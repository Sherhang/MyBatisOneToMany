package com.example.demoMysql.dao;

import com.example.demoMysql.bean.Product;
import com.example.demoMysql.bean.ProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductMapper {
    /**
     *  根据指定的条件获取数据库记录数,product
     *
     * @param example
     */
    long countByExample(ProductExample example);

    /**
     *  根据指定的条件删除数据库符合条件的记录,product
     *
     * @param example
     */
    int deleteByExample(ProductExample example);

    /**
     *  根据主键删除数据库的记录,product
     *
     * @param id
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  新写入数据库记录,product
     *
     * @param record
     */
    int insert(Product record);

    /**
     *  动态字段,写入数据库记录,product
     *
     * @param record
     */
    int insertSelective(Product record);

    /**
     *  根据指定的条件查询符合条件的数据库记录,product
     *
     * @param example
     */
    List<Product> selectByExample(ProductExample example);

    /**
     *  根据指定主键获取一条数据库记录,product
     *
     * @param id
     */
    Product selectByPrimaryKey(Long id);

    /**
     *  动态根据指定的条件来更新符合条件的数据库记录,product
     *
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") Product record, @Param("example") ProductExample example);

    /**
     *  根据指定的条件来更新符合条件的数据库记录,product
     *
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") Product record, @Param("example") ProductExample example);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,product
     *
     * @param record
     */
    int updateByPrimaryKeySelective(Product record);

    /**
     *  根据主键来更新符合条件的数据库记录,product
     *
     * @param record
     */
    int updateByPrimaryKey(Product record);
}