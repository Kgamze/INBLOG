package com.inblog.entity;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author Mesut Dogan <mesut.dogan@indbilisim.com.tr> on 10/1/15.
 */
public class InBlogUserDetails implements UserDetails {


    private final boolean accountNonExpired;

    private final boolean accountNonLocked;

    private final Collection<GrantedAuthority> authorities;

    private final boolean credentialsNonExpired;

    private final boolean enabled;

    private final Long id;

    private final String password;

    private final String username;

    private final String fullName;


    public InBlogUserDetails(User user) {
        this.username = user.getUserName();
        this.fullName = user.getFullName();
        this.password = user.getPassword();
        this.credentialsNonExpired = true;
        this.accountNonExpired = true;
        this.accountNonLocked = true;
        this.authorities = new ArrayList<GrantedAuthority>();
        this.enabled = true;
        this.id = user.getId();

        System.out.println("---------------->user " + this.username);
        System.out.println("---------------->password " + this.password);
        for (Role role : user.getRoles()) {
            authorities.add(new SimpleGrantedAuthority(role.getName()));
            System.out.println("---------------->Roles: " + role.getName());
        }
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return this.authorities;
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public String getUsername() {
        return this.username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return this.accountNonExpired;
    }

    @Override
    public boolean isAccountNonLocked() {
        return this.accountNonLocked;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return this.credentialsNonExpired;
    }

    @Override
    public boolean isEnabled() {
        return this.enabled;
    }
}
