package files;

public class string_buffer_ex6 {

	public static void main(String[] args) {
		StringBuffer sb =new StringBuffer();
		System.out.println(sb.capacity());
		sb.append("hello");
		System.out.println(sb.capacity());
		sb.append("i love icecreams");
		System.out.println(sb.capacity());

	}

}
