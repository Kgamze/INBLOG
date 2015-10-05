package com.inblog.service;

import com.inblog.entity.User;
import com.inblog.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Mesut Dogan <mesut.dogan@indbilisim.com.tr> on 9/21/15.
 */

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findOne(Long id) {
        return userRepository.findOne(id);
    }

    public User save(User user) {
        return userRepository.save(user);
    }

    public User findByUserName(String username) {
        return userRepository.findByUserName(username);
    }
}
