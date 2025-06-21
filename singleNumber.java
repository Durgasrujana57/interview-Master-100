// brute force approach

class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            boolean foundDuplicate = false;

            for (int j = 0; j < n; j++) {
                if (i != j && nums[i] == nums[j]) {
                    foundDuplicate = true;
                    break;
                }
            }

            if (!foundDuplicate) {
                return nums[i];
            }
        }
        return -1;
    }
}

time : o(n^2);
space : O(1);

//optimual
class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for(int num : nums) {
            result^=num;
        }
        return result; 
    }
}

time : O(n);
space : O(1);
