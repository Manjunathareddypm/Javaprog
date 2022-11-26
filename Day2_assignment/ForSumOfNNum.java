public class ForSumOfNNum {
    public static void main(String[] args) {
        int N = 5,sum =0;
        for(int i=1; N >= i; i++ )
        {
            sum = sum + i;
        }
        System.out.println("Sum of N numbers is : " +sum);
    }
}
