/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

/**
 *
 * @author jdara
 */
public class clase {
   
    
    public clase(){
}
    
       public float factorial(float x) {
        if(x <= 1) {
           return 1;
        }

        return factorial(x - 1) * x;
    }
       
  public float tabla (float x){
    
        for (int i=1; i<=10; i++){
        System.out.println(x + " X " + i + " = " + x*i + "\n");
        }
        
        return 0;
    }
       
}
   
