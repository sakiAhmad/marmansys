package com.marmansys.controller;

import com.marmansys.entity.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class AppController {
    
    @RequestMapping(method = RequestMethod.GET)
    public String getIndexPage() {
        return "index";
    }

    
}
