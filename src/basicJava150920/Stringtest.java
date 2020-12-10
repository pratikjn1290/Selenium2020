package basicJava150920;

public class Stringtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = new String("5-3+2");
	
		String arr[] = s.split("-+");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		
		Integer num = Integer.parseInt(s);
		System.out.println(num);
		
		
	}

}
