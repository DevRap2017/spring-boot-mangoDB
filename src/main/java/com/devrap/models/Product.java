/*
 * Creation: 26 déc. 2016 by habane
 */
package com.devrap.models;

import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "products")
public class Product
{

	private String id;

	private String name;

	private String category;

	private Double price;


	public String getId()
	{
		return id;
	}

	public void setId(String id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getCategory()
	{
		return category;
	}

	public void setCategory(String category)
	{
		this.category = category;
	}

	public Double getPrice()
	{
		return price;
	}

	public void setPrice(Double price)
	{
		this.price = price;
	}


}
