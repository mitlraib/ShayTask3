public class Exercise2 {



        public static void main(String[] args) {
            int [] array1 = {3,45,62};
            int [] array2 = {4,9,9,9,12,5};
            System.out.println(getPositionBrothers(array1, array2));

        }

        public static int getPositionBrothers(int [] arr1,int [] arr2) {
            int i =0;

            int biggestBrother=0;
            int arrayLocation =0;
            int temp =0;



            for ( i =0;i<arr1.length;i++){
                int brotherCount=0;
                int sumArr1 =0;
                while (arr1[i]!=0){
                    temp =  arr1[i] %10;
                    sumArr1 = temp + sumArr1;
                    arr1[i] = arr1[i]/10;

                }
                // 3



                for (int j =0;j<arr2.length;j++){
                    int sumArr2 =0;
                    int tempArray = arr2[j];

                    while (tempArray!=0){
                        temp =  tempArray %10;
                        sumArr2 = temp + sumArr2;
                        tempArray = tempArray/10;

                    }

                    if (sumArr1== sumArr2){
                        brotherCount++;
                    }



                }
                if (brotherCount>=biggestBrother) {
                    biggestBrother = brotherCount;
                    arrayLocation = i;
                }
            }



            return  arrayLocation;

        }


    }



