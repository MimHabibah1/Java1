/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author uys-50
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] s) {
        // TODO code application logic here
        
        int marks=Integer.parseInt(s[0]);
        if (marks<30)  
        {
        System.out.println("No");
        }
         if (marks>30&& marks<50)  
       {
           System.out.println("Passed");
        }                                                                                                     
          if (marks>50 && marks<70)  
        {
            System.out.println("Good");
        }
          if (marks>70)
          {
              System.out.println("Passed with A grade");
          }
    }
    
}
