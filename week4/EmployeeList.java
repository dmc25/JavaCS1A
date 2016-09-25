package week4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class EmployeeList {

	ArrayList<Employee> employeeList = new ArrayList<Employee>();
	
	EmployeeList(String file) throws IOException{
					
		FileReader fr = new FileReader(file);
		
		BufferedReader br = new BufferedReader(fr);
		
		String currentLine;
		
		String header = br.readLine();
		
		while((currentLine = br.readLine()) != null){
			String[] line = currentLine.split(","); 
			Employee e = new Employee();
			
			e.setEmployeeName(line[0]);
			e.setEID(line[1]);
			e.setAddress(line[2] + line[3] + line[4]);
			e.setPhoneNumber(line[5]);
			e.setDOB(line[6]);
			e.setSecurityClearance(line[7]);
						
			employeeList.add(e);
		}
				
		System.out.println();
	
	}
	public int size(){
		 
		return employeeList.size();
	}
	
	public void sortByID(){
		
		Collections.sort(employeeList,Employee.eidComparator);
	}	
	
	public void sortByName(){
		Collections.sort(employeeList, Employee.nameComparator);
	}
	
	public void sortByNameandEID(){
		Collections.sort(employeeList, Employee.nameandeidComparator);
	}
	
	public void add(Employee e){
		if(!employeeList.contains(e)){
			employeeList.add(e);
		}
		else{
			System.out.println("This employee already exist. ");
		}
	}
	
	public void remove(Employee e){
		if(employeeList.contains(e)){
			employeeList.remove(e);
		}
		else{
			System.out.print("This employee does not exist. ");
		}
	}
	
	public void display(){
		for(int i = 0; i < employeeList.size(); i++){
			Employee e = employeeList.get(i);
			System.out.println(e.display());
		}
		
	}
	
	public Employee search(Employee e){
		
		for(Employee em1: employeeList){
			if(em1.getEID().equalsIgnoreCase(e.getEID())){
				return em1;
			}	
		}
		
		return null;
	}
	
	public boolean updateAddr(Employee e, String addr){
		
		Employee found = search(e);
		if(found != null){
			e.setAddress(addr);
			return true;
		}
		return false;
	}
}
