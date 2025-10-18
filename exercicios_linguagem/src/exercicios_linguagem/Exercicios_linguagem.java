package exercicios_linguagem;

import java.util.Scanner;


public class Exercicios_linguagem {

    public static void Menu() {
        System.out.println("---- Menu ----");
        System.out.println("1- Verificar idade para votação");
        System.out.println("2- Calculadora de Área de quadrado");
        System.out.println("3- Conversor de temperatura");
        System.out.println("4- Concatenador de Nome");
        System.out.println("5- Sair");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc = 0;
        do {            
            Menu();
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("Digite a idade: ");
                    int idade = sc.nextInt();
                    System.out.println(VerificadorVoto.podeVotar(idade));
                    break;
                case 2:
                    System.out.println("Digite o lado: ");
                    double lado = sc.nextDouble();
                    System.out.println("Area: " + CalculadoraGeometrica.calcularAreaQuadrado(lado));
                    break;
                case 3:
                    System.out.println("Digite o celsius: ");
                    double celsius = sc.nextDouble();
                    System.out.println("Fahrenheigt: " + ConversorTemperatura.celciusParaFahrenheit(celsius));
                    break;      
                case 4:   
                    
                    break;
                case 5:   
                    break;
                default:
                    break;
               
            }
        } while (opc != 5);
        

    }

}
