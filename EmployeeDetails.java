package Programs;


public class EmployeeDetails {
//	public void Employeename(String EmployeeName,int EmpID) {
//		System.out.println("EmployeeName: "+EmployeeName+" "  + "EmpID:" + EmpID);
//		}
	public void Employeename(String EmployeeName,int EmpID) {
		System.out.println("EmployeeName: "+EmployeeName+" "  + "EmpID:" + EmpID);
		}
		public void getEmployeeAddress(String empAddress) {
			System.out.println("Employee address:"+empAddress);
		}
		public void printEmployeeSalary(double empSalary) {
			System.out.println("Employee salary:"+empSalary);
		}
		public void printEmployeeMobileNumber(long mobNum) {
			System.out.println("Employee Name:"+mobNum);
		}
		public static void main(String[] args) {
		  EmployeeDetails cal= new EmployeeDetails();
		  cal.Employeename("JAMEEL",800669);
		  cal.getEmployeeAddress("chennai");
		  cal.printEmployeeSalary(35000.000);
		  cal.printEmployeeMobileNumber(987654321L);
		  


	}

}
