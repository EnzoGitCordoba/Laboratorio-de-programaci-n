public class Juguete {
    //conjunto de variables que necesita nuestro juguete
    private final String nombre;
    private final int cantCabezas;
    private final int cantPiernas;
    private final int cantTorzos;
    private final int cantBrazos;
    private final double dureza;
    private final double precio;

    public Juguete(Builder builder){
        // este metodo recibira un builder que sera nuestro juguete creado por partes y lo "ensamblara"
        this.nombre = builder.nombre;
        this.cantCabezas = builder.cantCabezas;
        this.cantPiernas = builder.cantPiernas;
        this.cantTorzos = builder.cantTorzos;
        this.cantBrazos = builder.cantBrazos;
        this.dureza = builder.dureza;
        this.precio= builder.precio;
    }
    public double getPrecio() { //get precio necesario para buscar el mas caro
        return precio;
    }

    public String toString() {      //toString() para mostrar los juguetes
        String compo;
        compo = "La composicion del juguete "+nombre+" es: \n" ;
        compo += "\tcantidad de cabezas: " + cantCabezas + "\n" +
                "\tcantidad de piernas: " + cantPiernas + "\n" +
                "\tcantidad de torzos: " + cantTorzos + "\n" +
                "\tcantidad de brazos: " + cantBrazos + "\n"+
                "\tla dureza es: "+ dureza + "\n"
        +"\tel precio es: "+ precio + "\n";


        return compo;
    }

    
    public static class Builder{    // builder es una subClase de juguete , esta nos permitira creear el juguete por partes
                                    //por lo que necesitaremos las mismas variables que luego retornaremos
        private final String nombre;
        private int cantCabezas;
        private int cantPiernas;
        private int cantTorzos;
        private int cantBrazos;
        private double dureza;
        private final double precio;

        public Builder(String nombre,double precio) { //constructor general del builder , aqui pondremos las variables obligatorias.
            this.nombre = nombre;
            this.precio = precio;
        }

        public Builder Cabezas(int cantCabezas) {
            this.cantCabezas = cantCabezas; //guardamos en el builder la variable
            return this;        // luego la retornamos
        }

        public Builder Piernas(int cantPiernas) {
            this.cantPiernas = cantPiernas;
            return this;
        }

        public Builder Torzos(int cantTorzos) {
            this.cantTorzos = cantTorzos;
            return this;
        }

        public Builder Brazos(int cantBrazos) {
            this.cantBrazos = cantBrazos;
            return this;
        }

        public Builder Dureza(double dureza) {
            this.dureza = dureza;
            return this;
        }

        public Juguete build() {
            return new Juguete(this);
        }
    }
    
}
