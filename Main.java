//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    // Do not need to set up special scenario for empty array cases as the way pointers are set up would take care of it
    public static void mergeCustomerData(int[] customerData1, int m, int[] customerData2, int n) {
        // Initialize pointers for both arrays and for the merged array
        int i = m - 1; // Pointer for the last element in customerData1
        int j = n - 1; // Pointer for the last element in customerData2

        for (int k = m + n - 1; k >= 0; k--) { // k is the pointer for the end of the merged array
            // If there are no elements left in customerData2, stop
            if (j < 0) {
                break;
            }
            // If there are no elements left in customerData1, copy the remaining elements from customerData2 as they are already sorted
            if (i < 0) {
                customerData1[k] = customerData2[j];
                j--;
            }
            // Do the compare to 0 check first
            // Compare elements from customerData1 and customerData2
            else if (customerData1[i] > customerData2[j]) {
                customerData1[k] = customerData1[i];
                i--;
            }
            else {
                customerData1[k] = customerData2[j];
                j--;
            }

        }
    }
}