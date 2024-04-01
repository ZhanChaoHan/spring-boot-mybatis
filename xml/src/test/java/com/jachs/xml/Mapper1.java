package com.jachs.xml;

import java.io.InputStream;
import java.util.Date;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.jachs.xml.entity.Computer;
import com.jachs.xml.mapper.ComputerMapper;

/***
 * 
 * @author zhanchaohan
 *
 */
public class Mapper1 {
 public static String namespace = "com.jachs.xml.xml.ExamMapper";
    
    SqlSession sqlSession;
    
    @Before
    public void init() {
        InputStream is=App.class.getResourceAsStream ( "configer/mybatis-config.xml" );
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory1 = sqlSessionFactoryBuilder.build(is, "development");
        sqlSession = sqlSessionFactory1.openSession(true);
    }
    
    @Test
    public void t1() {
        ComputerMapper mapper=sqlSession.getMapper ( ComputerMapper.class );
        
        Computer cp=new Computer();
        
        cp.setComputerId ("mcjk");
        cp.setComputerName ( "AKIC" );
        cp.setComputerPrice ( 18266L );
        cp.setMadeTime ( new Date());
        
        int count= mapper.insertComputer ( cp );
        
        System.out.println ( count );
    }
}
