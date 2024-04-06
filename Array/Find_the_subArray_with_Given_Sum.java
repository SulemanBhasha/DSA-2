public class Find_the_subArray_with_Given_Sum {
    public static void main(String[] args) {
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        int sum = 6;
        int s= 0;
        int e= -1;
        int currSum = 0;
        int maxLength = -1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            currSum = currSum + arr[i];
            if(sum==currSum){
                s= 0;
                e=i;
                 maxLength = Math.max(maxLength, e-s);
            }
            if(map.containsKey(currSum- sum)){
                s= map.get(currSum-sum)+1;
                e=i;
                
            }
            map.put(currSum, i);
        }
        while(s<=e){
            System.out.println(arr[s++]);
        }
        
}
}
