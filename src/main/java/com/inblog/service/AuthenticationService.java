package com.inblog.service;

import com.inblog.entity.InBlogUserDetails;
import com.inblog.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Mesut Dogan <mesut.dogan@indbilisim.com.tr> on 10/1/15.
 */

@Service
@Transactional(readOnly = true)
public class AuthenticationService implements UserDetailsService {

    @Autowired
    private UserService userService;

    @Override
    public InBlogUserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

        User user = userService.findByEmail(email);

        if (user == null) {
            throw new UsernameNotFoundException("Username is not found");
        }

        return new InBlogUserDetails(user);
    }


}
