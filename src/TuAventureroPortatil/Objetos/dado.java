package TuAventureroPortatil.Objetos;

public class dado {

    // Objeto dado: cantidad de caras.
    int caras;

    // Constructor dado.
    public dado(int caras){
        this.caras = caras;
    }

    // Metodo que simula la tirada del dado.
    public int tirarDado(){
        int resultado;
        resultado = (int) Math.random()*caras + 1;
        return resultado;
    }

    // Metodo que simula la tirada de dado/dados.
    public int[] tirarDado(int cantidad){
        int[] resultado = new int[cantidad];
        for (int i = 0; i < cantidad; i++) {
            resultado[i] = tirarDado();
        }
        return resultado;

    }

}
