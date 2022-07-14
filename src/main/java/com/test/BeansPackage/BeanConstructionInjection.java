package com.test.BeansPackage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanConstructionInjection {

    ComponentAnnotationBeans componentAnnotationBeans;

    @Autowired
    public BeanConstructionInjection(ComponentAnnotationBeans componentAnnotationBeans) {
        this.componentAnnotationBeans = componentAnnotationBeans;
    }

    public ComponentAnnotationBeans getComponentAnnotationBeans() {
        return componentAnnotationBeans;
    }

    public void setComponentAnnotationBeans(ComponentAnnotationBeans componentAnnotationBeans) {
        this.componentAnnotationBeans = componentAnnotationBeans;
    }
}
