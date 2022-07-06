package com.jachs.mybatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.jachs.mybatis.dto.SoftWareDto;
import com.jachs.mybatis.entity.Software;
import com.jachs.mybatis.vo.SoftWareVo;

/***
 * 
 * @author zhanchaohan
 *
 */
@Mapper
public interface SoftwareMapper {
    int deleteByPrimaryKey(String softwareid);

    int insert(Software record);

    int insertSelective(Software record);

    Software selectByPrimaryKey(String softwareid);

    int updateByPrimaryKeySelective(Software record);

    int updateByPrimaryKey(Software record);
    //查询
	List<Software> findByCpId(@Param("cpId") String cpId);
	List<Software> findBycIdAndName(SoftWareVo swv);
	List<SoftWareDto> findBycIdAndNameDto(SoftWareVo swv);
	//拼接循环语句
	List<Software>  queryManyById(List<String> idList);
}