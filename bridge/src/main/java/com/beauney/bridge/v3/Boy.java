package com.beauney.bridge.v3;


/**
 * @author zengjiantao
 * @since 2020-08-12
 */
public class Boy {
    public void chase(Girl girl) {
        Gift gift = new WarmGift(new Book());
        give(girl, gift);
    }

    public void give(Girl girl, Gift gift) {

    }
}
