package at.fhj.msd;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class DrinkQueue implements IQueue<Drink> {

    /**
     * List with Drinks
     */
    private List<Drink> drinks = new ArrayList<>();

    /**
     * max Size of List
     */
    private int maxSize;

    /**
     * Constructor of DrinkQueue
     * @param maxSize maximale Size of Queue
     */
    public DrinkQueue(int maxSize) {
        this.maxSize = maxSize;
    }

    /**
     * adds an object to Queue
     * @param obj Object that's added
     * @return returns if object has been added
     */
    @Override
    public boolean offer(Drink obj) {
        if (drinks.size() < maxSize) {
            drinks.add(obj);
        } else {
            return false;
        }
        return true;
    }

    /**
     * returns first Element of queue and removes it, if queue is empty, returns null
     * @return first Element of queue
     */
    @Override
    public Drink poll() {
        Drink element = peek();

        if (!drinks.isEmpty()) {
            drinks.remove(0);
        }
        return element;
    }

    /**
     * returns first Element of queue and removes it, if queue is empty, throws NoSuchElementException
     * @return first Element of queue
     */
    @Override
    public Drink remove() {
        if (drinks.isEmpty()) {
            throw new NoSuchElementException("there's no element any more");
        } else {
            return peek();
        }
    }

    @Override
    public Drink peek() {
        return null;
    }

    @Override
    public Drink element() {
        return null;
    }
}
