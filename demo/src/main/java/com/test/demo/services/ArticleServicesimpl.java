package com.test.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.demo.dao.ArticleDAO;
import com.test.demo.entity.Article;

@Service
public class ArticleServicesimpl implements AriticalServices{

	@Autowired
	ArticleDAO artcledao ;
	@Override
	public Article saveArtical() {
		Article article=new Article();
		article.setCategory("tsetA");
		article.setTitle("Abc");
		
		return artcledao.create(article);
	}

}
