public class Search_Insert_Position {
    
	public static void main(String[] args) {
		int arr []= {1,3,5,6};
		int target = 5;
		
	int position =	searchInsertPosition(arr,target);
	System.out.println(position);
	}

	private static int searchInsertPosition(int[] arr, int target) {
		int s=0;
		int e=arr.length-1;
		int mid = s=(e-s)/2;
		while(s<=e){
			if(arr[mid]==target){
				return mid;
			}
			else if(arr[mid]<target){
				s=s+1;
			}
			else{
				e=mid-1;
			}
			mid=s+(e-s)/2;
		}
		return s;
	}

    
}
