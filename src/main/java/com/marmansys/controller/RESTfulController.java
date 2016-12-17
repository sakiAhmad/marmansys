package com.marmansys.controller;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RESTfulController {

    @RequestMapping(value = "admin/company/test", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public String RestTest() {
        return "Hello Rest";
    }
}
