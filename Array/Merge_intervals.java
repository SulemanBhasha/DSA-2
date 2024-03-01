/**
 * Merge_intervals
 */
public class Merge_intervals {

    
	public static void main(String[] args) {
		int arr[][]={{1,3},{2,6},{8,10},{15,18}};
		Arrays.sort(arr,Comparator.comparingInt(i ->i[0]));
		
		
		List<int[]> list = new ArrayList<int[]>();
		int []newIntervals= arr[0];
		list.add(newIntervals);
		
		for(int[] intervals : arr){
			if(intervals[0] <= newIntervals[1]){
				newIntervals[1]=Math.max(intervals[1], newIntervals[1]);
			}
			else{
				newIntervals=intervals;
				list.add(newIntervals);
			}
			
		}
		System.out.println(arr.length);
		
		
		  arr = list.toArray(new int[list.size()][]) ;
		 for (int i = 0; i < arr.length; i++) {
	            // Iterate over columns
	            for (int j = 0; j < arr[i].length; j++) {
	                System.out.print(arr[i][j] + " ");
	            }
	            // Move to the next line after each row
	            System.out.println();
	        }
		
	}

}