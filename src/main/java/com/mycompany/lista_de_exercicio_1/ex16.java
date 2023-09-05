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
public class ex16 {
    public static void main(String args[]){
        String text;
        Scanner sc = new Scanner(System.in);
        System.out.print("digite uma frase: ");
        text = sc.nextLine().trim().replaceAll(" ", "");
        System.out.print("o texto tem " + text.length() + " caracteres");
    } 
    
}
