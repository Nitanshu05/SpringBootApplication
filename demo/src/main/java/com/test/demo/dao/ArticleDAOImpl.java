package com.test.demo.dao;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.test.demo.entity.Article;


@Repository
@Transactional
public class ArticleDAOImpl implements ArticleDAO{

	/*@Autowired
    private HibernateTemplate hibernateTemplate;*/
	@Autowired
	SessionFactory SessionFactory;
	
	@Override
	public Article create(Article article) {
		System.out.println(article);
		try{
		Session session=SessionFactory.openSession();
	//	 Article mergeUser = this.hibernateTemplate.merge(article);
		session.save(article);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return article;
	}

}
