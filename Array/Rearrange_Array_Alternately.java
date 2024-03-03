import java.util.Arrays;

public class Rearrange_Array_Alternately {
    
//	Given a sorted array of positive integers. Your task is to rearrange the array elements alternatively i.e first element should be max value, second should be min value, third should be second max, fourth should be second min and so on.
//	Note: Modify the original array itself. Do it without using any extra space. You do not have to return anything.
//
//	Example 1:
//
//	Input:
//	n = 6
//	arr[] = {1,2,3,4,5,6}
//	Output: 6 1 5 2 4 3
//	Explanation: Max element = 6, min = 1, 
//	second max = 5, second min = 2, and 
//	so on... Modified array is : 6 1 5 2 4 3.
	
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};
		int min= 0;
		int max = arr.length-1;
		int maxEle = arr[max]+1;
		for (int i = 0; i < arr.length; i++) {
			if(i%2==0){
				arr[i]= arr[i]+(arr[max]%maxEle)*maxEle;
				max--;
			}
			else{
				arr[i]= arr[i]+(arr[min]%maxEle)*maxEle;
				min++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			arr[i]= arr[i]/maxEle;
		}
		System.out.println(Arrays.toString(arr));
	}

    
}
