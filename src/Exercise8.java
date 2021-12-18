import groovy.json.JsonOutput;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        final int ARRAY_SIZE = 4;
        String str = "Java";
        String str2 = "lave";


        String[] userArray = userArray(ARRAY_SIZE);
        for (int i = 0; i < userArray.length; i++) {
            System.out.print(userArray[i] + " ");
        }
        char [] array =   subStringsArray (str);
        System.out.println(" ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        String [] array123 = {str2, str};
        popularSubString(array123);
    }

    public static String[] userArray( int ARRAY_SIZE) {
        Scanner scanner = new Scanner(System.in);
        String userString= "              ";
        String[] userStringArray = {" ", " ", " ", " ", " ", " ", " ", " "};
        for (int i = 0; userString.length() > ARRAY_SIZE; i++) {
            System.out.println(" please insert string length less then 4:");
            userString = scanner.nextLine();
            userStringArray[i] = userString;


        }
        return userStringArray;
    }


    public static char[] subStringsArray(String str) {
        char [] array = {' ', ' ', ' ',' ',' ',' ',' ', ' ', ' ',' ',' ',' ', ' ', ' ',' ',' ',' ',' ', ' ', ' ',' ',' ',' '};
// option are: 1234, 01,12,23,012,123
    //  int temp1 = str.length()-1;
        for (int i =0; i<str.length();i++){

            char sub = str.charAt(i);

            array [i] =sub;
        }

        for (int i =0; i<str.length()-2;i++){

            char sub = str.charAt(i);

            array [i+str.length()+1] =sub;
        }
        for (int i =1; i<str.length()-1;i++){

            char sub = str.charAt(i);

            array [i+str.length()+3] =sub;
        }
        for (int i =2; i<str.length();i++){

            char sub = str.charAt(i);

            array [i+str.length()+5] =sub;
        }

        for (int i =0; i<str.length()-1;i++){

            char sub = str.charAt(i);

            array [i+str.length()+10] =sub;
        }

        for (int i =1; i<str.length();i++){

            char sub = str.charAt(i);

            array [i+str.length()+13] =sub;
        }



return array;

    }


    public static char [] popularSubString(String[] array) {
        String a = array[0];
        String b = array[1];

        System.out.println(" ");
        char [] array1 =   subStringsArray (b);

        System.out.print(array1[8]);
        System.out.print(array1[9]);

        char[] ab = {array1[8],array1[9]};

        return ab;
    }
}
