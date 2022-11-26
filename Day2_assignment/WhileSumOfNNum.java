public class WhileSumOfNNum {
    public static void main(String[] args) {
        int N = 5,sum = 0,i = 0;
        while( N >= i )
        {
            sum = sum + i;
            i++;
        }
        System.out.println("Sum of n numbers is : " +sum);
    }
}
