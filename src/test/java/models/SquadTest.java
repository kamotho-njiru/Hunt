package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.*;

public class SquadTest {
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    private Squad setUpNewSquad() {

        @Test
        public void createInstanceOfSquad () throws Exception {
            Squad squad = setUpNewSquad();
            assertEquals(true, squad instanceof Squad);
        }

        @Test
        public void returnAllInstances_true () throws Exception {
            Squad squad = setUpNewSquad();
            Squad otherSquad = setUpNewSquad();
            assertEquals(2, Squad.getSquads().size());
        }

        @Test
        public void allSquadsAreContainedInSquad () throws Exception {
            Squad squad = setUpNewSquad();
            Squad otherSquad = setUpNewSquad();
            assertTrue(Squad.getSquads().contains(squad));
            assertTrue(Squad.getSquads().contains(otherSquad));
        }

        @Test
        public void findsById () throws Exception {
            Squad squad = setUpNewSquad();
            Squad otherSquad = setUpNewSquad();
            Squad foundSquad = Squad.find(1);
            assertEquals(squad, foundSquad);
        }

        private Squad setUpNewSquad() {
            ArrayList<Hero> heroes = new ArrayList<Hero>();
            Hero hero = new Hero("Superman", 24, "strength", "kryptonite", 1);
            Hero otherHero = new Hero("Aqualad", 20, "control the sea ", "Can't breathe normal air", 2);
            heroes.add(hero);
            heroes.add(otherHero);
            return new Squad("avengers",5 , "Saving the world");
        }


    }


}