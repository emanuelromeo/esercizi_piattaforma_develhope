package enumerazioni;

public class Triangolo extends Forma {
    private double base, altezza;
    private TipologiaForma tipologiaForma;

    public Triangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
        this.tipologiaForma = TipologiaForma.TRIANGOLO;
    }

    @Override
    public void calcolaArea() {
        System.out.println("Il triangolo ha area: " + base * altezza / 2);
    }
}
