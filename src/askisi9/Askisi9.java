/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package askisi9;

import java.util.Scanner;

/**
 *
 * @author pleh
 */
public class Askisi9 {
    static double misthos (){
                Scanner input = new Scanner (System.in);
        double time;
        System.out.println("pose ores doulepses?");
        time= input.nextDouble();
        
         if (time<=40){
             time=time*10;

         }else if (time>40 && time<=50){
         time = ((time-40)*18)+400;

         }else if(time > 50){
             time=((time-50)*25)+400+180;
         }

        return time;
    }
    
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double misthos=misthos();
        System.out.println("poso " + misthos);

    }

}
      

    
    

