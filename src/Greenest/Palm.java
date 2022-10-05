package Greenest;

public class Palm extends Plantor{

    public Palm(String namn, double höjd) {
        super(namn, höjd);

        näring = Näringsdrycker.KRANVATTEN;
    }
    @Override
    public String getNäringsdryck() {
        return näring.näring;
    }

    @Override
    public double beräknaNäring() {
        return höjd * näring.liter;
    }

    @Override
    public String getNäring() {
        return "Palmen " + getNamn() + " ska vattnas med " + beräknaNäring() + " liter " + getNäringsdryck()
                + " per dag.";
    }
}
