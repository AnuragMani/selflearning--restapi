package com.selflearning.selflearning.restapi;

public class Employee {
	
	private Integer empId;
	private String  employeeName;
	private Integer ManagerId;
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public Integer getManagerId() {
		return ManagerId;
	}
	public void setManagerId(Integer managerId) {
		ManagerId = managerId;
	}
	public Employee(Integer empId, String employeeName, Integer managerId) {
		super();
		this.empId = empId;
		this.employeeName = employeeName;
		ManagerId = managerId;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", employeeName=" + employeeName + ", ManagerId=" + ManagerId + "]";
	}
	
	

}
