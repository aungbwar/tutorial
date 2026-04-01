public class Recursive {
    public static void main(String[] args) throws Exception {
        System.out.println(factorial(5));
        System.out.println("Version 7");
    }

    public static int factorial(int x ) {
        if (x == 1) {return x; }
        return factorial(x - 1) * x;
    }
}
