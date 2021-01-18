/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package themainclass;

/**
 *
 * @author tsegazabtesfay
 * 
 */

public class Lecturer8 extends Person8{
    
    private long salary;
    
    public Lecturer8(int age, String name, long salary){
        super(age, name);
        this.salary = salary;
    }
    public int getAge(){
        return age;
    }
    public String getInfo(){
        return super.getInfo() + "Salary: "+ salary;
    }
   
    
}
