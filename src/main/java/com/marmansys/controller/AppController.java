package com.marmansys.controller;

import com.marmansys.entity.Company;
import com.marmansys.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class AppController {

    @Autowired
    CompanyService companyService;

    @RequestMapping(method = RequestMethod.GET)
    public String getIndexPage() {
        return "index";
    }

    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public String newUser() {
        return "admin/admin-dashbord";
    }

    @RequestMapping(value = "/admin/add-company", method = RequestMethod.GET)
    public String addCompany() {
        Company company = new Company();

        company.setCompanyName("Love");
        companyService.addCompany(company);
        return "index";
    }
}
