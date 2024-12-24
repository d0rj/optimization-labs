package ru.sberbank.lab2ser.model;

public class DeliveryProduct {
    private double cost;
    private String name;
    private String producer;
    private String description;
    private long id;

    public DeliveryProduct() {
    }

    public DeliveryProduct(double cost, String name, String producer, String description, long id) {
        this.cost = cost;
        this.name = name;
        this.producer = producer;
        this.description = description;
        this.id = id;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
