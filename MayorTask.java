import java.util.concurrent.RecursiveTask;
import java.util.concurrent.ForkJoinPool;
public class MayorTask extends RecursiveTask<Double> {


    private double[] arreglo;
    private int inicio, fin;
    private static double maximo = 0;            // variable global de la clase hilo
    private static final Object lock = new Object();        // lock para la seccion critica

    public MayorTask(double[] arreglo, int inicio, int fin) {        // constructor de los hilos
        this.arreglo = arreglo;
        this.inicio = inicio;
        this.fin = fin;
    }


    @Override
    protected Double compute() {

        double resultadoDerecha=0;
        double resultadoIzquierda=0;
        if(arreglo.length<8){

            for (int i = inicio; i < fin; i++) {        // PARA AÑADIR RECURSIVE TASK ESTE RECORRIDO PODRIA SER RECURSIVO
                if (arreglo[i] > maximo) {
                    maximo = arreglo[i]; // almacena el maximo local (de la parte que recorrio) en maxlocal
               }
            }
        }else{
            int medio = (inicio+fin)/2 ;
            MayorTask izquierda=new MayorTask(arreglo,inicio,fin);
            MayorTask derecha=new MayorTask(arreglo,medio,fin);


            izquierda.fork();

            resultadoDerecha = derecha.compute();
            resultadoIzquierda= izquierda.join();

            maximo =Math.max(resultadoDerecha,resultadoIzquierda);

        }
        return maximo;
    }
}
