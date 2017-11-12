package com.example.alinemokfa.zoo;

import com.example.alinemokfa.zoo.animals.GoldenLionTamarin;
import com.example.alinemokfa.zoo.animals.Jaguar;
import com.example.alinemokfa.zoo.enclosures.Enclosure;
import com.example.alinemokfa.zoo.zoo.Zoo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by alinemokfa on 12/11/2017.
 */

public class ZooTest {

    Zoo zoo;
    Enclosure<Jaguar> jaguarEnclosure;
    Enclosure<GoldenLionTamarin> goldenLionTamarinEnclosure;
    Jaguar jaguar;
    GoldenLionTamarin goldenLionTamarin;

    @Before
    public void before() {
        zoo = new Zoo();
        jaguarEnclosure = new Enclosure<Jaguar>();
        goldenLionTamarinEnclosure = new Enclosure<GoldenLionTamarin>();
        jaguar = new Jaguar(1000);
        goldenLionTamarin = new GoldenLionTamarin(1000);
    }

    @Test
    public void zooStartsWithNoEnclosures() {
        assertEquals(0, this.zoo.enclosureCount());
    }

    @Test
    public void canAddEnclosure() {
        this.zoo.addEnclosure(jaguarEnclosure);
        assertEquals(1, this.zoo.enclosureCount());
    }

    @Test
    public void canRemoveEnclosure() {
        this.zoo.addEnclosure(jaguarEnclosure);
        this.zoo.removeEnclosure(jaguarEnclosure);
        assertEquals(0, this.zoo.enclosureCount());
    }

    @Test
    public void canGetNumberOfAnimals() {
        this.zoo.addEnclosure(jaguarEnclosure);
        this.jaguarEnclosure.addAnimal(jaguar);
        this.zoo.addEnclosure(goldenLionTamarinEnclosure);
        this.goldenLionTamarinEnclosure.addAnimal(goldenLionTamarin);
        assertEquals(2, this.zoo.animalCount());
    }

//    @Test
//    public void canSellAnimal() {
//        this.zoo.addEnclosure(jaguarEnclosure);
//        this.jaguarEnclosure.addAnimal(jaguar);
//
//    }
}
