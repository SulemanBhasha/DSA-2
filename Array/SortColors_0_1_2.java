import java.util.Arrays;

public class SortColors_0_1_2 {
    
	public static void main(String[] args) {
		int arr[]={2,0,2,1,1,0};
		int zero =0;
		int one =0;
		int two =0;
		for(int i=0; i<arr.length;i++){
			if(arr[i]==0) zero++;
			if(arr[i]==0) one++;
			if(arr[i]==0) two++;
		}
		for(int i=0;i<zero ;i++) arr[i]=0;
		for(int i =zero ; i<zero+one ; i++) arr[i]= 1;
		for(int i= zero+one ; i<arr.length; i++) arr[i]=2;
		System.out.println(Arrays.toString(arr));
	}
	

    
}
