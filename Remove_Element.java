import java.util.Scanner;

/**
 * Write a program to solve the following problem.
 * Given an integer array nums and an integer val, remove all occurrences of val in nums in- place.
 * Then return the number of elements in nums which are not equal to val.
 */
public class Remove_Element {

    public static int remove_element(int[] nums, int val) {
        int c = 0; // O(1)
        // for loop to iterate through the array
        for (int i = 0; i < nums.length; i++) {    //O(N)
            if (nums[i] != val) { // checks if current element is not equal to val     //O(N)
                nums[c] = nums[i]; // if condition is true then it assigns to c
                c++;   // increment c
            }
        }


        return c; // returns c    // O(1)
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        //int[] nums = {1, 2, 2, 3, 4, 5};
        //int val = 1;
        System.out.println("Enter length of the array ");
        int length = scan.nextInt();

        // input the array
        int[] nums = new int[length];
        System.out.println("Enter the elements of the array without commas:");
        for (int i = 0; i < length; i++) {
            nums[i] = scan.nextInt();
        }
        System.out.print("Enter the value to be removed: ");
        int val = scan.nextInt();

        int newArray = remove_element(nums, val);

        for (int i = 0; i < newArray; i++) {
            System.out.println(nums[i] + " ");
        }
    }
}
