import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int n = scanner.nextInt();
        
        String result = age(n);
        System.out.println("Eligible to vote status: " + result);
        
        scanner.close(); 
    }

    static String age(int n) {
        if (n >= 18) {
            return "Yes, you are eligible to vote.";
        } else {
            return "No, you are not eligible to vote.";
        }
    }
}
