import java.util.Scanner;
public class InvertiArray{
    public static void main (String[] args){
   
        Integer[] intArray = {1,2,3,4,5,6};
            System.out.println(" Array:");

        for(int i=0;i<intArray.length;i++)
        System.out.print(intArray[i] + "  ");
         
        System.out.println();
         
        //Array invertito

        System.out.println(" Array invertito:");
             for(int i=intArray.length-1;i>=0;i--)
             System.out.print(intArray[i] + "  ");
      }
  }