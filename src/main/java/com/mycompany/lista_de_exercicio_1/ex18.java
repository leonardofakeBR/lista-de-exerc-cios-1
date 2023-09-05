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
public class ex18 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int m, dia = 0;
        String mes = null;
        System.out.print("digite o numero do mês: ");
        m = sc.nextInt();
        if (m == 1){
        mes = "janeiro";
        dia = 31;
        }else if (m == 2){
        mes = "fevereiro";
        dia = 28;
        }else if (m == 3){
        mes = "março";
        dia = 31;
        }else if (m == 4){
        mes = "Abril";
        dia = 30;
        }else if (m == 5){
        mes = "maio";
        dia = 31;
        }else if (m == 6){
        mes = "junho";
        dia = 30;
        }else if (m == 7){
        mes = "julho";
        dia = 31;
        }else if (m == 8){
        mes = "agosto";
        dia = 31;
        }else if (m == 9){
        mes = "setembro";
        dia = 30;
        }else if (m == 10){
        mes = "outubro";
        dia = 31;
        }else if (m == 11){
        mes = "novembro";
        dia = 30;
        }else if (m == 12){
        mes = "dezembro";
        dia = 31;
        }else {
        System.out.print("numero invalido.");
        }
        if(m > 0 && m < 12) {
        System.out.print("No mês de " + mes + " tem " + dia + "dias.");
        }
    }
}
