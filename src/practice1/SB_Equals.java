package practice1;

public class SB_Equals {

	public static void main(String[] args) {
		
		StringBuffer sb1 = new StringBuffer("Iam not good boy");
		StringBuffer sb2 = new StringBuffer("Iam not good boy");
		
		System.out.println(sb1==sb2);
		System.out.println(sb1.equals(sb2));

	}

}
