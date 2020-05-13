package saber.kuns.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import saber.kuns.annotation.MybatisDao;
import saber.kuns.common.BaseForm;
import saber.kuns.common.CrudDao;
import saber.kuns.entity.TblAccomodation;
import saber.kuns.entity.TblAccomodationExample;

@MybatisDao
public interface TblAccomodationMapper extends CrudDao<TblAccomodation> {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_accomodation
     *
     * @mbg.generated
     */
    long countByExample(TblAccomodationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_accomodation
     *
     * @mbg.generated
     */
    int deleteByExample(TblAccomodationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_accomodation
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_accomodation
     *
     * @mbg.generated
     */
    int insert(TblAccomodation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_accomodation
     *
     * @mbg.generated
     */
    int insertSelective(TblAccomodation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_accomodation
     *
     * @mbg.generated
     */
    List<TblAccomodation> selectByExample(TblAccomodationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_accomodation
     *
     * @mbg.generated
     */
    TblAccomodation selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_accomodation
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TblAccomodation record, @Param("example") TblAccomodationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_accomodation
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TblAccomodation record, @Param("example") TblAccomodationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_accomodation
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TblAccomodation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_accomodation
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TblAccomodation record);

	// List<TblAccomodation> findList(TblAccomodation record);

	List<TblAccomodation> findPageList(BaseForm form);
}