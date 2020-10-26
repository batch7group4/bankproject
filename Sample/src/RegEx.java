
public class RegEx {

	public static void main(String[] args) {
		String regExpMob = "[1-9][0-9]{9}";
		
		String str="900009999";
		
		if(str.matches(regExpMob))
		{
			System.out.println("valid");
			
		}
		else
			
			{
				System.out.println("invalid");	
			}
		}

	}

