package com.example.demoMysql.dao;

import com.example.demoMysql.bean.Category;
import com.example.demoMysql.bean.CategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CategoryMapper {
    /**
     *  根据指定的条件获取数据库记录数,category
     *
     * @param example
     */
    long countByExample(CategoryExample example);

    /**
     *  根据指定的条件删除数据库符合条件的记录,category
     *
     * @param example
     */
    int deleteByExample(CategoryExample example);

    /**
     *  根据主键删除数据库的记录,category
     *
     * @param id
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  新写入数据库记录,category
     *
     * @param record
     */
    int insert(Category record);

    /**
     *  动态字段,写入数据库记录,category
     *
     * @param record
     */
    int insertSelective(Category record);

    /**
     *  根据指定的条件查询符合条件的数据库记录,category
     *
     * @param example
     */
    List<Category> selectByExample(CategoryExample example);

    /**
     *  根据指定主键获取一条数据库记录,category
     *
     * @param id
     */
    Category selectByPrimaryKey(Long id);

    /**
     *  动态根据指定的条件来更新符合条件的数据库记录,category
     *
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") Category record, @Param("example") CategoryExample example);

    /**
     *  根据指定的条件来更新符合条件的数据库记录,category
     *
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") Category record, @Param("example") CategoryExample example);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,category
     *
     * @param record
     */
    int updateByPrimaryKeySelective(Category record);

    /**
     *  根据主键来更新符合条件的数据库记录,category
     *
     * @param record
     */
    int updateByPrimaryKey(Category record);
}