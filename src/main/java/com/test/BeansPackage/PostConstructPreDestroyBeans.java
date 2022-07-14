package com.test.BeansPackage;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class PostConstructPreDestroyBeans {

    @PostConstruct
    public void postConstructMethod(){
        System.out.println("post construct method in PostConstructPreDestroyBeans is called...");
    }

    public String saySomething(){
        return "I'm saying something in PostConstructPreDestroyBeans";
    }

    @PreDestroy
    public void preDestroyMethod(){
        System.out.println("pre destroy method in PostConstructPreDestroyBeans is called...");
    }
}
