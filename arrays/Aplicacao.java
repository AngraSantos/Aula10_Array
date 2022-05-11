package arrays;

import javax.swing.*;
import java.util.Arrays;

public class Aplicacao {

    public static void main(String[] args) {

        //Arrays: é um conjunto de dados armazenados.
        //Ele é indexado ou seja acessa apartir de um determinado indice
        //Tamanho fixo e estrutura homogênea (Todos os dados são do mesmo tipo)

        /*double[] notasAlunoA = new double[3];*/

       /* notasAlunoA[0] = 7.5;
        notasAlunoA[1] = 5.5;
        notasAlunoA[2] = 9.5;

        System.out.println(Arrays.toString(notasAlunoA));

        double total = 0;
        for (int i = 0; i < 3; i++) {
            total += notasAlunoA[i];
        }
        System.out.println(total / 3);*/

        double[] notasAlunoB = {9.5, 8.6, 7.8, 7.5, 8.5, 8.6};
        double totalAlunoB = 0;
        for (int i = 0; i < notasAlunoB.length; i++){
            totalAlunoB += notasAlunoB[i];
        }
        System.out.println(totalAlunoB / notasAlunoB.length);
        System.out.println(notasAlunoB[2]);
        System.out.println(notasAlunoB[5]);
    }

}
