package TuAventureroPortatil.Objetos;

import TuAventureroPortatil.Objetos.SubObjetos.habilidad;
import TuAventureroPortatil.Objetos.SubObjetos.modificador;
import TuAventureroPortatil.Objetos.SubObjetos.requisito;

public class dote {


    String name;
    requisito requisitos;
    TuAventureroPortatil.Objetos.SubObjetos.habilidad[] habilidad;
    modificador bonificador;
    modificador penalizador;


    // Metodo Constructor
    public dote(String name, requisito requisitos, habilidad[] deDote){
        this.name = name;
        this.requisitos = requisitos;
        this.habilidad = deDote;
    }


    // Metodo que define el modificador del dote, en caso de que exista.
    public void setModificador(int modificador, String fuente){
        modificador nuevoModificador = new modificador(modificador, fuente);
        if(modificador < 0){
            penalizador = nuevoModificador;
        }
        if(modificador >= 0){
            bonificador = nuevoModificador;
        }
    }


    // Metodo que devuelve el nombre del dote.
    public String returnName(){
        return name;
    }


    // Metodo que devuelve los requisitos del dote.
    public requisito returnRequisitos(){
        return requisitos;
    }


    // Metodo que devuelve la habilidad del dote.
    public habilidad[] returnHabilidad(){
        return habilidad;
    }


    // Metodo que devuelve el modificador del dote.
    public modificador returnModificador(){
        if(bonificador.returnModificador() != 0){
            return penalizador;
        }
        if(penalizador.returnModificador() != 0){
            return bonificador;
        }
        return bonificador;
    }

}
