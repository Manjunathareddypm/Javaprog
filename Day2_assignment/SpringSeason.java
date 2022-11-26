import java.util.Scanner;
public class SpringSeason {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the month");
        int month = sc.nextInt();
        System.out.println("enter the day");
        int day = sc.nextInt();
        if (month == 3 && day >= 20 && day < 31)
        {
            System.out.println("true");
        }
        else if (month == 4 && day >= 1 && day <= 30)
        {
            System.out.println("true");
        }
        else if (month == 5 && day >= 1 && day <= 31)
        {
            System.out.println("true");
        }
        else if (month == 6 && day >= 1 && day < 21)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
        }
    }



