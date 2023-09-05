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
public class ex12 {
    public static void main(String args[]){
        int num1, num2, troca;
        Scanner sc = new Scanner(System.in);
        System.out.print("digite um numero: ");
        num1 = sc.nextInt();
        System.out.print("digite um outro numero: ");
        num2 = sc.nextInt();
        troca = num2;
        num2 = num1;
        num1 = troca;
        
        
    }
}
