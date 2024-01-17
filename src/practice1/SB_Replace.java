package practice1;

public class SB_Replace {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("Banglore");
		sb.replace(0, 8, "Hyderabad");
		System.out.println(sb);

	}

}
