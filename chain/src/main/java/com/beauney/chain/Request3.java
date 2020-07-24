package com.beauney.chain;

/**
 * @author zengjiantao
 * @since 2020-07-24
 */
public class Request3 extends AbsRequest {
    public Request3(String desc) {
        super(desc);
    }

    @Override
    int getLevel() {
        return 3;
    }
}
