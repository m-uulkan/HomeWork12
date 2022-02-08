package com.example.homework12;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HomeWork12Application {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person=context.getBean("myPerson",Person.class);
        Puppy puppy=context.getBean("myAnimal",Puppy.class);
        Person person1=context.getBean("myPerson1",Person.class);
        Kitten kitten=context.getBean("myKitten",Kitten.class);
        System.out.println(person.getName()+" "+person.getAge()+":"+"\n"+
                           puppy.getName()+", "+puppy.getPoroda()+", "+puppy.getColour()+", "+puppy.getFood());
        person.CallMethods();
        System.out.println(person1.getName()+" "+person1.getAge()+":"+"\n"+
                           kitten.getName()+", "+kitten.getPoroda()+", "+kitten.getColour()+", "+kitten.getFood());
        person1.CallMethodsOfKitten();
        context.close();
    }

}
