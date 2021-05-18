package org.kremlsa.spring;

import org.springframework.context.annotation.*;

@Configuration
//@ComponentScan("org.kremlsa.spring")
@PropertySource("classpath:myApp.properties")
public class MyConfig {

    @Bean
    @Scope("singleton")
    public Pet catBean() {
        System.out.println("!!!");
        return new Cat();
    }

    @Bean
    public Person personBean() {
        return new Person(catBean());
    }
}
