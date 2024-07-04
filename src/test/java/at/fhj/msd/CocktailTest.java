package at.fhj.msd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class CocktailTest {
    static Cocktail cocktail;
    static String name;
    static double volume;
    static double alcoholPercent;
    static boolean alcoholic;

    static Cocktail cocktail2;
    static String name2;
    static double volume2;
    static double alcoholPercent2;
    static boolean alcoholic2;

    static String is;
    static double is2;
    static double is3;
    static boolean is4;

    @BeforeEach
    void setup() {
        List <Liquid> liquids = new ArrayList<>();
        liquids.add(new Liquid("Pineapple Juice", 0.2,0));
        liquids.add(new Liquid("Coconut Juice", 0.2,0));
        cocktail = new Cocktail("Virgin Pina Colada", liquids);

        List <Liquid> liquids2 = new ArrayList<>();
        liquids2.add(new Liquid("Pineapple Juice", 0.2,0.4));
        liquids2.add(new Liquid("Coconut Juice", 0.2,0.1));
        cocktail2 = new Cocktail("Pina Colada", liquids2);
    }

    @BeforeAll
    static void test() {
        name = "Virgin Pina Colada";
        volume = 0.4;
        alcoholPercent = 0.0;
        alcoholic = false;

        name2 = "Pina Colada";
        volume2 = 0.4;
        alcoholPercent2 = 0.5;
        alcoholic2 = true;
    }

    @Test
    void testCocktailName() {
        is = cocktail.getName();
        Assertions.assertEquals(name,is);
    }

    @Test
    void testCocktailVolume() {
        is2 = cocktail.getVolume();
        Assertions.assertEquals(volume,is2);
    }

    @Test
    void testCocktailAlcohol() {
        is3 = cocktail.getAlcoholPercent();
        Assertions.assertEquals(alcoholPercent,is3);
    }

    @Test
    void testCocktailAlcoholic() {
        is4 = cocktail.isAlcoholic();
        Assertions.assertEquals(alcoholic,is4);
    }

    @Test
    void testCocktailName2() {
        is = cocktail2.getName();
        Assertions.assertEquals(name2,is);
    }

    @Test
    void testCocktailVolume2() {
        is2 = cocktail2.getVolume();
        Assertions.assertEquals(volume2,is2);
    }

    @Test
    void testCocktailAlcohol2() {
        is3 = cocktail2.getAlcoholPercent();
        Assertions.assertEquals(alcoholPercent2,is3);
    }

    @Test
    void testCocktailAlcoholic2() {
        is4 = cocktail2.isAlcoholic();
        Assertions.assertEquals(alcoholic2,is4);
    }
}
