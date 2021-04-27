/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Utente
 */
public class BufWaitNot {
    
    private static int valore;
    private boolean pieno = false;
    
    public synchronized int preleva(){
    
        while(pieno == false){
        
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        
        pieno = false;
        notify();
        System.out.println("Cosuma il numero: " + valore);
        return valore;
    }
    
    public synchronized void deposita(int value){
    
        while(pieno == true){
        
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        
        pieno = true;
        valore = value;
        notify();
        System.out.println("Produce il numero: " + valore);
    }
}
