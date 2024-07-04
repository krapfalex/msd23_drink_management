package at.fhj.msd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class DrinkQueueTest {

    private DrinkQueue drinkQueue;
    ArrayList liquids;

    Cocktail cocktailOne;
    Cocktail cocktailTwo;
    Cocktail cocktailThree;

    private final int maxSize = 2;

    @BeforeEach
    void setUp() {
        drinkQueue = new DrinkQueue(maxSize);
        liquids = new ArrayList();
        liquids.add("One");
        liquids.add("Two");
        cocktailOne = new Cocktail("one", liquids);
        cocktailTwo = new Cocktail("two", liquids);
        cocktailThree = new Cocktail("three", liquids);
    }

    @Test
    void offer() {
        Assertions.assertTrue(drinkQueue.offer(cocktailOne));
        drinkQueue.offer(cocktailTwo);
        Assertions.assertFalse(drinkQueue.offer(cocktailThree));
    }

    @Test
    void poll() {
        Assertions.assertEquals(null, drinkQueue.poll());

        drinkQueue.offer(cocktailOne);
        Assertions.assertEquals(cocktailOne, drinkQueue.poll());

        drinkQueue.offer(cocktailOne);
        drinkQueue.offer(cocktailTwo);
        Assertions.assertEquals(cocktailOne, drinkQueue.poll());
        Assertions.assertEquals(cocktailTwo, drinkQueue.poll());
    }

    @Test
    void remove() {
        Exception exception = Assertions.assertThrows(NoSuchElementException.class, () -> {
            drinkQueue.remove();
        });

        drinkQueue.offer(cocktailOne);
        Assertions.assertEquals(cocktailOne, drinkQueue.remove());

        drinkQueue.offer(cocktailOne);
        drinkQueue.offer(cocktailTwo);
        Assertions.assertEquals(cocktailOne, drinkQueue.remove());
        Assertions.assertEquals(cocktailTwo, drinkQueue.remove());
   }
}
