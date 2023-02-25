package br.edu.fema;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TrabalhoSalario_Java {
    public static void main(String[] args) {
        //Trabalho de João Fernando Correia
        List<BigDecimal> salarios = new ArrayList();
        for (String arg : args) {

            salarios.add(new BigDecimal(arg));
        }
        System.out.println(salarios);
        System.out.println("Quantidade de salarios na lista : " + salarios.size());


        BigDecimal MenorSalario = Collections.min(salarios);
        System.out.println("O menor salario é " + MenorSalario);
        //Usando o collections para achar a maior e manor variavel do meu programa
        BigDecimal MaiorSalario = Collections.max(salarios);
        System.out.println("O maior salario é : " + MaiorSalario);

        //Somando os salarios
        BigDecimal somaSalario = new BigDecimal(0);
        for (BigDecimal salario : salarios) {
            somaSalario = somaSalario.add(salario);
        }
        System.out.println("A soma dos salarios é : " + somaSalario);

        //Usando a variavel de soma e dividindo por um salarios.size para gerar a media
        BigDecimal mediaSalario = somaSalario.divide(new BigDecimal(salarios.size()), RoundingMode.CEILING);
        System.out.println("A media dos salarios é : " + mediaSalario);

        //Ordenando a lista em ordem descrescente
        Collections.sort(salarios, Comparator.reverseOrder());
        System.out.println("Os salarios em ordem descrescente : " + salarios);

        Collections.sort(salarios, Comparator.reverseOrder());
        System.out.println("Os 3 maiores salarios: " + salarios.subList(0, 3));

        Collections.sort(salarios, Comparator.naturalOrder());
        System.out.println("Os 3 menores salarios: " + salarios.subList(0, 3));
        System.out.println("Os salarios em ordem crescente " + salarios);


        BigDecimal somaAumento5 = BigDecimal.ZERO;
        BigDecimal somaAumento10 = BigDecimal.ZERO;
        BigDecimal somaAumento15 = BigDecimal.ZERO;

        for (BigDecimal salario : salarios) {
            BigDecimal Aumento05 = salario.multiply(new BigDecimal("0.05"));
            BigDecimal Aumento10 = salario.multiply(new BigDecimal("0.1"));
            BigDecimal Aumento15 = salario.multiply(new BigDecimal("0.15"));

            somaAumento5 = somaAumento5.add(Aumento05);
            somaAumento10 = somaAumento10.add(Aumento10);
            somaAumento15 = somaAumento15.add(Aumento15);

            System.out.println(" 05% do salario é : " + Aumento05 + " E o salario inteiro é : " + salario);
            System.out.println();
            System.out.println(" 10% do salario é : " + Aumento10 + " E o salario inteiro é : " + salario);
            System.out.println();
            System.out.println(" 15% do salario é : " + Aumento15 + " E o salario inteiro é : " + salario);
            System.out.println();
            System.out.println("As porcentagens dos proximos salarios respectivamente ");
            System.out.println();

        }
        System.out.println();
        System.out.println(" A soma dos 5%  dos Salarios é  : " + somaAumento5);
        System.out.println(" A soma dos 10% dos Salarios é  : " + somaAumento10);
        System.out.println(" A soma dos 15% dos salarios é  : " + somaAumento15);


    }
}