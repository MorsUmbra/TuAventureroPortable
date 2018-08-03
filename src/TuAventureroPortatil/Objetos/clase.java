package TuAventureroPortatil.Objetos;

import TuAventureroPortatil.Objetos.SubObjetos.habilidad;

public class clase {

    // Objeto Clase.
    String name;
    String[] maestrias;
    TuAventureroPortatil.Objetos.SubObjetos.habilidad[] habilidad;
    dote[] dote;
    int nivel;
    int rangos;


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
        this.habilidad = habilidades;
    }


    // Metodo que define los dotes de la clase.
    public void setDotesDeClase(dote[] dotes){
        this.dote = dotes;
    }


    // Metodo que define los rangos de habilidades por nivel.
    public void setRangosDeHabilidades(int rangos){
        this.rangos = rangos;
    }


    // Metodo que define las habilidades con maestria de la clase.
    public void setMaestrias(String[] maestrias){
        this.maestrias = maestrias;
    }
}
