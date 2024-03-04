import java.util.HashMap;

public class Array_Subset_of_another_array {

    

	public static void main(String[] args) {
		long a1[] = {11, 7, 1, 13, 21, 3, 7, 3};
		long a2[] = {11, 3, 1, 1, 7};
		String s=isSubset(a1,a2,a1.length,a2.length);
		System.out.println(s);
	}
	

    public static String isSubset( long a1[], long a2[], long n, long m) {
        
    	String flag ="No";
       HashMap<Long,Integer> map = new HashMap();
       HashMap<Long,Integer> subMap = new HashMap();
       for (int i = 0; i < a1.length; i++) {
		if(map.containsKey(a1[i])){
			map.put(a1[i],map.get(a1[i])+1);
			}
		else{
			map.put(a1[i],  1);
		}
	  }
      
       for (int i = 0; i < a2.length; i++) {
			if(subMap.containsKey(a2[i])){
				subMap.put(a2[i],subMap.get(a2[i])+1);
				}
			else{
				subMap.put(a2[i], 1);
			}
		}
       for(Entry<Long, Integer> newMap : subMap.entrySet()){
    	   System.out.println(newMap);
    	   int value = newMap.getValue();
    	   Long key = newMap.getKey();
    	  
    	  if(map.containsKey(key)){
    		  if(map.get(key)>=newMap.getValue()){
        		  continue;
        	   }
    		  else{
       		   return "No";
       	   }
    	  }else{
    		  return "No";
    	  }
    	   
    	   
       }
       return "Yes";
    }
    
}
