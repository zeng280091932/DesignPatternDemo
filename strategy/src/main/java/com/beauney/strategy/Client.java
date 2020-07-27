package com.beauney.strategy;

import com.beauney.strategy.comparable.Cat;
import com.beauney.strategy.comparable.Dog;
import com.beauney.strategy.comparator.CatHeightComparator;
import com.beauney.strategy.comparator.CatWeightComparator;
import com.beauney.strategy.comparator.DogComparator;
import com.beauney.strategy.comparator.Sorter;

import java.util.Arrays;

/**
 * @author zengjiantao
 * @since 2020-07-27
 */
public class Client {
    public static void main(String[] args) {
        /*int[] a = {9, 2, 3, 5, 7, 1, 4};
        new Sorter().sort(a);
        System.out.println(Arrays.toString(a));*/

        /*Cat[] a = {new Cat(3, 3), new Cat(5, 5), new Cat(1, 1)};
        new Sorter<Cat>().sort(a);
        System.out.println(Arrays.toString(a));*/


        /*Dog[] a = {new Dog(3), new Dog(5), new Dog(1)};
        new Sorter<Dog>().sort(a);
        System.out.println(Arrays.toString(a));*/

//        Cat[] a = {new Cat(3, 3), new Cat(5, 5), new Cat(1, 1)};
////        new Sorter<Cat>().sort(a, new CatWeightComparator());
//        new Sorter<Cat>().sort(a, new CatHeightComparator());
//        System.out.println(Arrays.toString(a));

        Dog[] a = {new Dog(3), new Dog(5), new Dog(1)};
        new Sorter<Dog>().sort(a, new DogComparator());
        System.out.println(Arrays.toString(a));
    }
}
