import java.util.Arrays;

/**
 * Rotate_an_Array
 */
public class Rotate_an_Array {

    
	 public static void main(String[] args) {
		int arr[]={1,2,3,4,5,6,7};
		int k= 1;
		System.out.println(Arrays.toString(arr));
		 arr= rotate(arr,k);
		 System.out.println(Arrays.toString(arr));
	}
	 private static int[] rotate(int[] arr, int k) {
		int newArr[]=new int[arr.length];
		for (int i = 0; i < newArr.length; i++) 
			newArr[(i+k)%arr.length]=arr[i];
		return newArr;
		
	}
	

}