package io.kch.sda.ioc.factory;

import io.kch.sda.ioc.factory.config.Config;
import io.kch.sda.ioc.factory.factory.ShirtFactory;
import io.kch.sda.ioc.factory.resource.Dye;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        PrintStream printStream = context.getBean(PrintStream.class);
        ShirtFactory factory = context.getBean(ShirtFactory.class);
        printStream.println(factory.produce());
        printStream.println(factory.produce(2));
        factory.setDye(Dye.BLUE);
        printStream.println(factory.produce());
        printStream.println(factory.produce(3));
        factory.setDye(Dye.RED);
        printStream.println(factory.produce());

    }
}
