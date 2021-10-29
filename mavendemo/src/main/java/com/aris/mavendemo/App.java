package com.aris.mavendemo;
import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	@SuppressWarnings("resource")
       ApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
      // Vehicle obj=(Vehicle) context.getBean("car");
     //  obj.drive();
    	
    	 Car obj=(Car) context.getBean("car");
          obj.drive();
    	 
    //	Tyre t=(Tyre) context.getBean("tyre");
    	//System.out.println(t);
    }
}
