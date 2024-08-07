public class Main {
    public static void main(String[] args) {
        //Create an instance of the twoSum class
        twoSum solution = new twoSum();

        //Define test cases
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;

        int[] nums2 = {3, 2, 4};
        int target2 = 6;

        int[] nums3 = {3, 3};
        int target3 = 6;

        //Run the twoSum method on the test cases
        int[] output1 = solution.twoSum(nums1, target1);
        int[] output2 = solution.twoSum(nums2, target2);
        int[] output3 = solution.twoSum(nums3, target3);

        //Print the results
        printResult(output1);
        printResult(output2);
        printResult(output3);
    }
    private static void printResult(int[] result) {
        if (result.length == 2) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        }
        else {
            System.out.println("No solution found");
        }
    }
}
