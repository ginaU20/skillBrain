

   // Definiti o lista de Integer, de 5 elemente. Calculati suma tuturor elementelor.




    import java.util.ArrayList;

    public class Exercitiul7 {
        public static void main(String[] args) {

            ArrayList<Integer> list = new ArrayList<>();

            list.add(33);
            list.add(16);
            list.add(25);
            list.add(93);
            list.add(64);

            int suma = 0;


            for (int i = 0; i < 5; i++) {

                suma = suma + list.get(i);
            }
            System.out.println(" Suma " + suma);



        }
    }

