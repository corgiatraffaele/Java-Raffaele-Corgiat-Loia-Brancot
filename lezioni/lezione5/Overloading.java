package lezione5;

public class Overloading {

    public static void stampa(int[]array){

        for(int i = 0; i<array.length;i++){
                System.out.print(array[i]+ "");
        }
    }

        public static void main(String[]args){
                int[] a= {1,2,3,4};
                stampa(a);
                String[] b ={"cane","gatto","coniglio"};
                stampa(b)

                //la firma è il nome ed i parametri in input,
            //per far si che accetti parametri diversi si fa l'overloading
            //per questo qui abbiamo due stampa
            //definire piùmetodi con lo stesso nome ma parametri diversi


            //l'overriding invece  è la ridefinizione di un metodo che è già presente in una
            // sottocrasse e deve avere la stessa firma ( non si può cambiare il tipo di ritorno)


            //la classe OBJECT : tutte le classi ereditano da object
            // ha come parametri :
            //equals() e to string();
        }

}
