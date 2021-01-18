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
public class ElectricCar extends Car {
    String regNr;
    String make;
    int battery;
    
    public ElectricCar(String regNr, String make, int battery){
        super(regNr,make);
        this.battery = battery;
    }
    
    @Override
    public int getcalculatedBom(){
        return 10;
    }
    
}
