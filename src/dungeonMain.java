import java.awt.*;
import java.util.Random;
import java.util.Scanner;

   public class dungeonMain {
    public static void main (String[]args) {


        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        //variabile jucator

        int sanatate = 100;
        int atacDeteriorare = 50;
        int nrPotiuni = 3;
        int valoareRegenerarePortiune = 30;
        int sansaPotiune = 50; //procensatj

        //variabile inamic
        String[] inamici = {"Zombi", "Skeleton", "Warrior", "Assasin" };
        int maximSanatateInamic = 50;
        int inamicAtacDeteriorare = 20;


        boolean running = true;
        System.out.println("Bine ai venit in Temnita!");

        GAME:

        while (running) {
            System.out.println("-----------------");

            int sanatateInamic = rand.nextInt(maximSanatateInamic);
            String inamic = inamici[rand.nextInt(inamici.length)];

            System.out.println("/# " + inamic + " a aparut!#");


            while (sanatateInamic > 0) {

                System.out.println("\t Sanatatea ta este :" + sanatate);
                System.out.println("\t Sanatatea inamicului " + inamic + " este " + sanatateInamic);
                System.out.println("\t\n Ce ai vrea sa faci?");
                System.out.println("\t1. Ataca ");
                System.out.println("\t2. Bea potiune");
                System.out.println("\t3. Fugi ");


                String input = in.nextLine();

                if (input.equals("1")) {
                    //cod pentru actiunea de a ataca

                    int deteriorareProdusa = rand.nextInt(atacDeteriorare);
                    int deteriorarePrimita = rand.nextInt(inamicAtacDeteriorare);

                    sanatateInamic -= deteriorareProdusa;
                    sanatate -= deteriorarePrimita;
                    System.out.println("\t l ai lovit " + inamic + " cu " + deteriorareProdusa + " deteriorare ");
                    System.out.println("\t ai primit " + deteriorarePrimita + " deteriorare ");

                    if (sanatate < 1) {
                        System.out.println("\t Ai fost lovit prea tare, esti prea slabit sa continui. ");
                        break;

                    }

                } else if (input.equals("2")) {
                    // cod pentru actiunea de bea potiune

                    if (nrPotiuni > 0) {
                        sanatate += valoareRegenerarePortiune;
                        nrPotiuni--;
                        System.out.println("\t Ai baut o portiune , te ai vindecat cu " + valoareRegenerarePortiune +
                                "\n\t Acum ai " + sanatate + " sanatate " +
                                "\n\t Ti au ramas potiuni " + nrPotiuni + " potiuni ");

                    } else {
                        System.out.println("\t Nu mai ai potiuni! Invinge un inamic ca sa castigi potiuni./n  ");

                    }


                } else if (input.equals("3")) {
                    // pentru actiunea de a fugi

                    System.out.println("\t Ai fugit de" + inamic);

                    continue GAME;

                } else {
                    // cod pentru optiune invalida
                    System.out.println("\t Comanda invalida ");

                }

                if (sanatate < 1) {
                    System.out.println("\t Te au batut crunt in Temnita, esti prea slab!");
                    break;

                }

            }

            System.out.println("-----------------");
            System.out.println("#" + inamic + " a fost invins! ");
            System.out.println("# Ai" + sanatate + " sanatate. #");


            if (rand.nextInt(100) < sansaPotiune) {
                nrPotiuni++;
                System.out.println("# Ai castigat pe urma infrangerii lui " + inamic + " ! #");
                System.out.println("# Mai ai" + nrPotiuni + "potiuni .#");


            }

            System.out.println(" Ce ai vrea sa faci ? ");
            System.out.println(" 1. Continui lupta  ");
            System.out.println(" 2. Termina jocul ");

            String input = in.nextLine();

            while (!input.equals(1) && !input.equals(2)) ;
            {
                System.out.println("Comanda invalida!");

                input = in.nextLine();

            }

            switch (input) {
                case "1": {
                    System.out.println("Continui cu aventura!");
                    break;
                }

                case "2": {
                    System.out.println("\t Ai ales sa iesi din Temnita. Drum bun! ");
                    break GAME;

                }
            }


        }

        System.out.println(" ##################### ");
        System.out.println(" # Multumim de joc! #");
        System.out.println(" ##################### ");



    }


}
