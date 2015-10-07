package com.inblog.entity;

import javax.persistence.*;
import java.util.List;

/**
 * @author Mesut Doğan <mesut.dogan@indbilisim.com.tr>
 */

@Entity
public class Role {

    @Id
    @GeneratedValue
    Long id;

    String name;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    List<User> users;

    public Role() {

    }
    public Role(String roleName) {
        this.name = roleName;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
