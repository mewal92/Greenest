package Greenest;

enum Näringsdrycker {
    MINERALVATTEN ("mineralvatten", 0.02),
    PROTEINDRYCK ("proteindryck", 0.1),
    KRANVATTEN ("kranvatten", 0.5);

    public final String näring;
    public final double liter;

    Näringsdrycker(String n, double l){
        näring = n;
        liter = l;

    }
}
