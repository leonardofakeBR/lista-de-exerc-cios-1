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
public class ex6 {
    public static void main (String args[]){
        int num, i;
        Scanner scanner = new Scanner(System.in);
        System.out.print("digite um numero: ");
        num = scanner.nextInt();
        i = 0;
        while(i <= 10){
        System.out.println(i + " X " + num + " = " + i*num);
        i++;
        }
    }
    
}
