public class Exercise13 {
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

    public static int binarySearch(int[] array, int number, int l, int r) {
        int center = (l + r) / 2;

        if (l > r) return - 1;

        if (array[center] == number) {
            return center;
        } 
        
        if (array[center] > number) {
            return binarySearch(array, number, l, center - 1);
        } 
            
        return binarySearch(array, number, center + 1, r);
    }
    public static void main(String[] args) {
        int[] array = {12, 33, 15, 2, 5, 1, 93};
        int[] sortedArray = bubbleSortRe(array, array.length);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();
        System.out.println(binarySearch(sortedArray, 15, 0, sortedArray.length - 1));
    }
}
