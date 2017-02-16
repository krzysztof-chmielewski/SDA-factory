package io.kch.sda.ioc.factory.factory;

import io.kch.sda.ioc.factory.good.Good;

import java.util.List;

public interface Factory {
    Good produce();

    List<? extends Good> produce(int n);
}
