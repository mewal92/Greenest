package Greenest;

import javax.swing.*;

abstract class Plantor implements InterfacePlantor {
    protected String namn;
    protected double höjd;
    protected Näringsdrycker näring;

    public Plantor(String namn, double höjd) {
        this.namn = namn;
        this.höjd = höjd;
     }

    public String getNamn() {return namn;}

    public String getNäringsdryck(){return näring.näring;}
}
