package _poo._exvetores.src;

import _poo._exvetores.src.entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class vetores {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Numero de pessoas que serão digitados: ");
        int n = sc.nextInt();
        Pessoa pessoa[] = new Pessoa[n];
        for (int i = 0; i < pessoa.length; i++) {
            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();

            pessoa[i] = new Pessoa(nome, idade, altura);

        }
        double sum = 0.0;
        for (Pessoa p : pessoa) {
            sum += p.getAltura();
        }
        double avg = sum / pessoa.length;
        int qtdMenores16 = 0;
        for (Pessoa p : pessoa) {
            if (p.getIdade() < 16) {
                qtdMenores16++;

            }
        }

        double porcentagem = ((double) qtdMenores16 / pessoa.length) * 100;
        System.out.printf("AVERAGE HEIGHT = %.2f%n ", avg);
        System.out.printf("Porcentagem de menores de 16:  %.2f%%%n", porcentagem);

        String[] nomeMenos = new String[qtdMenores16];
        int idx = 0;
        for(Pessoa p : pessoa){
            if(p.getIdade()< 16){
                nomeMenos[idx] = p.getName();
                System.out.print(nomeMenos[idx]);
                idx++;
            }
        }


        sc.close();
    }
}
