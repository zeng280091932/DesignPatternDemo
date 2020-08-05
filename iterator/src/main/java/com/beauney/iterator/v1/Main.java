package com.beauney.iterator.v1;

import java.util.LinkedList;

/**
 * @author zengjiantao
 * @since 2020-08-05
 */
public class Main {
    public static void main(String[] args) {
        ArrayList_<String> arrayList_ = new ArrayList_<>();
        for (int i = 0; i < 15; i++) {
            arrayList_.add("string" + i);
        }

        LinkedList_<String> linkedList_ = new LinkedList_<>();
        for (int i = 0; i < 15; i++) {
            linkedList_.add("string" + i);
        }
    }
}
