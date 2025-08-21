public class Juguete {
    private final String nombre;
    private final int cantCabezas;
    private final int cantPiernas;
    private final int cantTorzos;
    private final int cantBrazos;
    private final double dureza;
    private final double precio;

    public Juguete(Builder builder){
        this.nombre = builder.nombre;
        this.cantCabezas = builder.cantCabezas;
        this.cantPiernas = builder.cantPiernas;
        this.cantTorzos = builder.cantTorzos;
        this.cantBrazos = builder.cantBrazos;
        this.dureza = builder.dureza;
        this.precio= builder.precio;
    }
    public double getPrecio() {
        return precio;
    }

    public String toString() {
        String compo;
        compo = "La composicion del juguete "+nombre+" es: \n" ;
        compo += "\tcantidad de cabezas: " + cantCabezas + "\n" +
                "\tcantidad de piernas: " + cantPiernas + "\n" +
                "\tcantidad de torzos: " + cantTorzos + "\n" +
                "\tcantidad de brazos: " + cantBrazos + "\n"+
                "\tla dureza es: "+ dureza + "\n"
        +"\t el precio es: "+ precio + "\n";


        return compo;
    }

    
    public static class Builder{
        private final String nombre;
        private int cantCabezas;
        private int cantPiernas;
        private int cantTorzos;
        private int cantBrazos;
        private double dureza;
        private final double precio;

        public Builder(String nombre,double precio) {
            this.nombre = nombre;
            this.precio = precio;
        }

        public Builder Cabezas(int cantCabezas) {
            this.cantCabezas = cantCabezas;
            return this;
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
