/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package themainclass;
import java.util.*;

/**
 *
 * @author tsegazabtesfay
 */
public class Oppgavesett_5 {
    public int a = 0;
    
    public Oppgavesett_5(int b){
        a = b;
    }
    public void ElementVerdi(){
        int[] tab = {9,18,7,16,5,14,3,12,1,10};
        
        for(int i=0;i<tab.length;i++){
            System.out.println(tab[i]);
        }
    }
    public void ReverseE(){
        int[] tab = {9,18,7,16,5,14,3,12,1,10};
   
//lengde: 10
        for(int i=((tab.length)-1);i>=0;i--){
            System.out.println(tab[i]);
        }
        
    // finne ut ett tall fra listen, det vil si en spesiel tall.
    // Bruk av if i en for løkka som ble funnet ut fra listen
    }
    public void HvertAndre(){
        int[] tab = {9,18,7,16,5,14,3,12,1,10};
        for(int i=0;i<tab.length;i+=2){
            System.out.println(tab[i]);
        }
        
    }
    // Her oppgaven som gjelder teori sprs...
    
    public void Oppgave_3(){
        //Tar to heltall fra brukeren og printer ut felles diviser.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        while(a!=b){
            if(a>b){
                a = a-b;
            }else if(b>a){
                b = b-a;
            }
        }
        int c = a;
        System.out.println("Det største felles diviser er: "+ c);
        
        
        
    }
    // Dette er formulla hvordan man konverterer fra en string til en heltall.
    public void stringToint(){
        String fem = "5";
        int tall = Integer.parseInt(fem);
        System.out.println("Dette er tallet som endret fra en string to integer: "+ tall);
     ;
    }
    public void copyNewtable(){
        int[] intTab = new int[10];
        for(int i=0; i<10; i++){
            intTab[i] = i; 
            
        }

    }

   
}
