package main4_LifeCycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import di04.ConnPool1;
import di04.ConnPool2;
import di04.ConnPool3;
import di04.MyBean;
import di04.MyExtension;


@Configuration
public class LifeCycleAnnotation {
	
	
   @Bean
   public MyExtension Extension() {
	   return new MyExtension();
   }
   @Bean
   public ConnPool1 connPool1() {
	   return new ConnPool1();
   }
   @Bean
   public ConnPool2 connPool2() {
	   return new ConnPool2();
   }
   @Bean(initMethod = "init", destroyMethod="destroy")
   public ConnPool3 connPool3() {
	   return new ConnPool3();
   }
   
   @Bean(initMethod = "customInit", destroyMethod="customDestroy")
   public MyBean myBean() {
	   MyBean  mybean = new MyBean();
	   mybean.setProperty1("값1");
	   return mybean;
   }
   
}
