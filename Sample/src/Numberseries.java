import java.util.Random;


public class Numberseries implements Runnable {
	
	private int maxelements ;
	
	private int count;

	public Numberseries(int maxelements) {
		super();
		this.maxelements = maxelements;
		this.count=0;
	}
	
	
	
	public void Docount(){
		String sname=Thread.currentThread().getName();
		
		Random r=new Random();
		
		while(count<maxelements){
			System.out.println(sname +"-----"+r.nextInt(10));			
			count++;
			
		}
		
	}

	@Override
	public void run() {
		Docount();
		
	}
	
	
	
	
	

}
