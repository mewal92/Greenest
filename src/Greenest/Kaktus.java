package Greenest;

class Kaktus extends Plantor {
   protected Näringsdrycker näring= Näringsdrycker.MINERALVATTEN;


    public Kaktus(String namn, double höjd) {
        super(namn, höjd);
    }

    @Override
    public String getNäringsdryck() {
        return näring.näring;
    }

    @Override
    public double beräknaNäring() {
    return näring.liter*100;
    }

    @Override
    public String getNäring() {
        return "Kaktusen " + getNamn()
                + " ska vattnas med " + beräknaNäring() + " cl " + getNäringsdryck()
                + " per dag.";
    }
}
