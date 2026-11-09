/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursion;

/**
 *
 * @author USER
 */
public class SumOfDigits {
    static int Digits(int n){
    if(n == 0){
    return 0;
    }
    return n%10 + Digits(n/10);
    }
}
