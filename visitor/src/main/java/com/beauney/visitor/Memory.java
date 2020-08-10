package com.beauney.visitor;

/**
 * @author zengjiantao
 * @since 2020-08-10
 */
public class Memory extends ComputerPart {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitMemory(this);
    }

    @Override
    public double getPrice() {
        return 300;
    }
}
