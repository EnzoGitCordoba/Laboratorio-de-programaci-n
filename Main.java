//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Juguete juguete = new Juguete.Builder("Spider Man", 15000)
                .Cabezas(1)
                .Piernas(2)
                .Torzos(1)
                .Brazos(2)
                .Dureza(25.0)
                .build();
        System.out.println("Juguete creado: " + juguete.toString());

        Juguete juguete1 = new Juguete.Builder("Matuqui", 8000)
                .Dureza(10.0)
                .build();
        System.out.println("Juguete creado: " + juguete1.toString());

        Juguete juguete2 = new Juguete.Builder("Barbie", 25000)
                .Cabezas(1)
                .Piernas(2)
                .Torzos(1)
                .Brazos(2)
                .Dureza(5.0)
                .build();
        System.out.println("Juguete creado: " + juguete2.toString());

        Juguete juguete3 = new Juguete.Builder("Pelota", 5000)

                .Dureza(2)
                .build();
        System.out.println("Juguete creado: " + juguete3.toString());

        Juguete juguete4 = new Juguete.Builder("Apretable de goma", 2500)
                .Dureza(1)
                .build();
        System.out.println("Juguete creado: " + juguete4.toString());

        Juguete juguete5 = new Juguete.Builder("Dr. Optopus", 25000)
                .Cabezas(1)
                .Piernas(2)
                .Torzos(1)
                .Brazos(6)
                .Dureza(15)
                .build();
        System.out.println("Juguete creado: " + juguete5.toString());



    }
}