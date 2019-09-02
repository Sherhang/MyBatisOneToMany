package com.example.demoMysql.bean;

import java.util.List;

public class Category {
    /**
     * 
     * 表字段 : category.Id
     */
    private Long id;

    /**
     * 
     * 表字段 : category.Name
     */
    private String name;

    private List<Product> products;

    /**
     * 获取  字段:category.Id
     *
     * @return category.Id, 
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置  字段:category.Id
     *
     * @param id the value for category.Id, 
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取  字段:category.Name
     *
     * @return category.Name, 
     */
    public String getName() {
        return name;
    }

    /**
     * 设置  字段:category.Name
     *
     * @param name the value for category.Name, 
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products=products;
    }
}