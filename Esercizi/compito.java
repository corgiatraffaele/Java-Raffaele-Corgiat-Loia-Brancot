
import java.util.Scanner;
public class compito {
    public static void main (String[] args){
    Scanner tastiera = new Scanner(System.in);

    int codice = 58688;
    String cod = Integer.toString(codice);
    int somma = 0;
    int contatore =0;
    int tentativi = 0;
    String n = new String();

        while(tentativi > 0){
            System.out.println("Indovina 5 cifre");
            n = tastiera.nextLine();

        for(int i= 0; i<cod.length(); i++){
            int num = 1;

            if( n.charAt(i) == cod.charAt(i)) {
                num +=1;
                somma = somma +(n.charAt(i));
                contatore ++;
            }else if(n.charAt(i)< cod.charAt(i)){
                num += i;
            }else{
                num += 1;
            }
        }
        if (contatore == 5){
            System.out.println("numeri corretti");
            break;
        }

        tentativi --;
        System.out.println("la somma dei numeri corretti è: ");
        contatore = 0;
        somma = 0;
      

        }

    }


}