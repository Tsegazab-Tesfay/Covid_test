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
// her må jeg endre til abstract noe.
public class Student9 extends Person9{
    protected int age;
    protected String name;
    private char examScore;
    public Student9(int age, String name, char examScore){
        super(age, name);
        this.examScore = examScore;
        
    }
    
}
