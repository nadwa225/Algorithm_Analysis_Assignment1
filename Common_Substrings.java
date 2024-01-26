import java.util.Scanner;

/**
 * A subsequence of a string is a new string generated from the original string with some
  * characters (can be none) deleted without changing the relative order of the remaining
     * characters.
     * For example, "ace" is a subsequence of "abcde".
     * Write an algorithm to solve the following problem:
     * Given two strings text1 and text2, return the length of their longest common subsequence. If
     * there is no common subsequence, return 0
     */
    public class Common_Substrings {
        //method
        // count1&2 keep track of lengths of the substrings
        // use a 2d

        // method declaration
        public int commonWords(String word1, String word2) {
            int count1 = word1.length(); // store length of word1 2 diff lettersc
            int count2 = word2.length(); // store length of word2
            int array[][] = new int[count1 + 1][count2 + 1]; // 2D array

            int common = 0; // stores the common subtring
            // iterates through the words
            for (int i = 0; i <= count1; i++) {
                for (int j = 0; j <= count2; j++) {
                    //array[i][j] = 0;
                    if (i >= 0) { // crete two if statemnents
                        if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                            common = 1 + array[i - 1][j - 1]; // O(1)
                            //array[i][j] = Math.max(common, Math.max(array[i - 1][j], array[i][j - 1])); //O(1)
                        }
                        array[i][j] = Math.max(common, Math.max(array[i - 1][j], array[i][j - 1])); //O(1)

                    }
                    else {
                        System.out.println("");
                    }
                }

            }
            return array[count1][count2]; // returns the longest common sub

        }

        public static void main (String[]args){
            Scanner scan = new Scanner(System.in);

            System.out.println("Enter the first word: ");
            String word1 = scan.nextLine();


            System.out.println("Enter the second word: ");
            String word2 = scan.nextLine();



        }
    }

