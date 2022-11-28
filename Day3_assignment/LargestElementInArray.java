public class LargestElementInAArray {
    public static void main(String[] args) {
        int array[] = {20,40,30,5,50,10};
        int largest = array[0];
        for (int i=0;i< array.length;i++)
        {
            if(array[i]>largest)
            {
                largest=array[i];
            }
        }
        System.out.println("Largest element of an array is: " +largest);
    }
}
