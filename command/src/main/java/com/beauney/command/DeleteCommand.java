package com.beauney.command;

/**
 * @author zengjiantao
 * @since 2020-08-12
 */
public class DeleteCommand extends Command {
    Content c;
    String deleted;

    public DeleteCommand(Content c) {
        this.c = c;
    }

    @Override
    public void exec() {
        deleted = c.msg.substring(0, 5);
        c.msg = c.msg.substring(5);
    }

    @Override
    public void undo() {
        c.msg = deleted + c.msg;
    }
}
