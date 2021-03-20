import java.util.Arrays;

public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] retVal = new int[nums.length];
        int product = 1;
        boolean check = false;
        boolean check2 = false;
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=0){
             product*=nums[i];   
            }
            else{
                if(check == true){
                    check2 = true;
                }
                check=true;
            }
        }
        if(check2){
            Arrays.fill(retVal, 0);
        }
        else if(check){
            Arrays.fill(retVal, 0);
            for(int j=0; j<retVal.length;j++){
                if(nums[j]!=0){
                    retVal[j]/=nums[j];   
                }
                else{
                    retVal[j] = product;
                }
            }
        }
        else{
         Arrays.fill(retVal, product);
            for(int j=0; j<retVal.length;j++){
                if(nums[j]!=0){
                    retVal[j]/=nums[j];   
                }
                else{
                    retVal[j] = product;
                }
            }
        }
        return retVal;
    }
}
