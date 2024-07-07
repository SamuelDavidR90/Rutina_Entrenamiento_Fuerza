
package com.mycompany.poo_rutinaentrenamiento;
import java.util.Scanner;

public class TrenInferior {
    String nombre;
    int series;
    int reps;
    int levantamiento;
    
    public TrenInferior(){
        
    }
    
    public TrenInferior(String nombre, int series, int reps, int levantamiento){
        this.nombre = nombre;
        this.series = series;
        this.reps = reps;
        this.levantamiento = levantamiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public int getReps() {
        return reps;
    }

    public void setReps(int reps) {
        this.reps = reps;
    }
    
    public void iniciar(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la semana");
        int semana = teclado.nextInt();
        
        System.out.println("Introduce tu repeticion Maxima en Kilos");
        double rm = teclado.nextInt();
        
        double levantamiento = 0;
        switch(semana){
            case 1: levantamiento = rm * 0.70;
            break;
            case 2: levantamiento = rm * 0.75;
            break;
            case 3: levantamiento = rm * 0.80;
            break;
            case 4: levantamiento = rm * 0.85;
            break;
            default: System.out.println("Solo puedes introducir valores entre 1 y 4");
            break;
        }
        
        System.out.println("Tu levantamiento sera con " + levantamiento + " Kilos");
        System.out.println("Al finalizar la semana evalua tu rm maxima");
    }
    
    
    
}
