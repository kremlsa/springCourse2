package org.kremlsa.spring;

public class Cat implements Pet{
    @Override
    public void say() {
        System.out.print("Meow, meow!");
    }
}
