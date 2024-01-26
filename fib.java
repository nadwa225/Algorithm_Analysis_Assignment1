import java.math.BigInteger;
import java.util.Scanner;

public class fib {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // scanner class
        System.out.println("Enter the number of Fibonacci");
        int nterms = scan.nextInt(); //input from the user
        fibonacci(nterms);

        }

        public static void fibonacci(int nterms){
            BigInteger term = BigInteger.ZERO; // initialized to value zero  O(1)
            BigInteger term1 = BigInteger.ONE; // initialized to value one   O(1)


            for(int i = 0; i< nterms;i++ ){ // current and next term  O(N)
                System.out.println(term + " ");
               // sum = sum.add(term);

                BigInteger nextTerm = term.multiply(BigInteger.valueOf(3)).add(term1.multiply(BigInteger.valueOf(2)));// O(1
                term = term1;  //O(1)
                term1 = nextTerm;   //O(1) iterate
            }
            //System.out.println(sum);


        }


    }
// Complexity  O(N) + O(1) + O(1) + O(1) + O(1) = O(N)
// Space O(N)

