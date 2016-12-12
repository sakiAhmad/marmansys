
package com.marmansys.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class AbstractDao {
    
    @Autowired
    private SessionFactory sessionFactory;
    
}
