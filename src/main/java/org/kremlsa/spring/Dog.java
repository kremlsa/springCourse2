package org.kremlsa.spring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component
//@Scope("singleton")
public class Dog implements Pet {
    public Dog() {
        System.out.println("Dog bean is created");
    }

    @PostConstruct
    public void init(){
        System.out.println("Dog bean is init");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Dog bean is destroy");
    }


   /* public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }*/

    @Override
    public void say() {
        System.out.println("Wow, wow!");
    }

}

