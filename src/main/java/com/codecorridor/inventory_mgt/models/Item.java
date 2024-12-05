package com.codecorridor.inventory_mgt.models;

import java.util.UUID;

public class Item {

    private UUID itemId;
    private String name;
    private short quantity;
    private boolean isAvailable;

    public Item(){}
    public Item( String name, short quantity, boolean isAvailable){
        setName(name);
        setQuantity(quantity);
        setAvailable(isAvailable);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getQuantity() {
        return quantity;
    }

    public void setQuantity(short quantity) {
        this.quantity = quantity;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
