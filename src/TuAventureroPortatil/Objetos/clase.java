package TuAventureroPortatil.Objetos;

public class clase {

    // Objeto Clase.
    String name;
    String[] maestrias;
    habilidad[] hDeClase;
    dote[] dDeClase;
    int nivel;
    int rangosDeHabilidades;

    // Generador de Objeto Clase.
    public clase(String name){
            this.name = name;
        }


    // Metodo que devuelve el nombre de la clase.
    public String name(){
        return name;
    }


    // Metodo que define el nivel de la clase.
    public void setNivel(int nivel){
        this.nivel = nivel;
    }


    // Metodo que define las habilidades de la clase.
    public void setHabilidadesDeClase(habilidad[] habilidades){
        hDeClase = habilidades;
    }


    // Metodo que define los dotes de la clase.
    public void setDotesDeClase(dote[] dotes){
        dDeClase = dotes;
    }


    // Metodo que define los rangos de habilidades por nivel.
    public void setRangosDeHabilidades(int rangos){
        rangosDeHabilidades = rangos;
    }


    // Metodo que define las habilidades con maestria de la clase.
    public void setMaestrias(String[] maestrias){
        this.maestrias = maestrias;
    }
}
