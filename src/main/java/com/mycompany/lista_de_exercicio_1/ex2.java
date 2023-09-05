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
public class ex2 {
     public static void main(String[] args) {
        float num1, num2, num3, resultado;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        num1 = scanner.nextFloat();
        System.out.println("Digite outro numero: ");
        num2 = scanner.nextFloat();
        System.out.println("Digite outro numero: ");
        num3 = scanner.nextFloat();
        resultado = (num1 + num2 + num3) / 3;
        System.out.println("A media dos numeros é " + resultado);
        
        
    
}
}