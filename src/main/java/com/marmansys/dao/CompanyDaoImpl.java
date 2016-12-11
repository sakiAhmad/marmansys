
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
 
    @Override
      public void save(Company company) {
        persist(company);
    }

    @Override
    public void deleteBySSO(String sso) {
        Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("ssoId", sso));
        Company company = (Company) crit.uniqueResult();
        delete(company);
    }

   @SuppressWarnings("unchecked")
    public List<Company> findAllUsers() {
        Criteria criteria = createEntityCriteria().addOrder(Order.asc("firstName"));
        criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.
        List<Company> users = (List<Company>) criteria.list();

		// No need to fetch userProfiles since we are not showing them on list page. Let them lazy load. 
        // Uncomment below lines for eagerly fetching of userProfiles if you want.
		/*
         for(User user : users){
         Hibernate.initialize(user.getUserProfiles());
         }*/
        return users;
    }

    
    
}
