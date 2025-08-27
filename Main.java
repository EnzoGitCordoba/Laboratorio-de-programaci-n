import java.util.concurrent.ForkJoinPool;

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


// meto todos los precios de juguetes en un arreglo , para luego compararlos+

        double [] arreglo= new double[106];
        arreglo[0]=juguete.getPrecio();
        arreglo[1]=juguete1.getPrecio();
        arreglo[2]=juguete2.getPrecio();
        arreglo[3]=juguete3.getPrecio();
        arreglo[4]=juguete4.getPrecio();
        arreglo[5]=juguete5.getPrecio();

        generarJuguetes2(105,arreglo);

        Juguete juguete6 = new Juguete.Builder("EL JUGUETE MAS CARO", 9999999)
                .Cabezas(1)
                .Piernas(2)
                .Torzos(1)
                .Brazos(6)
                .Dureza(15)
                .build();
        System.out.println("Juguete creado: " + juguete6.toString());

        arreglo[92]=juguete6.getPrecio();

        double mayor;
        ForkJoinPool fj= new ForkJoinPool();

        mayor= fj.invoke(new MayorTask(arreglo, 0, arreglo.length));


        System.out.println("El mayor es :"+mayor);
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
/*  public static double[] generarJuguetes() {
// forma iterativa de generar juguetes
        Juguete juguete;
        double [] arreglo1= new double[100];

        for(int i=0;i<100;i++){

            juguete = new Juguete.Builder("replica"+i, i*25000)
                    .Cabezas(1)
                    .Piernas(2)
                    .Torzos(1)
                    .Brazos(6)
                    .Dureza(15)
                    .build();

            arreglo1[i]=juguete.getPrecio();
        }
        System.out.println("Los juguetes fueron generados");
        return arreglo1;
    }*/

}
