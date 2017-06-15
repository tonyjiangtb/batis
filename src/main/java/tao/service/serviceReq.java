package tao.service;

import java.text.SimpleDateFormat;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;

@Service("serviceReq")
@Scope(value="request",proxyMode =ScopedProxyMode.TARGET_CLASS)
//attribute proxyMode that is used to create AOP proxy of the bean. We need to do it when we are injecting short lived bean scope to long lived bean scope.
public class serviceReq {
	serviceReq(){
		System.out.println("serviceReq created");
		sdf=new SimpleDateFormat("yyyy-MM-dd");
	}
	public SimpleDateFormat sdf;

}
