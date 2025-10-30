package com.example;

import java.time.LocalDate;
import java.util.Set;

public class Order {

    private final Long id;
    private final LocalDate date;
    private final LocalDate deliveryDate;
    private final String status;

    private final Set<Product> products;


    public Order(Long id, LocalDate date, LocalDate deliveryDate, String status, Set<Product> products) {
        this.id = id;
        this.date = date;
        this.deliveryDate = deliveryDate;
        this.status = status;
        this.products = products;
    }

    public Long getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public String getStatus() {
        return status;
    }

    public Set<Product> getProducts() {
        return products;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", Дата=" + date +
                ", Дата доставки=" + deliveryDate +
                ", Статус='" + status + '\'' +
                ", Продукт=" + products +
                '}';
    }
}
