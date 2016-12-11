
package com.marmansys.dao;

import com.marmansys.entity.Company;
import java.util.List;

public interface CompanyDao {
    Company findById(int id);

    Company findBySSO(String sso);

    void save(Company company);

    void deleteBySSO(String sso);

    List<Company> findAllUsers();
}
