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
public class Student8 extends Person8 {
    
    private char examScore;
    
    public Student8(int age, String name,char examScore){
    super(age,name);
    this.examScore = examScore;
        
    }
    public void setAge(int a){
        age = a;
    }

    
    @Override
    public String getInfo(){
        return super.getInfo()+ "exam " + examScore;
    }
   

    
}
