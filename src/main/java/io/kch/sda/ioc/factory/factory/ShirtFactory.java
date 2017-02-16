package io.kch.sda.ioc.factory.factory;

import io.kch.sda.ioc.factory.good.Quality;
import io.kch.sda.ioc.factory.good.Shirt;
import io.kch.sda.ioc.factory.resource.Dye;
import io.kch.sda.ioc.factory.resource.Fabric;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ShirtFactory implements Factory {
    private final Fabric fabric;
    private final Quality quality;
    private Dye dye;

    @Autowired
    public ShirtFactory(Fabric fabric, Quality quality) {
        this.fabric = fabric;
        this.quality = quality;
    }

    @Autowired
    public void setDye(Dye dye) {
        this.dye = dye;
    }

    @Override
    public Shirt produce() {
        return new Shirt(quality, fabric, dye);
    }

    @Override
    public List<Shirt> produce(int n) {
        List<Shirt> result = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            result.add(produce());
        }

        return result;
    }
}
