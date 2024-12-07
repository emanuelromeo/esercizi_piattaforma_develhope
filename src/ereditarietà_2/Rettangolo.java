package ereditarietà_2;

public class Rettangolo extends Forma {
    private double base, altezza;

    public Rettangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    public void calcolaArea() {
        System.out.println("Il rettangolo ha area: " + base * altezza);
    }
}
