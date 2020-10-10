package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldShowRemain1000For0() {
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldShowRemain950For1050() {
        int amount = 1050;
        int actual = service.remain(amount);
        int expected = 950;
        assertEquals(actual, expected);
    }

    // The test is frequently fail. The issue was published.
    @Test
    public void shouldReturn0For1000() {
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldShowRemain100For900() {
        int amount = 100;
        int actual = service.remain(amount);
        int expected = 900;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculateNegative() {
        int amount = -5;
        int actual = service.remain(amount);
        int expected = 1005;
        assertEquals(actual, expected);
    }
}