import java.util.Scanner;
public class leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter an Year : ");
        int year = sc.nextInt();
        if (year>=1582)
        {
        	if (year % 400 == 0)
		{
		System.out.println(year+ " is a leap year");
		} 
		else if ((year % 4 == 0) && (year % 100 != 0))
            	{
                	System.out.println(year+ " is a leap year");
            	}
            	else
           	 {
                	System.out.println((year+ " is not a leap year"));
            	 }
        }
    }
}
