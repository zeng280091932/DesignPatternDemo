package com.beauney.visitor;

/**
 * @author zengjiantao
 * @since 2020-08-10
 */
public abstract class ComputerPart {
    public abstract void accept(Visitor visitor);

    public abstract double getPrice();
}
