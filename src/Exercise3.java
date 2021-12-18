public class Exercise3 {

    public static void main(String[] args) {
        int number = 18;
        int[] myArray = primesArray(number);
        for (int i = 0; i < myArray.length; i++) {

            if (myArray[i] != 1) {
                System.out.print(myArray[i] + " ");
            }
        }


    }

    public static int[] primesArray(int number) {
        int prime = 2;
        int[] array = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        int temp = 1;

        for (int i = 0; number != 1; i++) {
            if (number % prime == 0) {
                array[i] = prime;
            } else {
                int nextPrime = prime + 1;
                for (int a = nextPrime; prime < nextPrime; a++) {
                    for (int j = 0; j < array.length; j++) {
                        if (a % prime == 0) {
                            temp = 1;
                            break;
                        } else {
                            temp = 0;
                        }

                    }
                    if (temp == 0) {
                        prime = a;
                    }

                }


            }
            if (number % prime == 0) {
                array[i] = prime;
                number = number / prime;
            }


        }
        return array;
    }


}
