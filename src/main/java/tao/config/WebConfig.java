package tao.config;

import java.io.IOException;
import java.io.InputStream;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
//Configuration don't write ,then component scan, enablewebmvc don't work
@ComponentScan(basePackages="tao.controller,tao.service")
@EnableWebMvc
public class WebConfig {


}
