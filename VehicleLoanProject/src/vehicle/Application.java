package vehicle;

import java.util.Scanner;

public class Application{
	//static int id=100;
	private int applicationId;
	private String name;
	private int age;
	private String gender;
	private int yearlySalary;
	private int existingEMIs;
	public void setApplicationId() {
	  double x = (Math.random()*10000000);
	  this.applicationId = (int)x;
	
    }
    public int getApplicationId() {
	return applicationId;
    }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getYearlySalary() {
		return yearlySalary;
	}
	public void setYearlySalary(int yearlySalary) {
		this.yearlySalary = yearlySalary;
	}
	public int getExistingEMIs() {
		return existingEMIs;
	}
	public void setExistingEMIs(int existingEMI) {
		this.existingEMIs = existingEMI;
	}
	@Override
	public String toString() {
		return "Application [name=" + name + ", applicationId=" + applicationId +", age=" + age + ", gender=" + gender + ", yearlySalary=" + yearlySalary
				+ ", existingEMIs=" + existingEMIs + "]";
	}
	
	public Loan applyForLoan(Application application) {

		Loan obj=new Loan();
		obj.setName(application.getName());	
		obj.setAge(application.getAge());
		obj.setSalary(application.getYearlySalary());
		obj.setApplicationId(application.getApplicationId());
		
		//obj.setPrincipalAmount(price, downPayment);
		System.out.println(obj);
		return obj;
	}
	
}