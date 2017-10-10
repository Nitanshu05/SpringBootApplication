package com.test.demo;

import javax.persistence.EntityManagerFactory;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;

@Configuration
public class springconfig {

	@Bean
	public SessionFactory sessionFactory(EntityManagerFactory entityManagerFactory) {  
	   return entityManagerFactory.unwrap(SessionFactory.class);
	}
	 @Bean
	    @Autowired
	    public HibernateTemplate getHibernateTemplate(SessionFactory sessionFactory)
	    {
	        HibernateTemplate hibernateTemplate = new HibernateTemplate(sessionFactory);
	        hibernateTemplate.setCheckWriteOperations(false);

	        return hibernateTemplate;
	    }
	 @Bean
	    @Autowired
	    public HibernateTransactionManager transactionManager(SessionFactory sessionFactory)
	    {
	        HibernateTransactionManager htm = new HibernateTransactionManager();
	        
	        htm.setSessionFactory(sessionFactory);
	        return htm;
	    }
}
