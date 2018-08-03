package TuAventureroPortatil.MenuPrincipal.GeneradorDeCaracteristicas;

public class estandar {

    public static int cifra(int[] resultado){
        int cifra = 0;
        for (int i = 0; i < resultado.length-1; i++) {
            cifra = cifra + resultado[i];
        }
        return cifra;
    }
}
