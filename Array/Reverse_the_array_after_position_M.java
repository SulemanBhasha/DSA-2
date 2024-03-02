/**
 * Reverse_the_array_after_position_M
 */
public class Reverse_the_array_after_position_M {

    
		public static void main(String[] args) {
			int arr[]={1,2,3,4,5,6,7,8,9};
			int m = 3;
			reverse(arr,m);
			System.out.println(Arrays.toString(arr));
		}
		private static  void reverse(int arr[], int s) {
			int e= arr.length-1;
			while(s<=e){
				int temp =arr[s];
				arr[s]= arr[e];
				arr[e]= temp;
				e--;
				s++;
				}
		}
		

}