package com.hjl.javabase.javaneixing.MainStart;

import com.hjl.javabase.javaneixing.User;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;

/**
 * Created with IntelliJ IDEA.
 * User: hjl
 * Date: 19-5-7
 * Time: 上午11:04
 * Description:
 */
public class NeixingStart {

    public static void main(String [] args) throws Exception{
      /**  通过 PropertyDescriptor*/
        User user = new User();
        PropertyDescriptor propertyDescriptor = new PropertyDescriptor("name", User.class);
        Method writeMethod = propertyDescriptor.getWriteMethod();
        writeMethod.invoke(user,"hello");
        System.out.println(user.getName());
        /** 通过 Introspector*/
        BeanInfo beanInfo = Introspector.getBeanInfo(User.class);
        PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
        for (PropertyDescriptor descriptor : propertyDescriptors) {
            System.out.println(descriptor.getReadMethod());
        }
    }

}
