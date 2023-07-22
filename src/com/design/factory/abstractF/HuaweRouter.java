package com.design.factory.abstractF;

public class HuaweRouter implements IRouterProduct {
    @Override
    public void start() {
        System.out.println("啟動華為路由器");
    }

    @Override
    public void shutdown() {
        System.out.println("關閉華為路由器");
    }

    @Override
    public void openWife() {
        System.out.println("打開華為路由器wify");
    }

    @Override
    public void setting() {
        System.out.println("打開華為設定");
    }
}
