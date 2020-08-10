package com.beauney.visitor;

/**
 * @author zengjiantao
 * @since 2020-08-10
 */
public class CorpVisitor implements Visitor {
    double totalPrice = 0.0;

    @Override
    public void visitCpu(ComputerPart cpu) {
        totalPrice += cpu.getPrice() * 0.8;
    }

    @Override
    public void visitMemory(ComputerPart memory) {
        totalPrice += memory.getPrice() * 0.75;
    }

    @Override
    public void visitBoard(ComputerPart board) {
        totalPrice += board.getPrice() * 0.85;
    }
}
