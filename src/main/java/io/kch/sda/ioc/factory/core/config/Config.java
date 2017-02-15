package io.kch.sda.ioc.factory.core.config;

import io.kch.sda.ioc.factory.core.factory.Factory;
import io.kch.sda.ioc.factory.core.good.Good;
import io.kch.sda.ioc.factory.core.good.Quality;
import io.kch.sda.ioc.factory.core.resource.Dye;
import io.kch.sda.ioc.factory.core.resource.Resource;
import org.springframework.context.annotation.*;

import java.io.PrintStream;

@Configuration
@ComponentScan(basePackageClasses = {Factory.class, Good.class, Resource.class})
@PropertySource("classpath:config.properties")
public class Config {
    @Bean
    public PrintStream printStream() {
        return System.out;
    }

    @Bean
    @Profile("default")
    public Quality normal() {
        return Quality.NORMAL;
    }

    @Bean
    @Profile("lazy-employees")
    public Quality poor() {
        return Quality.POOR;
    }

    @Bean
    @Profile("super-productive-employees-communism-approves")
    public Quality outstanding() {
        return Quality.OUTSTANDING;
    }

    @Bean
    public Dye defaultDye() {
        return Dye.WHITE;
    }
}
