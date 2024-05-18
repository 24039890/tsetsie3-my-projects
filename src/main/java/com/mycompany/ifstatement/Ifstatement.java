/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ifstatement;

    import java.util.Scanner;
class Ifstatement{
    
   public static void main( String [] args){
    
    int A,B,C;
    Scanner achieve = new Scanner(System.in);
    
    A = achieve.nextInt();
    System.out.println(" A IS :" + A);
    
    B = achieve.nextInt();
    System.out.println(" B is : " + B);
    
    C = achieve.nextInt();
    System.out.println(" C is : " + C);
    
    if( A == B) System.out.println( " A and B are equal");
    if ( B==C) System.out.println("B is equal to C ");
    
    if( A== C) System.out.println(" A and C are equal");
    if( A >= B) System.out.println(" A is greater than B");
    if ( A>= C)System.out.println( "A is greater then ");
    if ( A*A + B*B == C) System.out.println(" the answer is : " + C);
    if ( A +B == B + A)  System.out.println( " this is commutative law");
    
    
   B=A*440;
   A=C*67;
   
  if ( B> A) System.out.println(" B IS greater");
    
} 
    
}