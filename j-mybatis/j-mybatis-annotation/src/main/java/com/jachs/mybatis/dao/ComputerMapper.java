package com.jachs.mybatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.*;

import com.jachs.mybatis.entity.Computer;

/***
 * @Mapper：将mapper接口注册到容器中<br>
 * @Select：查询<br>
 * @Delete：删除<br>
 * @Insert：插入 <br>
 * @Update：更新<br>
 * @Options(useGeneratedKeys = true,keyColumn = "id")：指定表的自增主键并自动绑定到实体类对象<br>
 * @Result 修饰返回的结果集，关联实体类属性和数据库字段一一对应，如果实体类属性和数据库属性名保持一致，    就不需要这个属性来修饰。<br>
 * @author zhanchaohan
 *
 */
@Mapper
public interface ComputerMapper {
	@Insert("insert into Computer(computerId,computerName,computerPrice,madeTime) values(#{computerId},#{computerName},#{computerPrice},#{madeTime})")
	int addComputer(Computer computer);
	
	@Delete("delete  from computer where computerId=#{computer_id}")
	int deleteComputer(String computerId);
	
	@Select("select * from computer")
    List<Computer> findAllComputer();

	
}
