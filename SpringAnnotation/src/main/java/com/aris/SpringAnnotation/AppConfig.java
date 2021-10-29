package com.aris.SpringAnnotation;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@Configuration
@ComponentScan(basePackages="com.aris.SpringAnnotation")
public class AppConfig
{
  //  @Bean
  //  public Samsung getPhone()
  // {
//	 return new Samsung();
 //  }
    
 //  @Bean
 //  public MobileProcessor getProcessor()
 //  {
//	   return new Snapdragon();
 //  }
}
