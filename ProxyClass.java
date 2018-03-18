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
public class ProxyClass implements IAuthenticate{
    RealClass real= new RealClass();
    
    
    @Override
    public int getNamePassword(String uname, String pass) {
        //   three times attempt would be enough to test user validation
        return real.getNamePassword(uname, pass);

    }

    @Override
    public double giveBalanace() {
        return 0.0;
    }
    
}
