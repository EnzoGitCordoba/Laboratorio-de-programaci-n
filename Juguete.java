public class Juguete {
    private final String nombre;
    private final int cantCabezas;
    private final int cantPiernas;
    private final int cantTorzos;
    private final int cantBrazos;
    private final double dureza;
    

    public Juguete(Builder builder){
        this.nombre = builder.nombre;
        this.cantCabezas = builder.cantCabezas;
        this.cantPiernas = builder.cantPiernas;
        this.cantTorzos = builder.cantTorzos;
        this.cantBrazos = builder.cantBrazos;
        this.dureza = builder.dureza;
        
    }

    public String toString() {
        String compo;
        compo = "La composicion del juguete "+nombre+" es: \n" ;
        compo += "\tcantidad de cabezas: " + cantCabezas + "\n" +
                "\tcantidad de piernas: " + cantPiernas + "\n" +
                "\tcantidad de torzos: " + cantTorzos + "\n" +
                "\tcantidad de brazos: " + cantBrazos + "\n"+
                "\tla dureza es: "+ dureza + "\n";

        return compo;
    }

    
    public static class Builder{
        private final String nombre;
        private int cantCabezas;
        private int cantPiernas;
        private int cantTorzos;
        private int cantBrazos;
        private double dureza;

        public Builder(String nombre) {
            this.nombre = nombre;
        }

        public Builder setCantCabezas(int cantCabezas) {
            this.cantCabezas = cantCabezas;
            return this;
        }

        public Builder setCantPiernas(int cantPiernas) {
            this.cantPiernas = cantPiernas;
            return this;
        }

        public Builder setCantTorzos(int cantTorzos) {
            this.cantTorzos = cantTorzos;
            return this;
        }

        public Builder setCantBrazos(int cantBrazos) {
            this.cantBrazos = cantBrazos;
            return this;
        }

        public Builder setDureza(double dureza) {
            this.dureza = dureza;
            return this;
        }

        public Juguete build() {
            return new Juguete(this);
        }
    }
    
}
