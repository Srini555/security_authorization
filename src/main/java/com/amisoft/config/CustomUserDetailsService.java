package com.amisoft.config;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;


@Service
public class CustomUserDetailsService implements UserDetailsService {

    private final Map<String,UserDetails> detailsMap = new HashMap<>();

    public CustomUserDetailsService() {

        this.detailsMap.put("amisoft", new CustomUser("amisoft","password6",true,"USER"));
        this.detailsMap.put("joseph", new CustomUser("joseph","password4",true,"ADMIN"));
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        if(this.detailsMap.containsKey(username)){
            return this.detailsMap.get(username);
        }
        throw new UsernameNotFoundException("cann't find "+username+ " ! ");
    }
}
