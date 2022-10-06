package Greenest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KaktusTest {

    Plantor p1 = new Kaktus("Igge", 3);

    @Test
    void getNäringsTest() {
        assert(p1.getNäring().startsWith("K")); //kollar om meningen börjar med K som den ska

        assert(!p1.getNäring().startsWith("P")); //Fel-test, meningen ska ej börja med tex P
    }
}