package com.kangpei.ioc.factory;

public interface BeanFactoryAware {

    public void setBeanFactory(BeanFactory beanFactory) throws Exception;
}
