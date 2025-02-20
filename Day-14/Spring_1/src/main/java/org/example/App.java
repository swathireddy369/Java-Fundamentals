package org.example;


import org.example.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.awt.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args)
    {
        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        Desktop dt=context.getBean(Desktop.class);

//        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
//        Alien obj=(Alien) context.getBean("alien");
////        obj.setAge(26);
//         System.out.println( "Hello World!" );
//        obj.code();
//

    }
}
