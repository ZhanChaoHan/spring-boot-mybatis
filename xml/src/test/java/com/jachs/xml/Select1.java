package com.jachs.xml;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.jachs.xml.entity.Exam;


/***
 * 
 * @author zhanchaohan
 *
 */
public class Select1 {
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
        Exam exam=sqlSession.selectOne("exam.selectExam", 2 );
        
        System.out.println ( exam.getExamId ()+"\t\t"+exam.getExamName ()+"\t\t"+exam.getScore () );
    }
    
    @Test
    public void t2() {
        List<Exam> emps = sqlSession.selectList("exam.findAll");
        
        for ( Exam exam : emps ) {
            System.out.println ( exam.getExamId ()+"\t\t"+exam.getExamName ()+"\t\t"+exam.getScore () );
        }
    }
}
