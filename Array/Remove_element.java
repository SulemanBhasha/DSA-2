/**
 * Remove_element
 */
public class Remove_element {

    public static void main(String[] args) {
        
		int arr[]={0,1,2,2,3,3,3,3,0,4,2};
		int val= 3;
		int i=0;
		for (int j = 0; j < arr.length; j++) {
			if(arr[j]!=val){
				arr[i]=arr[j];
				i++;
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("length aftr remooving val == "+i );
	
    }
}