package application;

import entities.Estudante;


import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Estudante estudante = new Estudante();
        System.out.print("Digite o nome do estudante: ");
        estudante.name = sc.nextLine();
        System.out.print("Digite as notas do ano do estudante: ");
        estudante.nota1 = sc.nextDouble();
        estudante.nota2 = sc.nextDouble();
        estudante.nota3 = sc.nextDouble();
        System.out.println("Final grade = " + estudante.notaFinal());
        if(estudante.notaFinal() < 60){
           System.out.println("FAILED: ");
           System.out.println("Missing points:" + estudante.pontosFaltantes());
        }else {
            System.out.println("PASSED");
        }


        sc.close();

    }
}