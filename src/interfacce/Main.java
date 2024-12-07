package interfacce;

public class Main {
    public static void main(String[] args) {
        Rettangolo rettangolo = new Rettangolo(10, 5.2);
        Triangolo triangolo = new Triangolo(12, 4);

        rettangolo.calcolaArea();
        triangolo.calcolaArea();
    }
}
