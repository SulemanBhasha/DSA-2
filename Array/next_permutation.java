import java.util.Arrays;

public class next_permutation {
    
 public static void main(String[] args) {
	 int arr[] ={1,3,2};
	 nextPermutation(arr);
	 System.out.println(Arrays.toString(arr));
}
 public static void nextPermutation(int[] nums) {
     
     int n=nums.length;
     int fn=-1;
     int fni=-1;
     for(int i=nums.length-1;i>0;i--){
         if(nums[i-1]<nums[i]){
             fn = nums[i-1];
             fni= i-1;
             break;
         }
     }
     if(fni>=0){
         int j = n-1;
         while(nums[j]<=nums[fni]){
             j--;
         }
         swap(nums,fni,j);
     }
     reverse(nums,fni+1);
 } 
 private static  void reverse(int[] nums, int start) {
     int i = start, j = nums.length - 1;
     while (i < j) {
    	 int temp = nums[i];
         nums[i] = nums[j];
         nums[j] = temp;
         i++;
         j--;
     }
 }
 public static  void swap(int[] nums, int a ,int b){
     int temp = nums[a];
     nums[a] = nums[b];
     nums[b] = temp;
 }

    
}
