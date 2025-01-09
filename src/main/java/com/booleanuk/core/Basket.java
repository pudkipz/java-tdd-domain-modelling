package com.booleanuk.core;

import java.util.HashMap;
import java.util.Map;

public class Basket {
    Map<String, Integer> items = new HashMap<>();

    public boolean add(String product, int price) {
        if (items.containsKey(product)) {
            return false;
        }

        items.put(product, price);
        return true;
    }
}
