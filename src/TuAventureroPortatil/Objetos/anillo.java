package TuAventureroPortatil.Objetos;

import TuAventureroPortatil.Objetos.habilidad;
import TuAventureroPortatil.Objetos.modificador;

public class anillo {

    String nombre;
    String descripcion;
    habilidad[] deObjeto;
    int nivelNecesario;
    modificador objeto;

    public anillo(String nombre){
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }

    public void setHabilidadDeObjeto(habilidad[] deObjeto){
        this.deObjeto = deObjeto;
    }

    public void setNivelNecesario(int nivelNecesario){
        this.nivelNecesario = nivelNecesario;
    }

    public void setModificador(int modificador, String fuente){
        objeto = new modificador(modificador,fuente);
    }

}
