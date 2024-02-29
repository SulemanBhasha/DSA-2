public class Jump_game_II {
    
			int arr[]={10,10,0,1,4,5,6,7};
			
			int position =0;
			int desti = 0;
			int jump =0;
			for (int i = 0; i < arr.length-1; i++) {
				desti = Math.max(desti, arr[i]+i);
				
				if(position == i){
					position = desti;
					jump++;
				}
			}
			System.out.println("maximum jump is : "+jump);
		
}
