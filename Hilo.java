public class Hilo extends Thread {

        private double[] arreglo;
        private int inicio, fin;
        private static double maxGlobal = 0;            // variable global de la clase hilo
        private static final Object lock = new Object();        // lock para la seccion critica

        public Hilo(double[] arreglo, int inicio, int fin) {        // constructor de los hilos
            this.arreglo = arreglo;
            this.inicio = inicio;
            this.fin = fin;
        }

        public void run() { // cada hilo recorre una parte del arreglo
            double maxLocal = arreglo[inicio];
            for (int i = inicio; i < fin; i++) {        // PARA AÑADIR RECURSIVE TASK ESTE RECORRIDO PODRIA SER RECURSIVO
                if (arreglo[i] > maxLocal) {
                    maxLocal = arreglo[i]; // almacena el maximo local (de la parte que recorrio) en maxlocal
                }
            }

            synchronized(lock) {    //todos los hilos intentaran entrar a la seccion critica pero deben entrar de a 1

                if (maxLocal > maxGlobal) {
                    maxGlobal = maxLocal;       //comparan y cambian max global
                    //
                    //
            }
        }
        }
        public static double getMaxGlobal() {
            return maxGlobal;                   //un hilo pedira el maximo
        }
    }

