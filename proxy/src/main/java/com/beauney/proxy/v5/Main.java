package com.beauney.proxy.v5;

import com.beauney.proxy.Movable;
import com.beauney.proxy.v4.CarLogProxy;
import com.beauney.proxy.v4.CarTimeProxy;

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
        Movable movable = (Movable) Proxy.newProxyInstance(car.getClass().getClassLoader(), new Class[]{Movable.class}, new LogHandler(car));
        movable.move();
    }

    static class LogHandler implements InvocationHandler {
        Car car;

        public LogHandler(Car car) {
            this.car = car;
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
            Object o = method.invoke(car, args);
            end();
            return o;
        }
    }
}
