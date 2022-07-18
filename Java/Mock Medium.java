// Given an array of integers, 
// find out whether there are two distinct indices i and j in the array 
// such that the absolute difference between nums[i] and nums[j] is at most t and 
// the absolute difference between i and j is at most k.

// Input: nums = [1,2,3,1], k = 3, t = 0

// Output: true







// // Maximum Perimeter Triangle from array

// // Given an array of non-negative integers. Find out three elements from this array that form a triangle of the maximum perimeter.

// // Input : {6, 1, 6, 5, 8, 4}

// // Output : 20

// // Input : {2, 20, 7, 55, 1, 33, 12, 4}

// // Output : Triangle formation is not possible.




// How Many Numbers Are Smaller Than the Current Number

// Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it.
//  That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].

// Return the answer in an array.

// Input: nums = [8,1,2,2,3]

// Output: [4,0,1,1,3]

// Explanation:

// For nums[0]=8 there exist four smaller numbers than it (1, 2, 2 and 3).

// For nums[1]=1 does not exist any smaller number than it.

// For nums[2]=2 there exist one smaller number than it (1).

// For nums[3]=2 there exist one smaller number than it (1).

// For nums[4]=3 there exist three smaller numbers than it (1, 2 and 2).
import java.util.*;

public class Problem{
    public static void main(String[] args) {
        int nums[] = {8,1,2,2,3};
        int n = nums.length;
       
        for(int i=0; i<n-1;i++){
            int small = 0; 
            for(int j=0;j<n;j++){
                if(nums[j]>nums[i]){
                    small++;
                }

            }
        }

    }
}