public class Composicion {
    int cantCabezas;
    int cantPiernas;
    int cantTorzos;
    int cantBrazos;

    Composicion( int cc, int cp, int ct, int cb){
        cantCabezas = cc;
        cantPiernas = cp;
        cantTorzos = ct;
        cantBrazos = cb;

    }
    public void setCantCabezas(int c){
        cantCabezas = c;
    }
    public void setCantPiernas(int p){
        cantPiernas = p;
    }
    public void setCantTorzos(int t){
        cantTorzos = t;
    }
    public void setCantBrazos(int cantBrazos) {
        this.cantBrazos = cantBrazos;
    }

    public int getCantCabezas(){
        return cantCabezas;
    }
    public int getCantPiernas(){
        return cantPiernas;
    }
    public int getCantTorzos(){
        return cantTorzos;
    }
    public int getCantBrazos(){
        return cantBrazos;
    }

    public String  composiciontoString(){
        return "\tcantidad de cabezas: "+cantCabezas+"\n" +
                "\tcantidad de piernar: "+cantPiernas+"\n" +
                "\tcantidad de Torzos: "+ cantTorzos+"\n" +
                "\tcantidad de brazos: "+cantBrazos+"\n";
    }
}
