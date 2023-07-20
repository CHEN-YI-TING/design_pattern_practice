package com.design.factory.simple;

public class CarFactory {
    public CarFactory() {
    }

    public static Car getCar(String car) {

        //但當我們要新增車的類別時，這邊會需要修改，直接破壞開放封閉原則。
        if (car.equals("bmw")) {
            return new Bmw();
        }
        if (car.equals("toyota")) {
            return new Toyota();
        } else {
            return null;
        }
    }
}
