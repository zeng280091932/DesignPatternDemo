package com.beauney.chain;

/**
 * @author zengjiantao
 * @since 2020-07-24
 */
public class Request2 extends AbsRequest {
    public Request2(String desc) {
        super(desc);
    }

    @Override
    int getLevel() {
        return 2;
    }
}
