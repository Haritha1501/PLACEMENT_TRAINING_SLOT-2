package com.example.coffee_order;


import java.util.concurrent.atomic.AtomicLong;

public class Coffee {
    private String cust_name;
    private String coffee_type;
    private int id;
//    private static final AtomicLong idcount = new AtomicLong(0);
//    private String id;
//    public static Coffee idGenerate(Coffee coffee1) {
//        long idInc = idcount.getAndIncrement();
//        coffee1.setId(
//                coffee1.getCust_name() +
//                        coffee1.getCoffee_type() +
//                        idInc
//        );
//        return coffee1;
//    }
//


//    }
//    public static Coffee idGenerate(Coffee coffee1) {
//        long idInc = idcount.getAndIncrement();
//        return  coffee1.getCust_name() +
//                coffee1.getCoffee_type() +
//                idInc;
//    }
    public String  getCust_name() {
        return cust_name;
    }
    public void setCust_name(String cust_name) {
        this.cust_name = cust_name;
    }
    public String getCoffee_type() {
        return coffee_type;
    }
    public void setCoffee_type(String coffee_type) {
        this.coffee_type = coffee_type;
    }
    public int  getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}


