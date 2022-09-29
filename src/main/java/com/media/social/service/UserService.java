package com.media.social.service;

import com.media.social.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    User save(User user);

    User update(User user);

    Optional<User> findById(String id);

    void deleteById(String id);

    List<User> findAll();

    User findByEmail(String email);
}
