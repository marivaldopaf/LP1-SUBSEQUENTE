package aula01;

import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = teclado.nextLine();
        System.out.println(" Olá mundo! "+nome); 

        System.out.print("Qual a sua idade: ");
        int idade = teclado.nextInt(); 
        System.out.println(" Legal ter "+idade+ "anos");  

    }
}
