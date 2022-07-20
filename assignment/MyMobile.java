package assignment;

public class MyMobile {
	public void sendMessage() {
		System.out.println("Send Message");
	}
    public void shareDocument() {
    	System.out.println("Share Document");
    }
    public void makeCall() {
    	System.out.println("Make Call");
    }
 public static void main(String[] args) {
	MyMobile mob=new MyMobile();
	mob.sendMessage();
	mob.shareDocument();
	mob.makeCall();
 }
 

}
