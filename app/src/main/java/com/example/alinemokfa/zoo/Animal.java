package com.example.alinemokfa.zoo;

/**
 * Created by alinemokfa on 12/11/2017.
 */

public abstract class Animal {

    private int cashValue;

    public Animal(int cashValue) {
        this.cashValue = cashValue;
    }

    public int getCashValue() {
        return this.cashValue;
    }

}
