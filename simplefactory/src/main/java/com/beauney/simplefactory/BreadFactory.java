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

    /**
     * 第一种写法，需要传入类型
     * @param type
     * @return
     */
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

    /**
     * 第二种写法，需要传入类型
     * @param clazz
     * @param <T>
     * @return
     */
    public static <T extends IBread> T create(Class clazz) {
        IBread bread = null;
        try {
            bread = (IBread) Class.forName(clazz.getName()).newInstance();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (T) bread;
    }
}
