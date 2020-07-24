package com.beauney.chain;

/**
 * 抽象处理者
 *
 * @author zengjiantao
 * @since 2020-07-24
 */
public abstract class AbsHandler {
    private AbsHandler nextHandler;

    public void setNextHandler(AbsHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handleRequest(AbsRequest request) {
        if (request.getLevel() == getLevel()) {
            handle(request);
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }

    abstract int getLevel();

    abstract void handle(AbsRequest request);
}
