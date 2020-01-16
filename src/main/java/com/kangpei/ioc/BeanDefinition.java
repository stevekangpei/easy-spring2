package com.kangpei.ioc;

public class BeanDefinition {


    /**
     *  bean定义信息
     */
    private Object bean;

    /**
     * bean名称
     */
    private String beanClassName;


    /**
     * bean类名
     */
    private Class beanClass;

    private PropertyValues propertyValues;


    public Object getBean() {
        return bean;
    }

    public void setBean(Object bean) {
        this.bean = bean;
    }

    public String getBeanClassName() {
        return beanClassName;
    }

    /**
     * 同时设置一下beanclass的名称
     * @param beanClassName
     */
    public void setBeanClassName(String beanClassName) {
        this.beanClassName = beanClassName;

        try {
            this.beanClass = Class.forName(beanClassName);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }

    public PropertyValues getPropertyValues() {
        return propertyValues;
    }

    public void setPropertyValues(PropertyValues propertyValues) {
        this.propertyValues = propertyValues;
    }


}
