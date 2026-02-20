import java.util.stream.Collectors;

 public static void main(String[] args) {

    // It is not possible to create a generic list with primitive types (int, double, etc.)
    List<String> list = new ArrayList<String>();

    // Add elements to the list
    list.add("Miguel");
    list.add("Yasmim");
    list.add("Rafael");
    list.add("Rosa");
    list.add("Maria");
    list.add("André");
    list.add("Adriana");

    // Add elements to a specific index in the list
    list.add(2, "Luna");

    //Show list size
    IO.println(list.size());


    //Print all the elements in the list
    for (String x : list) {
        IO.println(x);
    }
    IO.println("-------------------");
    //Remove elements for the list
    list.remove("Rafael");
    list.remove(4);
    IO.println("Removing with a specific value or index number:");
    for (String x : list){
        IO.println(x);
    }
    IO.println("_______________________");
    //Lambda expression to check if any String starts with the letter "M"(True / False);
    IO.println("Removing from list with predicate:");
    list.removeIf(x -> x.charAt(0) == 'M');
    for(String x : list ){
        IO.println(x);
    }

    //Find the index of a certain value
    IO.print("----------index-------- ");
    IO.println("Index of Yasmim: "+ list.indexOf("Yasmim"));
    IO.println("Index of Rosa: "+ list.indexOf("Rosa"));
    IO.println("Index of Miguel: "+ list.indexOf("Miguel"));// When the list can find a certain value, returns "-1"
    IO.println("_______________________");
    //Keeping the values that starts with the letter "R"
    //Stream special type that accepts lambda expressions
    IO.println("Keeping the ones that starts with the letter R");
    List<String> result = list.stream().filter(x -> x.charAt(0) =='R').collect(Collectors.toList());
    for(String x : result){
        IO.println(x);
    }
    IO.println("_______________________");
    String name = list.stream().filter(x -> x.charAt(0) =='A').findFirst().orElse(null);
    IO.println("Keeping the ones that starts with the letter A");
    IO.println(name);
    IO.println("_______________________");


}
