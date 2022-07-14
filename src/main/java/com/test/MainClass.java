package com.test;

import com.test.BeansPackage.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
    public static void main(String[] args) {

        //XML configuration
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Employee_ApplicationConfigClassBean employeeApplicationConfigClassBean = (Employee_ApplicationConfigClassBean) context.getBean("employeeApplicationConfigClassBean");

        //Class configuration
        ApplicationContext context1 = new AnnotationConfigApplicationContext(ApplicationConfigClass.class);
        Employee_ApplicationConfigClassBean employeeApplicationConfigClassBean1 = context1.getBean(Employee_ApplicationConfigClassBean.class);

        //@Component in bean class
        ComponentAnnotationBeans componentAnnotationBeans = context1.getBean(ComponentAnnotationBeans.class);
        BeanConstructionInjection beanConstructionInjection = context1.getBean(BeanConstructionInjection.class);
        BeanPropertyInjection beanPropertyInjection = context1.getBean(BeanPropertyInjection.class);
        PostConstructPreDestroyBeans postConstructPreDestroyBeans = context1.getBean(PostConstructPreDestroyBeans.class);

        System.out.println(employeeApplicationConfigClassBean.getFirstName());
        System.out.println(employeeApplicationConfigClassBean1.getFirstName());
        System.out.println(componentAnnotationBeans.saySomething());
        System.out.println(beanConstructionInjection.getComponentAnnotationBeans().saySomething());
        System.out.println(beanPropertyInjection.getComponentAnnotationBeans().saySomething());
        System.out.println(postConstructPreDestroyBeans.saySomething());
    }
}
