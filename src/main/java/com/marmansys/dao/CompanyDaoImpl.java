
package com.marmansys.dao;

import com.marmansys.entity.Company;
import java.util.List;
import java.util.logging.Logger;
import org.hibernate.Criteria;
import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

@Repository("companyDao")
public class CompanyDaoImpl extends AbstractDao implements CompanyDao{
    
}
