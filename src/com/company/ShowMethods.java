package com.company;
import java.lang.reflect.*;
import java.util.regex.*;


public class ShowMethods {
    private static Pattern p = Pattern.compile("\\w+\\.");
    public static void main(String[] args) {
        try {
            Class<?> c = Class.forName("java.util.regex.Pattern");
            Method[] methods = c.getMethods();
            for(Method method : methods) {
 //               System.out.println(method.toString());
//                System.out.println(p.matcher(method.toString()).replaceAll(""));
            }
            Constructor[] ctors = c.getConstructors();
            for(Constructor ctor : ctors) {
                System.out.println(p.matcher(ctor.toString()).replaceAll(""));
            }

        } catch (ClassNotFoundException e) {
            System.out.println("No such class: " + e);
        }
    }
}
