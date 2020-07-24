package com.beauney.chain;

/**
 * @author zengjiantao
 * @since 2020-07-24
 */
public class Handler3 extends AbsHandler {
    @Override
    int getLevel() {
        return 3;
    }

    @Override
    void handle(AbsRequest request) {
        System.out.println("Hanler3 处理了--->" + request.getDesc());
    }
}
