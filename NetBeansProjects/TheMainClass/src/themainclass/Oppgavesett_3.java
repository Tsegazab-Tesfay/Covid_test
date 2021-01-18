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
public class Oppgavesett_3 {
    // OPPGAVE.1.1
    /** Her vil koden print ut "melding 1" hvis påstanden/argumemntet som kommer inn er true, hvis ikke så
    får jeg resultatet til å bli "MELDING 2".*/
    //OPPGAVE 1.2
    public void PrintMelding(){
        int x = 0;
        for(x=1;x<=15;x++){
            System.out.println(x + " Hei, DAPE1400/ITPE1400");
    }
    // OPPGAVE 1.3
    /** Resultatet skal bli True, False, False.*/
    //OPPGAVE 2. Teori
    /**1. Forskjellen mellom instruksjonsegmentet og datasegment er:
     at instruksjonsegmengtet innholder instruksjonene til programmet mens data segmentet inneholder
     programmets variabler*/
    /**2. Det er fordi hver instruksjon som utføres, programtelleren automatisk peker 
     på neste instruksjon*/
    /**3. Betingede hopp er, som hopper til en gitt instruksjon bare hvis et gitt boolsk utsagn er sant,
     mens ubetinget hopp, som hopper ubetinget til en gitt instruksjon*/
    /**4.GOTO instruksjonen er det som forteller hvor hvilke instruksjoner som skal 
     utføres, dvs GOTO er et eksmple av ubetinget hopp. GOTO støttes ikke av java, det er fordi java dekker
     alle behøvene som vi får av GOTO instruksjon. Når det gjelder hvordan if-else, while og for løkke relatert med
     GOTO instruskjon:if-ifelse-else hopper til neste instruksjon hvis boolsk/logisk uttrykk ikke gir sann
     mens for og while hopper tilbake i instruksjonssekvensen.*/
    /**5. beskrevet i 4. */
    //OPPGAVE 5
    // Her må jeg se hva koden gjør nøye, altså boolean.
    }
    public void oppgaveFem(){
        
        boolean test = true || false;
        
        if(test){
            test= true && false;
        }else{
            System.out.println("Bye bye, world! 111");
        }
        //
        if(test){
            System.out.println("Bye bye, world! 112");
        }else if(!test){
            test = !test;
        }else{
            System.out.println("Bye bye, world 113");
        }
        //
        if(test){
            System.out.println("Bye bye, world! 121");
        }else{
            test = true;
            if(test){
                System.out.println("Bye bye, world! 122");
            }
        }
    }
    
public void AlbertE(){
    
    int x = 1;
    for(x = 1; x <11; x++){
        System.out.println("System.out.println(" + '"'+"Melding " +x + '"' + ");");
    }
    x = x + 1;
}
/**3.
den skal print ut 20 ganger "teller", det vil si fra 0 til 19(samme som mindre enn 20)
men når den starter do while skal prints ut 18 ganger teller, dvs fra 19 til 1.
Forskjellen er at while løkke printer ut minst en gang.
*/

public void Analysere(){
    int teller = 0;
    while(teller < 20){
        teller++;
        
        
    }
    System.out.println("teller1 " + teller);
    do{
        teller--;
    }while(teller !=20 && teller >0);
    System.out.println("teller2 " + teller);
    
}
public void konverter(){
    System.out.println("Skriv et tegn: 9");
    Scanner sc = new Scanner(System.in);
    char ch = sc.next().charAt(0);
    
    //char ch = scanner.next().charAt(0);
    switch(ch){
        case 97:
            System.out.println("Du skrev inn a");
            break;
        case 98:
            System.out.println("Du skrev inn b");
            break;
        case 99:
            System.out.println("Du skrev inn c");
            break;
        case 100:
            System.out.println("Du skrev inn d");
            break;
        default:
            System.out.println("Du skrev inn noe annet");
    }
}
// Den kjører uendelig...
public void for_Isteaden_while_loop(){
    int teller = 0;
    for(int i = 0;i<20;i++){
        teller++;
    }
    System.out.println(teller);
    }
// Here forsetter jeg videregående oppgaver.
public void kl(){
    
    for(int i=0;i<20;i++){
        System.out.println(i);
    }
}
public void Oppgave_3_1(){
    Scanner sc = new Scanner(System.in);
    int x,y,z;
    System.out.println("Enter  number: ");
    x = sc.nextInt();
    y = sc.nextInt();
    z = sc.nextInt();
    // Her jeg kunne ha brukt min(x,y,z) også
    // kunne være mer nøye om hva brukern gir
    if(x<y && x<z){
        System.out.println(x + " er minst tall");
    }else if(y<x && y<z){
        System.out.println(y + " er minst tall");
    }else{
        System.out.println(z+ " er minst tall");
    }
   }
public void Oppgave_3_2(){
    System.out.println("*");
    System.out.println("**");
    System.out.println("***");
    System.out.println("****");
    System.out.println("*****");
    System.out.println("******");
    System.out.println("*****");
    System.out.println("****");
    System.out.println("***");
    System.out.println("**");
    System.out.println("*");
 
}
public void Oppgave_3_3(){
    
    
    for(int i = 0;i<10;i++){
        int tall= (int)(Math.random()*100);
        System.out.println(tall);
    }
}
public void Oppgave_3_4(){
    int n = 2;
    int m = 3;
    
    for(int i=0; i<=2 ;i++){
        // her trenger jeg å finne ut hva som bruker til squre.(isteaden for square)
        int t = i+n;
        int b = i+m;
        System.out.println(t);
        System.out.println(b);
        System.out.println();
        
        
    }
}
public static void ret_dem(boolean verdi){
    if(verdi){
        System.out.println("Verdien er true!");
        return;
    }else{
        System.out.println("Verdien er false!");
        return;
    }
}

}
