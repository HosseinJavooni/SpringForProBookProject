package com.test;

import com.test.BeansPackage.Employee_ApplicationConfigClassBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.test")
public class ApplicationConfigClass {
    @Bean
    public Employee_ApplicationConfigClassBean returnEmployee(){
        return new Employee_ApplicationConfigClassBean();
    }
}
