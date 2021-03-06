package org.jinyuanjava.litemall.db.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.jinyuanjava.litemall.db.domain.LitemallStoreBrand;
import org.jinyuanjava.litemall.db.domain.LitemallStoreBrandExample;

public interface LitemallStoreBrandMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_store_brand
     *
     * @mbg.generated
     */
    long countByExample(LitemallStoreBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_store_brand
     *
     * @mbg.generated
     */
    int deleteByExample(LitemallStoreBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_store_brand
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_store_brand
     *
     * @mbg.generated
     */
    int insert(LitemallStoreBrand record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_store_brand
     *
     * @mbg.generated
     */
    int insertSelective(LitemallStoreBrand record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_store_brand
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallStoreBrand selectOneByExample(LitemallStoreBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_store_brand
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallStoreBrand selectOneByExampleSelective(@Param("example") LitemallStoreBrandExample example, @Param("selective") LitemallStoreBrand.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_store_brand
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<LitemallStoreBrand> selectByExampleSelective(@Param("example") LitemallStoreBrandExample example, @Param("selective") LitemallStoreBrand.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_store_brand
     *
     * @mbg.generated
     */
    List<LitemallStoreBrand> selectByExample(LitemallStoreBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_store_brand
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallStoreBrand selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") LitemallStoreBrand.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_store_brand
     *
     * @mbg.generated
     */
    LitemallStoreBrand selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_store_brand
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallStoreBrand selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_store_brand
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") LitemallStoreBrand record, @Param("example") LitemallStoreBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_store_brand
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") LitemallStoreBrand record, @Param("example") LitemallStoreBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_store_brand
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(LitemallStoreBrand record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_store_brand
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(LitemallStoreBrand record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_store_brand
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByExample(@Param("example") LitemallStoreBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_store_brand
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByPrimaryKey(Integer id);
}