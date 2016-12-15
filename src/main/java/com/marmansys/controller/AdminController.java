
package com.marmansys.controller;

import com.marmansys.entity.Company;
import com.marmansys.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/admin")
public class AdminController {
    
    @Autowired
    CompanyService companyService;

    @RequestMapping(method = RequestMethod.GET)
    public String adminPanel() {
        return "admin/admin-dashbord";
    }
    
    @RequestMapping(value="/insert-company" , method = RequestMethod.GET)
    public String addCompany() {
        return "admin/insert-company";
    }

//    @RequestMapping(value = "/admin/add-company", method = RequestMethod.GET)
//    public String addCompany() {
//        Company company = new Company();
//
//        company.setCompanyName("Love");
//        companyService.addCompany(company);
//        return "index";
//    }
}
