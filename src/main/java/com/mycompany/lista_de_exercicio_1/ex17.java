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
public class ex17 {
    public static void main(String args[]){
    Float kg, M, imc;
    Scanner sc = new Scanner(System.in);
    System.out.print("digite seu peso em kg: ");
    kg = sc.nextFloat();
    System.out.print("digite sua altura em M: ");
    M = sc.nextFloat();
    imc = kg/(M*M);
    System.out.print("O seu IMC é " + imc);
    if(imc < 18.5){
        System.out.println("Você está abaixo do normal. ");
    }else if(18.6 < imc && imc < 24.9) {
        System.out.println("Você é normal. ");
    }else if(25 < imc && imc < 29.9) {
        System.out.println("você está com sobrepeso.");
    }else if(30 < imc && imc < 34.9){
        System.out.println("você está com obesidade 1 ");
    }else if(35 < imc && imc < 39.9){
        System.out.println("você está com obesidade 2 ");
    }else if(imc > 40) {
        System.out.println("você está com obesidade 3 ");
    }



}
    
}
