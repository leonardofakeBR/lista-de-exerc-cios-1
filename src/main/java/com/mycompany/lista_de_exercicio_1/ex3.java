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
public class ex3 {
     public static void main(String[] args) {
        int num1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        num1 = scanner.nextInt();
        if (num1 % 2 == 0){
            System.out.println("O numero digitado é par");
        }else {
            System.out.println("O numero digitado é impar");
        }
        
}}
