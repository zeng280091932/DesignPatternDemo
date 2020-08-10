package com.beauney.visitor;

/**
 * @author zengjiantao
 * @since 2020-08-10
 */
public class PersonalVisitor implements Visitor {
    double totalPrice = 0.0;

    @Override
    public void visitCpu(ComputerPart cpu) {
        totalPrice += cpu.getPrice() * 0.9;
    }

    @Override
    public void visitMemory(ComputerPart memory) {
        totalPrice += memory.getPrice() * 0.85;
    }

    @Override
    public void visitBoard(ComputerPart board) {
        totalPrice += board.getPrice() * 0.95;
    }
}
