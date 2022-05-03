package Prova;

import java.util.Scanner;

public class Fases {

    public static void main(String[] args) {

        double porcentagem_total;
        
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o número de fases completas: ");
        int fases_completas = input.nextInt();

        System.out.println("Digite o número total de fases: ");
        int fases_total = input.nextInt();


        if (fases_completas < 0 || fases_total <= 0 || fases_completas > fases_total) {

            System.out.println("Número inválido!");
            
        }else{

            porcentagem_total = (fases_completas * 100) / fases_total;

            System.out.println("Você completou " + porcentagem_total + "% das fases");
        }

        input.close();


    }
    
}
