//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // aqui crearemos juguetes para mostrarlos por pantalla
        Tipo tipo;
        tipo= new Tipo("HombreAraña","lego","saltarin");

        Composicion compo;
        compo= new Composicion(1,2,1,2);

        Juguete juguete;
        juguete=new Juguete(tipo,compo,123);

        System.out.println(juguete.getCaracteristicas());
    }
}