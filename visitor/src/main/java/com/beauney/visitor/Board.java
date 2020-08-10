package com.beauney.visitor;

/**
 * @author zengjiantao
 * @since 2020-08-10
 */
public class Board extends ComputerPart {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitBoard(this);
    }

    @Override
    public double getPrice() {
        return 200;
    }
}
