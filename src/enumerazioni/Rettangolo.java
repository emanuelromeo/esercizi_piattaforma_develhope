package enumerazioni;

public class Rettangolo extends Forma {
    private double base, altezza;
    private TipologiaForma tipologiaForma;

    public Rettangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
        this.tipologiaForma = TipologiaForma.RETTANGOLO;
    }

    @Override
    public void calcolaArea() {
        System.out.println("Il rettangolo ha area: " + base * altezza);
    }
}
