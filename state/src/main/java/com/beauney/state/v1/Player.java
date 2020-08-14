package com.beauney.state.v1;

/**
 * @author zengjiantao
 * @since 2020-08-14
 */
public class Player {
    enum PlayerState {GOOD, BAD}

    PlayerState state;

    public void shot(){
        if (state == PlayerState.GOOD){
            System.out.println("射门精准");
        }else if (state == PlayerState.BAD){
            System.out.println("射门打飞机");
        }
    }

    public void pass(){
        if (state == PlayerState.GOOD){
            System.out.println("传球精准");
        }else if (state == PlayerState.BAD){
            System.out.println("传球出界");
        }
    }

    public void run(){
        if (state == PlayerState.GOOD){
            System.out.println("跑动不累");
        }else if (state == PlayerState.BAD){
            System.out.println("跑动费劲");
        }
    }
}
