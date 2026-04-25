import java.util.Scanner;

public class NumberUtils {

    public static void swap(Scanner sc) {
        int a, b;
        System.out.print("Enter two numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After swap: a=" + a + " b=" + b);
    }

    public static void max3(Scanner sc) {
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

        if (a >= b && a >= c)
            System.out.println("Max = " + a);
        else if (b >= a && b >= c)
            System.out.println("Max = " + b);
        else
            System.out.println("Max = " + c);
    }

    public static void leapYear(Scanner sc) {
        int y = sc.nextInt();

        if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0))
            System.out.println("Leap Year");
        else
            System.out.println("Not Leap Year");
    }

    public static void perfect(Scanner sc) {
        int n = sc.nextInt(), sum = 0;

        for (int i = 1; i < n; i++)
            if (n % i == 0) sum += i;

        System.out.println(sum == n ? "Perfect" : "Not Perfect");
    }

    public static void palindrome(Scanner sc) {
        int n = sc.nextInt(), rev = 0, temp = n;

        while (n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }

        System.out.println(temp == rev ? "Palindrome" : "Not Palindrome");
    }

    public static void armstrong(Scanner sc) {
        int n = sc.nextInt(), sum = 0, temp = n;

        while (n > 0) {
            int d = n % 10;
            sum += Math.pow(d, 3);
            n /= 10;
        }

        System.out.println(sum == temp ? "Armstrong" : "Not Armstrong");
    }

    public static void prime(Scanner sc) {
        int n = sc.nextInt();
        boolean flag = true;

        if (n <= 1) flag = false;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                flag = false;
                break;
            }
        }

        System.out.println(flag ? "Prime" : "Not Prime");
    }

    static int sumSquare(int n) {
        int sum = 0;
        while (n > 0) {
            int d = n % 10;
            sum += d * d;
            n /= 10;
        }
        return sum;
    }

    public static void happy(Scanner sc) {
        int n = sc.nextInt();

        while (n != 1 && n != 4)
            n = sumSquare(n);

        System.out.println(n == 1 ? "Happy Number" : "Not Happy");
    }
}