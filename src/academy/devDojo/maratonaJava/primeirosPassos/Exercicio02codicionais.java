package academy.devDojo.maratonaJava.primeirosPassos;

import java.util.Scanner;

public class Exercicio02codicionais {



   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("digite seu salario anual:");
      double salarioDigitado = scanner.nextDouble();

      if(salarioDigitado <= 34718){
         double porcentagem = 9.70;
         double resultado = (salarioDigitado*porcentagem)/100;
         double salarioFinal = salarioDigitado - resultado;
         System.out.println("seus impostos serao de "+resultado+" de taxa, seus salario final sera de R$"+ salarioFinal);
      }else if(salarioDigitado >= 34719 || salarioDigitado <= 68507){
         double porcentagem =37.35 ;
         double resultado = (salarioDigitado*porcentagem)/100;
         double salarioFinal = salarioDigitado - resultado;
         System.out.println("seus impostos serao de "+resultado+" de taxa, seus salario final sera de R$"+ salarioFinal);
      }else {
         double porcentagem = 49.50;
         double resultado = (salarioDigitado*porcentagem)/100;
         double salarioFinal = salarioDigitado - resultado;
         System.out.println("seus impostos serao de "+resultado+" de taxa, seus salario final sera de R$"+ salarioFinal);
      }

   }

}
