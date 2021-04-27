/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Utente
 */
public class ProdConsBufWaitNotify {
    
    public static void main(String[] args){
    
        BufWaitNot Buff = new BufWaitNot();
        Produttore p = new Produttore(Buff);
        Consumatore c = new Consumatore(Buff);
        p.start();
        c.start();
    }
    
}
