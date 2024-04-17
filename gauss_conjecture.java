import java.util.Scanner;

public class gauss_conjecture {
    // Check a number is a prime
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n <= 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    // Check prime number of Gauss to a integer n
    public static int gaussConjecture(int n) {
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số n bất kì (n > 1): ");
        int n = scanner.nextInt();
        int sum = gaussConjecture(n);
        System.out.println("Tổng của các số nguyên tố trong dãy số nguyên tố Gauss đến " + n + " là: " + sum);
    }
}
