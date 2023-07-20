package com.design.factory.method;

public class BmwFactory implements CarFactory {
    @Override
    public Car getCar() {
        return new Bmw();
    }
}
