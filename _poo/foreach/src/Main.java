//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public static void main(String[] args) {
    String [] vect = new String[]{"Miguel", "Yasmim", "Java"};
    // Common way (for loop)
    System.out.println("--For loop--");
    for (int i = 0; i< vect.length; i++){
        System.out.println(vect[i]);
    }


    //For each loop
    System.out.println("--For each loop--");
    for (String s : vect){
        System.out.println(s);
    }
}
