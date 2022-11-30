package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        holaMundo saludos = new holaMundo();

        holaMundo holaMundo = (holaMundo) context.getBean("holaMundo");

        String name = holaMundo.holaMundo();
        System.out.println(name);
        System.out.println("aguante argentina");

    }
}