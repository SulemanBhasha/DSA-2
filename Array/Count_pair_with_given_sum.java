import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Count_pair_with_given_sum {
        
	public static void main(String[] args) {
		int arr[]={1, 5, 7, -1, 5}; int k = 6;
		List list = new ArrayList();
		int add[]=new int[2];
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length-1; j++) {
				if(  k == (arr[i]+arr[j+1]) ) {
					add[0]=arr[i];
					add[1]=arr[j+1];
					System.out.println(Arrays.toString(add));
				}
			}
		}
		
	}

}
