package com.design.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

//枚舉是甚麼? 枚舉本身也是一個類別
public enum enumS {
    INSTANCE;


    public enumS getInstance() {
        return INSTANCE;
    }
}

class Test {
    public static void main(String[] args) throws Exception {
        enumS instance1 = enumS.INSTANCE;
        enumS instance2 = enumS.INSTANCE;

        //System.out.println(instance1);
        //System.out.println(instance2);

        //反射不能破壞枚舉，ide騙你有無參數建構子，但用jad反編譯後的source code上只有有參數建構子，

        Constructor<enumS> declaredConstructor = enumS.class.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        enumS instance3 = declaredConstructor.newInstance();
        System.out.println(instance3);


    }
}
