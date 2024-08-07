import java.util.HashMap;
import java.util.Map;

public class twoSum {
    //This method takes an array of integers and a target integer.
    //It returns an array of two integers, which are the indices of the two numbers that add up to the target
    public int[] twoSum(int[] nums, int target) {
        //Create a HashMap to store the numbers and their corresponding indices.
        Map<Integer, Integer> numMap = new HashMap<>();

        //Get the length of the input array.
        int n = nums.length;

        //Loop through each element in the array
        for (int i = 0; i < n; i++) {
            //Calculate the complement by subtracting the current number from the target.
            int complement = target -nums[i];
            //Check if the complement is already is the HashMap
            if (numMap.containsKey(complement)) {
                //If it is, return the indices fo the complement and the current number.
                return new int[]{numMap.get(complement), i};
            }
            //If the complement is not found, add the current number and its index to the HashMap
            numMap.put(nums[i], i);
        }
        //If no solution is found, return an empty array
        return new int[]{}; //  No solution found
    }
}

