package ru.alex_life.spring;

/**
 * @author Alex_life
 * @version 1.0
 * @since 11.10.2022
 */
public class TestBean {
    private String name;

    public TestBean(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
