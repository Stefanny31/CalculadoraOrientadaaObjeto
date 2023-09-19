/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadoraorientadaaobjeto;

import java.util.Scanner;

/**
 *
 * @author stefanny.0181
 */
public class Rascunho {
    
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        CalculadoraCientifica cc = new CalculadoraCientifica();
        
        Scanner scanner = new Scanner(System.in);
        
        int opcao;
        
       
       Boolean continuar = true;
       
       String opcaoescolha;
       
       while(continuar){
       
        System.out.println("----------------------------------------");
        System.out.println("**************Calculadora***************");
        System.out.println("----------------------------------------");
        System.out.println("Selecione a opção ");
        System.out.println("1 - Soma ");
        System.out.println("2 - Subtração ");
        System.out.println("3 - Multiplicação ");
        System.out.println("4 - Divisão ");
        System.out.println("5 - Raiz Quadrada ");
        System.out.println("6 - Potência ");
        System.out.println("----------------------------------------");

        opcao = scanner.nextInt();
        
        System.out.println("Informe o primeiro valor: ");
        float num1 = scanner.nextFloat();
        
        System.out.println("Informe o segundo valor: ");
        float num2 = scanner.nextFloat();
        
        System.out.println("**********Resultados**********");
        System.out.println("Resultado: " + calculadora.somar(num1, num2));
        System.out.println("Resultado: " + calculadora.subtrair(num1, num2));
        System.out.println("Resulatdo " + calculadora.multiplicar(num1, num2));
        System.out.println("Resultado" + calculadora.dividir(num1, num2));
        System.out.println("Resultado: " + cc.raizQuadrada(num1));
        System.out.println("Resultado: " + cc.potencia(num1,num2));
        
       }
    }

    
}
