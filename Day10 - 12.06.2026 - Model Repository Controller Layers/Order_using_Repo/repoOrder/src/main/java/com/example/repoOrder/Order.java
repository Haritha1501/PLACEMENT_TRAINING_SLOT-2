package com.example.repoOrder;
public class Order {

    private int id;
    private String cust_name;
    private String order_type;

    public Order() {
    }

    public Order(int id, String cust_name, String order_type) {
        this.id = id;
        this.cust_name = cust_name;
        this.order_type = order_type;
    }

    public int getId() {
        return id;
    }

    public String getCust_name() {
        return cust_name;
    }

    public String getOrder_type() {
        return order_type;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCust_name(String cust_name) {
        this.cust_name = cust_name;
    }

    public void setOrder_type(String order_type) {
        this.order_type = order_type;
    }
}