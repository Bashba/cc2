/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hamidcalcuatorcc2;

import java.util.Scanner ; 
/**
 *
 *@author Hamid 
 */
public class HamidCalcuatorCC2 {
public static void main(String[] args) { 
    double num1 ;
    double num2 ;
    double ans ;
    char op ; 
    Scanner reader=new Scanner(System.in);  
    System.out.println("Enter two numpers"); 
    num1 = reader.nextDouble();
    num2 = reader.nextDouble();
    System.out.println("Enter operator (+, -, *, /)"); 
     op = reader.next().charAt(0);
      switch(op) {
         case '+': ans = num1 + num2;
            break;
         case '-': ans = num1 - num2;
            break;
         case '*': ans = num1 * num2;
            break;
         case '/': ans = num1 / num2;
            break;
      default: System.out.printf("Error! Enter correct operator");
         return;
      }
      System.out.print("The result is given as follows:");
      System.out.printf(num1 + " " + op + " " + num2 + " = " + ans);

    
}
