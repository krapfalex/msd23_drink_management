package at.fhj.msd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class StringQueueTest {
    StringQueue stringQueue;
    String one;
    String two;
    String three;
    private final int maxSize = 2;

    @BeforeEach
    void setUp() {
        stringQueue = new StringQueue(maxSize);
        one = "helloWorld";
        two = "ThisIsAString";
        three = ":3";
    }


    @Test
    void offer() {
        Assertions.assertTrue(stringQueue.offer(one));
        stringQueue.offer(two);
        Assertions.assertFalse(stringQueue.offer(three));
    }

    @Test
    void poll() {
        Assertions.assertEquals(null, stringQueue.poll());

        stringQueue.offer(one);
        Assertions.assertEquals(one, stringQueue.poll());

        stringQueue.offer(one);
        stringQueue.offer(two);
        Assertions.assertEquals(one, stringQueue.poll());
        Assertions.assertEquals(two, stringQueue.poll());
    }

    @Test
    void remove() {
        Exception exception = Assertions.assertThrows(NoSuchElementException.class, () -> {
            stringQueue.remove();
        });

        stringQueue.offer(one);
        Assertions.assertEquals(one, stringQueue.remove());

        stringQueue.offer(one);
        stringQueue.offer(two);
        Assertions.assertEquals(one, stringQueue.remove());
        Assertions.assertEquals(two, stringQueue.remove());
    }

    @Test
    void peek() {
        Assertions.assertEquals(null, stringQueue.peek());

        stringQueue.offer(one);
        Assertions.assertEquals(one, stringQueue.peek());

        stringQueue.offer(two);
        Assertions.assertEquals(one, stringQueue.peek());
    }

    @Test
    void element() {
        Exception exception = Assertions.assertThrows(NoSuchElementException.class, () -> {
            stringQueue.element();
        });

        stringQueue.offer(one);
        Assertions.assertEquals(one, stringQueue.element());

        stringQueue.offer(two);
        Assertions.assertEquals(one, stringQueue.element());
    }
}
