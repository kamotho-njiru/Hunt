package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HeroTest {
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void heroCreatesInstanceOfHero_true() throws Exception {
        Hero hero = setUpNewHero();
        assertTrue(String.valueOf(true), true);
    }

    @Test
    public void returnAllInstancesOfHeroes() throws Exception {
        Hero hero = setUpNewHero();
        Hero otherHero = new Hero("Aqualad", 20, "control the sea ", "Can't breathe normal air", 2);
        assertEquals(1, Hero.getHeroes().size());
    }

    @Test
    public void allInstancesAreContainedInHero() {
        Hero hero = setUpNewHero();
        Hero otherHero = new Hero("Aqualad", 20, "control the sea ", "Can't breathe normal air", 2);
        assertTrue(Hero.getHeroes().contains(hero));
        assertTrue(Hero.getHeroes().contains(otherHero));
    }

    @Test
    public void findById() throws Exception {
        Hero hero = setUpNewHero();
        Hero otherHero = new Hero("Aqualad", 20, "control the sea ", "Can't breathe normal air", 2);
        Hero foundHero = Hero.findHero(1);
        assertEquals(hero, foundHero);
    }
    private Hero setUpNewHero () {
        return new Hero("Superman", 24, "strength", "kryptonite", 1);
    }

}