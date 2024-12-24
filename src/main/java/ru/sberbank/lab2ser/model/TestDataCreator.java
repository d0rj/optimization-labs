package ru.sberbank.lab2ser.model;

import java.util.ArrayList;
import java.util.List;

public class TestDataCreator {
    public static DeliveryEntry instantiate() {
        List<DeliveryProduct> products = new ArrayList<>();
        products.add(new DeliveryProduct(1275.5, "Cozy T-Shirt", "Cozy sheets and Co", "soft cloth", 12));
        products.add(new DeliveryProduct(5.75, "bubble gum", "Dirol", "taste like classic bubble gum", 929));
        return new DeliveryEntry("Garmonicus", products, "1234123412341234", 0.1);
    }

    public static EntryProto.DeliveryEntry instantiateProto() {
        return EntryProto.DeliveryEntry.newBuilder()
                .setMarket("Garmonicus")
                .setCardNumber("1234123412341234")
                .setServicePercent(0.1)
                .addProducts(EntryProto.DeliveryEntry.DeliveryProduct.newBuilder()
                        .setCost(1275.5)
                        .setName("Cozy T-Shirt")
                        .setProducer("Cozy sheets and Co")
                        .setDescription("soft cloth")
                        .setId(12))
                .addProducts(EntryProto.DeliveryEntry.DeliveryProduct.newBuilder()
                        .setCost(5.75)
                        .setName("bubble gum")
                        .setProducer("Dirol")
                        .setDescription("taste like classic bubble gum")
                        .setId(929))
                .build();

    }
}
