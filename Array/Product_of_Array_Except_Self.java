/**
 * Product_of_Array_Except_Self
 */
public class Product_of_Array_Except_Self {

    
	public static void main(String[] args) {
		int arr[]= {1,2,-1,4,1};
		int result[]= new int[arr.length];
		Find_Product(arr,result);
		
		System.out.println(Arrays.toString(result));
		
		
	}
	public static void Find_Product(int[] arr, int[] result){
		int left = 1;
		for (int i = 0; i < arr.length; i++) {
			result[i]=left;
			left = left * arr[i];
		}
		int right = 1;
		for (int i = arr.length-1 ; i >= 0 ; i--){
			result[i] = result[i] * right;
			right = right * arr[i];
		}
		
	}

}