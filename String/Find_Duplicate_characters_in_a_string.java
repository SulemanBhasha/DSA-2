public class Find_Duplicate_characters_in_a_string {
    
	public static void main(String[] args) {
		String str = "aabssbcecddefgh";
		HashMap<Character, Integer> map = new HashMap<>();
		for(int i=0; i<str.length(); i++){
			if(map.containsKey(str.charAt(i))){
				map.put(str.charAt(i), map.get(str.charAt(i))+1);
			}
			else{
				map.put(str.charAt(i), 1);
			}
		}
		System.out.println(map);
		java.util.List<Character> list = new ArrayList<>();
		for(Entry<Character , Integer> newMap : map.entrySet()){
			if(newMap.getValue()>1){
				list.add(newMap.getKey());
			}
		}
		System.out.println(list);
	}

}
