package com.beauney.command;

/**
 * @author zengjiantao
 * @since 2020-08-12
 */
public abstract class Command {
    public abstract void exec();

    public abstract void undo();
}
