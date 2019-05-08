package com.hjl.javabase.jmx.condition;

import com.hjl.javabase.jmx.interfaceimpl.Hello;

import javax.management.Notification;
import javax.management.NotificationListener;

/**
 * Created with IntelliJ IDEA.
 * User: hjl
 * Date: 19-5-8
 * Time: 上午10:15
 * Description:
 */
public class MyListoner implements NotificationListener {
    @Override
    public void handleNotification(Notification notification, Object handback) {
        System.out.println("----------HelloListener-Begin------------");
        System.out.println("\ttype = "+ notification.getType());
        System.out.println("\tsource = "+notification.getSource());
        System.out.println("\tseq = "+notification.getSequenceNumber());
        System.out.println("\tsend time = "+notification.getTimeStamp());
        System.out.println("\tmessage="+notification.getMessage());
        System.out.println("----------HelloListener-End------------");

        if (handback != null) {
            if (handback instanceof Hello) {
                Hello hello = (Hello)handback;
                System.out.println(notification.getMessage());
            }
        }
    }
}
