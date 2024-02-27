

public class Search_in_Rotated_Sorted_Array {
	public static void main(String[] args) {
		int  arr[] = {4,5,6,7,0,1,2}; 
		int target = 0;
		int pivot=getpivot(arr);
		System.out.println(arr[pivot]);
		int index=-1;
		if(target>=arr[pivot] && target<=arr[arr.length-1]){
			 index=binarysearch(arr,pivot,arr.length-1,target);
		}
		else{
			 index=binarysearch(arr,0,pivot-1,target);
		}
		System.out.println(index);
	}
	public static int getpivot(int arr[])
    {
        int s=0;
       int e=arr.length-1;
       int mid=s+(e-s)/2;
       while(s<e)
       {
    	   System.out.println(s);
    	   System.out.println(e);
    	   System.out.println(mid);
    	   System.out.println("------------");
           if(arr[0]<=arr[mid])
           {
               s=mid+1;
           }
           else
           {
               e=mid;
           }
           
           mid=s+(e-s)/2;
       }
      return s;
    }
	private static int binarysearch(int[] arr, int s, int e, int target) {
		
		int mid = s+(e-s)/2;
		while(s<=e){
			if(arr[mid]==target){
				return mid;
			}
			else if(arr[mid]<target){
				s++;
			}
			else{
				e--;
			}
			mid= s+(e-s)/2;
		}
		
		
	return -1;
	}
}
