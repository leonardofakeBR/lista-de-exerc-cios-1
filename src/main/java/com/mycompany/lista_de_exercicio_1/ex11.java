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
public class ex11 {
    public static void main(String arg[]){
        int num1, num2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        num1 = scanner.nextInt();
        System.out.print("digite outro numero: ");
        num2 = scanner.nextInt();
        if(num1 > num2){
            System.out.print("o numero " + num1 + " é maior que o numero " + num2);
        }else if(num1 < num2){
            System.out.print("o numero " + num2 + " é maior que o numero " + num1);

        }else {
            System.out.print("os numeros são iguais.");
        }
            
    }
}
