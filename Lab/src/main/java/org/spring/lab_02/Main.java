package org.spring.lab_02;


import org.spring.lab_02.account.Current;
import org.spring.lab_02.account.Saving;
import org.spring.lab_02.config.Config;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(Config.class);

        Saving saving = container.getBean(Saving.class);
        Current current = container.getBean(Current.class);

        /*getBean(Class<T> requiredType) 方法用于从 Spring 容器中获取指定类型的 Bean。
        requiredType 参数是指 Bean 的类型。
        Spring 容器会根据 Bean 定义中的类名来匹配 Bean。
        如果 Spring 容器找到匹配的 Bean，它会返回该 Bean。
        如果 Spring 容器没有找到匹配的 Bean，它会抛出异常。*/

        saving.initialize();
        current.initialize();
    }
}
