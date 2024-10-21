package in.sunil.string.based.interview;

public class RemDupStCaseSensitive{

	public static void main(String[] args) {
		String ss="aabbbcca";
		
		String string3 = ss.chars().distinct().collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
		System.out.println(string3+" --string23");
	}
}
               