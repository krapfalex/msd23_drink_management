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
     * returns first element of queue and removes it, if queue is empty, returns null
     * @return first element of queue
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
     * returns first element of queue and removes it, if queue is empty, throws NoSuchElementException
     * @return first element of queue
     */
    @Override
    public Drink remove() {
        Drink drink = peek();
        if (drinks.isEmpty()) {
            throw new NoSuchElementException("there's no element any more");
        } else {
            drinks.remove(0);
            return drink;
        }
    }

    /**
     * returns first element of queue, if queue is empty, returns null
     * @return first element of queue if exists
     */
    @Override
    public Drink peek() {
        if (drinks.isEmpty()) {
            return null;
        } else {
            return drinks.get(0);
        }
    }

    /**
     * returns first element of queue, if queue is empty, throws NoSuchElementException
     * @return first element of queue if exists
     */
    @Override
    public Drink element() {
        if (drinks.isEmpty()) {
            throw new NoSuchElementException("there's no element at the top of the list");
        } else {
            return drinks.get(0);
        }
    }
}
