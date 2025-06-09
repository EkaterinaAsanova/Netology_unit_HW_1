package ru.netology.service;

//import org.testng.annotations.Test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

//import static org.junit.Assert.assertEquals;

//import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {
    @Test
    public void shouldCashbackHackServiceWithPriceInMiddle() {
        CashbackHackService service = new CashbackHackService();
        int amount = 500;

        int actual = service.remain(amount);
        int expected = 500;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCashbackHackServiceWithFreePurchase() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;

        int actual = service.remain(amount);
        int expected = 1000;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCashbackHackServiceWithMinPricePurchase() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1;

        int actual = service.remain(amount);
        int expected = 999;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCashbackHackServiceWithCostOf999Rubles() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;

        int actual = service.remain(amount);
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCashbackHackServiceWithCostOf1_000Rubles() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCashbackHackServiceWithCostOf9_999Rubles() {
        CashbackHackService service = new CashbackHackService();
        int amount = 9999;

        int actual = service.remain(amount);
        int expected = 1;

        assertEquals(expected, actual);
    }
}