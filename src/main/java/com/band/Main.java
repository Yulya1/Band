package com.band;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Yulya on 18.02.2016.
 */
//программа должна "вызыывать на сцену" два-три музыкальных коллектива, каждый из которых исполняет две-три композиции
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        //Performer performer = (Performer) context.getBean("d");
        //performer.perform();
        Group group = (Group) context.getBean("group");
        group.perform();
    }
}
