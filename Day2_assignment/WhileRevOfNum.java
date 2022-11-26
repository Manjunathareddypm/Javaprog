import java.util.Scanner;

public class whilerevofnum {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the number: ");
            int num = sc.nextInt();
            int rev = 0, remainder;

            while (num != 0)
            {
                remainder = num % 10;
                rev = rev * 10 + remainder;
                num = num/10;
            }
            System.out.println("The reverse of the given number is: " + rev);
        }
}
