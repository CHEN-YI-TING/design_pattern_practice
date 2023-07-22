package com.design.singleton;

//靜態內部類別，但還是不安全--> 因為有反射
public class Holder {
    private Holder() {

    }

    public static Holder getInstance() {
        return InnerClass.HOLDER;
    }

    public static class InnerClass {
        private static final Holder HOLDER = new Holder();
    }

}
