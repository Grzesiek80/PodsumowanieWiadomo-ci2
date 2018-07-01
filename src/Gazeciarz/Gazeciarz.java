package Gazeciarz;

import java.util.ArrayList;

public class Gazeciarz implements Podmiot {

    ArrayList<Obserwator> subskrybenci = new ArrayList<>();

    @Override
    public void dodajSubskrybenta(Obserwator obserwator) {
        subskrybenci.add(obserwator);
    }

    @Override
    public void usunSubskrybenta(Obserwator obserwator) {
        subskrybenci.remove(obserwator);
    }

    @Override
    public void dostarczGazete() {
        for (Obserwator obserwator: subskrybenci) {
            obserwator.odbierz("Przegląd Sportowy");
        }
    }
}
