/**
 * String to anumber
 */
public class String_to_number {
    public static void main(String[] args) {
		String str= "2 4";
		int n =0;
		for(int i=0; i<str.length();i++){
			if((str.charAt(i)<='9' && str.charAt(i)>='0')  ){
				if(str.charAt(i)=='-'){
					
				}
				else{
				char ch = str.charAt(i);
				 int  c= (char) (ch-48);
				System.out.println(c);
				n= c+(n*10);
				}	
			}
		}
		
		System.out.println(n);
		
	}
    
}