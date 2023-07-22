package com.design.factory.abstractF;

public class XiaomiFactory implements IProductFactory {
    @Override
    public IphoneProduct iphoneProduct() {
        return new XiaomiPhone();
    }

    @Override
    public IRouterProduct irouterProduct() {
        return new XiaomiRouter();
    }
}
