import java.util.ArrayList;
import java.util.List;


public class List1 {

	public static void main(String[] args) {
		List<Employee> obj=new ArrayList();
		
		for(Employee emps : obj ){
			System.out.println(emps.getFullName());
		}
	}

}
