import java.util.*;
public class wifi{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.nextLine().toLowerCase().replace(" ","");
		int c=0;
		for(int i=0;i<s.length();i++){
			int r1=s.charAt(i)-96;
			int r2=s.charAt(i)-48;
			if(!(r1<=26 && r1>=1) && !(r2>=0 && r2<=9))
				c++;
			}
		System.out.println(c);
		
}}
