package com.jachs.mybatis.mapper;

import com.jachs.mybatis.domain.Computer;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.github.yulichang.base.MPJBaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zhanchaohan
 * @since 2022-04-06
 */
public interface ComputerMapper  extends MPJBaseMapper <Computer>{

	List<Computer> selectPageByXml(@Param("price") Long price);

	List<Computer> selectPageByXml(@Param("price") Long price, Page<Computer> page);

	@Select(value = "SELECT computerId,computerName,computerPrice,madeTime FROM computer\r\n"
			+ "	     WHERE (computerPrice >= #{price}) ORDER BY computerPrice ASC")
	List<Computer> selectPageByAnn(@Param("price") Long price);
	
	@Select(value = "SELECT computerId,computerName,computerPrice,madeTime FROM computer\r\n"
			+ "	     WHERE (computerPrice >= #{price}) ORDER BY computerPrice ASC")
	List<Computer> selectPageByAnn(@Param("price") Long price, Page<Computer> page);

}
