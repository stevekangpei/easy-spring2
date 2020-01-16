package com.kangpei.ioc.xml;

import com.kangpei.ioc.BeanDefinition;
import com.kangpei.ioc.BeanDefinitionReader;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * 这个类的作用主要是加载配置文件，然后
 */
public class XmlBeanDefinitionReader implements BeanDefinitionReader {

    private Map<String, BeanDefinition>  registry;

    public XmlBeanDefinitionReader() {
        this.registry = new HashMap<String, BeanDefinition>();
    }

    public void loadBeanDefinitions(String location) {

    }
}
