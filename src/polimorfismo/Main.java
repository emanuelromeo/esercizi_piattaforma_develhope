package polimorfismo;

// A partire dal programma creato precedentemente in cui si richiedeva il calcolo dell'area,
// aggiungere una ulteriore classe chiamata Triangolo supportando poi il calcolo dell'area
// per quest'ultima figura

public class Main {
    public static void main(String[] args) {
        Forma forma = new Forma();
        Rettangolo rettangolo = new Rettangolo(10, 5.2);
        Triangolo triangolo = new Triangolo(12, 4);

        forma.calcolaArea();
        rettangolo.calcolaArea();
        triangolo.calcolaArea();
    }
}
