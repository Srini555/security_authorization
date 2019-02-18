package com.amisoft.config;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class CustomUser implements UserDetails {


    private final Set<GrantedAuthority> authorities = new HashSet<>();
    private final String username,password;
    private final boolean active;


    public CustomUser( String username, String password, boolean active,String ... authorities) {

        this.username = username;
        this.password = password;
        this.active = active;

        this.authorities.addAll(
                Arrays
                    .stream(authorities)
                        .map( a-> new SimpleGrantedAuthority("ROLE_"+a))
                        .collect(Collectors.toSet()));
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
        return this.active;
    }

    @Override
    public boolean isAccountNonLocked() {
        return this.active;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return this.active;
    }

    @Override
    public boolean isEnabled() {
        return this.active;
    }
}
