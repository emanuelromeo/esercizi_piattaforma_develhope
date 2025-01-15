package design_patterns_builder;

//Crea una classe Person con i campi firstName, lastName, age e address, i getter and i setter
//Il costruttore accetterà un Builder in input
//Creare una classe Builder che attraverso il costruttore e dei metodi specifici (tranne nome e cognome, gli altri campi sono opzionali) per costruire l'oggetto Person.
//Creare due oggetti Person e stamparli a video

public class PersonBuilder {
    private String firstName, lastName, address;
    private int age;

    public PersonBuilder(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person getPerson() {
        return new Person(this);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
