package EsCasa1;


public class Main {
    public static void main (String[] args){

        BambinoScuola b1 = new BambinoScuola("Emanuel",14,"Maria","ciao a tutti");

        System.out.println(b1.getNome());
        System.out.println(b1.getEtà());
        System.out.println(b1.getSaluto());


       // b1.nome ="Giammaria";
        b1.setNome("Pippo");
        System.out.println(b1.getNome());


        BambinoPrecoce b2 = new BambinoPrecoce("Sergio",16, "Carla", "ciao mondo");
        System.out.println(b2.getEtà());
        System.out.println(b2.getSaluto());
        b2.setSaluto("Ciao ciao");
        System.out.println(b2.getSaluto());

    }
}
