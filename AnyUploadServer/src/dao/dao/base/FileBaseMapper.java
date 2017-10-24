package dao.dao.base;

import dao.model.base.FileBase;
import dao.model.base.FileBaseCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FileBaseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table file_base
     *
     * @mbg.generated
     */
    long countByExample(FileBaseCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table file_base
     *
     * @mbg.generated
     */
    int deleteByExample(FileBaseCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table file_base
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String fileBaseId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table file_base
     *
     * @mbg.generated
     */
    int insert(FileBase record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table file_base
     *
     * @mbg.generated
     */
    int insertSelective(FileBase record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table file_base
     *
     * @mbg.generated
     */
    List<FileBase> selectByExample(FileBaseCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table file_base
     *
     * @mbg.generated
     */
    FileBase selectByPrimaryKey(String fileBaseId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table file_base
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") FileBase record, @Param("example") FileBaseCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table file_base
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") FileBase record, @Param("example") FileBaseCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table file_base
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(FileBase record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table file_base
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(FileBase record);
}