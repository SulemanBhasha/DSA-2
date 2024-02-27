import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Substring_with_Concatenation_of_All_Words {
   
	static int size=1;
	 public static void main(String[] args) {
		 String arr[] = {"foo","bar","the"};
		 String str="barfoofoobarthefoobarman";
		 
		 ArrayList<String> list=new ArrayList<>();
		 permute(arr,0,arr.length-1,list);
		 System.out.println(list);
		 
		 int length=list.get(1).length();
		 
		 List< Integer> l= new ArrayList<>();
		 
		 for (int i = 0; i <= str.length()-length; i++) {
			String s= str.substring(i,i+length);
			
			System.out.println(s);
			if( list.contains(s)){
				l.add(i);
			}
		}
		 System.out.println(list.contains("barfoo"));
		 System.out.println(l);
				 
		
		
	}
	 private static void permute(String arr[], int l, int r,ArrayList<String> list) {
			if(r==l)
			{
				String result ="";
//				size++;
				System.out.println(Arrays.toString(arr) +"--"+size++);
			
			    for (int j = 0; j< arr.length; j++) {
					result =result +arr[j];
			    }
			    list.add(result);
			   	return;     
			}
			else
			{
				for (int i = l; i<=r; i++) {
					arr=swapping(arr,l,i);
					permute(arr,l+1,r,list);
					arr=swapping(arr, l, i);                                       
				}
			}	
		}
//		swapping function
		public static String[] swapping(String arr[],int i,int j)
		{	
			String  temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			return arr;
		}

}
