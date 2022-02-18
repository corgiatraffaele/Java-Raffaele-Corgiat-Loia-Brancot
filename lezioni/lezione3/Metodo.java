import java.util.Scanner;

public class Metodo {
    
    public static void main(String[]arg){
        //chiamata di un metodo (quando lo utilizziamo)
         System.out.println("ciao");


        //chiamata di un metodo NON static (prima devo inizializzare scanner)
        Scanner tastiera = new Scanner(System.in);
        tastiera.nextLine()
    }

    //definizione del metodo (quando descriviamo cosa deve fare quando viene chiamato)
    //[modificatore d'accesso][static/niente][tipo di ritorno]

    public static void nomeMetodo( int a, int b, int c){}


}
//i nomi dei metodi utilizzano il CamelCase