package com.kangpei.ioc;

/**
 * 名称和bean的引用信息
 */
public class BeanReference {


    private Object bean;
    private String name;

    public Object getBean() {
        return bean;
    }

    public void setBean(Object bean) {
        this.bean = bean;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
