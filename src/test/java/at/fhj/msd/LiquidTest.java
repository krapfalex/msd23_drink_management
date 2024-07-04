package at.fhj.msd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LiquidTest {
    /**
     * variables used for liquid1
     */
    static Liquid liquid;
    static String name;
    static double volume;
    static double alcoholPercent;

    /**
     * variables used for liquid2
     */
    static Liquid liquid2;
    static String name2;
    static double volume2;
    static double alcoholPercent2;

    /**
     * variables used for calculations
     */
    static String is;
    static double is2;
    static double is3;

    /**
     * setup starts before every test and defines the liquid object
     */
    @BeforeEach
    void setup() {
        liquid = new Liquid("Pineapple Juice", 0.2,0);
        liquid2 = new Liquid("Coconut Juice", 0.4,0.2);
    }

    /**
     * test starts before everything else and defines the expected results
     */
    @BeforeAll
    static void test() {
        name = "Pineapple Juice";
        volume = 0.2;
        alcoholPercent = 0;

        name2 = "Coconut Juice";
        volume2 = 0.4;
        alcoholPercent2 = 0.2;
    }

    /**
     * testLiquidName compares the calculated result with the expected results
     */
    @Test
    void testLiquidName() {
        is = liquid.getName();
        Assertions.assertEquals(name,is);
    }

    /**
     * testLiquidVolume compares the calculated result with the expected results
     */
    @Test
    void testLiquidVolume() {
        is2 = liquid.getVolume();
        Assertions.assertEquals(volume,is2);
    }

    /**
     * testLiquidAlcohol compares the calculated result with the expected results
     */
    @Test
    void testLiquidAlcohol() {
        is3 = liquid.getAlcoholPercent();
        Assertions.assertEquals(alcoholPercent,is3);
    }

    /**
     * testLiquidName2 compares the calculated result with the expected results
     */
    @Test
    void testLiquidName2() {
        is = liquid2.getName();
        Assertions.assertEquals(name2,is);
    }

    /**
     * testLiquidVolume2 compares the calculated result with the expected results
     */
    @Test
    void testLiquidVolume2() {
        is2 = liquid2.getVolume();
        Assertions.assertEquals(volume2,is2);
    }

    /**
     * testLiquidAlcohol2 compares the calculated result with the expected results
     */
    @Test
    void testLiquidAlcohol2() {
        is3 = liquid2.getAlcoholPercent();
        Assertions.assertEquals(alcoholPercent2,is3);
    }
}
