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

    /**
     * Calculates and returns volume of drink
     *
     * @return the volume of drink in liter
     */
    @Override
    public double getVolume() {
        double volume = 0;
        for (Liquid liquid: liquids) {
            volume += liquid.getVolume();
        }
        return volume;
    }

    /**
     * Calculates and returns the alcohol percentage
     *
     * @return alcohol volume percent (e.g. 50)
     */
    @Override
    public double getAlcoholPercent() {
        double percentage = 0;
        for (Liquid liquid: liquids) {
            percentage += liquid.getAlcoholPercent();
        }
        return percentage;
    }

    /**
     * Gives information if drink is alcoholic or not
     *
     * @return true when alcoholic liquids are present, otherwise false
     */
    @Override
    public boolean isAlcoholic() {
        for (Liquid liquid: liquids) {
            if (liquid.getAlcoholPercent() > 0) {
                return true;
            }
        }
        return false;
    }

    /**
     * Gets the name of the drink
     *
     * @return the name of the drink
     */
    @Override
    public String getName() {
        return cocktailName;
    }

    /**
     * Sets the name of the drink
     *
     * @param name the name of the drink
     */
    @Override
    public void setName(String name) {
        this.cocktailName = name;
    }
}
