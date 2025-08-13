package Finalkeyword;
public class Final_keyworddemo {
	private final int rollnumber;
	public Final_keyworddemo(int rollnumber) {
		this.rollnumber=rollnumber;
	}
	public final void displayrollnumber() {
		System.out.println("Roll number: "+rollnumber);
	}
	public static void main(String args[]) {
		Final_keyworddemo obj = new Final_keyworddemo(30202);
		obj.displayrollnumber();
		final StringBuilder sb = new StringBuilder("Hello, ");
		sb.append("Word");
		System.out.print(sb);
	}
}