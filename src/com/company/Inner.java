package com.company;

public class Inner {
    class Contents {
        private  int i = 11;
        public int value() {return i;}
    }
    class Destination {
        private String label;
        Destination(String whereTo) {
            label= whereTo;
        }
        String readLable () {return label;}
    }
    public void ship(String dest) {
        Contents c = new Contents();
        Destination d = new Destination(dest);
        System.out.println(d.readLable());
    }
    public static void main(String[] args) {
        Inner m_inner = new Inner();
        m_inner.ship("Tasmania");
    }
}
