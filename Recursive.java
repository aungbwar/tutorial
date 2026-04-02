public class Recursive {
    public static void main(String[] args) throws Exception {
        System.out.println(factorial(5));
        System.out.println("Version 8");
        System.out.println("Bug fix");
        System.out.println("Added feature 3");
    }

    public static int factorial(int x ) {
        if (x == 1) {return x; }
        return factorial(x - 1) * x;
    }
}
