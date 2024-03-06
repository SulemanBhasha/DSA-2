public class Palindomic_array_indicies {
    
//	Given a Integer array A[] of n elements. Your task is to complete the function PalinArray. 
//	Which will return 1if all the elements of the Array are palindrome otherwise it will return 0.
	public static void main(String[] args) {
		int arr[]={111 ,222 ,333 ,444, 555};
		int n = arr.length;
		int result =palinArray(arr,n);
				
	}
	public static int palinArray(int[] arr, int n)
    {
          for(int i=0; i<n ; i++){
              int num = arr[i];
              int copy = num;
              int sum =0;
              while(num!=0){
                  int rem = num%10;
                  sum = sum*10 +rem ;
                  num=num/10;
              }
              if(sum!=copy){
                   return 0;
              }
          }
          return 1;
    }

    
}
