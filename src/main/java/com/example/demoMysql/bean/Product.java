package com.example.demoMysql.bean;

public class Product {
    /**
     * 
     * 表字段 : product.Id
     */
    private Long id;

    /**
     * 
     * 表字段 : product.categoryId
     */
    private Long categoryid;

    /**
     * 
     * 表字段 : product.Name
     */
    private String name;

    /**
     * 获取  字段:product.Id
     *
     * @return product.Id, 
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置  字段:product.Id
     *
     * @param id the value for product.Id, 
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取  字段:product.categoryId
     *
     * @return product.categoryId, 
     */
    public Long getCategoryid() {
        return categoryid;
    }

    /**
     * 设置  字段:product.categoryId
     *
     * @param categoryid the value for product.categoryId, 
     */
    public void setCategoryid(Long categoryid) {
        this.categoryid = categoryid;
    }

    /**
     * 获取  字段:product.Name
     *
     * @return product.Name, 
     */
    public String getName() {
        return name;
    }

    /**
     * 设置  字段:product.Name
     *
     * @param name the value for product.Name, 
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}