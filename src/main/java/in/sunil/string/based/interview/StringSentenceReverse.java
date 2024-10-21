package in.sunil.string.based.interview;
//Input : This is a test sentence 
//output This is a test ecnetnes

public class StringSentenceReverse {
	public static void main(String[] args) {
		
		String[] s="This is a test sentence".split(" ");
		String rev="";
		StringBuilder sb=null;
		for(int i=s.length-1;i>=0;i--) {
			if(s[i].equalsIgnoreCase("sentence")) {
				sb=new StringBuilder("sentence").reverse();
				rev=sb+rev +" ";
			}else {
				rev =s[i]+" "+rev;
			}
		}
		System.out.println(rev);
	}
}
