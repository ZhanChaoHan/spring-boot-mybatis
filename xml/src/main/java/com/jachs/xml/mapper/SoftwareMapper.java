package com.jachs.xml.mapper;

import org.apache.ibatis.annotations.Select;

import com.jachs.xml.entity.Software;

/***
 * 
 * @author zhanchaohan
 *
 */
public interface SoftwareMapper {
    @Select("SELECT * FROM software where softWareId=#{softWareId}")
    Software selectBlog(String softWareId);
}
