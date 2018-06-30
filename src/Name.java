public class Name {

    public static void main(String[] args) {

        String name = "grzesiek gil";
        String al = " abcdefghiljklmoprstwyz";
        int result = 0;
        for (int i = 0; i < name.length(); i++) {
            for (int j = 0; j < al.length(); j++) {
                if(name.charAt(i) == al.charAt(j)) {
                    result = al.charAt(i);
                } 
            } 

        }
        int a = result%2;
        System.out.println("Przed modulo " +result);
        System.out.println("Po modulo " +a);

    }


}