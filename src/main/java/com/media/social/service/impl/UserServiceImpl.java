package com.media.social.service.impl;

import com.media.social.model.User;
import com.media.social.repository.UserRepository;
import com.media.social.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Slf4j
@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserRepository userRepository;

    @Override
    public User save(User user) {

        log.debug("Save User : "+user);
        return userRepository.save(user);
    }

    @Override
    public User update(User user)
    {
        log.debug("Updated User : "+user);
        return userRepository.save(user);
    }

    @Override
    public Optional<User> findById(String id) {

        log.debug("Find user by id  : "+id);
        return userRepository.findById(id);
    }

    @Override
    public void deleteById(String id) {

        log.debug("Delete User by id : "+id);
        userRepository.deleteById(id);
    }

    @Override
    public List<User> findAll() {

        log.debug("Find All User");
        return (List<User>) userRepository.findAll() ;
    }

    @Override
    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }
}
