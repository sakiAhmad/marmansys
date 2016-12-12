
package com.marmansys.dao;

import com.marmansys.entity.Company;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CompanyDaoImpl extends AbstractDao implements CompanyDao{
    
    
    @Override
    public void addCompany(Company company) {
        getSessionFactory().getCurrentSession().save(company);
    }

}
 