package com.strawberry.services;

/**
 * @author： 莫欺少年一时穷、
 * @create： 2022-01-24 15:42
 * @contents：XXX
        */
public class SomeServiceImpl implements SomeService {

    public SomeServiceImpl() {
        System.out.println("SomeServiceImpl无参数构造方法");
    }

    @Override
    public void doSome() {
        System. out.println("====业务方法doSome()====");
    }
}
