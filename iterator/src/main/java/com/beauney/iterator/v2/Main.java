package com.beauney.iterator.v2;

import java.util.ArrayList;

/**
 * @author zengjiantao
 * @since 2020-08-05
 */
public class Main {
    public static void main(String[] args) {

//        Collection_<String> collection_ = new ArrayList_<>();
        Collection_<String> collection_ = new LinkedList_<>();
        for (int i = 0; i < 15; i++) {
            collection_.add("string" + i);
        }
    }
}
