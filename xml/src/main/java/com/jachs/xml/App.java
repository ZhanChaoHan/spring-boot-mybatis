package com.jachs.xml;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.jachs.xml.entity.Exam;

/***
 * 
 * @author zhanchaohan
 *
 */
public class App{
    
    public static void main( String[] args ) throws Exception{
        Exam ex=new Exam();
        ex.setExamId ( 2 );
        ex.setExamName ( "peter" );
        ex.setScore ( 12.12 );
        
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        
        InputStream is=App.class.getResourceAsStream ( "configer/mybatis-config.xml" );
        
//        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
//        SqlSession sqlSession = sqlSessionFactory.openSession(true);
//        int count = sqlSession.insert("insertExam", ex);
//        System.out.println("插入了几条记录：" + count);
        
        // 使用指定数据库
        SqlSessionFactory sqlSessionFactory1 = sqlSessionFactoryBuilder.build(is, "pro");
        SqlSession sqlSession1 = sqlSessionFactory1.openSession(true);
        int count1 = sqlSession1.insert("insertExam", ex);
        System.out.println("插入了几条记录：" + count1);
    }
}
