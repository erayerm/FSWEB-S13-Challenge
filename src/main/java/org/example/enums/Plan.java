package org.example.enums;
public enum Plan{
    BASIC("basic", 150), PLAN2("plan2",200), PLAN3("plan3", 300);
    private String name;
    private int price;
    private Plan(String name, int price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

};