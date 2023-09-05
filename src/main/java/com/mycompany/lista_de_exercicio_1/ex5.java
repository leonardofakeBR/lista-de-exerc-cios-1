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
public class ex5 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        int i, num;
        i = 0;
        System.out.print("Digite um numero: ");
        num = scanner.nextInt();
        while(i <= num) {
            System.out.println(num);
            num--;
    }
    }
    
}
