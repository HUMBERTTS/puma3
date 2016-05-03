/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author humberto
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
      
        System.out.println("Hola mundo");
        
      ///variables enteras
        int a, b;
        ///variables reales
        double r1, r2;
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("inserte los valores");
        a= Integer.parseInt(br.readLine());
        System.out.println("Inserte el segundo valor");
        b=Integer.parseInt(br.readLine());
        
        System.out.println("Inserte nu valor doble");
        r1= Double.parseDouble(br.readLine());
        System.out.println("Inserte un segyndo valor real");
        r2= Double.parseDouble(br.readLine());
        
        
        System.out.println("***************************");
        System.out.println("Redultados");
        
         System.out.println("a-b= "+(a-b));
        System.out.println("a+b= "+(a+b));
         System.out.println("b+a= "+(b/a));
         
         System.out.println("r1+r2= "+(r1+r2));
         System.out.println("r1-r2= "+(r1-r2));
         
         System.out.println("a+r2= "+(a+r2));
         System.out.println("r1+b= "+(r1+b));
    }
    
}
