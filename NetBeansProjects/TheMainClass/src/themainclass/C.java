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
public class C extends B{
    public int x;
    
    public C(int x){
        super(x);
    }
    public void test(){
        x = 10;
        this.x = 20;
        /* Xen i C klasse kaller enten direkte siden det er global variable eller
        gjennom konstrukturen
        */
        //B b_in_x = new B(2);
        //this.x = b_in_x.x;
        // eller akkurat som vi har i konstrukturen
        super.x = x;
        B b = this;
        b.x = 0;
        
    }
    
}
