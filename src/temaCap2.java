import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;



        // Am facut aici exercitiile 1,2,3 //




//public class temaCap2 {
//    private static int i;
//
//    public static void main(String[] args) {
//     /*Citit un numar de la tastatura si stocati valoarea lui intr-o variabila. Generati un numar random intre 1 si 100
//     si stocati acel numar intr-o alta variabila. Daca numarul introdus de la tastatura este mai mic decat numarul
//     random generat, afisati mesajul “Numarul introdus este mai mic decat <numar_random>” (inserati valoarea numarului
//     random generat in textul afisat).

//      */
//     System.out.println(" Citi-ti un numar intre 1- 100 ");
//     Scanner in = new Scanner(System.in ) ;
//     Random rand = new Random();
//
//     int numar= in.nextInt();
//
//     int numarGenerat= (int)(Math.random()* 100 +1 );
//
//        if(numar < numarGenerat) {
//
//            System.out.println("Numarul generat este mai mare " + numarGenerat);
//
//        } else { System.out.println(" Numarul dumneavoastra este " + numar + " iar numarul generat este " + numarGenerat);
//
//     }
//        /*
//        Citit un caracter si 2 numere de la tastatura, si stocati-le in variabile. Folosind structura switch, daca
//        s-a introdus un caracter anume, realizati operatia respectiva cu cele 2 numere, si afisati rezultatul pe ecran:
//    -‘a’: adaugare
//    -‘s’: scadere
//    -‘i’: inmultire
//    -‘p’: impartire
//    -‘m’: modul
//            Daca nu s-a introdus un caracter valid, afisati un mesaj de eroare.
//         */
//
//        char  operator;
//
//        Double number1 ,number2 , result;
//
//        Scanner imput = new Scanner (System.in);
//
//        System.out.println("Alege - operatia: a - adunare; s - scadere; i = inmultire; p - impartire; m - modul ");
//        operator= imput.next().charAt(0);
//
//        System.out.println("Introduce-ti primul numar");
//        number1=imput.nextDouble();
//
//        System.out.println("Introduce-ti al doilea numar ");
//        number2=imput.nextDouble();
//
//
//
//
//        switch (operator ) {
//
//            case 'a':
//                    result = number1 + number2;
//
//                System.out.println(number1 + " + " +number2 + "="  +result);
//                break;
//
//
//            case 's':
//                result = number1 - number2;
//                System.out.println(number1 + "+" +number2 + "=" +result);
//                break;
//
//            case'i':
//                result= number1 *number2;
//                System.out.println(number1+ "+" +number2 +"=" + result);
//                break;
//
//            case'p':
//                result= number1/ number2;
//                System.out.println(number1+ "+" + number2 +"=" + result);
//                break;
//
//            case'm':
//                result= number1 % number2;
//                System.out.println(number1+ "+" + number2 + "=" + result);
//                break;
//
//            default:
//                System.out.println("operator invalid");
//                break;
//
//        }  imput.close();

        /*Definiti un array de 2 dimensiuni, fiecare dimensiune sa aiba cate 3, respectiv 5 elemente.
         Initializati array-ul. Afisati primele si ultimele elemente din fiecare dimensiune pe ecran.

         */

//
//        int[][] matrice = new int[3][5];
//
//        for (int i = 0; i <= 2; i++) ;
//        {
//            for (int j = 0; j <= 4; j++) {
//                matrice[i][j] = i + j;
//            }
//        }
//        System.out.println(matrice[0][0]);
//        System.out.println(matrice[2][4]);
//
//
//    }
//  }
//
