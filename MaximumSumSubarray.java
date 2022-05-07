


// given array [2,-3,-4.4,11,22,-9,-23] of integers, find the maximum possible sum you can get from on of its contigous subarrays.
//The sub array from which this must contain at least 1;
//Using Kadane's Algorithm

public class MaximumSumSubarray {



    public static void main(String[] args) {

        int[] subArrayMax = {2,-3,-4,-4,11,22,-9,-23};
        System.out.println(maxConsecutiveSum(subArrayMax));

    }
    static int maxConsecutiveSum(int[] array){
        int max_sum = array[0];
        int current_sum = max_sum;
        for (int i = 0; i < array.length; i++) {
            current_sum = Math.max(array[i]+current_sum,array[i]);
            max_sum=Math.max(current_sum, max_sum);
        }

        return max_sum;
    }
}
