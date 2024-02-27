import java.util.Arrays;

public class Find_First_and_Last_Position_of_Element_in_Sorted_Array {
    
	public static void main(String[] args) {
		int nums[]= { 5,7,7,8,8,10};   int target= 8;
		
		int arr[]={-1,-1};
	      arr[0]= first(nums,target);
	        arr[1]= last(nums,target);
	        System.out.println(Arrays.toString(arr));
	        
	    }
	    static int first(int arr[],int target)
	    {
//	    	int nums[]= { 5,7,7,8,8,10};   int target= 8;
	        int ans=-1;
	        int s=0;
	        int e=arr.length-1;
	        int mid=s+(e-s)/2;
	        while(s<=e)
	        {
	            if(arr[mid]==target)
	            {
	                ans=mid;
	                e=mid-1;
	            }
	            else if(arr[mid]<target)
	            {
	                s=mid+1;
	            }
	            else
	            {
	                e=mid-1;
	            }
	            mid=s+(e-s)/2;
	        }
	        return ans;
	    }
	     static int last(int arr[],int target)
	    {
	        int ans=-1;
	        int s=0;
	        int e=arr.length-1;
	        int mid=s+(e-s)/2;
	        while(s<=e)
	        {
	            if(arr[mid]==target)
	            {
	                ans=mid;
	                s=mid+1;
	            }
	            else if(arr[mid]<target)
	            {
	                s=mid+1;
	            }
	            else
	            {
	                e=mid-1;
	            }
	            mid=s+(e-s)/2;
	        }
	        return ans;
	    }
	
    
}
