package at.fhj.msd;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class DrinkQueue implements IQueue<Drink> {

    private List<Drink> drinks = new ArrayList<>();
    private int maxSize;

    public DrinkQueue(int maxSize) {
        this.maxSize = maxSize;
    }

    @Override
    public boolean offer(Drink obj) {
        if (drinks.size() < maxSize) {
            drinks.add(obj);
        } else {
            return false;
        }
        return true;
    }

    @Override
    public Drink poll() {
        Drink element = peek();

        if (!drinks.isEmpty()) {
            drinks.remove(0);
        }
        return element;
    }

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
