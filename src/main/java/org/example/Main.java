package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractRefreshableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        Student student = (Student) context.getBean("student1");
        System.out.println(student);

        Professor professor = (Professor) context.getBean("professor1");
        System.out.println(professor);

        Lesson lesson = (Lesson) context.getBean("lesson1");
        System.out.println(lesson);
    }
}