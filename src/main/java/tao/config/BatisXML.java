package tao.config;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import tao.service.Comp1;

@Configuration
public class BatisXML {
	private static SqlSessionFactory sqlSessionFactory;
	BatisXML () {
		String resource = "mybatis-config.xml";
		InputStream inputStream;
		try {
			inputStream = Resources.getResourceAsStream(resource);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			
			/*sqlSessionFactorys = new SqlSessionFactoryBuilder().build(reader, "test");
			testSession = sqlSessionFactorys.openSession(); // test env

			sqlSessionFactorys = new SqlSessionFactoryBuilder().build(reader, "development");
			devSession = sqlSessionFactorys.openSession(); // dev env*/
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	public static SqlSessionFactory getSqlSessionFactory(){
		return sqlSessionFactory;
	}
	@Bean
	public Comp1 GetBean()
	{
		return new Comp1();
	}
}
