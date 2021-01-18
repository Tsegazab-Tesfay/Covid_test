/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package themainclass;
import static java.lang.Math.abs;
import java.util.*;

/**
 *
 * @author tsegazabtesfay
 */
public class Oppgavesett_4 {
    /**1. Den skal printe ut 2*/
    /**2.*/
    public static boolean a(int i){
        //true hvis verdien er >= 18, false hvis det er lavere
        return (i>=18);
    }
    public void Result(){
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        boolean b = a(i);
        System.out.println(b);
    }
    // opp.3. for metoden har void, som ikke retunerer noe.
    // opp.2 Teori
    // a) Global datasegmentet er tilgjenglig i alle prosedyrer, dermed navnet"global"
    //Og variablene er alltid konstatnt i antall byter, noe som fører antall datasegementet er alltid 
    //konstatnt. Siden størelsen til segmentet er konstant og verken kan fominskes eller
    //utvides, kalles det en static segment(men det er ikke noe å gjøre med static som vi bruker når
    // vi operater en klasse.
    // Mens en stabel(stuck) er en variabel som er plassert på stabelen og er utelukkende tilgjengelig 
    // i prosedyren den er deklarert i.
    public void Opp_3(){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int d = abs(a);
        int e= abs(b);
        while(d!=e){
            if(d>e){
                d = d-e;
            }else{
                e = e-d;
            }
        }
        int c = e;
        System.out.println(c); 
        
    }
    public static int p2(int a){
        int i = 0;
        while(i <20){
            int inc =2;
            a+= inc;
            i+=inc;
        }
        return a;
    }
    
    public static int p1(int a){
        return p2(a +10);
    }
    
    

    
}
