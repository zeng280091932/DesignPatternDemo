package com.beauney.strategy.comparator;

import com.beauney.strategy.comparable.Cat;

/**
 * @author zengjiantao
 * @since 2020-07-27
 */
public class CatWeightComparator implements Comparator<Cat> {
    @Override
    public int compare(Cat c1, Cat c2) {
        if (c1.weight < c2.weight) {
            return -1;
        } else if (c1.weight > c2.weight) {
            return 1;
        } else {
            return 0;
        }
    }
}
