package com.hjl.javabase.jmx.interfaceimpl;

/**
 * Created with IntelliJ IDEA.
 * User: hjl
 * Date: 19-5-7
 * Time: 上午11:45
 * Description:
 */
public class Hello implements HelloMBean {

    private String name;

    @Override
    public String sayHello() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name=name;
    }
}
