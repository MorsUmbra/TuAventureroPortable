package TuAventureroPortatil.MenuPrincipal.Experiencia.Automatico;

import TuAventureroPortatil.Objetos.caracteristica;
import TuAventureroPortatil.Objetos.dado;

public class Characteristics {

    //Objeto Characteristics: posee los seis objetos caracteristica principales.
    private int[] cifras;
    private caracteristica FUE = new caracteristica(0,0);
    private caracteristica DES = new caracteristica(0,0);
    private caracteristica CON = new caracteristica(0,0);
    private caracteristica INT = new caracteristica(0,0);
    private caracteristica SAB = new caracteristica(0,0);
    private caracteristica CAR = new caracteristica(0,0);

    //Generador de Objeto Characteristics.
    public Characteristics(){
        cifras = generarTotal(6);
    }

    //Metodo que genera X cantidad de cifras.
    private int[] generarTotal(int cantidad){
        int[] cifras = new int[cantidad];
        for (int i = 0; i < cifras.length; i++) {
            cifras[i] = generar();
        }
        cifras = ordenar(cifras);
        int total = suma(cifras);
        if(total < 60 || total > 80){
            return generarTotal(cantidad);
        }
        return cifras;
    }

    //Metodo que genera una cifra que va entre 7 y 18
    private int generar(){
        dado dado6 = new dado(6);
        int[] resultado = dado6.tirarDado(4);
        int baseCharacteristic = totalCharacteristic(resultado);
        if(baseCharacteristic < 7){
            return generar();
        }
        return baseCharacteristic;
    }

    //Metodo que suma el total de un int[], restandole la ultima posicion (en este caso, el menor).
    private int totalCharacteristic(int[] resultado){
        resultado = ordenar(resultado);
        int resultadoFinal = 0;
        for (int i = 0; i < resultado.length-1; i++) {
            resultadoFinal = resultadoFinal + resultado[i];
        }
        return resultadoFinal;
    }

    //Metodo que permite modificar la base y el bonificador de una caracteristica especifica.
    public void sumar(int base, int bonificador, String charact){
        if(charact.equals("FUE")){
            sumarFUE(base,bonificador);
        }
        if(charact.equals("DES")){
            sumarDES(base,bonificador);
        }
        if(charact.equals("INT")){
            sumarINT(base,bonificador);
        }
        if(charact.equals("CON")){
            sumarCON(base,bonificador);
        }
        if(charact.equals("SAB")){
            sumarSAB(base,bonificador);
        }
        if(charact.equals("CAR")){
            sumarCAR(base,bonificador);
        }
    }

    // Metodo que modifica la base y el bonificador de Fuerza.
    private void sumarFUE(int base, int bonificador){
        FUE.modificarBase(base);
        FUE.modificarBonificador(bonificador);
    }

    // Metodo que modifica la base y el bonificador de Destreza.
    private void sumarDES(int base, int bonificador){
        DES.modificarBase(base);
        DES.modificarBase(bonificador);
    }

    // Metodo que modifica la base y el bonificador de Constitucion.
    private void sumarCON(int base, int bonificador){
        CON.modificarBase(base);
        CON.modificarBonificador(bonificador);
    }

    // Metodo que modifica la base y el bonificador de Inteligencia.
    private void sumarINT(int base, int bonificador){
        INT.modificarBase(base);
        INT.modificarBonificador(bonificador);
    }

    // Metodo que modifica la base y el bonificador de Sabiduria.
    private void sumarSAB(int base, int bonificador){
        SAB.modificarBase(base);
        SAB.modificarBonificador(bonificador);
    }

    // Metodo que modifica la base y el bonificador de Carisma.
    private void sumarCAR(int base, int bonificador){
        CAR.modificarBase(base);
        CAR.modificarBonificador(bonificador);
    }

    // Metodo que devuelve una Caracteristica especifica a traves del nombre como argumento.
    public caracteristica returnChar(String charact){
        if(charact.equals("FUE")){
            return FUE;
        }
        if(charact.equals("DES")){
            return DES;
        }
        if(charact.equals("CON")){
            return CON;
        }
        if(charact.equals("INT")){
            return INT;
        }
        if(charact.equals("SAB")){
            return SAB;
        }
        if(charact.equals("CAR")){
            return CAR;
        }
        return FUE;
    }

    // Metodo que devuelve la variable cifras;
    public int[] returnCifras(){
        return this.cifras;
    }

    // Metodo que imprime por pantalla los valores de cada caracteristica.
    public void print(){
        System.out.println("Fuerza: ");
        FUE.print();
        System.out.println();
        System.out.println("Destreza: ");
        DES.print();
        System.out.println();
        System.out.println("Constitucion: ");
        CON.print();
        System.out.println();
        System.out.println("Inteligencia: ");
        INT.print();
        System.out.println();
        System.out.println("Sabiduria: ");
        SAB.print();
        System.out.println();
        System.out.println("Carisma: ");
        CAR.print();
    }

    // Metodo que ordena un int[].
    private int[] ordenar(int[] resultado){
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

    // Metodo que suma el total de un int[].
    private int suma(int[] cifras){
        int resultado = 0;
        for(int i = 0; i < cifras.length; i++) {
            resultado = resultado + cifras[i];
        }
        return resultado;
    }
}

