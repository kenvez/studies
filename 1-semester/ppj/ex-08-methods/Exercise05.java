public class Exercise05 {
    public static boolean isEqual(int[][] arrOne, int[][] arrTwo) {
        if (arrOne.length != arrTwo.length) {
            return false;
        }

        for (int i = 0; i < arrOne.length; i++) {
            if (arrOne[i].length != arrTwo[i].length) {
                return false;
            }

            for (int j = 0; j < arrOne[i].length; j++) {
                if (arrOne[i][j] != arrTwo[i][j]) {
                    return false;
                }
            }
        }

        return true;
    }
    
    public static void main(String[] args) {
        int[][] arrOne = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] arrTwo = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] arrThree = {
            {1, 2, 3},
            {4, 2, 1}
        };

        System.out.println(isEqual(arrOne, arrTwo));
        System.out.println(isEqual(arrOne, arrThree));
    }
}
