package week4;

import java.util.Comparator;

public class Employee {

	Employee(){
		this.employeeName 	= "";
		this.EID 			= "";
		this.address 		= "";
		this.phoneNumber	= "";
		this.DOB 			= "";
		this.securityClearance = "";
	}
	
	Employee(String EN, String ID, String addr, String PN, String date, String SC){
		this.employeeName = EN;
		this.EID = ID;
		this.address = addr;
		this.phoneNumber = PN;
		this.DOB = date;
		this.securityClearance = SC;
	}
	
	public void setEmployeeName(String EN) {employeeName = EN;}
	public String getEmployeeName(){return employeeName;}
	
	public void setEID(String ID) {EID = ID;}
	public String getEID(){return EID;} 
	
	public void setAddress(String addr) {address = addr;}
	public String getAddress(){return address;}
	
	public void setDOB(String date) {DOB = date;}
	public String getDOB(){return DOB;}
	
	public void setPhoneNumber(String PN){phoneNumber = PN;}
	public String getPhoneNumber(){return phoneNumber;}
	
	public void setSecurityClearance(String SC) {securityClearance = SC;}
	public String getSecurityClearance(){return securityClearance;}
	
	public String display(){
		
		 String s1 = getEmployeeName() + " " + getEID() + " " + getAddress() + " " + getPhoneNumber()
		+ " " +  getDOB() + " " + getSecurityClearance();
				
		return s1;
	}
	
	public static Comparator<Employee> eidComparator = new Comparator<Employee>(){
		
	public int compare(Employee e1, Employee e2){
		String eid1 = e1.getEID();
		String eid2 = e2.getEID();
		
		return eid1.compareTo(eid2);
	}};
	
	public static Comparator<Employee> nameComparator = new Comparator<Employee>(){
		
	public int compare(Employee e1, Employee e2){
		String en1 = e1.getEmployeeName();
		String en2 = e2.getEmployeeName();
		
		return en1.compareTo(en2);
	}};
	
	public static Comparator<Employee> nameandeidComparator = new Comparator<Employee>(){
	public int compare(Employee e1, Employee e2){
		
		int eidDiff = e1.getEID().compareTo(e2.getEID());
		if(eidDiff != 0)
			return eidDiff;
		return e1.getEmployeeName().compareToIgnoreCase(e2.getEmployeeName());		
	} };
	
	public String toString() {
	   return employeeName  +" " + EID + " " + address + " " + phoneNumber + " " + DOB + " " 
	        		+ securityClearance;
	 }
		
	private String employeeName, address, 
					phoneNumber, DOB, securityClearance, EID;
	
	
	
}
