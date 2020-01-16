package com.kangpei.ioc.factory;

public interface BeanFactory {

    Object getBean(String beanName) throws Exception;
}
