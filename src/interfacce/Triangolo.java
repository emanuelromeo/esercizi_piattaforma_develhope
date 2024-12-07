package interfacce;

public class Triangolo implements Forma {
    private double base, altezza;

    public Triangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    public void calcolaArea() {
        System.out.println("Il triangolo ha area: " + base * altezza / 2);
    }
}
