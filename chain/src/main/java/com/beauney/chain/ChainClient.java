package com.beauney.chain;

/**
 * @author zengjiantao
 * @since 2020-07-24
 */
public class ChainClient {
    public static void main(String[] args) {
        AbsHandler handler1 = new Handler1();
        AbsHandler handler2 = new Handler2();
        AbsHandler handler3 = new Handler3();
        handler1.setNextHandler(handler2);
        handler2.setNextHandler(handler3);

        handler1.handleRequest(new Request1("任务一"));
        handler1.handleRequest(new Request2("任务二"));
        handler1.handleRequest(new Request3("任务三"));
    }
}
