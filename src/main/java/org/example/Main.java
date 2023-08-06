package org.example;

import config.MyConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        int c = 0;
        for (String beanName : context.getBeanDefinitionNames()) {
            System.out.println(c++ + " " + beanName);
        }

        Cat cat1 = context.getBean(Cat.class);
        cat1.setName("Murka");
        System.out.println(cat1.getName());
    }
}
