package week1.day2;

public class Mobile {
	
	public void makeCall() {
		System.out.println("Make Call");
	}
		
	public void sendMsg() {
		System.out.println("Send Message");	
			
	}
	
	public static void main(String[] args) {
		
		Mobile obj=new Mobile();
		
		obj.makeCall();
		obj.sendMsg();
	}
	
	
}
