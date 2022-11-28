public class SecondLargestNumber {
        public static void main(String[] args) {
            int[] array = {1,5,6,8,9,3};
            int temporary;
            System.out.println("entered numbers are: ");
            for (int i=0;i<array.length;i++) {
                System.out.println(array[i]+ " ");
            }
            for (int i=0;i<array.length;i++)
            {
                for (int j=i+1;j< array.length;j++)
                {
                    if (array[i] > array[j])
                    {
                        temporary = array[i];
                        array[i] = array[j];
                        array[j] = temporary;
                    }
                }
            }
            System.out.println("Second largest element in an array is: " +array[4]);
        }
    }

