package com.jachs.mybatis;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;

/***
 * 
 * @author zhanchaohan
 *
 */
@Configuration
public class MybatisPlusConfig {
	/***
	 * 配置分页
	 * @return
	 */
	 @Bean
	    public MybatisPlusInterceptor mybatisPlusInterceptor(){
	        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
	        interceptor.addInnerInterceptor(new PaginationInnerInterceptor());
	        return interceptor;
	    }
}
