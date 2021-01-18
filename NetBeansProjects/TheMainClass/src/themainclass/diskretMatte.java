/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package themainclass;
import javax.swing.*;

/**
 *
 * @author tsegazabtesfay
 */
public class diskretMatte {
    
    //
    public void aritmetisk(){
        // 2 + 5 + 11 + 14 + 17 + 20
        int d = 3;// differancen
        int a = 2;// første ledd
        int b = 20;// siste ledd
        int n = (b-a)/d+1;
        
        int sum1 =((a+b)/2)*n;
        
        
        //her jeg kunne sette for løkke
        int sum2 = 0;
        String s = "";
        for(int i = a; i <=b; i+=d){
            s += (i!=b)? i+ "+" : i;// betingelse settning
            sum2 +=i;
        }
        System.out.println("Sum1 er : " + sum1+ " og sum2 er: "+ sum2);
    }
    public void geoMetrisk(){
        double a = 1;
        double r = -1/2.0; // r er forholdet mellom tallene 
        
        int n = 5; // n er det størst index, altså sist ledd
        
        double sum1 = 0;
        double ledd = a;
        String s = "";
        
        for(int j= 0;j<n;j++){
            sum1 += ledd;
            // her  jeg kunne skrevet
            //ledd =  a*Math.pow(a, j);
            ledd *= r;
        }
        // På en annen måte, r!=1
        double sum2 = a*(Math.pow(r,n+1)/(r-1));
        s += "sum1 = " + sum1 + "sum2 = " + sum2;
        //JOptionPane.showMessageDialog(null,s);
        System.out.println("Summen er :" + sum1 + " Summen er: " + sum2);
        
    }
}
