import java.util.ArrayList;
import java.util.List;

public class Common_Elements_in_sorted_Array {
    
	public static void main(String[] args) {
		int []A = {2, 5, 10, 20, 40, 80,80};
		int []B = {1, 7, 20, 80,80, 100};
		int []C = {3, 4, 15, 20, 30, 70, 80,80, 120};
		int n1 = A.length; 
		int n2 = B.length;
		int n3 = C.length;
		List<Integer> list = new ArrayList<Integer>();
		list = commonElement(A,B,C,n1,n2,n3,list);
		System.out.println(list);
		
	}

	private static List<Integer> commonElement(int[] a, int[] b, int[] c, int n1, int n2, int n3, List<Integer> list) {
		
		int i=0;
		int j=0;
		int k =0;
		while(  i<n1 && j<n2 && k<n3 ){
			if(a[i]==b[j] && b[j]==c[k]){
				if(!list.contains(a[i]))
				list.add(a[i]);
				i++;j++;k++;
				continue;
			}
			else if(a[i]<=b[j] && a[i]<=c[k]){
				i++;
			}
			else if(b[j]<=c[k] && b[j]<=a[i]){
				j++;
			}
			else{
				k++;
			}
		}
		return list;
	}

}
