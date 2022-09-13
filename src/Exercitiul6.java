
/*
Definiti un array cu 9 elemente si parcugeti-l cu structura for (tipul de date este la alegere).
 Daca iteratia este la indexul 2, sa se sara peste. Daca iteratia este la indexul 7, sa se opreasca iteratia.
 Altfel, sa se afiseze mesajul “Index valid” pe ecran.

 */

public class Exercitiul6 {
    public static void main(String[] args) {

        int[] b = new int[20];

        for (int i = 0; i < 20; i++) {

            b[i] = i;
               //System.out.println(b[i]);
        }


     //date

            for (int i = 0; i < 20; i++) {

            if( i == 2 ) {
                continue;
            }
            if( i==7){
                break;
            }
            System.out.println( i + " Index invalid!");
        }


    }


}








