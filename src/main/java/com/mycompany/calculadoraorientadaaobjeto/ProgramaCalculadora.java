/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadoraorientadaaobjeto;

import java.util.Scanner;

/**
 *
 * @author stefanny.0181
 */
public class ProgramaCalculadora {

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
        System.out.println("7 - Porcentagem");
        System.out.println("----------------------------------------");

        opcao = scanner.nextInt();
        
        
        float num1; 
        float num2 ;
        
        if(opcao == 1){    
            System.out.println("Escolheu Soma");
            System.out.println("Informe o primeiro valor: ");
            num1 = scanner.nextFloat();
            System.out.println("Informe o segundo valor: ");
            num2 = scanner.nextFloat();
            System.out.println("Resultado: " + calculadora.somar(num1, num2));
            

        }else if(opcao == 2){
            System.out.println("Escolheu Subtração");
            System.out.println("Informe o primeiro valor: ");
            num1 = scanner.nextFloat();
            System.out.println("Informe o segundo valor: ");
            num2 = scanner.nextFloat();
            System.out.println("Resultado: " + calculadora.subtrair(num1, num2));

        }else if(opcao == 3){
            System.out.println("Escolheu Multiplicação");
            System.out.println("Informe o primeiro valor: ");
            num1 = scanner.nextFloat();
            System.out.println("Informe o segundo valor: ");
            num2 = scanner.nextFloat();
            System.out.println("Resulatdo " + calculadora.multiplicar(num1, num2));

        }else if(opcao == 4){
            System.out.println("Ecolheu Divisão");
            System.out.println("Informe o primeiro valor: ");
            num1 = scanner.nextFloat();
            System.out.println("Informe o segundo valor: ");
            num2 = scanner.nextFloat();
            System.out.println("Resultado" + calculadora.dividir(num1, num2));
            
        }else if(opcao == 5){
            System.out.println("Escolheu Raiz Quadrada");
            System.out.println("Informe o Valor: ");
            num1 = scanner.nextFloat();
            System.out.println("Resultado: " + cc.raizQuadrada(num1));
            
        }else if(opcao == 6){
            System.out.println("Escolheu Potência");
            System.out.println("Informe o primeiro valor: ");
            num1 = scanner.nextFloat();
            System.out.println("Informe o segundo valor: ");
            num2 = scanner.nextFloat();
            System.out.println("Resultado: " + cc.potencia(num1,num2));
            
        }else if(opcao == 7){
            System.out.println("Escolheu Potência");
            System.out.println("Informe o primeiro valor: ");
            num1 = scanner.nextFloat();
            System.out.println("Informe o segundo valor: ");
            num2 = scanner.nextFloat();
            System.out.println("Resultado: " + cc.porcentagem(num1,num2));
            
            
        }else{
            System.out.println("Opção inexistente");
        }
        
       
        System.out.println("-------------------------------------");
        System.out.println("Deseja continuar? (S/N");
        opcaoescolha = scanner.next();
        System.out.println("-------------------------------------");

        if(opcaoescolha.equals("S") || opcaoescolha.equals("s")){
            continuar = true;
        }else{
            continuar = false;
        
        
        
        
        }
        
       }
    }
}
