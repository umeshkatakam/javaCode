package Threading;

class A extends Thread{

	 public  void run() {
		 synchronized(this) {
			 
		 
		 
		 
		 for(int i=0;i<5;i++) {
	System.out.println("AAA");
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	};
    		 	}
	 }
	 }
	 public  void show() {
		 for(int i=0;i<5;i++) {
	System.out.println("In start method");
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    		 	}
	 }
	 
	String name() {
		System.out.println("umesh");
		return "umesh";
	}
}
class B implements Runnable{

	 public synchronized void run() {
		 for(int i=0;i<5;i++) {
	System.out.println("BBB");
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   		 	}
	 }
	
}
public class MultiThread {
	public static void main(String args[]) {
		A a=new A();
		B b =new B();
		//a.name();
		a.start();
		Thread t=new Thread(b);
		//b.start();
		t.start();
		a.show();
		
		 
	
}
}