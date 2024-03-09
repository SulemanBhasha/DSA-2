public class Longest_prefixx_suffixx_KMP_Algo {
    
	public static void main(String[] args) {
		String str = "aaaa";
		int s= 0;
		int e= str.length()-1;
		List<char []> list = new ArrayList<char[]>();
		List<char []> list2 = new ArrayList<char[]>();
		String start ="";
		String end ="";
		while(s<str.length()-1 && e>0){
			start= start+str.charAt(s++);
			char ss[]= start.toCharArray();
			list.add(ss);
	
			end =  str.charAt(e--)+end;
		char[]	ee= end.toCharArray();
			list2.add(ee);
		}
		int max =0;
		for (int i = 0; i < list.size(); i++) {
				if(Arrays.equals(list.get(i), list2.get(i))){
					
				max= Math.max(max, Math.max(list.get(i).length, list.get(i).length));
			}
		}
		System.out.println(max);
	}

}
