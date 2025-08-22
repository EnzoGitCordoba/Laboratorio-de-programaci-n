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

        Juguete juguete1 = new Juguete.Builder("Matuqui", 808880)
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

        Juguete juguete3 = new Juguete.Builder("Pelota", 555000)

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

        double [] arreglo= new double[6];
        arreglo[0]=juguete.getPrecio();
        arreglo[1]=juguete1.getPrecio();
        arreglo[2]=juguete2.getPrecio();
        arreglo[3]=juguete3.getPrecio();
        arreglo[4]=juguete4.getPrecio();
        arreglo[5]=juguete5.getPrecio();
        // meto todos los precios de juguetes en un arreglo , para luego compararlos

        Hilo h1= new Hilo(arreglo,0,2); // el constructor del hilo recibe el arreglo , y que distancia debe recorrer
        Hilo h2= new Hilo(arreglo,2,4);
        Hilo h3= new Hilo(arreglo,4,6);

        h1.start(); //arranca el hilo
        h2.start();
        h3.start();

        try {
            h3.sleep(1500); //el hilo 3 espera un poco , para asegurar la finalizacion de los otros hilos
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("el maximo general es de " + h3.getMaxGlobal() ); //solicito el valor de la variable global de la clase HILO

    }

}