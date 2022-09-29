package com.media.social.config;

import com.media.social.model.User;
import com.media.social.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserServiceImpl userService;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

        User user = userService.findByEmail(email);
        if (user == null){
            throw new UsernameNotFoundException("User Not Found");
        }

        return new CustomUserDetails(user);
    }
}
