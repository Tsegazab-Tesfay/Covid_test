/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package themainclass;

import static java.lang.Math.abs;

/**
 *
 * @author tsegazabtesfay
 */

// Jeg bruker Oppgavesett_6 isteadenfor Person.
public class Oppgavesett_6 {
    // jeg kaller Oppgavesett_6 istedenfor Person
    private final int age;
    private final String name;
 
    
    
    public Oppgavesett_6(int a, String n){
        age = a;
        name = n; 
    }
    public void printInfo(){
        //final int other_person = 10;
        System.out.println("Name: "+ name +" Person_age: "+ age);
        
    }
    public int getAge(){
        return age;
    }
    public boolean checkAge(Oppgavesett_6 other){
        if(other.getAge() == 0 || getAge()==0 || other.getAge() > 130 || getAge() > 130){
            return false;
        }else{
            return true;
        }
            
        
    }
    public int ageDifference(Oppgavesett_6 other){
        if(checkAge(other) == true){
            int otherAge = other.getAge();
            int difference = abs(getAge() - otherAge);
            return difference;
     
        }else{
            return 0;
        }
        
    }

}
