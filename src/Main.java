//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.print("Enter number of terms: ");
        int n = 56;

        int a = 0, b = 1;

        System.out.print("Fibonacci Series: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        System.out.printf("Hello and welcome!");
        // I am working on the feature changes
        for (int k  = 1; k <= 5; k++) {
            System.out.println("i = " + k);
        }
        for (int j = 1; j <= 5; j++) {
            System.out.println("i = " +j);
        }
    }
}
