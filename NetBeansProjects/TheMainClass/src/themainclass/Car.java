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
public class Car {
    
    String regNr;
    String make;
    public Car(String regNr, String make){
        this.regNr=regNr;
        this.make= make;
    }
    
    public String getregNr(){
        return regNr;
    }
    
    public int getcalculatedBom(){
        return 0;
    }
    
}
