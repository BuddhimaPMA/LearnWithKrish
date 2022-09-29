package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        obj.getMessage();

    }

    /**
     * When spring application get loaded the memory, Framework makes use of the above configuration file to create all the beans defined and assigns them a unique ID aa defined in
     * <beans> tag. You can use <property> tag to pass the values of different variables used at the time of the object creation.
     */
}
