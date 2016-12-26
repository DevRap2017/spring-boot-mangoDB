/*
 *
 * Creation: 26 déc. 2016 by habane
 *
 */
package com.devrap.repository;

import org.springframework.data.repository.CrudRepository;

import com.devrap.models.Product;

public interface ProductMongoRepository extends CrudRepository<Product,String>
{

}
