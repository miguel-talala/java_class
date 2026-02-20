
//não é possivel preencher dados com o forEach, apenas pegá-los
void main() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite a quantidade de numeros para ser checado: ");
    int n = sc.nextInt();
    int[] vect = new int[n];
    for (int i = 0; i < vect.length; i++) {
        System.out.print("Digite o numero: ");
        vect[i] = sc.nextInt();
    }

    System.out.println("NUMEROS PARES: ");
    int sum = 0;
    for (int v : vect) {
        if (v % 2 == 0) {
            System.out.println(v);
            sum++;
        }
    }
    System.out.println("Quantidade de numeros pares: " + sum);


}
