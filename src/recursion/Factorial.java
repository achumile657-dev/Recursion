/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursion;

/**
 *
 * @author USER
 */
public class Factorial {
    static int factorial(int n){
    if(n==0){
    return 1;
    }
    System.out.println(n);
    return n * factorial(n-1);
    }
 
  static int evenNumbers(int n){
  if(n==0){
  return 0;
  }
  System.out.println(n);
  return n + evenNumbers(n-1);
  }
   
}
