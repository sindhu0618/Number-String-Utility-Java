import java.util.Scanner;

public class StringUtils {

    public static void palindrome(Scanner sc) {
        String s = sc.next();
        String rev = new StringBuilder(s).reverse().toString();

        System.out.println(s.equals(rev) ? "Palindrome" : "Not Palindrome");
    }

    public static void countVowels(Scanner sc) {
        String s = sc.next();
        int count = 0;

        for (char c : s.toCharArray()) {
            if ("aeiouAEIOU".indexOf(c) != -1)
                count++;
        }

        System.out.println("Vowels = " + count);
    }

    public static void passwordCheck(Scanner sc) {
        String p = sc.next();

        boolean l = false, u = false, d = false, sp = false;

        for (char c : p.toCharArray()) {
            if (Character.isLowerCase(c)) l = true;
            else if (Character.isUpperCase(c)) u = true;
            else if (Character.isDigit(c)) d = true;
            else sp = true;
        }

        if (p.length() >= 8 && l && u && d && sp)
            System.out.println("Strong Password");
        else
            System.out.println("Weak Password");
    }

    public static void charFrequency(Scanner sc) {
        String s = sc.next();
        int[] freq = new int[256];

        for (char c : s.toCharArray())
            freq[c]++;

        for (int i = 0; i < 256; i++) {
            if (freq[i] != 0)
                System.out.println((char)i + " = " + freq[i]);
        }
    }
}