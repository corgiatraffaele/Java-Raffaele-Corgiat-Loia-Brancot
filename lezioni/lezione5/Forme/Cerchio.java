package lezione5.Forme;

public class Cerchio extends Forma{

    private int raggio;

    public int getRaggio() {
        return raggio;
    }

    public void setRaggio(int raggio) {

        if(raggio<0){
        this.raggio = raggio;
        }
    }


    public double circonferenza(){
        return (Math.PI)=(raggio * raggio);
    };
    public double area(){

        return(2*( Math.PI)*raggio);

    };
}
