import java.util.Scanner;
public class ArithmeticOperationsMaxAndMin {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("enter a first number");
        int a = sc.nextInt();
        System.out.println("enter a second number");
        int b = sc.nextInt();
        System.out.println("enter a third number");
        int c = sc.nextInt();
        int value1 = a+b*c;
        int value2 = c+a/b;
        int value3 = a%b+c;
        int value4 = a*b+c;
        System.out.println("first value is : " +value1);
        System.out.println("second value is : " +value2);
        System.out.println("third value is : " +value3);
        System.out.println("four value is : " +value4);
        if((value1>value2) && (value1>value3) && (value1>value4))
        {
            System.out.println("max value is: " +value1);
        }
        else if((value2>value1) && (value2>value3) && (value2>value4)) {
            System.out.println("max value is: " + value2);
        }
        else if((value3>value1) && (value3>value2) && (value3>value4)) {
            System.out.println("max value is: " + value3);
        }
        else  {
            System.out.println("max value is: " + value4);
    }
        if((value1<value2) && (value1<value3) && (value1<value4))
        {
            System.out.println("min value is: " +value1);
        }
        else if((value2<value1) && (value2<value3) && (value2<value4)) {
            System.out.println("min value is: " + value2);
        }
        else if((value3<value1) && (value3<value2) && (value3<value4)) {
            System.out.println("min value is: " + value3);
        }
        else  {
            System.out.println("min value is: " + value4);
        }

    }
}
