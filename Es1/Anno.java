public class Anno {
    
    public static void main (String[] args){

        int anno = Integer.parseInt(args[0]);
        
        if(anno %400==0|| anno%4==0 && anno%100!=0){
            System.out.println("Anno Bisestile");
        }else{
            System.out.println("Anno non Bisestile");
        }



        }

    }


