package com.design.singleton;

import java.lang.reflect.Constructor;


//解決方法-雙重鎖
public class LazyMan_Resolve {
    //加上volatile 保證原子性操作
    private volatile static LazyMan_Resolve lazyMan;
    //懶漢式單例模式

    //處理反射二次破壞情形-->新增密鑰，但是有可能會被解密，又被反射再破壞= = 幹!!，最後請出枚舉
    private static boolean key = false;

    private LazyMan_Resolve() {
        //這邊針對反射的破壞進行處理-->三重鎖
        synchronized (LazyMan_Resolve.class) {
            if (key == false) {
                key = true;
            } else {
                throw new RuntimeException("不要使用反射破壞");
            }
//            if (lazyMan != null) {
//              throw new RuntimeException("不要使用反射破壞");
//            }
        }
//        System.out.println(Thread.currentThread().getName() + "ok");
    }


    public static LazyMan_Resolve getInstance() {
        //實作雙重鎖模式的懶漢式單例DCL--> 有一些問題? 程式碼安全嗎?
        if (lazyMan == null) {
            synchronized (LazyMan.class) {
                if (lazyMan == null) {
                    lazyMan = new LazyMan_Resolve();//他並不是一個原子性操作
                    //非原子性操作
                    //1. 分配記憶體空間
                    //2. 執行建構子方法，開始初始化物件
                    //3. 把物件指向此空間

                    //可能執行順序不對
                    // 123 or 321 or 132

                }
            }
        }


        return lazyMan; //此時lazyMan 還沒完成建構子
    }

    //單執行續時沒問題，但多執行續並行時就會出問題
    //以下是簡單示範
//    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//            new Thread(() -> {
//                com.design.singleton.LazyMan_Resolve.getInstance();
//            }).start();
//
//        }
//    }

    //反射
    public static void main(String[] args) throws Exception {
//        LazyMan_Resolve instance = LazyMan_Resolve.getInstance(); 加上三重鎖後，假設不用此方法去new
        Constructor<LazyMan_Resolve> declaredConstructor = LazyMan_Resolve.class.getDeclaredConstructor(null);
        declaredConstructor.setAccessible(true);
        //使用下免得方法建立實例，又會破壞反射
        LazyMan_Resolve instance2 = declaredConstructor.newInstance();
        LazyMan_Resolve instance3 = declaredConstructor.newInstance();

        System.out.println(instance3);
        System.out.println(instance2);
        //輸出的hashcode已經不是相同的值，代表單例被反射破壞了
        //com.design.singleton.LazyMan@682a0b20
        //com.design.singleton.LazyMan@3d075dc0

    }
}

