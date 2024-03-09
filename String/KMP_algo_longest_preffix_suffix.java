public class KMP_algo_longest_preffix_suffix {
    
	public static void main(String[] args) {
		String str = "aaaaa";
		int l= lps(str);
		System.out.println(l);
	}

 public static int lps(String str) {
        int ch[] = new int[str.length()];
        int pre= 0;
        int suf= 1;
        while(suf<str.length()){
            if(str.charAt(pre)==str.charAt(suf)){
                ch[suf]=pre+1;
                pre++;
                suf++;
            }
            else{
                if(pre==0){
                    ch[suf]=0;
                    suf++;
                }
                else{
                    pre= ch[pre-1];
                }
            }
            
        }
        return ch[ch.length-1];
    }


}
