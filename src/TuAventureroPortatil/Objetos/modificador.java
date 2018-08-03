package TuAventureroPortatil.Objetos;

public class modificador {

    String aModificar;
    int bonificador = 0;
    int penalizador = 0;

    public modificador(int modificador, String fuente){
        if(modificador <= 0){
            bonificador = modificador;
        }
        if (modificador > 0) {
            bonificador = penalizador;
        }
        aModificar = fuente;
    }

    public String returnModificar(){
        return  aModificar;
    }

    public int returnModificador(){
        if(bonificador != 0){
            return bonificador;
        }
        if(penalizador != 0){
            return penalizador;
        }
        return 0;
    }

}
