package tao.service;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

//@Component
public class Comp1 implements BeanFactoryAware {
	//@Autowired
	//public serviceReq s;
	
	private ListableBeanFactory factory;
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		// TODO Auto-generated method stub
		factory=(ListableBeanFactory) beanFactory;
		String[] beanNames=factory.getBeanDefinitionNames();
		for (String name:beanNames){
			System.out.println("bean:"+name);
		}
		beanNames=factory.getBeanNamesForAnnotation(Configuration.class);
		System.out.println("@Configuration:"+beanNames);
		System.out.println("List @Configuration:"+Arrays.asList(beanNames));
	}

}
