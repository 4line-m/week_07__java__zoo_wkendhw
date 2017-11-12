package com.example.alinemokfa.zoo;

import com.example.alinemokfa.zoo.animals.Jaguar;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by alinemokfa on 12/11/2017.
 */

public class JaguarTest {

    Jaguar jaguar;

    @Before
    public void before() {
        jaguar = new Jaguar(500);
    }

    @Test
    public void checkCashValue() {
        assertEquals(500, jaguar.getCashValue());
    }
}
