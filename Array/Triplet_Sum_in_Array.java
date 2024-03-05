import java.util.Arrays;

/**
 * Triplet_Sum_in_Array
 */
public class Triplet_Sum_in_Array {

    
//	Given an array arr of size n and an integer X. 
//	Find if there's a triplet in the array which sums up to the given integer X.
//	Example 1:
//
//	Input:
//	n = 6, X = 13
//	arr[] = [1 4 45 6 10 8]
//	Output:
//	1
//	Explanation:
//	The triplet {1, 4, 8} in 
//	the array sums up to 13.
	public static void main(String[] args) {
		int arr []={1 ,4, 45, 6, 10, 8};
	    int sum = 14;
		int n = arr.length;
		Arrays.sort(arr);
		boolean flag = true;
		for (int i = 0; i < arr.length-2; i++) {
			int s = i+1;
			int e= n-1;
			while(s<e){
				int currSum = arr[i]+arr[s]+arr[e];
				if(sum == currSum){
					flag= false;
					System.out.println("triplets are present");
					break;
				}
				else if(currSum < sum){
					s++;
				}
				else{
					e--;
				}
			}
		}
		if(flag ==true ){
			System.out.println("triplets not found");
		}
		
	}

    
}