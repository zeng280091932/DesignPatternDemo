package com.beauney.flyweight;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zengjiantao
 * @since 2020-08-03
 */
public class GirlFriendFactory {
    private static List<Girl> girlFriendPool = new ArrayList<>();

    public static Girl getGirlFriend() {
        for (Girl girl : girlFriendPool) {
            if (girl.getState() == 0) {
                return girl;
            }
        }
        Girl girl = new GirlFriend(0);
        girlFriendPool.add(girl);
        return girl;
    }

    public static void printSize() {
        System.out.println("共享女友池size：" + girlFriendPool.size());
    }
}
