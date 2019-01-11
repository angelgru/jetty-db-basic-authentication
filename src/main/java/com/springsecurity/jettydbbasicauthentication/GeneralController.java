package com.springsecurity.jettydbbasicauthentication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GeneralController {

    @GetMapping("/")
    public String testController() {
        return "JDBC Based authentication works";
    }
}
