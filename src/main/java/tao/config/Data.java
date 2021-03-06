package tao.config;

import javax.sql.DataSource;
//import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import tao.mapper.UserMapper;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

//@Configuration
//@MapperScan("tao.mapper")
public class Data {
	
	Data() {
		System.out.println("DataConfig Created");
	}

	@Bean
	public DataSource getDataSource() {
		// DataSource dataSource = new DataSource();
		// dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		// dataSource.setUrl("jdbc:mysql://localhost:3306/concretepage");
		// dataSource.setUsername("root");
		// dataSource.setPassword("");
		// return dataSource;
//		DriverManagerDataSource dataSource = new DriverManagerDataSource();
//		 dataSource.setDriverClassName("org.postgresql.Driver");
//		 dataSource.setUrl("jdbc:postgresql://172.31.86.12:5432/test");
//		 dataSource.setUsername("postgres");
//		 dataSource.setPassword("1234");
		 
		 DriverManagerDataSource dataSource = new DriverManagerDataSource();
		 dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		 dataSource.setUrl("jdbc:oracle:thin:@127.0.0.1:1521:xe");
		 dataSource.setUsername("jt");
		 dataSource.setPassword("1234");
		 return dataSource;
	}

	@Bean
	public DataSourceTransactionManager transactionManager() {
		return new DataSourceTransactionManager(getDataSource());
	}

	@Bean
	public SqlSessionFactory sqlSessionFactory() throws Exception {
		SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
		sessionFactory.setDataSource(getDataSource());
		return sessionFactory.getObject();
	}
//	 @Bean
//	 public UserMapper userMapper() throws Exception {
//	 final SqlSessionTemplate sessionTemplate = new SqlSessionTemplate(sqlSessionFactory());
//	 return sessionTemplate.getMapper(UserMapper.class);
//	 }
}
