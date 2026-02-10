import entities.Product;
public static void main(String[] args) {

    int x = 20;

    //Object obj = x;
    // Wrapper classes allow primitive values to be treated as objects,
    // enabling their use in object-oriented contexts
    Integer obj = x;
    System.out.println(obj);
    int y = obj * 2;
    System.out.println(y);
}
