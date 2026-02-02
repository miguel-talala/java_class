import entities.Rent;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner sc = new Scanner(System.in);
    Rent[] vect = new Rent[10];

    System.out.print("How many rooms will be rented?: ");
    int n = sc.nextInt();

    for(int i = 1 ; i <=n; i ++){
        System.out.print("");
        System.out.println("Rent#" + i + ":");
        System.out.print("Name: ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.next();
        System.out.print("Room: ");
        int roomRented = sc.nextInt();
        vect[roomRented] = new Rent(name, email);
    }
    System.out.print("");
    System.out.println("Busy rooms: ");
    for (int i = 0; i < vect.length; i++)
        if (vect[i] != null) {
            System.out.println( i + ":" + vect[i]);
        }

    sc.close();
}
