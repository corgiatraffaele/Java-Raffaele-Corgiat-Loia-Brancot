package EsCasa1;


public class BambinoPrecoce extends BambinoScuola{


    @Override
    public int getEtà() {
        return (super.getEtà()+2);
    }

    @Override
    public void setSaluto(String a ) {
        super.setSaluto(a + ". Io sono il migliore...");
    }

    public BambinoPrecoce(String a, int b, String c, String d) {
        super(a, b, c, d);


    }
}
