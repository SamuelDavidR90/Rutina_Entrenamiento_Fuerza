

package com.mycompany.poo_rutinaentrenamiento;

import java.util.Scanner;


public class POO_RutinaEntrenamiento {

    public static void main(String[] args) {
        TrenInferior sentadilla = new TrenInferior("Sentadilla", 3, 5, 0);
        TrenInferior pesomuerto = new TrenInferior("peso muerto convencional", 3, 5, 0);
        TrenSuperior pressbanco = new TrenSuperior("Press banco", 3, 5);
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Inserte el dia \n 1 Lunes \n 2 Martes \n 3 Jueves \n 4 Viernes");
        int dia = teclado.nextInt();
        
        switch (dia){
            case 1: System.out.println("Entrenaras " + sentadilla.getNombre() + " \n Series:" + sentadilla.getSeries() + " \n Repeticiones: " + sentadilla.getReps());
                    sentadilla.iniciar();
            break;
            case 2: pressbanco.iniciar();
            break;
            case 3: pesomuerto.iniciar();
            case 4: pressbanco.iniciar();
            break;
            default: System.out.println("Selecciona un valor valido");
            break;
        }
        
        System.out.println("Descansos: \n Miercoles \n Sabados \n Domingos");
    }
}
