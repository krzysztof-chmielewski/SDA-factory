package io.kch.sda.ioc.factory.resource;

import org.springframework.stereotype.Component;

@Component
public class Cotton implements Fabric {

    @Override
    public String toString() {
        return "cotton";
    }
}
