package com.design.factory.abstractF;

//抽象產品工廠
public interface IProductFactory {
    //負責生產手機和路由器
    IphoneProduct iphoneProduct();

    IRouterProduct irouterProduct();
}
