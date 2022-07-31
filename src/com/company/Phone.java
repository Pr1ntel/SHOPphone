package com.company;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Phone {
    PhonesManager phonesManager = new PhonesManager();
    private String model;
    private int price;
    private int quantity;

    public void setPrice(int price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public Phone(String model, int price, int quantity) {
        this.model = model;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return  model + ' ' +
                 price +' ' +
                 quantity;
    }
    }


