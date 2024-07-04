package at.fhj.msd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LiquidTest {
    static Liquid liquid;
    static String name;
    static double volume;
    static double alcoholPercent;

    static Liquid liquid2;
    static String name2;
    static double volume2;
    static double alcoholPercent2;

    static String is;
    static double is2;
    static double is3;

    @BeforeEach
    void setup() {
        liquid = new Liquid("Pineapple Juice", 0.2,0);
        liquid2 = new Liquid("Coconut Juice", 0.4,0.2);
    }

    @BeforeAll
    static void test() {
        name = "Pineapple Juice";
        volume = 0.2;
        alcoholPercent = 0;

        name2 = "Coconut Juice";
        volume2 = 0.4;
        alcoholPercent2 = 0.2;
    }

    @Test
    void testCocktailName() {
        is = liquid.getName();
        Assertions.assertEquals(name,is);
    }

    @Test
    void testCocktailVolume() {
        is2 = liquid.getVolume();
        Assertions.assertEquals(volume,is2);
    }

    @Test
    void testCocktailAlcohol() {
        is3 = liquid.getAlcoholPercent();
        Assertions.assertEquals(alcoholPercent,is3);
    }


    @Test
    void testCocktailName2() {
        is = liquid2.getName();
        Assertions.assertEquals(name2,is);
    }

    @Test
    void testCocktailVolume2() {
        is2 = liquid2.getVolume();
        Assertions.assertEquals(volume2,is2);
    }

    @Test
    void testCocktailAlcohol2() {
        is3 = liquid2.getAlcoholPercent();
        Assertions.assertEquals(alcoholPercent2,is3);
    }
}
