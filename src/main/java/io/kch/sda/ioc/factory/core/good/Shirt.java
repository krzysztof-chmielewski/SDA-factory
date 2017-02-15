package io.kch.sda.ioc.factory.core.good;

import io.kch.sda.ioc.factory.core.resource.Dye;
import io.kch.sda.ioc.factory.core.resource.Fabric;

public class Shirt implements Good {
    private final Quality quality;
    private final Fabric fabric;
    private final Dye dye;

    public Shirt(Quality quality, Fabric fabric, Dye dye) {
        this.quality = quality;
        this.fabric = fabric;
        this.dye = dye;
    }

    @Override
    public String toString() {
        return "Brand new " + fabric + " " + dye + "-coloured shirt of " + quality + " quality";
    }
}
