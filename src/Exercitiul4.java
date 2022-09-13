import java.util.Arrays;




public class Exercitiul4 {
    public static void main(String[] args) {

        /*
        Definiti un array de char-uri. Iterati array-ul folosind structura for, si afisati
        pe ecran cate al doilea caracter din sir.
         */

        String[] caractere = new String[10];
        caractere[0] = "a";
        caractere[1] = "b";
        caractere[2] = "c";
        caractere[3] = "d";
        caractere[4] = "e";
        caractere[5] = "f";
        caractere[6] = "g";
        caractere[7] = "h";
        caractere[8] = "i";
        caractere[9] = "j";

        int i;
        for (i = 0; i <= 9; i++) {

            if (i % 2 == 0) {


                System.out.println(caractere[i]);
            }

        }
    }
}
