

/*
        Definiti un array de double, cu valori zecimale. Iterati array-ul folosind strutura for, si daca un element
        este egal cu valoarea 4.5, afisati-l pe ecran. Daca un element este mai mare decat 5, afisati mesajul
        “Element peste 5”

         */





public class Exercitiul5 {
    public static void main(String[]args){
      double[] d = new double[7];

      d [0]= 9.15;
      d [1]= 2.30;
      d [2]= 7.56;
      d [3]= 3.35;
      d [4]= 9.0;
      d [5]= 4.5;


      for( int i= 0 ; i< 7 ; i++ ) {

          if (d[i] == 4.5) {
              System.out.println(d[i] + "Numarul este 4.5");
          }  else if ( d[i] > 5) {
              System.out.println(d[i]+ " Element este mai mare decat 5");
          }

      }

    }
}
