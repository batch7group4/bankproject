
public class Threadcall {

	public static void main(String[] args) {
		Numberseries obj1=new Numberseries(10);
		Numberseries obj2=new Numberseries(5);
		
		Thread t1=new Thread(obj1, "thread1");
		Thread t2=new Thread(obj2, "thread2");
		
		t1.start();
		try {
			t1.sleep(500);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		t2.start();
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("hiiiii");
		
	}

}
