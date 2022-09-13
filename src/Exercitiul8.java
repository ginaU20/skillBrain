

        //Definiti un array si o lista. Determinati daca ele sunt goale sau nu.


        import java.util.ArrayList;

        public class Exercitiul8 {
    public static void main(String[]args){

        ArrayList<Integer> lista= new ArrayList<>();

        lista.add(23);
        lista.add(54);
        lista.add(21);
        lista.add(14);
        lista.add(43);

        int[] numeArray= new int[3];
        numeArray[0]= 0;
        numeArray[1]= 1;
        numeArray[2]= 2;



        if(numeArray.length==0){
            System.out.println(" Sirul este  gol.");

        }else{
            System.out.println(" Sirul nu este gol");
        }

        if(lista.isEmpty()){
            System.out.println(" Lista este goala. ");
        }else  {
            System.out.println("Lista nu este goala");
        }

    }
}

// nu am facut clear fiindca aveam nevoie de lista :))