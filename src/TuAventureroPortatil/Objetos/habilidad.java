package TuAventureroPortatil.Objetos;

public class habilidad {

    String name;
    String descripcion;
    String tipo;
    String condicionDeActivacion;
    int duracion;
    modificador temporal;
    modificador caracteristica;
    modificador permanente;
    int rangos;
    int nivelNecesario;
    boolean maestria;

    public habilidad(String name){
        this.name = name;
    }

    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public void setCondicionDeActivacion(String condicionDeActivacion){
        this.condicionDeActivacion = condicionDeActivacion;
    }

    public void setTemporal(int modificador, String fuente){
        temporal = new modificador(modificador, fuente);
    }

    public void setCaracteristica(int modificador, String fuente){
        caracteristica = new modificador(modificador, fuente);
    }

    public void setPermanente(int modificador, String fuente){
        permanente = new modificador(modificador, "Velocidad");
    }

    public void setRangos(int rangos){
        this.rangos = rangos;
    }

    public void setNivelNecesario(int nivelNecesario){
        this.nivelNecesario = nivelNecesario;
    }

    public void setMaestria(boolean maestria){
        this.maestria = maestria;
    }

    public String returnName(){
        return name;
    }

    public String returnDescription(){
        return descripcion;
    }

    public String returnTipo(){
        return tipo;
    }

    public String returnCondicionDeActivacion(){
        return condicionDeActivacion;
    }

    public modificador returnModTemporal(){
        return temporal;
    }

    public modificador returnModCaracteristicas(){
        return caracteristica;
    }

    public modificador returnModPermanente(){
        return permanente;
    }

    public int returnRangos(){
        return rangos;
    }

    public int returnNivelNecesario() { return nivelNecesario; }

    public boolean maestria() {
        return maestria;
    }

    public void setDuracion(int duracion, int modificador){
        this.duracion = duracion + modificador;
    }

    public int returnDuracion(){
        return duracion;
    }
}
