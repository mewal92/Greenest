package Greenest;

import org.junit.jupiter.api.Test;

class PlantorTest {

    Plantor p1 = new Kaktus("Tagg", 2); //testkaktus
    Plantor p3 = new KöttätandeVäxt("Nom nom", 5); //test kv

    @Test
    void NamnTest() { //testar att get namn metoden hämtar namnet korrekt
        assert (p1.getNamn() == "Tagg");
        assert (p3.getNamn() == "Nom nom");

        assert (p1.getNamn() != "Gertrud"); //fel-test
    }
}