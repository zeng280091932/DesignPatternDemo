package com.beauney.prototype;

/**
 * @author zengjiantao
 * @since 2020-07-22
 */
public class PersonalOrder implements IOrder {
    private int orderNumber;
    private String orderName;

    @Override
    public int getOrderNumber() {
        return orderNumber;
    }

    @Override
    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    @Override
    public Prototype cloneOrder() {
        PersonalOrder personalOrder = new PersonalOrder();
        personalOrder.setOrderName(orderName);
        personalOrder.setOrderNumber(orderNumber);
        return personalOrder;
    }
}
