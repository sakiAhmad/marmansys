
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

    @RequestMapping(method = RequestMethod.GET)
    public String adminPanel() {
        return "admin/admin-dashbord";
    }
    
    @RequestMapping(value="/company" , method = RequestMethod.GET)
    public String manageCompany() {
        return "admin/company";
    }
}
