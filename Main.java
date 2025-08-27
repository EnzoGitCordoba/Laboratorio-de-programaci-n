import java.util.concurrent.ForkJoinPool;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        //Crearemos varios juguetes y mostramos su contenido de forma manual para comprobar el funcionamiento del builder
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


// metemos el precio de cada juguete dentro de un arreglo para despues poder buscar el mayor

        double [] arreglo= new double[106];         //6  de estos ya fueron previamente creados
        arreglo[0]=juguete.getPrecio();
        arreglo[1]=juguete1.getPrecio();
        arreglo[2]=juguete2.getPrecio();
        arreglo[3]=juguete3.getPrecio();
        arreglo[4]=juguete4.getPrecio();
        arreglo[5]=juguete5.getPrecio();

        generarJuguetes2(105,arreglo); //genero automatico juguetes con precio escalable

        Juguete juguete6 = new Juguete.Builder("EL JUGUETE MAS CARO", 9999999)      // creo el juguete mas caro , este sera nuestro objetivo a encontrar
                .Cabezas(1)
                .Piernas(2)
                .Torzos(1)
                .Brazos(6)
                .Dureza(15)
                .build();
        System.out.println("Juguete creado: " + juguete6.toString());

        arreglo[92]=juguete6.getPrecio(); // lo ubico en cualquier lado del arreglo pisando el precio generado previamente

        double mayor;               //variable donde guadaremos el mayor precio
        ForkJoinPool conjuntoDeHilos= new ForkJoinPool();        //creo un forkJoinPool el cual es un conjunto de hilos especiales que implementa el modelo de ejecución divide y vencerás.

        mayor= conjuntoDeHilos.invoke(new MayorTask(arreglo, 0, arreglo.length)); // envio la tarea al conjunto de hilos previamente creado esperando que me devuelva el mayor precio
                                                                     //la tarea la envio en forma de "hilo" en mayorTask el cual en vez de un run() sobrescribe un compute()

        System.out.println("El mayor es :"+mayor); //muestro el mayor precio
    }



    public static void generarJuguetes2(int i , double[] arreglo ) {
// forma recursiva de generacion de juguetes
        Juguete juguete;

        if(i==5){

            juguete = new Juguete.Builder("replica"+i, i*25000)
                    .Cabezas(1)
                    .Piernas(2)
                    .Torzos(1)
                    .Brazos(6)
                    .Dureza(15)
                    .build();

            arreglo[i]=juguete.getPrecio();

            System.out.println("Los juguetes fueron generados");

        } else {
            juguete = new Juguete.Builder("replica"+i, i*25000)
                    .Cabezas(1)
                    .Piernas(2)
                    .Torzos(1)
                    .Brazos(6)
                    .Dureza(15)
                    .build();

            arreglo[i]=juguete.getPrecio();

            generarJuguetes2(i-1, arreglo);
        }



    }
}
