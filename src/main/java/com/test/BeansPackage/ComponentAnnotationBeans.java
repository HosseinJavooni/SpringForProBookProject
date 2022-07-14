package com.test.BeansPackage;

import org.springframework.stereotype.Component;

@Component
public class ComponentAnnotationBeans {
    public String saySomething(){
        return "this is ComponentAnnotationBeans...";
    }
}
