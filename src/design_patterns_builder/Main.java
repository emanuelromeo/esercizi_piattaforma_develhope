package design_patterns_builder;

public class Main {
    public static void main(String[] args) {
        PersonBuilder personBuilder1 = new PersonBuilder("Mario", "Rossi");
        personBuilder1.setAddress("Via del Campo, 1");
        personBuilder1.setAge(23);

        PersonBuilder personBuilder2 = new PersonBuilder("Giuseppe", "Verdi");

        System.out.println(personBuilder1.getPerson());
        System.out.println(personBuilder2.getPerson());
    }
}
