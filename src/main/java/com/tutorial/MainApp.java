package com.tutorial;



import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class MainApp{


    public static void main(String[]args){
        AbstractApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
//        HelloWorld obj=(HelloWorld)context.getBean("helloWorld");
//        obj.getMessage1();
//        obj.getMessage2();

        HelloIndia helloIndia = (HelloIndia)context.getBean("helloIndia");
        helloIndia.getMessage1();
        helloIndia.getMessage2();
        helloIndia.getMessage3();
        context.registerShutdownHook();
    }
}