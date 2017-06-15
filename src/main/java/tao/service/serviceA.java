package tao.service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

import tao.config.BatisXML;
import tao.config.Data;
import tao.mapper.UserMapper;
import tao.model.Person;

@Service("serviceA")
public class serviceA {



	
	// @Autowired
	private SqlSessionFactory factory;
	serviceA(){
		System.out.println("serviceA created");
	}
	public String method1(String arg1) {

		try {
			//Date x=servicerequest.sdf.parse("2014-09-01");
			DateFormat x;
			//x.toString();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";
	}

	public String method2(String arg1) throws ParseException {
		// sqlsession not thread safe
		SqlSession session = BatisXML.getSqlSessionFactory().openSession();
		//sqlSessionFactory.openSession(ExecutorType.BATCH);  
		Person p = new Person();
		//p.seq = 3;
		//Configuration s=session.getConfiguration();
//		Person retp=session.selectOne("people.select", p);
		Map<String,Person> map=session.selectMap("people.selectmap2", "seq");
		//List<Person> listp=session.selectList("people.selectall2");
		//xml namespace can be any one, only need to be same as here. no relation to java namespace code
		p=map.get("A                   ");
		p=map.get(new java.lang.Long("82"));
		p=map.get(83);// automatic to Interger,get nothing
//		p.seq=99;
//		p.name="new2";
//		retp.name="change";
//		retp=session.selectOne("people.select", p);
		
//		p= new Person();
//		p.name="";
//		//if null value associated, unable to map error
//		p.birth=(new SimpleDateFormat("yyyy-MM-dd H:mm:ss")).parse("2014-09-01 13:45:05");
//		p.level=(float) 4.5;
//		p.description="lala";
//		int ret=session.insert("people.insert", p);
//
//		session.commit();
		
		//session.rollback();
		session.close();
		return "person seq:"+p.seq;
	}

}
