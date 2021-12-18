import java.util.Scanner;

public class Exercise5 {

    public static void main(String[] args) {
        System.out.println(mostCommonLetter());

    }

    public static String mostCommonLetter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a string:");
        String userString = scanner.nextLine();
        int[] counter = new int[userString.length()];
        char[] charBeenSeen = new char[userString.length()];
        for (int i = 0; i < userString.length(); i++) {
            char currentTested = userString.charAt(i);
            if (!(beenChecked(charBeenSeen, currentTested) | currentTested == ' ')) {
                charBeenSeen[i] = currentTested;
                for (int j = 0; j < userString.length(); j++) {
                    if (currentTested == userString.charAt(j)) {
                        counter[i]++;
                    }
                }
            }
        }
        int letterMaxIndex = MaxIndexCheck(counter);
        counter[letterMaxIndex] = 0;
        int secondMaxIndex = MaxIndexCheck(counter);

        char maxChar = userString.charAt(letterMaxIndex);
        char secondMaxChar = userString.charAt(secondMaxIndex);
        char[] changedText = replaceChars(userString, maxChar, secondMaxChar);
        String finalChangedText = String.valueOf(changedText);
        return finalChangedText;
    }

    public static boolean beenChecked(char[] charBeenSeen, char currentTested) {
        boolean result = false;
        for (int i = 0; i < charBeenSeen.length; i++) {
            if (currentTested == charBeenSeen[i]) {
                result = true;
                break;
            }
        }
        return result;
    }

    public static int MaxIndexCheck(int[] counter) {
        int max = 0;
        for (int i = 0; i < counter.length; i++) {
            if (counter[max] < counter[i]) {
                max = i;
            }
        }
        return max;
    }

    public static char[] replaceChars(String text, char maxChar, char secondMaxChar) {
        char[] newText = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            char currentTested = text.charAt(i);
            if (currentTested == maxChar) {
                newText[i] = secondMaxChar;
            } else if (currentTested == secondMaxChar) {
                newText[i] = maxChar;
            } else {
                newText[i] = currentTested;
            }
        }
        return newText;
    }


    }
