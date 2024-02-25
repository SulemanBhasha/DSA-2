import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * ThreeSum
 */
public class ThreeSum {

    public static void main(String[] args) {
        
		int arr[]= {-1,0,1,2,-1,-4,2} ;
		if(arr.length==0 || arr==null  || arr.length<3){
			System.out.println("not have triplets");
			return ;
		}
		Set <List<Integer>> result = new HashSet();
		Arrays.sort(arr);
		for (int i = 0; i < arr.length-2; i++) {
			int s=i+1;
			int e=arr.length-1;
			while(s<e){
				int sum = arr[i]+arr[s]+arr[e];
				if(sum==0){
					result.add(Arrays.asList(arr[i],arr[s],arr[e]));
					s++;
					e--;
				}
				else if(sum<0){
					s++;
				}
				else{
					e--;
				}
				
					
			}
		}
		System.out.println(result);
	
    }
}