package com.beauney.chain;

/**
 * @author zengjiantao
 * @since 2020-07-24
 */
public abstract class AbsRequest {
    private String desc;

    public AbsRequest(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    abstract int getLevel();
}
