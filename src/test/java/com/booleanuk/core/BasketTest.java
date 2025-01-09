package com.booleanuk.core;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class BasketTest {
    @Test
    public void canAddNewItem() {
        Basket basket = new Basket();
        String product = "eggs";
        int price = 20;
        Assertions.assertTrue(basket.add(product, price));
    }
}
