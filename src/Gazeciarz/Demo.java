package Gazeciarz;

public class Demo {
    public static void main(String[] args) {
        Gazeciarz gaz = new Gazeciarz();
        Odbiorca Zenek = new Odbiorca(gaz);
        Odbiorca Jan = new Odbiorca(gaz);
        gaz.usunSubskrybenta(Jan);
        Odbiorca Franek = new Odbiorca(gaz);


        gaz.dostarczGazete();


    }
}
