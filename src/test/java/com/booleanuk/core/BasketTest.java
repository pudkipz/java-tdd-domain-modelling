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

    @Test
    public void cannotAddExistingItem() {
        Basket basket = new Basket();
        String product = "eggs";
        int price = 20;
        basket.add(product, price);
        Assertions.assertFalse(basket.add(product, price));
    }

    @Test
    public void emptyBasketShouldHaveZeroTotal() {
        Basket basket = new Basket();
        Assertions.assertEquals(basket.total(), 0);
    }
}
