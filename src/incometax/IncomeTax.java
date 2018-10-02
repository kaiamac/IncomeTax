/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package incometax;
import java.util.Scanner;
/**
 *
 * @author kamac8665
 */
public class IncomeTax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner keyInput = new Scanner (System.in);
        // x = taxable income
        int x = (int) 0.0;
        int l3 = (int) 0.0;
        int l5 = (int) 0.0;
        int tax = (int) 0.15;
        int total = (int) 0.0;
        System.out.println("Enter your taxable income from line 260 of your return");
        x = keyInput.nextInt();
        
        if( x < 46605) {
            l3 = x - 0;
            l5 = l3 * tax;
            total = l5;

        }
    System.out.println("Your taxable income is " + total);
    }
    
}
