/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletininterruptor;

/**
 * Programa que escriba 6 veces alternativamente la palabra hola y adios (Hola,adios,hola,adios,hola,adios)
 * @author quique
 */
public class Interruptor {
    
    int inter = 0;
    int cond = 0;
    
    public void calcularInter(){
    
        while (cond <6){
            if (inter==0){
                System.out.println("Hola");
                inter = 1;
            } else {
                System.out.println("Adios");
                inter = 0;
            }
            cond+=1;
        }
    
    }
}
