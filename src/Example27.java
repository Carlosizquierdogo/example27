
public class Example27 {
    public static void main(String[] args) {
        int number = 40;
        int fibo = 0;
        int naci = 1;
        for (int i = 1; i <= number; ++i) {
            System.out.println(fibo + ".");
            int fibonacci = fibo + naci;
            fibo = naci;
            naci = fibonacci;
        }
    }
}