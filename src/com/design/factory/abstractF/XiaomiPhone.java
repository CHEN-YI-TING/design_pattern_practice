package com.design.factory.abstractF;

public class XiaomiPhone implements IphoneProduct {

    @Override
    public void start() {
        System.out.println("開啟小米手機");
    }

    @Override
    public void shutdown() {
        System.out.println("關閉小米手機");
    }

    @Override
    public void callup() {
        System.out.println("小米手機通話");
    }

    @Override
    public void sendSMS() {
        System.out.println("小米手機發簡訊");
    }
}
