package com.media.social.repository;

import com.media.social.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {

    User findByEmail(String email);
}
