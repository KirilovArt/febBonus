package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

class CashbackHackServiceTest {

    @Test
    void remain() {
        int amount = 700;
        int expected = 300;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }
}