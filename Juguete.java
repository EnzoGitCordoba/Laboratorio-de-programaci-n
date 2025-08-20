public class Juguete {
    Composicion compo;

    double dureza;
    Tipo tipo;

    Juguete(Tipo t,Composicion c, double d){
        tipo=t ;
        compo=c ;
        dureza=d;
    }

    public void setTipo(Tipo n){
       this.tipo= n ;
    }
    public void setDureza(double d){
        dureza=d;
    }

    public void setCompo(Composicion c){
        compo=c ;
    }


    public Tipo getTipo(){
     return tipo;
    }
    public double getDureza(){
        return dureza;
    }
    public Composicion getCompo(){
        return compo;
    }

    String getCaracteristicas(){
        String caracteristicas;
        caracteristicas = "tipo :\n " +this.tipo.getTipocompuesto() +
                "\ncomposicion:\n " +
                compo.composiciontoString()+
                "dureza: "+dureza;
        return  caracteristicas;
    }
}
