package com.test.BeansPackage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanPropertyInjection {

    ComponentAnnotationBeans componentAnnotationBeans;

    public ComponentAnnotationBeans getComponentAnnotationBeans() {
        return componentAnnotationBeans;
    }

    @Autowired
    public void setComponentAnnotationBeans(ComponentAnnotationBeans componentAnnotationBeans) {
        this.componentAnnotationBeans = componentAnnotationBeans;
    }
}
