import java.util.concurrent.RecursiveTask;
import java.util.concurrent.ForkJoinPool;
public class MayorTask extends RecursiveTask<Double> {


    private double[] arreglo;
    private int inicio, fin;



    public MayorTask(double[] arreglo, int inicio, int fin) {        // constructor de los hilos
        this.arreglo = arreglo;
        this.inicio = inicio;
        this.fin = fin;
    }


    @Override
    protected Double compute() {    //metodo sobreescrito de la clase abstracta recursiveTask
        double resultado=0;
        double resultadoDerecha=0;
        double resultadoIzquierda=0;

        if((fin-inicio)<=5){                            // cada "hilo" debera preguntar si su tramo de arreglo es menor a 5
            double maxLocal = arreglo[inicio];             // si lo es , creamos un maxLocal con la posicion inicial que va a comparar
            System.out.println("Soy un hilo que recorre desde:"+inicio+" hasta:"+fin+" mi mayor local es:"+maxLocal);
            for (int i = inicio; i < fin; i++) {        // recorro todo el arreglito para ver el maxLocal
                if (arreglo[i] > maxLocal) {
                    maxLocal = arreglo[i];          // Guardo el maxLocal
                                 }

            }
            resultado=maxLocal;                 //como resultado es lo que voy a retornar , maxLocal= resultado
        }else{
            System.out.println("Soy un hilo y intento recorrer desde: "+inicio+" hasta:"+fin+"pero como es muy grande divido la tarea");
            //en el caso de que no haya sido el tramo menor a 5 entraremos a bifurcar la tarea
            int medio = (inicio+fin)  /2 ;      //dividimos el arreglo en 2
            MayorTask izquierda=new MayorTask(arreglo,inicio,medio);        //Creamos dos "hilos" los cuales se dividiran la tarea
            MayorTask derecha=new MayorTask(arreglo,medio,fin);


            izquierda.fork();           // manda a trabajar el hilo izquierdo en paralelo

            resultadoDerecha = derecha.compute();// llama recursivamente a compute con el lado derecho del arreglo y almacena el valor retornado (resultado=MaxLocal)
            resultadoIzquierda=izquierda.join();       //espera a que termine la tarea izquierda y guarda el valor
            System.out.println("Mis subHilos, me devolvieron dos valores. ResultadoIzquierda="+resultadoIzquierda+" y ResultadoDerecha"+resultadoDerecha);
            resultado =Math.max(resultadoDerecha,resultadoIzquierda);       // por cada bifurcacion resultante vamos a comparar y devulver un rexzultado

        }
        return resultado;
    }
}
