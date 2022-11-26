import java.util.Scanner;

public class numtounitstens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number=");
        int num = sc.nextInt();
        if (num == 1) {
            System.out.println("unit");
        } else if (num == 10) {
            System.out.println("ten");
        } else if (num == 100) {
            System.out.println("Hundred");
        } else if (num == 1000) {
            System.out.println("Thousand");
        } else if (num == 10000) {
            System.out.println("Ten Thousand");
        } else {
            System.out.println("Please pass numbers as 1,10,100,1000,10000");
        }
    }
}



