package tao.service;

import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

import tao.config.BatisXML;
import tao.config.Data;
import tao.mapper.UserMapper;
import tao.model.Person;

@Service("serviceA")
public class serviceA {

	// @Autowired
	// private UserMapper um;

	// @Autowired
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
		// sqlsession not thread safe
		SqlSession session = BatisXML.getSqlSessionFactory().openSession();
		//sqlSessionFactory.openSession(ExecutorType.BATCH);  
		Person p = new Person();
		p.seq = 3;
		//Configuration s=session.getConfiguration();
		Person retp=session.selectOne("people.select", p);
		Map<String,Person> map=session.selectMap("people.selectmap", "seq");
		
		retp=map.get(2);
		//List<Person> listp=session.selectList("people.selectall");
		//xml namespace can be any one, only need to be same as here. no relation to java namespace code
		retp.name="change";
		retp=session.selectOne("people.select", p);
		return "";
	}

}
