package at.fhj.msd;

import java.util.ArrayList;
import java.util.List;

public class Cocktail implements Drink{

    List <Liquid> liquids;
    String cocktailName;

    public Cocktail(String cocktailName, List<Liquid> liquids) {
        this.cocktailName = cocktailName;
        this.liquids = liquids;
    }

    @Override
    public double getVolume() {
        return 0;
    }

    @Override
    public double getAlcoholPercent() {
        return 0;
    }

    @Override
    public boolean isAlcoholic() {
        return false;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void setName(String name) {

    }
}
