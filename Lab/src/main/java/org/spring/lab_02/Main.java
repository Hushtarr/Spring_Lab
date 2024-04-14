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

        saving.initialize();
        current.initialize();
    }
}
