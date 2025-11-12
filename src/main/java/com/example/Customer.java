package com.example;

import java.util.Set;

public class Customer {

    private final long id;
    private final String name;
    private final long level;

    private final Set<Order> orderSet;

    public Customer(long id, String name, long level, Set<Order> orderSet) {
        this.id = id;
        this.name = name;
        this.level = level;
        this.orderSet = orderSet;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public long getLevel() {
        return level;
    }

    public Set<Order> getOrderSet() {
        return orderSet;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", Имя='" + name + '\'' +
                ", Уровень=" + level +
                ", orderSet=" + orderSet +
                '}';
    }
}
