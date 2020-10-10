package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceJunitJupiterTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldShowRemain1000For0() {
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldShowRemain950For1050() {
        int amount = 1050;
        int actual = service.remain(amount);
        int expected = 950;
        assertEquals(expected, actual);
    }

    // The test is frequently fail. The issue was published.
    @Test
    public void shouldReturn0For1000() {
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldShowRemain100For900() {
        int amount = 100;
        int actual = service.remain(amount);
        int expected = 900;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateNegative() {
        int amount = -5;
        int actual = service.remain(amount);
        int expected = 1005;
        assertEquals(expected, actual);
    }
}
