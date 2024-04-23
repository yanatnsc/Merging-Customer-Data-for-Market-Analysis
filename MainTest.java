import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void mergeCustomerData() {
        // Test 1: Both customerData1 and customerData2 are empty
        int[] customerData1_1 = {};
        int[] customerData2_1 = {};
        int m1 = 0;
        int n1 = 0;
        Main.mergeCustomerData(customerData1_1, m1, customerData2_1, n1);
        int[] expected1 = {};
        assertArrayEquals(expected1, customerData1_1);

        // Test 2: customerData1 = {1, 2, 3, 4} and customerData2 is empty
        int[] customerData1_2 = {1, 2, 3, 4};
        int[] customerData2_2 = {};
        int m2 = 4;
        int n2 = 0;
        Main.mergeCustomerData(customerData1_2, m2, customerData2_2, n2);
        int[] expected2 = {1, 2, 3, 4};
        assertArrayEquals(expected2, customerData1_2);

        // Test 3: customerData1 = {0, 0} (no non-zero value) and customerData2 = {1, 2}
        int[] customerData1_3 = {0, 0};
        int[] customerData2_3 = {1, 2};
        int m3 = 0;
        int n3 = 2;
        Main.mergeCustomerData(customerData1_3, m3, customerData2_3, n3);
        int[] expected3 = {1, 2};
        assertArrayEquals(expected3, customerData1_3);

        // Test 4: customerData1 = {1, 2, 3, 4, 0, 0} and customerData2 = {1, 2}
        int[] customerData1_4 = {1, 2, 3, 4, 0, 0};
        int[] customerData2_4 = {1, 2};
        int m4 = 4;
        int n4 = 2;
        Main.mergeCustomerData(customerData1_4, m4, customerData2_4, n4);
        int[] expected4 = {1, 1, 2, 2, 3, 4};
        assertArrayEquals(expected4, customerData1_4);

        // Test 5: customerData1 = {1, 2, 0, 0, 0, 0} and customerData2 = {1, 2, 3, 4}
        int[] customerData1_5 = {1, 2, 0, 0, 0, 0};
        int[] customerData2_5 = {1, 2, 3, 4};
        int m5 = 2;
        int n5 = 4;
        Main.mergeCustomerData(customerData1_5, m5, customerData2_5, n5);
        int[] expected5 = {1, 1, 2, 2, 3, 4};
        assertArrayEquals(expected5, customerData1_5);
    }
}