public class Exercise7 {
    public static int[] bubbleSortIt(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if ( array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        return array;
    }
    public static void main(String[] args) {
        int[] array = {12, 33, 15, 2, 5, 1, 93};

        bubbleSortIt(array);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
