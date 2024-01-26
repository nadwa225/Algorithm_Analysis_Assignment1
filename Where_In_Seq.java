import java.math.BigInteger;
import java.util.Scanner;

/**
 *Given an integer output the position of that number in the NotFibonacci sequence from problem 3.
 * If the given input is not a number in the sequence, return the position of the closest number lower than the input.
 *
 */
public class Where_In_Seq {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // scanner class for user input
        System.out.println("Enter the number:");
        BigInteger inputNumber = scan.nextBigInteger();

        System.out.println("Enter number of terms: ");
        int nterms = scan.nextInt(); //input from the user

        //O(N)
        BigInteger[] num = Notfibonacci(nterms); // gets the sequence to store in the num array

        // uses num from array so O(N)
       int position =  position(num, inputNumber); // find position of input number or closest number
        System.out.println(position); // print the position


    }

    // This method generates the Not Fibonacci sequence. Uses BigInteger
    public static BigInteger[] Notfibonacci(int nterms) {
        // array to store large integers
        BigInteger term = BigInteger.ZERO; // initialized to value zero  O(1)
        BigInteger term1 = BigInteger.ONE; // initialized to value one   O(1)

        BigInteger[] fibnum = new BigInteger[nterms]; // stores the notfib seq in the array

        for (int i = 0; i < nterms; i++) { // current and next term  O(N)
            //System.out.println(term + " ");     //O(N)
            fibnum[i]= term;

            // Line calculates the terms
            BigInteger nextTerm = term.multiply(BigInteger.valueOf(3)).add(term1.multiply(BigInteger.valueOf(2)));

            term = term1;  //O(1)
            term1 = nextTerm;   //O(1) iterate
        }
        return fibnum;
    }

    // finds the values of the input value or closest position.
    public static int position(BigInteger[] pos, BigInteger value) {
        int next_position = 0; // stores the postion
        for (int i = 0; i < pos.length; i++) {  // iterate through
            if (pos[i].compareTo(value) == 0) {
                return i + 1; // returns 1 less that the index

            } else if (pos[i].compareTo(value) < 0) {
                next_position = i + 1; // updates the closest number to the value

            }

        }

        return next_position; //returns the closest num
    }
}
