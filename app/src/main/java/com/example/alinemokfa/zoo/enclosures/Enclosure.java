package com.example.alinemokfa.zoo.enclosures;

import com.example.alinemokfa.zoo.animals.Animal;

import java.util.ArrayList;

/**
 * Created by alinemokfa on 12/11/2017.
 */

public class Enclosure<T extends Animal> {

    private ArrayList<T> enclosure;

    public Enclosure(){
        this.enclosure = new ArrayList<>();
    }

    public int animalCount() {
        return this.enclosure.size();
    }


    public void addAnimal(T animal) {
        this.enclosure.add(animal);
    }

    public void removeAnimal(T animal) {
        this.enclosure.remove(animal);
    }

    public boolean findAnimal(T animal) {
        if(this.enclosure.contains(animal)) {
            return true;
        }
        return false;
    }
}
