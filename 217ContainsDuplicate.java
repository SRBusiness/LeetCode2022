// 217. Contains Duplicates https://leetcode.com/problems/contains-duplicate/ Easy

// Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
//
// Example 1:
// Input: nums = [1,2,3,1]
// Output: true
//
// Example 2:
//
// Input: nums = [1,2,3,4]
// Output: false
// Example 3:
//
// Input: nums = [1,1,1,3,3,4,3,2,4,2]
// Output: true
//
//
// Constraints:
//
// 1 <= nums.length <= 105
// -109 <= nums[i] <= 109

// ------------------------------------------------
class Solution {
    public boolean containsDuplicate(int[] nums) {
        // early return if the length of the array is less than 1 we can return
        // since there would be no duplicates
        if (nums.length < 1) {
            return false;
        }

        // make a map where key is the int and value is int
        Map<Integer, Integer> intMap = new HashMap<Integer, Integer>();

        // loop through each element in the int[]
        // use i as a counter
        // as long as i is less then the length of the array
        // add one to i for each loop
        for (int i = 0; i < nums.length; i++) {
            int currentInt = nums[i];
            Integer inMap = intMap.get(currentInt);

            if (inMap != null) {
            // if the Integer returned from the map isn't null then there is a duplicate and we should return true
                return true;
            } else {
            // if the response was equal to null then we should add the int to the map
                intMap.put(currentInt, currentInt);
            }
        }
        // if we have hit this point in the code then we have no duplicates and should
        // return false
        return false;
    }
}

// Time Complexity
O(n) where n is the number of elements in the int[] array

// Space Complexity
O(n) where n is the number of elements in the int[] array

// ------------------------------------------------
// Cleaner implementaction but same time and space Complexity
class Solution {
    public boolean containsDuplicate(int[] nums) {
		 Set<Integer> set = new HashSet<Integer>();
		 for(int i : nums)
			 if(!set.add(i))
                 // if there is same
				 return true;
		 return false;
    }
}
// Time Complexity
// O(n) where n is the number of elements in the int[] array

// Space Complexity
// O(n) where n is the number of elements in the int[] array
