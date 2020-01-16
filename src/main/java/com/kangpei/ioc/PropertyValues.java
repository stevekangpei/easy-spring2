package com.kangpei.ioc;

import java.util.ArrayList;
import java.util.List;

public class PropertyValues {

    private List<PropertyValue> propertyValues = new ArrayList<PropertyValue>();

    public void addPropertyValues(PropertyValue propertyValue) {
        this.propertyValues.add(propertyValue);
    }

    public List<PropertyValue> getPropertyValues() {
        return this.propertyValues;
    }

}
