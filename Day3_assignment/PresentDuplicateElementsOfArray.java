public class PresentDuplicateElementsOfArray {
    public static void main(String[] args) {
        int[] array = {10,20,30,40,50,60,20,40,60};
        System.out.println("duplicate element of an array is: ");
        for (int i=0; i<array.length; i++) {
            for (int j=i+1; j<array.length; j++) {
                if (array[i] == array[j])
                    System.out.println(array[j]);
            }
        }
    }
}



