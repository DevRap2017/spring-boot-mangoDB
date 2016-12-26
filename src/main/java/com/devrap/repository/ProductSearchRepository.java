/*
 * Creation: 26 déc. 2016 by habane
 */
package com.devrap.repository;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.devrap.models.Product;


@Repository
public class ProductSearchRepository
{

	@Autowired
	MongoTemplate mongoTemplate;

	public Collection<Product> searchCars(String text)
	{
		return mongoTemplate.find(Query.query(new Criteria()
				.orOperator(Criteria.where("name").regex(text, "i"),
						Criteria.where("category").regex(text, "i"),
						Criteria.where("price").regex(text, "i"))),
				Product.class);
	}

}
