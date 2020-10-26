import java.util.List;


public class EmployeeService {
	
	public void payhike(List<Employee> a,double raise,Selectable s){
		
		for(Employee emp1: a){
			if(s.selected(emp1)){
				emp1.setBasic(emp1.getBasic()+raise);
				
			}
			
		}
	}

}
