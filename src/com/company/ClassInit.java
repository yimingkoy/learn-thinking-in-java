package com.company;

import java.util.*;

class Initable {
    static final int staticF = 12;
    static final int staticF2 = ClassInit.rand.nextInt(100);
    static {
        System.out.println("Init Initable");
    }

}

class Initable2 {
    static final int staticNoF = 34;
    static {
        System.out.println("Init Initable2");
    }
}

class Initable3 {
    static int staticNoF = 56;
    static {
        System.out.println("Init Initable3");
    }
}
public class ClassInit {
    public static Random rand = new Random(78);
    public static void main(String[] args) throws Exception {
        Class initable = Initable.class;
        System.out.println("After create Initable ref");
        System.out.println(Initable.staticF);
        System.out.println(Initable.staticF2);
        System.out.println(Initable2.staticNoF);
        Class initable3 = Class.forName("com.company.Initable3");
        System.out.println("After create Initable3 ref");
        System.out.println(Initable3.staticNoF);

    }
}
