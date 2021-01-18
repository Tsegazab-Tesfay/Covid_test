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
public class Foreleser {
    
    private String navn;
    private int kontornummer;
    private double lannstrinn;
    
    public Foreleser(String Navn, int Kontornummer, double Lannstrinn){
        navn = Navn;
        kontornummer = Kontornummer;
        lannstrinn = Lannstrinn;
    }
    public void setForeleserName(String n){
        navn = n;
    }
    public void setKontorNumber(int number){
        kontornummer = number;
    }
    public void setLannTrinn(double lanntrinn){
        lannstrinn = lanntrinn;
    }
    
    public String getForelserName(){
        return navn;
    }
    public int getKontorNumber(){
        return kontornummer;
    }
    public double getLanntrinn(){
        return lannstrinn;
    }
    
}
