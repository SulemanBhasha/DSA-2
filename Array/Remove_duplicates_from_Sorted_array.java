/**
 * Remove_duplicates_from_Sorted_array
 */
public class Remove_duplicates_from_Sorted_array {

    public static void main(String[] args) {
        
		int arr[]= {0,};
		int count =0;
		for (int i = 1; i < arr.length-1; i++) {
			if(arr[count]!=arr[i]){
				count++;
				arr[count]=arr[i];
			}
		}
		count+=1;
		System.out.println(count);
	
    }
}
