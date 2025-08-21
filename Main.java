//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Juguete juguete = new Juguete.Builder("Bocaa")
                .setCantCabezas(1)
                .setCantPiernas(2)
                .setCantTorzos(1)
                .setCantBrazos(2)
                .setDureza(5.0)
                .build();
        System.out.println("Juguete creado: " + juguete.toString());
        Juguete juguete2 = new Juguete.Builder("aaaa")
                .setCantCabezas(1)
                .setCantPiernas(2)
                .setCantTorzos(1)
                .setDureza(5.0)
                .build();
        System.out.println("Juguete creado: " + juguete2.toString());
    }
}