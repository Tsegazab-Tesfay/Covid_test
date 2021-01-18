/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package themainclass;
import java.util.Scanner;
/**
 *
 * @author tsegazabtesfay
 */
public class Test {
    Scanner scanner = new Scanner(System.in);
    public void test(){
        
        System.out.println("What is your name? ");
        
        String name = scanner.nextLine();
        System.out.println();
        System.out.println("Hello, " + name + "!");
        
        System.out.println("What is your age");
        int age = scanner.nextInt();
        int YearBorn = 2017 - age;
        System.out.format("\nHello, %s! Your were born in %d\n", name, YearBorn, YearBorn -1);

    }
    public String getString(){
        return scanner.next();
    }
    public int getInt(){
        return scanner.nextInt();
    }
    public void Resu(){
        System.out.println("What is your name? ");
        String name = getString();
        System.out.println("What is your age");
        int age = getInt();
        int yearBorn = 2017 - age;
        System.out.format("Hello %s, You were born in %d ", name, yearBorn);
    }
    public void boolsk(){
        char a = 'p';
        System.out.println(0 + a);
    }
    public void EksamenOpp(){
        char var = 'a'-1;
        
        while((++var) !='z'+1){
            System.out.println(var);
            
        }
    }
    // hva en break og continue gjør i en while loops.
    // break og continue er h
    //oppe instruksjoner
    
    // do while
    // for loop
    // switch
    // Skreiv en for-løkke som en while-løkke
    
    public void testfor(){
        for(int i = 1; i<8; i++){
            
            System.out.println(i);
            if(i == 4){
                // if innfor for loop
            }
            
        }
    }
    public void tabeler(){
     int x=0;
        System.out.println(x);
        
    }
    static int a(){
        System.out.println("Hello from a()");
        return 5;
        
    }
    public static boolean invert(boolean input){
        System.out.println("Input: " + input);
        return !input;
        
    }
    public static int sum(int a, int b){
        return a + b;
        
    }
    public static void writeMessage(){
        System.out.println("Hello from write message!");
    }
    //det er beste og enklere å ungå 
    // Her er det mulig å returner ved hjelp return selv om det er en void her.
    public static void returnDemo(boolean value){
        if(value){
            System.out.println("Value is true");
        }else{
            System.out.println("value is false");
        }  
        
    }
    public static void sum(int a, int b, int mySum){
        mySum = a + b;
    }
    
    public void Tabeller(){
        int[] intTab = {-3,-3,2,5,12};
        char[] charTab = {'H','e','l','l','o'};
        
        int[] intTab2 = new int[5];
        char[] charTab2 = new char[5];
        
        for(int index=0;index<5;index++){
            intTab2[0]= index;
            charTab2[index]=(char)('a'+index);
            
        }
        
        for(int value:intTab2){
            System.out.println(value);
            
        }        
        System.out.println(charTab2);
    }
    public void printErr(){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x==2){
            System.err.println("Det er to");
            System.exit(-1);
        }else{
            System.out.println("Det er ikke to");
        }
    }
    public void gcd(int a, int b){
        while(b > 0){
            int r = a%b;
            a = b;
            b = r;
        }
        System.out.println("The greatest commen diviser is: " + a);
    }
    
    
    
}
