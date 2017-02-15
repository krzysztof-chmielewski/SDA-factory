package io.kch.sda.ioc.factory.core.factory;

import io.kch.sda.ioc.factory.core.good.Good;

import java.util.List;

public interface Factory {
    Good produce();

    List<? extends Good> produce(int n);
}
