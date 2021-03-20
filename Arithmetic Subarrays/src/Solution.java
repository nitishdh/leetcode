import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> retVal = new ArrayList<>();
        
        for(int i=0; i<l.length; i++){
            boolean bool = true;
            int[] arr = new int[nums.length];
            for(int k=0; k<arr.length; k++){
             arr[k] = nums[k];
            }
            Arrays.sort(arr, l[i], r[i]+1);
            
            for(int j=l[i]; j<r[i]; j++){
                if((arr[j+1] - arr[j]) != (arr[l[i]+1] - arr[l[i]])){
                    bool = false;
                }
            }
            retVal.add(i, bool);
        }
        
        return retVal;
    }
}
