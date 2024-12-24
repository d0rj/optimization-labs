package ru.sberbank.lab2ser.model;

import java.util.List;

public class DeliveryEntry {
    private String market;

    private List<DeliveryProduct> products;

    private String cardNumber;

    private double servicePercent;

    public DeliveryEntry() {
    }

    public DeliveryEntry(String market, List<DeliveryProduct> products, String cardNumber, double servicePercent) {
        this.market = market;
        this.products = products;
        this.cardNumber = cardNumber;
        this.servicePercent = servicePercent;
    }

    public String getMarket() {
        return market;
    }

    public void setMarket(String market) {
        this.market = market;
    }

    public List<DeliveryProduct> getProducts() {
        return products;
    }

    public void setProducts(List<DeliveryProduct> products) {
        this.products = products;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public double getServicePercent() {
        return servicePercent;
    }

    public void setServicePercent(double servicePercent) {
        this.servicePercent = servicePercent;
    }
}
