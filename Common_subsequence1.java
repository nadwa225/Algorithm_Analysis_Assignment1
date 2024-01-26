import java.util.Scanner;
/**
 * Write an algorithm to solve the following problem:
 * Given two strings text1 and text2, return the length of their longest common subsequence.
 * If there is no common subsequence, return 0.
 */


public class Common_subsequence1 {
    public static int common_sub(String text1, String text2) {
        //string size
        int string1 = text1.length(); // length of first string  O(N)
        int string2 = text2.length(); // length of the second string O(N)c

        // create 2d array
        int[][] array = new int[string1 + 1][string2 + 1];
        int max = 0; // O(1)
        int end = 0; // O(1)

        for (int i = 1; i <= string1; i++) { // O(N)
            for (int j = 1; j <= string2; j++) { // O(N)
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) { //O(N)
                    array[i][j] = array[i - 1][j - 1] + 1;
                    if (array[i][j] > max) { // O(1)
                        max = array[i][j]; // O(1)
                        //end = i;
                    }
                } else {
                    array[i][j] = Math.max(array[i - 1][j], array[i][j - 1]); // selects the max of common strings
                }
            }
        }


        return max;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter text 1: ");
        String text1 = scan.nextLine();

        System.out.println("Enter text 2: ");
        String text2 = scan.nextLine();

        int output = common_sub(text1,text2);

        //System.out.println(common_sub(text1, text2));
        System.out.println("Output: "+ output);
        System.out.println("The longest common subsequence is "  );
    }

}
