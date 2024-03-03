public class Find_the_Maximum_SubArray_with_Given_Sum {
    public static void main(String[] args) {
    int arr[]={-2,1,-3,4,-1,2,2,1,1,2,2,2,2};
    int sum =6;
    int s= 0;
    int e = -1;
    int maxlength = Integer.MIN_VALUE;
    int currSum = 0;
    int count =0;
    HashMap<Integer,Integer> map = new HashMap();
    for (int i = 0; i < arr.length; i++) {
        currSum = arr[i]+currSum;
         
        if(currSum == sum ){
            count++;
            if(maxlength<(i-0+1)){
                 maxlength = Math.max(maxlength, e-s+1);
                 s=0;
                 e=i;
            }
            
        }
            if(map.containsKey(currSum-sum)){
                count++;
                if(maxlength<(i-map.get(currSum-sum)+1)){
                    s= map.get(currSum-sum)+1;
                    e=i;
                    maxlength= Math.max(maxlength, e-s+1 );
                }
            }
        
        map.put(currSum, i);
    }
    System.out.println(s+"--"+e);
    System.out.println(count);
    while(s<=e){
        System.out.println(arr[s++]);
    }
    
}
 
    
}

    

