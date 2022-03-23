package EsCasa1;

/*
* Esercizio 3 e 4 pagina 489 (Ereditarietà)
*
* */

public class BambinoScuola {

    private String nome;
    private int età;
    private String nomeProf;
    private String saluto;

    public BambinoScuola( String a, int b, String c, String d){
        this.nome = a;
        this.età = b;
        this.nomeProf = c;
        this.saluto = d;

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEtà() {
        return età;
    }

    public void setEtà(int età) {
        this.età = età;
    }

    public String getNomeProf() {
        return nomeProf;
    }

    public void setNomeProf(String nomeProf) {
        this.nomeProf = nomeProf;
    }

    public String getSaluto() {
        return saluto;
    }

    public void setSaluto(String saluto) {
        this.saluto = saluto;
    }
}
