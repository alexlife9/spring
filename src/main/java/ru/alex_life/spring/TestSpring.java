package ru.alex_life.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Alex_life
 * @version 1.0
 * @since 12.10.2022
 */
public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        TestBean testBean = context.getBean("testBean", TestBean.class);

        System.out.println(testBean.getName());

        context.close();
    }
}
