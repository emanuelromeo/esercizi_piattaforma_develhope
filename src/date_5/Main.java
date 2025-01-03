package date_5;

import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args) {

        OffsetDateTime dataPrecedente = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        OffsetDateTime dataSuccessiva = OffsetDateTime.parse("2024-03-01T13:00:00Z");

        System.out.println("La prima data precede la seconda? " + dataPrecedente.isBefore(dataSuccessiva));
        System.out.println("La seconda data segue la prima? " + dataSuccessiva.isAfter(dataPrecedente));
        System.out.println("La prima data è uguale ad ora? " + dataPrecedente.isEqual(OffsetDateTime.now()));
        System.out.println("La seconda data è uguale ad ora? " + dataSuccessiva.isEqual(OffsetDateTime.now()));

    }
}
