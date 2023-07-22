package com.design.singleton;

//懶漢式單例模式
public class LazyMan {
    public LazyMan() {
        System.out.println(Thread.currentThread().getName() + "ok");
    }

    private static LazyMan lazyMan;

    public static LazyMan getInstance() {
        if (lazyMan == null) {
            lazyMan = new LazyMan();

        }

        return lazyMan;
    }

    //單執行續時沒問題，但多執行續並行時就會出問題
    //以下是簡單示範
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                LazyMan.getInstance();
            }).start();

        }
    }
    //每次回傳的執行續實例都不同數量
    //解決方法-雙重鎖

}
