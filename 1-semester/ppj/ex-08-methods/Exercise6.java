public class Exercise6 {
    public static int[] flatten(int[][] array2d) {
        int length = 0;
        
        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d[i].length; j++) {
                length += 1;
            }
        }

        int[] array = new int[length];
        int index = 0;

        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d[i].length; j++) {
                array[index++] = array2d[i][j];
            }
        }

        return array;
    }
    
    public static void main(String[] args) {
        int[][] tab={
            {1, 0, 0, 0, 0},
            {0, 1, 0, 0},
            {0, 0, 1}
        };

        int[] array = flatten(tab);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
