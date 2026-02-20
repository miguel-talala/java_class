import entities.Rent;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner sc = new Scanner(System.in);
    Rent[] vect = new Rent[10];
    // Asks how many rooms will be rented
    System.out.print("How many rooms will be rented?: ");
    int n = sc.nextInt();
    // Loop that runs once for each rental
    for(int i = 1 ; i <=n; i ++){
        System.out.print("");
        // Displays the rental number
        System.out.println("Rent#" + i + ":");
        // Reads the tenant's name
        System.out.print("Name: ");
        sc.nextLine();
        String name = sc.nextLine();
        // Reads the tenant's email
        System.out.print("Email: ");
        String email = sc.next();
        // Reads the room number to be rented
        System.out.print("Room: ");
        int roomRented = sc.nextInt();
        // Stores the Rent object in the vector at the chosen room index
        vect[roomRented] = new Rent(name, email);
    }
    System.out.print("");
    System.out.println("Busy rooms: ");
    //Loop to print the busy rooms
    for (int i = 0; i < vect.length; i++)
        // Checks if the room is occupied
        if (vect[i] != null) {
            // Prints the room number and the tenant's information
            System.out.println( i + ":" + vect[i]);
        }

    sc.close();
}
