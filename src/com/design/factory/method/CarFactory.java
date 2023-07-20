package com.design.factory.method;

public interface CarFactory {
    //針對靜態/簡單工廠模式，要如何解決違反開放封閉原則呢
    //答: 實現一個工廠的統一介面
    Car getCar();

}
