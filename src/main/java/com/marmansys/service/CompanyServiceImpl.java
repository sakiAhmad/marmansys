
package com.marmansys.service;

import com.marmansys.dao.CompanyDao;
import com.marmansys.entity.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CompanyServiceImpl implements CompanyService{
    
    @Autowired
    CompanyDao companyDao;

    @Override
    public void addCompany(Company company) {
       companyDao.addCompany(company);
    }
    
}
