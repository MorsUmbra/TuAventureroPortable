package TuAventureroPortatil.Objetos;

public class requisito {

    String fuente;
    int cantidad;


    // Metodo Constructor.
    public requisito(String fuente, int cantidad){
        this.fuente = fuente;
        this.cantidad = cantidad;
    }


    // Metodo que devuelve la fuente del requisito.
    public String returnFuente(){
        return fuente;
    }


    // Metodo que devuelve la cantidad del requisito.
    public int returnCantidad(){
        return cantidad;
    }
}
