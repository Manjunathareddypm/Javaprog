public class PresentOfOddNumbers {
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Even numbers of an array is: ");
        for (int i=0; i < array.length; i=i+2) {
            System.out.println(array[i]);
        }
    }
}
