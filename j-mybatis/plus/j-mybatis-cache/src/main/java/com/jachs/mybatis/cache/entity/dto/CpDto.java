package com.jachs.mybatis.cache.entity.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/***
 * 
 * @author zhanchaohan
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CpDto {
	private String computerId;
	private String computerName;
	private Long computerPrice;
	private Date madeTime;
	
	private String softWareName;
}
