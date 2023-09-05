/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_de_exercicio_1;

import java.util.Scanner;

/**
 *
 * @author leonardo.35903
 */
public class Lista_de_exercicio_1 {

    public static void main(String[] args) {
        int num1, num2, resultado;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        num1 = scanner.nextInt();
        System.out.println("Digite outro numero: ");
        num2 = scanner.nextInt();
        resultado = num1 + num2;
        System.out.println("A soma dos dois numeros é " + resultado);
        
        
    }
}
