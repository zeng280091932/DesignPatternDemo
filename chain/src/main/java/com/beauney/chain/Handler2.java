package com.beauney.chain;

/**
 * @author zengjiantao
 * @since 2020-07-24
 */
public class Handler2 extends AbsHandler {
    @Override
    int getLevel() {
        return 2;
    }

    @Override
    void handle(AbsRequest request) {
        System.out.println("Hanler2 处理了--->" + request.getDesc());
    }
}
