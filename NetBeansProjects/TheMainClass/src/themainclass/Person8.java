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
/*
Denne oppgaven inkluderer klasser Person8, Studenter8 og Lecturer8.
*/
public class Person8 {
    protected int age;
    public String name;
    private double height;
    
    public Person8(int age, String name){
        this.age = age;
        this.name = name;
        
    }
    public String getInfo(){
        return "Name:" + name + "Age:"+ age;
        
    }
    
}
