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
public class ex4 {
    public static void main(String args[]){
        float num1, num2, opcao, resultado;
        Scanner scanner = new Scanner(System.in);
        System.out.print("1 - soma\n2 - subtração\n3 - multiplicação\n4 - divisão\nR: ");
        opcao = scanner.nextFloat();
        if(opcao == 1) {
            
            System.out.print("Digite um numero: ");
            num1 = scanner.nextInt();
            
            System.out.print("Digite outro numero: ");
            num2 = scanner.nextInt();
            
            resultado = num1 + num2;
            
            System.out.print("a soma entre " + num1 + " e " + num2 + " é igual a " + resultado);
            

        }else if(opcao == 2) {
            
            System.out.print("Digite um numero: ");
            num1 = scanner.nextInt();
            
            System.out.print("Digite outro numero: ");
            num2 = scanner.nextInt();
            
            resultado = num1 - num2;
            
            System.out.print("a subtração entre " + num1 + " e " + num2 + " é igual a " + resultado);
            

        }else if(opcao == 3) {
            
            System.out.print("Digite um numero: ");
            num1 = scanner.nextInt();
            
            System.out.print("Digite outro numero: ");
            num2 = scanner.nextInt();
            
            resultado = num1 * num2;
            
            System.out.print("a multiplicação entre " + num1 + " e " + num2 + " é igual a " + resultado);
            

        }else if(opcao == 4) {
            
            System.out.print("Digite um numero: ");
            num1 = scanner.nextInt();
            
            System.out.print("Digite outro numero: ");
            num2 = scanner.nextInt();
            
            resultado = num1 / num2;
            
            System.out.print("a divisão entre " + num1 + " e " + num2 + " é igual a " + resultado);
            

        }else {
            System.out.print("opção invalido.");
        }
        
    }
    
}
