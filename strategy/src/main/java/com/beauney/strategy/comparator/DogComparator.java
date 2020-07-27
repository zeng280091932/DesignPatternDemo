package com.beauney.strategy.comparator;

import com.beauney.strategy.comparable.Dog;

/**
 * @author zengjiantao
 * @since 2020-07-27
 */
public class DogComparator implements Comparator<Dog> {
    @Override
    public int compare(Dog d1, Dog d2) {
        if (d1.weight < d2.weight) {
            return -1;
        } else if (d1.weight > d2.weight) {
            return 1;
        } else {
            return 0;
        }
    }
}
