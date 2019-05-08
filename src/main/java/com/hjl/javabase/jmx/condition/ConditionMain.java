package com.hjl.javabase.jmx.condition;

import com.hjl.javabase.jmx.interfaceimpl.Hello;
import com.sun.jdmk.comm.HtmlAdaptorServer;

import javax.management.MBeanServer;
import javax.management.ObjectName;
import java.lang.management.ManagementFactory;

/**
 * Created with IntelliJ IDEA.
 * User: hjl
 * Date: 19-5-8
 * Time: 上午10:17
 * Description:
 * Notification，一个通用的事件类型，该类标识事件的类型，可以被直接使用，也可以根据传递的事件的需要而被扩展。
 * NotificationListener接口，接受通知的对象需实现此接口。
 * NotificationFilter接口，作为通知过滤器的对象需实现此接口，为通知监听者提供了一个过滤通知的过滤器。
 * NotificationBroadcaster接口，通知发送者需实现此接口，该接口允许希望得到通知的监听者注册。
 *
 */
public class ConditionMain {

    public static void main(String [] args) throws Exception{
        MBeanServer server = ManagementFactory.getPlatformMBeanServer();

        ObjectName helloName = new ObjectName("MyMBean:name=HelloWorld");
        Hello hello = new Hello();
        server.registerMBean(hello,helloName);

        ObjectName adapterName = new ObjectName("MyBean:name=htmladapter,port=8082");
        HtmlAdaptorServer adapter = new HtmlAdaptorServer();
        server.registerMBean(adapter,adapterName);

        Say xs = new Say();
        server.registerMBean(xs,new ObjectName("MyMBean:name=xiaosi"));
        xs.addNotificationListener(new MyListoner(),null,hello);
        adapter.start();
    }

}
