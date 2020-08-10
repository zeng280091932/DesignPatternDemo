package com.beauney.visitor;

/**
 * @author zengjiantao
 * @since 2020-08-10
 */
public class Cpu extends ComputerPart {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitCpu(this);
    }

    @Override
    public double getPrice() {
        return 500;
    }
}
