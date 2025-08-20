public class Tipo {
    // espero tipo juguetes del estilo super heroe , villano ,muñeca , etc...
    String nombre;
    // espero la marca de este juguete
    String marca;
    // imagino que cada figura de accion tiene un  modelo distinto
    String modelo;

    Tipo(String n ,String marca,String modelo) {
        nombre=n;
        this.marca=marca;
        this.modelo=modelo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getTipocompuesto(){
        return "\tnombre: "+nombre+"\n\tmarca: "+marca+ "\n\tmoledo :"+modelo;
    }
}
