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
public class ex15 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float nota1, nota2, nota3, nota4, media;
        System.out.print("digite a 1° nota: ");
        nota1 = sc.nextFloat();
        System.out.print("digite a 2° nota: ");
        nota2 = sc.nextFloat();
        System.out.print("digite a 3° nota: ");
        nota3 = sc.nextFloat();
        System.out.print("digite a 4° nota: ");
        nota4 = sc.nextFloat();
        media = (nota1 + nota2 + nota3 + nota4)/4;
        if(media >= 6.0) {
            System.out.print("com a media de " + media + " o aluno está aprovado.");
        }else {
            System.out.print("com a media de " + media + " o aluno está reprovado.");
        }
    }
}
