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
public class ex20 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int sum = 0, n = 0;
        
        System.out.print("digite um numero: ");
        n = sc.nextInt();
        
        while (n != 0)
        {
            sum = sum + n % 10;
            n = n/10;
        }
        System.out.print("A soma dos digitos é " + sum);
    }
}
