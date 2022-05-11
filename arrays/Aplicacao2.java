package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Aplicacao2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.printf("Quantas notas: ");
        int quantidadeNotas = input.nextInt();

        System.out.println(quantidadeNotas);

        double[] notas = new double[quantidadeNotas];
        for (int i = 0; i < notas.length; i++ ){
            System.out.println("Informe a nota " + "(" + (i + 1) + "): ");
            notas[i] = input.nextDouble();
        }

        double total = 0;
        for (double nota : notas){
            total += nota;
        }
        System.out.println(Arrays.toString(notas));

        System.out.println("A média é: " + total / notas.length);

        input.close();

    }
}
