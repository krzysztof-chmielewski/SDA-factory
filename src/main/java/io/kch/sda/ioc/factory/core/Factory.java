package io.kch.sda.ioc.factory.core;

import java.util.List;

interface Factory {
    Good produce();

    List<Good> produce(int n);
}
