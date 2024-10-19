package in.sunil.string.based.interview;

public class StringImmutabilitychecking {
	public static void main(String[] args) {
		String s="Hello";
		s.concat("World");
		System.out.println(s);//Hello
		s=s.concat("World");
		System.out.println(s);//Hello World
		String s1=s, s2=s, s3=s;
		System.out.println(s1+","+s2+","+s3);
		s=s.concat("test");
		s=s.concat("comong");
		System.out.println(s1+","+s2+","+s3);
	}
}
