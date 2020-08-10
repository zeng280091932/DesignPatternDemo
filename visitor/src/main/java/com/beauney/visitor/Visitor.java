package com.beauney.visitor;

/**
 * @author zengjiantao
 * @since 2020-08-10
 */
public interface Visitor {
    void visitCpu(ComputerPart cpu);
    void visitMemory(ComputerPart memory);
    void visitBoard(ComputerPart board);
}
