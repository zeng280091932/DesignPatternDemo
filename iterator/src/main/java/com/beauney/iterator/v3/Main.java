package com.beauney.iterator.v3;

/**
 * @author zengjiantao
 * @since 2020-08-05
 */
public class Main {
    public static void main(String[] args) {
        Collection_<String> collection_ = new ArrayList_<>();
//        Collection_<String> collection_ = new LinkedList_<>();
        for (int i = 0; i < 15; i++) {
            collection_.add("collection_" + i);
        }

        Iterator<String> iterator = collection_.iterator();
        while (iterator.hasNext()) {
            String string = iterator.next();
            System.out.println(string);
        }
    }
}
