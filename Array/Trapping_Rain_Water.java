public class Trapping_Rain_Water {
    
	public static void main(String[] args) {
		int arr[]={7,4,0,9};
		int n =arr.length;
		int volume = trappingWater(arr,n) ;
		System.out.println(volume);
	}
	private static int trappingWater(int[] arr, int n) {
		int right[]= new int[n];
		int left[]= new int[n];
		left[0] = arr[0];
		right[n-1]= arr[n-1];
		for (int i = 1; i < left.length; i++) {
			left[i]= Math.max(left[i-1], arr[i]);
		}
		for (int i = n-2; i >= 0; i--) {
			right[i]= Math.max(right[i+1], arr[i]);
		}
		int result = 0;
		for (int i = 0; i < arr.length; i++) {
			result = result +Math.min(left[i],right[i] )-arr[i];
		}
		return result;
	}

}
