package Gazeciarz;

public class Odbiorca implements Obserwator {

    public Odbiorca(Podmiot dostawcaTresci) {
        dostawcaTresci.dodajSubskrybenta(this);
    }


    @Override
    public void odbierz(String name) {
        System.out.println("Potwierdzam odebranie gazety " + name);

    }
}

