/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursion;
import java.util.Scanner;
/**
 *
 * @author USER
 */
//import java.util.Scanner;
public class Recursion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   SumOfDigits sum = new SumOfDigits();
   Factorial fac = new Factorial();
   //System.out.println(countDown(1));
   
   System.out.println(fac.factorial(5));
   //System.out.println(evenNumbers(5));
 //  Scanner sc = new Scanner(System.in);
   //int num1 = sc.nextInt();
   //int num2 =sc.nextInt();
   //System.out.println(multiply(num1,num2));
   int[] arr = {1,5,3,4};
   //System.out.println(arr.length);
   
   System.out.println(sum.Digits(1234));
   
   //int target = 3;
   //System.out.println(SortNumber(arr,target,0));
   
     
}
    /*
    // Recursion practise: counting from 1 to 5
    public static int countDown(int n){
    if(n==5){
    return n;
    }
   System.out.println(n);
   return countDown(n+1); 
    }
    
   
  static int multiply(int n,int k){
  if(k==0){
  return 0;
  }
  return n * multiply(n,k-1);
  }

    static boolean SortNumber(int[] arr,int target,int index){
     if(index==arr.length){
    return false;
    }
   
    return target == arr[index] || SortNumber(arr,target,index+1);
    }
    */
    static int sum =0;
    static void reverse(int n){
    if(n ==0){
    return;
    }
    int rem = n%10;
    sum = sum * 10 + rem;
    reverse(n/10);
    }
}

