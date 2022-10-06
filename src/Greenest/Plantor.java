package Greenest;
//klassen plantor används vidare i klasserna kaktus/palm/köttätande växt och blir därmed polymorfism
abstract class Plantor implements InterfacePlantor {
    protected String namn; //inkapsling
    protected double höjd;
    protected Näringsdrycker näring;

    public Plantor(String namn, double höjd) { //publik konstruktor
        this.namn = namn;
        this.höjd = höjd;
     }
//metoder som ska ärvas ned
    public String getNamn() {return namn;}

    public String getNäringsdryck(){return näring.näring;}
}
