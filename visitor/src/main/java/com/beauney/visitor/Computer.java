package com.beauney.visitor;

/**
 * @author zengjiantao
 * @since 2020-08-10
 */
public class Computer {
    ComputerPart cpu = new Cpu();
    ComputerPart memory = new Memory();
    ComputerPart board = new Board();

    void accept(Visitor visitor){
        cpu.accept(visitor);
        memory.accept(visitor);
        board.accept(visitor);
    }

    public static void main(String[] args) {
        Computer computer = new Computer();
        PersonalVisitor personalVisitor = new PersonalVisitor();
        computer.accept(personalVisitor);
        System.out.println(personalVisitor.totalPrice);
    }
}
