/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproxypattern;

/**
 *
 * @author arash
 */
public class RealClass implements IAuthenticate{
    private final String uname="test";
    private final String password="test";

    private double balance = 1005397.45;


    @Override
    public double giveBalanace() {
        return balance;
    }

    @Override
    public int getNamePassword(String name, String pass) {

        if (uname.equals(name) && password.equals(pass)){
             return 0;
        }

        return 1;
    }  
}
