public class Maximum_Product_Subarray {
    
	public static void main(String[] args) {
		int arr []={2,3,0,10,-2,-2,-2,4};
		int leftProduct = 1;
		int rightProduct =1 ;
		int max= arr[0];
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			leftProduct= leftProduct==0 ?1 :leftProduct;
			rightProduct = rightProduct==0 ?1 :rightProduct;
			leftProduct = leftProduct * arr[i];
			rightProduct = rightProduct* arr[n-1-i];
			max=Math.max(max, Math.max(rightProduct, leftProduct));			
		}
		System.out.println(max);
	}

}
