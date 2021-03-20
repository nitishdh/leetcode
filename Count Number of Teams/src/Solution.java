public class Solution {
    public int numTeams(int[] rating) {
        int count=0;
        for(int i=0;i<rating.length;i++){
            for(int j=i+1;j<rating.length;j++){
                if(rating[j] > rating[i]){
                  for(int k=j+1;k<rating.length;k++){
                        if(rating[k] > rating[j] ){
                             count++;        
                        }
                    }
                }
                else if(rating[j] < rating[i]){
                    for(int k=j+1;k<rating.length;k++){
                        if(rating[k] < rating[j]){
                             count++;        
                        }
                    }
                    
                }
                
            }
        }
        return count;
        
   }
}
