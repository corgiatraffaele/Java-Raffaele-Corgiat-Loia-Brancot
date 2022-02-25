
/*- Dato a e b restituire se a è divisibile per b
- dueVolteArray: dato un array restituire un array che ripete ogni elemento: es [0,1,2] restituisce [0,0,1,1,2,2]
- sommaVettoriale: dati due array restituire un array con la somma elemento per elemento. Se uno dei due array è più grande restituire gli elementi restanti non sommati. Esempio a=[1,2]; b=[3,4,5]  restituisce [4,6,5]
- fattoriale: fattoriale(n) = fattoriale(n-1) * n. fattoriale(0) = 1. fare un metodo ricorsivo che restituisce il fattoriale*/

import java.util.Scanner;
public class Riscaldamento04 {
    
    public static void main(String[] args){
    
        System.out.println(divisibile(6,3));


    }

    public static boolean divisibile(int a,int b) {

        return a%b==0;       
        
    }     

/* import java.util.Scanner;
public class Riscaldamento04 {
    
    public static void main(String[] args){
        //dichiarazione del metodo
      
    int a = 10;
    int b = 5;
    
    if(a % b ==0){
        System.out.println("a è divisibile per b");
        }else{
        System.out.println("a non è divisibile per b");
        }
                                   
  //dueVolteArray: dato un array restituire un array che ripete ogni elemento: es [0,1,2] restituisce [0,0,1,1,2,2]




    int[] numeri= {0,1,2};

    int[] array2 = Arrays.copyOf(numeri, numeri.length);

    for (int i : numeri) {
        System.out.println(i);

     

      }

 */



    }
  

