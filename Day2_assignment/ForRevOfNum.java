public class ForRevOfNum {
    public static void main(String[] args) {
            int num = 231,rev = 0, remainder;
            for (;num != 0;)
            {
                remainder = num % 10;
                rev = rev * 10 + remainder;
                num = num/10;
            }
            System.out.println("The reverse of the given number is: " + rev);
        }

    }
