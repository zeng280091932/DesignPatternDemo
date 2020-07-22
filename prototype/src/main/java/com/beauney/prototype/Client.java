package com.beauney.prototype;

/**
 * @author zengjiantao
 * @since 2020-07-22
 */
public class Client {
    public static void main(String[] args) {
        OrderDealFactory factory = new OrderDealFactory();

        //处理个人订单
        PersonalOrder order = new PersonalOrder();
        order.setOrderNumber(3200);
        order.setOrderName("个人订单");
        factory.dealOrder(order);

        //处理公司订单
        CompanyOrder companyOrder = new CompanyOrder();
        companyOrder.setOrderNumber(5600);
        companyOrder.setOrderName("公司订单");
        factory.dealOrder(companyOrder);

    }
}
