import java.util.HashMap;

public class Longest_Consecutive_Sequence {
    
	public static void main(String[] args) {
		 int []nums = {0,3,7,2,5,8,4,6,0,1};
		int length= longestConsecutive(nums);
		System.out.println(length);
	}

	 public static int longestConsecutive(int[] nums) {
		 
	        HashMap <Integer,Boolean> map = new HashMap();
	        for(int num :nums){
	            map.put(num, Boolean.FALSE);
	        }
	        int longestLength = 0;
	        for(int num : nums){
	            int currentLength= 1;
	           int nextNum=num+1;
	            while(map.containsKey(nextNum) && map.get(nextNum)==false)
	            {
	                map.put(nextNum,true);
	                currentLength++;
	                nextNum++;
	            }
	           int prevNum = num-1;
	             while(map.containsKey(prevNum) && map.get(prevNum)==false)
	            {
	                map.put(prevNum,true);
	                currentLength++;
	               prevNum--;
	            }
	            longestLength= Math.max(longestLength,currentLength);
	        }
	        return longestLength;
	    }

}
