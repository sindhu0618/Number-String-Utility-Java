import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Swap Numbers");
            System.out.println("2. Max of 3 Numbers");
            System.out.println("3. Leap Year");
            System.out.println("4. Perfect Number");
            System.out.println("5. Palindrome Number");
            System.out.println("6. Armstrong Number");
            System.out.println("7. Prime Number");
            System.out.println("8. Happy Number");
            System.out.println("9. String Palindrome");
            System.out.println("10. Count Vowels");
            System.out.println("11. Password Strength");
            System.out.println("12. Character Frequency");
            System.out.println("0. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch(choice) {
                case 1: NumberUtils.swap(sc); break;
                case 2: NumberUtils.max3(sc); break;
                case 3: NumberUtils.leapYear(sc); break;
                case 4: NumberUtils.perfect(sc); break;
                case 5: NumberUtils.palindrome(sc); break;
                case 6: NumberUtils.armstrong(sc); break;
                case 7: NumberUtils.prime(sc); break;
                case 8: NumberUtils.happy(sc); break;
                case 9: StringUtils.palindrome(sc); break;
                case 10: StringUtils.countVowels(sc); break;
                case 11: StringUtils.passwordCheck(sc); break;
                case 12: StringUtils.charFrequency(sc); break;
                case 0: System.out.println("Exiting..."); break;
                default: System.out.println("Invalid choice");
            }

        } while(choice != 0);

        sc.close();
    }
}