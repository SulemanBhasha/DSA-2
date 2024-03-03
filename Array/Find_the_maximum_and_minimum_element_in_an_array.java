public class Find_the_maximum_and_minimum_element_in_an_array {
    

	public static void main(String[] args) {
		int arr[]={1, 345, 234, 21, 56789};
		sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(arr[0]+" && "+arr[arr.length-1]);
		
	}
	public static void sort(int arr[]){
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-1; j++) {
				if(arr[j]>arr[j+1]){
					int temp =arr[j];
					arr[j]=arr[j+1];
					arr[j+1]= temp;
				}
			}
		}
		
	}

}
