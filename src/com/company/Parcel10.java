package com.company;

public class Parcel10 {
    public Destination destination(final String dest, final float price) {
        return new Destination() {
            private int cost;
            {
                cost = Math.round(price);
                System.out.println("Over budget!");
            }
            private String label = dest;
            public String readLabel() {return label;}
        };

    }
    public static void main(String[] args) {
        Parcel10 p = new Parcel10();
        Destination destination = p.destination("xxx", 101.1f);
    }
}


/*
public class Parcel11 {
    private static class ParcelContents implements Contents {
        private int i = 11;
        public int value() {return i;}
    }
    public static Contents contents() {
        return new ParcelContents();
    }
    public static void main(String[] args) {
        Contents c = contents();
    }
}*/

/*
public interface ClassInInterface {
    void howdy();
    class Test implements ClassInInterface {
        public void howdy() {
            System.out.println("Howdy!");
        }
        public static void main(String[] args) {
            new Test().howdy();
        }
    }
}*/

/*
public class TestBed {
    public void f() {}
    public static class Tester {
        public static void main(String[] args) {
            TestBed t = new TestBed();
            t.f();
        }
    }
}*/

/*class MNA {
    private void f() {}
    class A {
        private void g() {}
        public class B {
            void h() {
                g();
                f();
            }
        }
    }
}
public class MultiNestingAccess {
    public static void main(String[] args) {
        MNA mna = new MNA();
        MNA.A mnaa = mna.new A();
        MNA.A.B mnaab = mnaa.new B();
        mnaab.h();
    }
}*/

/*interface Counter {
    int next();
}
class LocalInnerClass {
    Counter getCounter(final String name) {
        class LocalCounter implements Counter {
            public LocalCounter() {

            }
        }
        return new LocalCounter();
    }

    Counter getCounter2(final String name) {
        return new Counter() {
            {
                System.out.println("Over budget!");
            }

        }
    }
}*/


