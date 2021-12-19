public class Exercise1 {


        public static void main(String[] args) {
            int number =1;
            System.out.println(isAlternateNumber ( number));
            int[] array = {5555,6574,1856,2345};
            int location = minAlternate(array);
            System.out.println(location);


        }

        public static boolean isAlternateNumber (int number) {
            //check if even
            int newNumber = number %10;
            if (newNumber%2 == 0){
                newNumber = 0;
            }

            else {
                newNumber = 1;
            }



            number = number/10;



            while (number!=0){
                int newNumber2 =  number %10;
                if (newNumber2%2 == 0){
                    newNumber2 = 0;
                }

                else {
                    newNumber2 = 1;
                }

                if (newNumber2 == newNumber){
                    return false;

                }
                else {
                    newNumber = newNumber2;
                    number = number/10;

                }

            }

            return true;
        }


    public static int minAlternate(int[] array) {
            int temp =2147483647;
            for (int i = 0; i<array.length;i++ ){
                if (isAlternateNumber (array[i])) {
                    if (array[i]<temp){
                        temp =array[i];
                            return  temp;
                    }
                }
            }


            return  -1;
    }





    }








