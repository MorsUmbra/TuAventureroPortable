package NombreDelProgramaPendiente.HojaDePersonaje.Personaje;

import TuAventureroPortatil.MenuPrincipal.Experiencia.Automatico.Asignament;
import TuAventureroPortatil.MenuPrincipal.Experiencia.Automatico.Characteristics;
import NombreDelProgramaPendiente.Generadores.Clase.Clase;

import java.util.Scanner;

public class personaje {
    // Objeto Personaje: posee Nombre, Caracteristicasm, Raza, Clase, Habilidades, Equipo, Defensa, Rasgos.
    String name;
    Characteristics caracteristicas;
    //Rasgos rasgos;
    //Race raza;
    Clase clase;
    //Abilities habilidades;
    //Equipment equipamiento;
    //Defense defensa;

    // Generador de objeto Personaje.
    public Personaje(String name, int index){
        if (index == 1){
            this.name = name;
            caracteristicas = new Characteristics();
            selectClass();
            Asignament.asigancion(clase, caracteristicas);
            caracteristicas.print();
        }
        if (index == 2){
            this.name = name;
            caracteristicas = new Characteristics();
            int[] cifras = caracteristicas.returnCifras();
        }
    }

    // Metodo que permite seleccionar la clase a traves de un switch.
    public void selectClass(){
        int index;
        Scanner sc = new Scanner(System.in);
        classMenu();
        index = sc.nextInt();
        switch (index){
            case 1:
                clase = new Clase(index);
                break;
            case 2:
                clase = new Clase(index);
                break;
            case 3:
                clase = new Clase(index);
                break;
            case 4:
                clase = new Clase(index);
                break;
            case 5:
                clase = new Clase(index);
                break;
            case 6:
                clase = new Clase(index);
                break;
            case 7:
                clase = new Clase(index);
                break;
            case 8:
                clase = new Clase(index);
                break;
            case 9:
                clase = new Clase(index);
                break;
            case 10:
                clase = new Clase(index);
                break;
            case 11:
                clase = new Clase(index);
                break;
        }
    }

    // Metodo que imprime el menu de clases.
    private void classMenu(){
        System.out.println("Elige tu clase:");
        System.out.println("    1. Barbaro");
        System.out.println("    2. Bardo");
        System.out.println("    3. Clerigo");
        System.out.println("    4. Druida");
        System.out.println("    5. Explorador");
        System.out.println("    6. Guerrero");
        System.out.println("    7. Hechicero");
        System.out.println("    8. Mago");
        System.out.println("    9. Monje");
        System.out.println("    10. Paladin");
        System.out.println("    11. Picaro");
    }

}
