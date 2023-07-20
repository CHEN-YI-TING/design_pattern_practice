package com.design.factory.method;

public class ToyotaFactory implements CarFactory {
    @Override
    public Car getCar() {
        return new Toyota();
    }
}
