package com.amisoft.config;


import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

@Service("authz")
@Log4j2
public class AuthService {

    public boolean check(HttpServletRequest request, CustomUser principle){

       log.info("Checking incoming request: "+request.getRequestURI() + "for principle "+ principle.getUsername());
       return true;
    }

}
