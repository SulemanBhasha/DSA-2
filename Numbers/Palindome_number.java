/**
 * Palindome_number
 */
public class Palindome_number {

    public static void main(String[] args) {
        int x= -121;
        int y=x;
        int pal=0;
        if(y<0){
            System.out.println("false");
            return ;
        }
        while(y!=0){
            int rem = y%10;
            pal =pal*10 +rem;
            y/=10;
            
        }
        if(x==pal){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
}