import java.util.HashMap;

public class Count_More_than_n_by_k_Occurences {

    
	public static void main(String[] args) {
		int arr[]= {2,3,3,2};
		int n = arr.length;
		int k = 4;
		int c= countOccurence(arr,n,k);
		System.out.println(c);
	}

    //Function to find all elements in array that appear more than n/k times.
    public static int countOccurence(int[] arr, int n, int k) 
    {
        int count=0;
        HashMap <Integer , Integer> map = new HashMap();
    for(int num : arr){
        if(map.containsKey(num)){
            map.put(num,map.get(num)+1);
        }
        else{
            map.put(num,1);
        }
    }
    System.out.println(map.get);
    for( Entry <Integer , Integer> entry: map.entrySet()){
        if(entry.getValue()>n/k){
            count++;
        }
    }
    return count;
    }


}
