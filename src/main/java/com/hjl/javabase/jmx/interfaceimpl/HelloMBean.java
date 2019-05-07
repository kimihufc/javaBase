package com.hjl.javabase.jmx.interfaceimpl;

/**
 * Created with IntelliJ IDEA.
 * User: hjl
 * Date: 19-5-7
 * Time: 上午11:43
 * Description:  MBean 必须要以MBean结尾
 */
public interface HelloMBean {

    public String sayHello();

    public void setName(String name);
}
