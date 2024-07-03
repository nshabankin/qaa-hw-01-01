package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void ShouldReturnProperRemainIfAboveBoundary() {
        int amount = 2_600;
        int expected = 400;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

    @Test
    public void ShouldReturnProperRemainIfBelowBoundary() {
        int amount = 900;
        int expected = 100;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

    @Test
    public void ShouldReturnProperRemainIfEqualsBoundary() {
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void ShouldReturnProperRemainIfAboveBoundaryJUnitAPI() {
        int amount = 2_600;
        int expected = 400;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void ShouldReturnProperRemainIfBelowBoundaryJUnitAPI() {
        int amount = 900;
        int expected = 100;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void ShouldReturnProperRemainIfEqualsBoundaryJUnitAPI() {
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }
}