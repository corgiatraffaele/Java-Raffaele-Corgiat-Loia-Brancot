package lezione5.Forme;

public class main {

    public static void main (String[]args){
        Quadrato q = new Quadrato(5);
        System.out.println(q.area());
        Quadrato q2= q;
        Rettangolo r = q;
        Rettangolo r2 = new Rettangolo(5, 10);

    }
}
