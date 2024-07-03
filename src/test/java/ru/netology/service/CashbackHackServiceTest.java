package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldReturnProperRemainIfAmountAboveBoundary() {
        int amount = 2_400;
        int actual = service.remain(amount);
        int expected = 600;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnProperRemainIfAmountBelowBoundary() {
        int amount = 600;
        int actual = service.remain(amount);
        int expected = 400;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnProperRemainIfAmountEqualsBoundary() {
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }
}