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
public class Student {
    private String navn;
    private int studentNumber;
    private int fodselaar;
    
    public Student(String Navn, int StudentNummer, int FodselAar){
        navn = Navn;
        studentNumber = StudentNummer;
        fodselaar = FodselAar;
    }
    public void setStudentName(String n){
        navn = n;
    }
    public void setStudentNumber(int number){
        studentNumber = number;
    }
    public void setStudentBirth(int birth){
        fodselaar = birth;
    }
    
    public String getStudentName(){
        return navn;
    }
    public int getStudenNumber(){
        return studentNumber;
    }
    public int getStudentBirth(){
        return fodselaar;
    }
    
}
