package Greenest;

import org.junit.jupiter.api.Test;

class KöttätandeVäxtTest {

    Plantor p1 = new KöttätandeVäxt("Per", 5); //Per får vara 5 meter i detta test

    @Test
    void getNäringsdrycksTest() {
        assert(p1.getNäringsdryck() == Näringsdrycker.PROTEINDRYCK.näring); //för KV bör getNäringsdryck ge proteindryck
        assert(p1.getNäringsdryck() != Näringsdrycker.KRANVATTEN.näring); //fel-test
    }

    @Test
    void beräknaNäring() {
        assert(p1.beräknaNäring() == 1.1); // beräkning för KV är 0.1+(0.2 * höjd) , med höjden 5 bör svaret bli 1.1
        assert(p1.beräknaNäring() != 1); //fel-test
    }
}