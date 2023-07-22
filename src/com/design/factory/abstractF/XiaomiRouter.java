package com.design.factory.abstractF;

public class XiaomiRouter implements IRouterProduct {
    @Override
    public void start() {
        System.out.println("啟動小米路由器");
    }

    @Override
    public void shutdown() {
        System.out.println("關閉小米路由器");
    }

    @Override
    public void openWife() {
        System.out.println("打開小米路由器wify");
    }

    @Override
    public void setting() {
        System.out.println("打開小米設定");
    }
}
