package Greenest;

import javax.swing.*;

class Huvudprogram {
    public Huvudprogram() {
//skapar upp objekt och tillhörande bild (polymorfism)
        Plantor p1 = new Kaktus("Igge", 0.2);
        ImageIcon icon1 = new ImageIcon(("src\\Greenest\\img\\igge.jpg"));

        Plantor p2 = new KöttätandeVäxt("Meatloaf", 0.7);
        ImageIcon icon2 = new ImageIcon(("src\\Greenest\\img\\meatloaf.jpg"));

        Plantor p3 = new Palm("Putte", 1);
        ImageIcon icon3 = new ImageIcon(("src\\Greenest\\img\\putte.jpg"));

        Plantor p4 = new Palm("Laura", 5);
        ImageIcon icon4 = new ImageIcon(("src\\Greenest\\img\\laura.jpg"));


        while (true) { //programmet fortsätter tills man anger avbryt eller trycker cancel
            try {
                String vemSkaMatas = JOptionPane.showInputDialog(null,
                        "Vilken växt ska ha mat? \nAnge 'avbryt' för exit");

                if (vemSkaMatas.equalsIgnoreCase("Avbryt")) {
                    break;
                }
                if (vemSkaMatas.equalsIgnoreCase(p1.getNamn())) {
                    JOptionPane.showMessageDialog(null, p1.getNäring(),
                            "Kaktus", 1, icon1);


                } else if (vemSkaMatas.equalsIgnoreCase(p2.getNamn())) {
                    JOptionPane.showMessageDialog(null, p2.getNäring(),
                            "Köttätande växt",
                            1, icon2);

                } else if (vemSkaMatas.equalsIgnoreCase(p3.getNamn())) {
                    JOptionPane.showMessageDialog(null, p3.getNäring(),
                            "Palm", 1, icon3);

                } else if (vemSkaMatas.equalsIgnoreCase(p4.getNamn())) {
                    JOptionPane.showMessageDialog(null, p4.getNäring(),
                            "Palm", 1, icon4);

                } else {
                    JOptionPane.showMessageDialog(null,
                            "Vi har ingen växt med det namnet.",
                            "Felmeddelande", 0);
                }

            } catch (NullPointerException e) {
                System.exit(0);
            }
        }
    }
}