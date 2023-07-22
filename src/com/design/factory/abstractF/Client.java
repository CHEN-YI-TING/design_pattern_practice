package com.design.factory.abstractF;

public class Client {
    public static void main(String[] args) {
        System.out.println("=====小米產品=====");
        XiaomiFactory xiaomiFactory = new XiaomiFactory();
        IphoneProduct iphoneProduct = xiaomiFactory.iphoneProduct();
        iphoneProduct.callup();
        iphoneProduct.sendSMS();
        IRouterProduct iRouterProduct = xiaomiFactory.irouterProduct();
        iRouterProduct.openWife();
        iRouterProduct.setting();

        System.out.println("=====華為產品=====");
        HuaweiFactory huaweiFactory = new HuaweiFactory();
        IphoneProduct huaweiF = huaweiFactory.iphoneProduct();
        huaweiF.callup();
        huaweiF.sendSMS();

        IRouterProduct huaweiR = huaweiFactory.irouterProduct();
        huaweiR.openWife();
        huaweiR.setting();

    }
}
