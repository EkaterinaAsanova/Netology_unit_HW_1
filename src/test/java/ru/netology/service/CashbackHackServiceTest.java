package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {
    @Test
    void shouldCashbackHackServiceWithPriceInMiddle() {
        CashbackHackService service = new CashbackHackService();
        int amount = 500;

        int actual = service.remain(amount);
        int expected = 500;

        assertEquals(actual, expected);
    }

    @Test
    void shouldCashbackHackServiceWithFreePurchase() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;

        int actual = service.remain(amount);
        int expected = 1000;

        assertEquals(actual, expected);
    }

    @Test
    void shouldCashbackHackServiceWithMinPricePurchase() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1;

        int actual = service.remain(amount);
        int expected = 999;

        assertEquals(actual, expected);
    }

    @Test
    void shouldCashbackHackServiceWithCostOf999Rubles() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;

        int actual = service.remain(amount);
        int expected = 1;

        assertEquals(actual, expected);
    }

    @Test
    void shouldCashbackHackServiceWithCostOf1_000Rubles() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    void shouldCashbackHackServiceWithCostOf9_999Rubles() {
        CashbackHackService service = new CashbackHackService();
        int amount = 9999;

        int actual = service.remain(amount);
        int expected = 1;

        assertEquals(actual, expected);
    }
}