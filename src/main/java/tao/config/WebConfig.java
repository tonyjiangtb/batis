package tao.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
//Configuration don't write ,then component scan, enablewebmvc don't work
@ComponentScan(basePackages="tao.controller,tao.service")
@EnableWebMvc
public class WebConfig {

	WebConfig(){
		System.out.println("webconfig created");
	}
}
