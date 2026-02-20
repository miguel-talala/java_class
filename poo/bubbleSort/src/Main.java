import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //intansiacao com data-hora
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] vect = new int[n];
        for (int m = 0; m < vect.length; m++) {
            vect[m] += sc.nextInt();
        }
        int temp = 0;
        for (int i = 0; i < vect.length; i++) {
            for (int j = 0; j < vect.length - 1; j++) {
                if (vect[j] > vect[j + 1]) {
                    temp = vect[j];
                    vect[j] = vect[j + 1];
                    vect[j + 1] = temp;
                }
            }
        }
        for (int v : vect) {
            System.out.print(v + " ");
        }
        sc.close();
    }
}