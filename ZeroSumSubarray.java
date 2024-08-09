import java.util.Scanner;

public class ZeroSumSubarray {
    public static void main(String[] args) {
        // take user input for the size of array
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        // declare array and take user input
        int arr[] = new int[n];
        System.out.print("Enter the elements of array: ");
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        // close scaner
        sc.close();

        // declare subarray to store the elements whose sum is 0
        int subarray[] = new int[n];
        int idx = 0;

        // iterate through subarrays and find required elements
        for (int i=0; i<n; i++) {
            int sum = arr[i];
            for (int j=i+1; j<n; j++) {
                // add the current element to sum
                sum += arr[j];
                if (sum == 0) {
                    // add the elements whose sum is 0 into the 'subarray' array for displaying to user
                    for (int k=i; k<=j; k++) {
                        subarray[idx++] = arr[k];
                    }
                }
            }
        }

        // check if 'subarray' is empty or not and print message accordingly
        if (idx == 0) {
            System.out.println("No such subarray exists in the array whose sum can be 0!");
        } else {
            System.out.print("The subarray found is: ");
            for (int i = 0; i < idx; i++) {
                System.out.print(subarray[i]+" ");
            }
        }

    }
}
