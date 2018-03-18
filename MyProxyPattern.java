/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproxypattern;

import java.util.Scanner;

/**
 *
 * @author arash
 */
public class MyProxyPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RealClass real= new RealClass();
        ProxyClass proxy= new ProxyClass();
        int counterTried=1;
        String uname=null;
        String pass=null;
        while(counterTried < 4){
            System.out.println("Attempt no: "+ counterTried);
            Scanner sc= new Scanner(System.in);

            System.out.println("Please enter your user name:");
            uname=sc.nextLine();
            
            System.out.println("Please enter your password:");
            pass=sc.nextLine();
            
            if (proxy.getNamePassword(uname, pass)==0){
                System.out.println("Your balance is : "+ real.giveBalanace());
                break;
            }
            counterTried++;
        }
        if (counterTried>3){
            System.out.println("Your balance is : "+ proxy.giveBalanace());;
        }
    }
    
}
