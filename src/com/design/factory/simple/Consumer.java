package com.design.factory.simple;

public class Consumer {
    public static void main(String[] args) {
        //原本顧客要去買車的情形
        //問題1. 在現實的情況下當顧客要去買車時，顧客不需要知道車的內部細節，
        //而我們自行使用new關鍵字來獲取想要車子的行為，就像是自己造出車子

        Car bmw = new Bmw();
        bmw.name();
        Car toyota = new Toyota();
        toyota.name();
        //解決: 實現一個工廠類別，需要時去工廠獲取
        Car bmw1 = CarFactory.getCar("bmw");
        bmw1.name();
        Car toyota1 = CarFactory.getCar("toyota");
        toyota1.name();
    }
}
