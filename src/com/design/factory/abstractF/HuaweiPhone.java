package com.design.factory.abstractF;

public class HuaweiPhone implements IphoneProduct {
    @Override
    public void start() {
        System.out.println("開啟華為手機");
    }

    @Override
    public void shutdown() {
        System.out.println("關閉華為手機");
    }

    @Override
    public void callup() {
        System.out.println("華為手機通話");
    }

    @Override
    public void sendSMS() {
        System.out.println("華為手機發簡訊");
    }
}
