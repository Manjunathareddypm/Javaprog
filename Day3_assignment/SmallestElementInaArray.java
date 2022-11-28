public class SmallestElementInaArray {
    public static void main(String[] args) {
        int array[] = {20,40,30,5,50,10};
        int smallest = array[0];
        for (int i=0;i< array.length;i++)
        {
            if(array[i]<smallest)
            {
                smallest=array[i];
            }
        }
        System.out.println("Smallest element of an array is: " +smallest);
    }
}
