/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista_de_exercicio_1;

import java.util.Scanner;

/**
 *
 * @author leonardo.35903
 */
public class ex8 {
    public static void main (String arg[]) {
        int num, i;
        Scanner scanner = new Scanner(System.in);
        System.out.print("digite um numero: ");
        num = scanner.nextInt();
        i = 2;
        while(i <= num) {
        if(num % i == 0 && num > i) {
            //if(num == i + 1){
            System.out.print("O numero não é primo"); 
            break;
           // }
        }
        else if(num == i) {
            
            System.out.print("O numero é primo");
            break;
            

             }
            i++;
        
        }
        
        }
}
