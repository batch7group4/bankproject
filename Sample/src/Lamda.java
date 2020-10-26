import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;


public class Lamda {

	public static void main(String[] args) {
		EmployeeService er=new EmployeeService();
		
		List<Employee> lt= Arrays.asList(new Employee[] {
				new Employee(1,"vinay",50000.0,"tl"),
				new Employee(2,"srinivas",10000.0,"tl"),
				new Employee(3,"raju",50000.0,"pm"),
				
				
				
				
		});
	
	
	for(Employee emp : lt){
		System.out.println(emp);
	}
	
	System.out.println("--------------------------------------------------------");
	
	er.payhike(lt, 1000, (e) -> e.getDesignation().equals("tl"));
	
	for(Employee emp : lt){
		System.out.println(emp);
	}
}}
