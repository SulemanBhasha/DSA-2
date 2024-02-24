public class Most_water_container {
    public static void main(String[] args) {
        int arr[]={1,8,6,2,5,4,8,3,7};
        int s= 0;
        int e =arr.length-1;
        int max =0;
        while(s<=e){
            int min =Math.min(arr[s],arr[e]);
               int area= min*(e-s);
               System.out.println(s+"--"+e+"--"+ area);
               max= Math.max(max, area);
               
               if(arr[s]<arr[e]){
                   s++;
               }
               else e--;
                   
        }
        System.out.println(max);
    }
}
