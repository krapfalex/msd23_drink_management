package at.fhj.msd;

/**
 * Interface for drink classes
 */
public interface Drink {
    /**
     * Calculates and returns volume of drink
     *
     * @return the volume of drink in liter
     */
    double getVolume();

    /**
     * Calculates and returns the alcohol percentage
     *
     * @return alcohol volume percent (e.g. 50)
     */
    double getAlcoholPercent();

    /**
     * Gives information if drink is alcoholic or not
     *
     * @return true when alcoholic liquids are present, otherwise false
     */
    boolean isAlcoholic();

    /**
     * Gets the name of the drink
     *
     * @return the name of the drink
     */
    String getName();

    /**
     * Sets the name of the drink
     *
     * @param name the name of the drink
     */
    void setName(String name);
}
