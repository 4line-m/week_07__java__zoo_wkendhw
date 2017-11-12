package com.example.alinemokfa.zoo;

import com.example.alinemokfa.zoo.animals.GoldenLionTamarin;
import com.example.alinemokfa.zoo.animals.Jaguar;
import com.example.alinemokfa.zoo.enclosures.Enclosure;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by alinemokfa on 12/11/2017.
 */

public class EnclosureTest {

    Enclosure<Jaguar> jaguarEnclosure;
    Enclosure<GoldenLionTamarin> goldenLionTamarinEnclosure;

    Jaguar jaguar;
    GoldenLionTamarin goldenLionTamarin;

    @Before
    public void before() {

        jaguarEnclosure = new Enclosure<Jaguar>();
        goldenLionTamarinEnclosure = new Enclosure<GoldenLionTamarin>();

        jaguar = new Jaguar(1000);
        goldenLionTamarin = new GoldenLionTamarin(1000);
    }

    @Test
    public void enclosureStartsEmpty(){
        assertEquals(0, jaguarEnclosure.animalCount());
        assertEquals(0, goldenLionTamarinEnclosure.animalCount());
    }

    @Test
    public void canAddAnimal(){
        jaguarEnclosure.addAnimal(jaguar);
        assertEquals(1, jaguarEnclosure.animalCount());
        goldenLionTamarinEnclosure.addAnimal(goldenLionTamarin);
        assertEquals(1, goldenLionTamarinEnclosure.animalCount());
    }

    @Test
    public void canRemoveAnimal(){
        jaguarEnclosure.addAnimal(jaguar);
        jaguarEnclosure.removeAnimal(jaguar);
        assertEquals(0, jaguarEnclosure.animalCount());
    }

}
