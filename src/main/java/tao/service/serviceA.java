package tao.service;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

import tao.config.Data;
import tao.mapper.UserMapper;
import tao.model.Person;

@Service("serviceA")
public class serviceA {

	//@Autowired
	//private UserMapper um;
	
	@Autowired
	private SqlSessionFactory factory;

	public String method1(String arg1) {

		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.register(Data.class);
		ctx.refresh();
		System.out.println("ctx newed");
		UserMapper mapper = ctx.getBean(UserMapper.class);
		System.out.println("gebean usermapper");
		Person p = new Person();
		p.name = "hhh";
		mapper.insert(p);
		return "";
	}
	public String method2(String arg1) {
		//sqlsession not thread safe
		SqlSession session=factory.openSession();
		UserMapper m=session.getMapper(UserMapper.class);
		m.insert(null);
		return "";
	}

}
