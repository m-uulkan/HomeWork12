package com.example.homework12;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HomeWork12Application {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Person person=context.getBean("myPerson",Person.class);
        System.out.println(person);
        person.CallMethods();
        Person person1=context.getBean("myPerson1",Person.class);
        System.out.println(person1);
        person1.CallMethodsOfKitten();

        context.close();
    }

}
