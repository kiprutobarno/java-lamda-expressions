public class App {
    public static void main(String[] args) throws Exception {
        Calculate add=(a, b)->a+b;
        Calculate mult=(a,b)->a*b;


        System.out.println(add.variables(4, 3));
        System.out.println(mult.variables(3, 4));
    }
}
