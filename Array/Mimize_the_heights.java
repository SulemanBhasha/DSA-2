import java.util.Arrays;

public class Mimize_the_heights {
    
	public static void main(String[] args) {
		int arr[]={1, 5, 8, 10};
		int k=2;
		if(arr.length==1){
			System.out.println("0");
			return;
		}
		Arrays.sort(arr);
		int max= 0;
		int min =Integer.MAX_VALUE;
		int diff = arr[arr.length-1] -arr[0];
		int n = arr.length;
		for (int i = 1; i < n; i++) {
			
			if(arr[i]-k<0) continue;
			
			max = Math.max(arr[i-1]+k, arr[n-1]-k);
			
			min = Math.min(arr[0]+k, arr[i]-k);
			
			diff = Math.min(diff, max-min);
		}
		System.out.println(diff);
		
	}

}
