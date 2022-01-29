package com.strawberry;

import com.strawberry.services.SomeServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author： 莫欺少年一时穷、
 * @create： 2022-01-24 15:45
 * @contents：XXX
 */
public class MyTest01 {
    @Test
    public void test01(){
        String resource = "applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(resource);
        SomeServiceImpl someService = (SomeServiceImpl) applicationContext.getBean("someservice");
        someService.doSome();
        int count = applicationContext.getBeanDefinitionCount();
        String[] names = applicationContext.getBeanDefinitionNames();
        System.out.println("容器中对象的数量：" + count);
        for (String name:names){
            System.out.println("容器中对象的名称：" + name);
        }
    }
}
