package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

 public class CashbackHackServiceTest {


     @Test
    public void remain() {
         int amount = 700;
         int expected = 300;
         CashbackHackService service = new CashbackHackService();
         int actual = service.remain(amount);
         assertEquals(actual, expected);
     }
 }