/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package themainclass;

/**
 *
 * @author tsegazabtesfay
 */
public class BensinCar extends Car{
    String regNr;
    String make;
    int bensintank;
    
    public BensinCar(String regNr, String make, int bensintank){
        super(regNr,make);
        this.bensintank = bensintank;

    }
    @Override
    public int getcalculatedBom(){
        return 50;
    }
    
    
}
