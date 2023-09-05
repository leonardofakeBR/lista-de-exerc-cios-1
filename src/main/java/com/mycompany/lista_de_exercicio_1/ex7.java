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
public class ex7 {
    public static void main (String args[]) {
        int num1, num2, resultado;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        num1 = scanner.nextInt();
        num2 = num1 - 1;
        while(num2 != 0) {
            num1 = num1 * num2;
            num2--;
            
        }
        System.out.print(num1);
    }
}
