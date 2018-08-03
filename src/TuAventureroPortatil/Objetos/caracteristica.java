package TuAventureroPortatil.Objetos;

public class caracteristica {
    // Objeto Caracteristic: posee un valor base y un valor modificador.
    private int base;
    private int bonificador;


    // Generador de objeto Caracteristic.
    public caracteristica(int base, int bonificador){
        this.base = base;
        this.bonificador = bonificador;
    }


    // Metodo que devuelve el valor base.
    public int returnBase(){
        return base;
    }

    // Metodo que devuelve el valor de bonificador.
    public int returnBonificador(){
        return bonificador;
    }

    // Metodo que modifica el valor base.
    public void modificarBase(int entero){
        base = base + entero;
    }

    // Metodo que modifica el valor del modificador
    public void modificarBonificador(int entero){
        bonificador = bonificador + entero;
    }

    // Metodo que imprime los valores de base y bonificador.
    public void print(){
        System.out.println("Base = " + base + " | Bonificador = " + bonificador);
    }
}
