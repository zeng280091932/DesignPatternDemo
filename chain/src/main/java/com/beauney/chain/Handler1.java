package com.beauney.chain;

/**
 * @author zengjiantao
 * @since 2020-07-24
 */
public class Handler1 extends AbsHandler {
    @Override
    int getLevel() {
        return 1;
    }

    @Override
    void handle(AbsRequest request) {
        System.out.println("Hanler1 处理了--->" + request.getDesc());
    }
}
