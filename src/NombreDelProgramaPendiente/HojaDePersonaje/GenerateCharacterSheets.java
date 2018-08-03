package NombreDelProgramaPendiente.HojaDePersonaje;

import java.util.Scanner;

public class GenerateCharacterSheets {
    //public void generate(int index){
    //if(index == 1){
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Elige el nombre de tu personaje: ");
        String name = sc.nextLine();
        Personaje newCharacter = new Personaje(name, 1);
    }
        //}
    //if(index == 2){
    //        Scanner sc = new Scanner(System.in);
    //        System.out.println("Elige el nombre de tu personaje: ");
    //        String name = sc.nextLine();
    //        Personaje newCharacter = new Personaje(name, 2);
    //}
    // }
}
