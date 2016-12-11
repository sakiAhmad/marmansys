
package com.marmansys.dao;

import com.marmansys.entity.Company;
import java.util.List;

public interface CompanyDao {
   

    void save(Company company);

    void deleteBySSO(String sso);

    List<Company> findAllUsers();
}
