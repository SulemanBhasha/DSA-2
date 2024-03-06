public class Median_of_2_Sorted_Arrays_of_Different_Sizes {
    
	public static void main(String[] args) {
		
        int	a[] = {1,5,9};
        int	b[] = {2,3,6,7};
        int n = a.length;
        int m = b.length;
    
        int l= n+m;
        int idx2 = (m+n)/2;
        int idx1= idx2-1;
        int i =0;
        int j=0;
        int count = 0;
        int idxEle1=-1;
        int idxEle2=-1;
        while(i<n && j<m){
           if(a[i]<b[i]){
                if(count == idx1) idxEle1= a[i];
                if(count == idx2) idxEle2=a[i];
                i++;
                count++;
                
           }
           else{
                if(count == idx1) idxEle1= b[j];
                if(count == idx2) idxEle2=b[j];
                j++;
                count++;
               
           }
        }
        while(i<n){
                if(count == idx1) idxEle1= a[i];
                if(count == idx2) idxEle2=a[i];
                i++;
                count++;
                
        }
        while(j<m){
                if(count == idx1) idxEle1= b[j];
                if(count == idx2) idxEle2=b[j];
                j++;
                count++;
                
        }
          
           if(l%2 == 1){
            System.out.println(idxEle2); ;
        }
        else{
            System.out.println((double) ((idxEle1+idxEle2)/2.0));;
        }
            
        
        }
    
}
