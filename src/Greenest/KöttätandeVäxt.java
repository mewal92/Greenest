package Greenest;

public class KöttätandeVäxt extends Plantor{
    double extraTillskott = 0.2;

    public KöttätandeVäxt(String namn, double höjd) {
        super(namn, höjd);

        näring = Näringsdrycker.PROTEINDRYCK;
    }
    @Override
    public String getNäringsdryck() {
        return näring.näring;
    }

    @Override
    public double beräknaNäring() {
        return näring.liter + (extraTillskott * höjd);
    }

    @Override
    public String getNäring() {
        return "Köttätande växten " + getNamn()
                + " ska vattnas med " + beräknaNäring() +
                " liter " + getNäringsdryck()
                + " per dag. \n(Daglig basnivå: "
                + näring.liter + " liter "+ getNäringsdryck()
                + " + \nExtra tillskott: "
                + extraTillskott + " liter" + getNäringsdryck() +")";
    }
}
