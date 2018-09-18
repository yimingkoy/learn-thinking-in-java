package com.company;
import java.util.*;

public class SimpleIteration {
    public static void main(String[] args) {
        List<Integer> m_list = Arrays.asList(1, 2, 3, 4, 5);
        Iterator<Integer> it = m_list.iterator();
        while(it.hasNext()) {
            Integer a = it.next();
            System.out.println(a);
        }
    }
}
