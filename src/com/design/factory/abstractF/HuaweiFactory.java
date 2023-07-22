package com.design.factory.abstractF;

public class HuaweiFactory implements IProductFactory {
    @Override
    public IphoneProduct iphoneProduct() {
        return new HuaweiPhone();
    }

    @Override
    public IRouterProduct irouterProduct() {
        return new HuaweRouter();
    }
}
