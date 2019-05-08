package com.hjl.javabase.jmx.condition;

import javax.management.Notification;
import javax.management.NotificationBroadcasterSupport;

/**
 * Created with IntelliJ IDEA.
 * User: hjl
 * Date: 19-5-8
 * Time: 上午10:08
 * Description:
 */
public class Say extends NotificationBroadcasterSupport implements SayMBean {

    @Override
    public void hi() {
        Notification notification = new Notification(
                "",
                this,
                1,
                System.currentTimeMillis(),
                "hahaha i am boy"
        );
        sendNotification(notification);
    }
}
