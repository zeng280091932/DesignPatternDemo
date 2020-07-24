package com.beauney.chain;

/**
 * @author zengjiantao
 * @since 2020-07-24
 */
public class Request1 extends AbsRequest {
    public Request1(String desc) {
        super(desc);
    }

    @Override
    int getLevel() {
        return 1;
    }
}
