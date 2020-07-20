package com.beauney.simplefactory;

import android.widget.BaseExpandableListAdapter;

/**
 * @author zengjiantao
 * @since 2020-07-20
 */
public class BreadFactory {
    public static IBread create() {
        return new Bread();
    }

    public static IBread create(int type) {
        switch (type) {
            case 1:
                return new Bread();
            case 2:
                return new CreamBread();
            case 3:
                return new FruitsBread();
            default:
                return new Bread();
        }
    }
}
