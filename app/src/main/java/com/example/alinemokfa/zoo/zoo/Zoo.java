package com.example.alinemokfa.zoo.zoo;

import com.example.alinemokfa.zoo.enclosures.Enclosure;

import java.util.ArrayList;

/**
 * Created by alinemokfa on 12/11/2017.
 */

public class Zoo<V extends Enclosure>{

    private ArrayList<V> enclosures;
    private int dollaBills;

    public Zoo() {
        this.enclosures = new ArrayList<>();
        this.dollaBills = 0;
    }


    public int enclosureCount() {
        return this.enclosures.size();
    }

    public void addEnclosure(V enclosure) {
        this.enclosures.add(enclosure);
    }

    public void removeEnclosure(V enclosure) {
        this.enclosures.remove(enclosure);
    }


    public int animalCount() {
        int total = 0;
        for(V enclosure : enclosures) {
            total += enclosure.animalCount();
        }
        return total;
    }
}
