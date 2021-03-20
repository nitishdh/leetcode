import java.util.Arrays;

public class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int missing = 1;
        boolean find = false;
        if(nums.length==0){
            return 1;
        }
        if(nums.length == 1){
            if(nums[0] == 1){
                return 2;
            }
            else{
                return 1;
            }
        }
        if(nums[nums.length-1]==1){
            return 2;
        }
        for(int i=0; i<nums.length-1; i++){
            if(find == false && nums[i] == 1){
                find = true;
            }
            if(find){
                if(nums[i+1] == nums[i]+1 || nums[i+1] == nums[i]){
                    if(i+1 != nums.length-1){
                        missing = nums[i+1];
                    }
                    else{
                        return nums[nums.length-1] + 1;
                    }
                }
                else{
                   return nums[i] + 1;
                }
            }
        }
        if(find == false){
            return 1;
        }
        return missing;
    }
}
