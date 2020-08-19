package com.beauney.proxy.v6;

import com.beauney.proxy.Movable;
import com.beauney.proxy.v5.Car;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author zengjiantao
 * @since 2020-08-05
 */
public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Movable movable = (Movable) Proxy.newProxyInstance(car.getClass().getClassLoader(), new Class[]{Movable.class}, new TimeHandler(car));
        movable.move();
    }

    static class LogHandler implements InvocationHandler {
        Object object;

        public LogHandler(Object object) {
            this.object = object;
        }

        private void before() {
            System.out.println("method start..");
        }

        private void end() {
            System.out.println("method  end!");
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            before();
            Object o = method.invoke(object, args);
            end();
            return o;
        }
    }

    static class TimeHandler implements InvocationHandler{

        Object object;

        public TimeHandler(Object object) {
            this.object = object;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            long start = System.currentTimeMillis();
            Object o = method.invoke(object, args);
            long end = System.currentTimeMillis();
            System.out.println("事件耗费时间:" + (end - start));
            return o;
        }
    }
}
