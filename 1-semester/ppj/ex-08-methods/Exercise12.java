public class Exercise12 {
    public static int[] bubbleSortRe(int[] array, int maxLength) {
        boolean elementsChanged = false;
        
        if (maxLength == 1) return array;

        for (int i = 0; i < maxLength - 1; i++) {
            if (array[i] > array[i + 1]) {
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;

                elementsChanged = true;
            }
        }

        if (elementsChanged == false) return array;
        
        bubbleSortRe(array, maxLength - 1);

        return array;
    }
    
    public static void main(String[] args) {
        int[] array = {12, 33, 15, 2, 5, 1, 93};

        bubbleSortRe(array, array.length);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
