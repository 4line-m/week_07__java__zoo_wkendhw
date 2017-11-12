package com.example.alinemokfa.zoo.enclosures;

import com.example.alinemokfa.zoo.Animal;
import com.example.alinemokfa.zoo.Jaguar;

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
}
