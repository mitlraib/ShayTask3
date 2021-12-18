public class Exercise4 {
    public static void main(String[] args) {
        final int ARRAY_SIZE = 4;
        int[] array = {1, 2, 3, 4, 5};
        int[] copyArray = array;

        sortOfArray(array, ARRAY_SIZE);
        for (int i = 0; i < array.length; i++) {
         //     System.out.println(isFullArray(array, copyArray)[i]);
          //    System.out.println(sortOfArray(array, ARRAY_SIZE)[i]);
            System.out.println(isSuccessive(array,ARRAY_SIZE));
        }
    }

    public static int[] isFullArray(int[] array, int[] copyArray) {
        int[] counters = {0, 0, 0, 0, 0};
        boolean doubleNumbers;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == copyArray[j]) {
                    counters[i]++;
                }
                if (array[i] == 1) {
                    doubleNumbers = false;

                }
            }
        }

        return counters;
    }

    public static int[] sortOfArray(int[] array, int ARRAY_SIZE) {
        int temp;
        for (int i = 0; i < ARRAY_SIZE; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;

                }
            }


        }
        return array;
    }

    public static boolean isSuccessive(int[] array, int ARRAY_SIZE) {
        for (int i = 0; i < ARRAY_SIZE; i++) {
            if (array[i+1]-array[i]!=1){
                return false;
            }


        }


        return true;
    }
}
