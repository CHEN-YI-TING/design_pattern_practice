package com.design.factory.method;
public class Consumer {
    public static void main(String[] args) {
        //工廠方法模式與簡單工廠的區別 : 簡單工廠只有一個工廠，
        //工廠方法模式則是每個車的類別都各自有一個工廠，共同實現一個工廠介面，實現橫向的擴展
        //優點，當你要新增車的種類，只要在新增一個車的類別與此類別的工廠類別
        //缺點，類別越來越多
        Car bmw = new BmwFactory().getCar();
        bmw.name();
        Car toyota = new ToyotaFactory().getCar();
        toyota.name();
        //結構複雜度: simple factory good
        //程式碼複雜度: simple factory good
        //寫程式複雜度: simple factory good
        //管理複雜度 : simple factory good

        //根據設計原則: 工廠方法模式
        //根據實際業務: 簡單工廠模式


    }
}
