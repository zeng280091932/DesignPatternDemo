package com.beauney.strategy.comparator;

import com.beauney.strategy.comparable.Cat;
import com.beauney.strategy.comparable.Dog;

/**
 * @author zengjiantao
 * @since 2020-07-27
 */
public class CatHeightComparator implements Comparator<Cat> {
    @Override
    public int compare(Cat c1, Cat c2) {
        if (c1.height < c2.height) {
            return -1;
        } else if (c1.height > c2.height) {
            return 1;
        } else {
            return 0;
        }
    }
}
