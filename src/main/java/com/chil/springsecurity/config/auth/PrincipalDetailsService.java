package com.chil.springsecurity.config.auth;

import com.chil.springsecurity.model.User;
import com.chil.springsecurity.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

// Once loginProcessingUrl("/login") inside of security configuration is being invoked
// Automatically, loadUserByuserName, having UserDetails Type, is being called.

@Service
public class PrincipalDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;
    // parameter username is the same as username within input box on loginForm

    //Security Session (inside) ==Authentication (inside) == UserDetails
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println("username:"+username);
        User userEntity = userRepository.findByUsername(username);
        System.out.println("userEntity:"+userEntity);
        if(userEntity != null ){
            return new PrincipalDetails(userEntity);
        }
        return null;
    }
}
