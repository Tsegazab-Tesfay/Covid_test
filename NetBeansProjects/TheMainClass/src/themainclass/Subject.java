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
public class Subject {
    
    //data felt
    public String title;
    private int code;
    
    //construkter
    public Subject(String t, int c){
       // System.out.println("A subjectt object has been created");
       title = t;
       code = c;
    }
    //metoder
    public void printInfo(){
        System.out.println("Hello from print info" + title +""+code);
    }
    // having static in metodes
    
    
    public String getTitle(){
        return title;
    }
   
    
    
}
