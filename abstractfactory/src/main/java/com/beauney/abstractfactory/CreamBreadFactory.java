package com.beauney.abstractfactory;

/**
 * @author zengjiantao
 * @since 2020-07-21
 */
public class CreamBreadFactory implements IFactory {
    @Override
    public IBread create() {
        return new CreamBread();
    }
}
