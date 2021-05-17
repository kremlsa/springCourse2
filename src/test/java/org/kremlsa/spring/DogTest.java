package org.kremlsa.spring;

import junit.framework.TestCase;
import org.junit.Test;

public class DogTest extends TestCase {

    @Test
    public void test1() {
        Pet pet = new Cat();
        pet.say();
    }
}