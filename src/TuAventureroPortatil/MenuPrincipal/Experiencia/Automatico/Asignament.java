package TuAventureroPortatil.MenuPrincipal.Experiencia.Automatico;

import TuAventureroPortatil.Objetos.caracteristica;
import TuAventureroPortatil.Objetos.clase;


public class Asignament {

    // Metodo que realiza una asignacion automatica de las caracteristicas segun la clase.
    public static void asigancion(clase clase, Characteristics charact){
        int[] cifras = charact.returnCifras();
        cifras = ordenar(cifras);
        if(clase.name() == "Barbarian"){
            Barbarian(cifras, charact);
        }
    }

    // Metodo que ordena un int[].
    public static int[] ordenar(int[] resultado){
        for(int i=0;i<(resultado.length-1);i++){
            for(int j=i+1;j<resultado.length;j++){
                if(resultado[i]<resultado[j]){
                    int variableauxiliar=resultado[i];
                    resultado[i]=resultado[j];
                    resultado[j]=variableauxiliar;
                }
            }
        }
        return resultado;
    }

    // Metodo que asigna las caracteristicas segun la clase Barbaro.
    public static void Barbarian(int[] cifras, Characteristics charact){
        cifras = ordenar(cifras);
        charact.sumar(cifras[0],0,"FUE");
        charact.sumar(cifras[1],0,"CON");
        charact.sumar(cifras[2],0,"DES");
        charact.sumar(cifras[3],0,"SAB");
        charact.sumar(cifras[4],0,"INT");
        charact.sumar(cifras[5],0,"CAR");
        bonificadores(charact,"FUE");
        bonificadores(charact,"DES");
        bonificadores(charact,"CON");
        bonificadores(charact,"INT");
        bonificadores(charact,"SAB");
        bonificadores(charact,"CAR");
    }

    // Metodo que aplica los bonificadores de las caracteristicas.
    private static void bonificadores(Characteristics characteristics, String characteristic){
        caracteristica charact = characteristics.returnChar(characteristic);
        int base = charact.returnBase();
        if(base == 7) {
            characteristics.sumar(0, -2,characteristic);
        }
        if(base == 8 || base == 9){
            characteristics.sumar(0,-1,characteristic);
        }
        if(base == 10 || base == 11){
            characteristics.sumar(0,0,characteristic);
        }
        if(base == 12 || base == 13){
            characteristics.sumar(0,1,characteristic);
        }
        if(base == 14 || base == 15){
            characteristics.sumar(0,2,characteristic);
        }
        if(base == 16 || base == 17) {
            characteristics.sumar(0, 3,characteristic);
        }
        if(base == 18){
            characteristics.sumar(0,4,characteristic);
        }
    }
}
