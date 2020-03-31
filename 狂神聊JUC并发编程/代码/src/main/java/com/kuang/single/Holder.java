package com.kuang.single;

// 静态内部类
public class Holder {
    private Holder(){

    }

    public static Holder getInstace(){
        return InnerClass.HOLDER;
    }

    public static class InnerClass{
        private static final Holder HOLDER = new Holder();
    }

}
