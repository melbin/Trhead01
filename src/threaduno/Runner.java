/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threaduno;

/**
 *
 * @author melbin
 */
public class Runner extends Thread{

    @Override
    public void run() {
        for(int i=0; i<10; i++){
            System.out.printf("Numero : %s\n", i);
            try{
                Thread.sleep(100);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
    
}
