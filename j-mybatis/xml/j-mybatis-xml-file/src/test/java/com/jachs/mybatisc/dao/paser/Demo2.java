package com.jachs.mybatisc.dao.paser;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.jachs.mybatis.Application;
import com.jachs.mybatisc.dao.paser.util.MyBatisSql;
import com.jachs.mybatisc.dao.paser.util.MyBatisSqlUtils;

/**
 * @author zhanchaohan
 * 
 */
@SpringBootTest(classes = Application.class)
public class Demo2 {
    @Autowired
    private SqlSessionFactory sqlSessionFactory;
    
    @Test
    public void t1() {
        Map<String,Object> map = new HashMap<String,Object>();
        map.put ( "computerid", "122" );
        map.put ( "computername", "cc" );
        String sql=sqlSessionFactory.getConfiguration ().getMappedStatement ( "com.jachs.mybatis.dao.ComputerMapper.insertSelective" ).getBoundSql ( map ).getSql ();
        
        System.out.println ( sql );
    }
    
    @Test
    public void t2() {
        Map<String,Object> map = new HashMap<String,Object>();
        map.put ( "computerid", "122" );
        map.put ( "computername", "cc" );
//        map.put ( "computerprice", 1212L );
        map.put ( "madetime", new Date () );
        
        MyBatisSql  sql=MyBatisSqlUtils.getMyBatisSql ("com.jachs.mybatis.dao.ComputerMapper.insertSelective",map,sqlSessionFactory);
        
        System.out.println ( sql );
    }
    
}
