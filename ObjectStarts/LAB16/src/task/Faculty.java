package task;

public class Faculty extends Employee implements TaxCalculator{

	private String initial;
	private int monthSalary;
	private int yearlyBonus;
	
	public Faculty(int id,String name,int age,String initial,int monthSalary,int yearlyBonus) {
		super(id,name,age);
		this.initial = initial;
		this.monthSalary = monthSalary;
		this.yearlyBonus = yearlyBonus;
	}
	public void setInitial(String initial) {
		this.initial = initial;
	}
	public void setmonthSalary(int monthSalary) {
		this.monthSalary = monthSalary;
	}
	public void setyearlyBonus(int yearlyBonus) {
		this.monthSalary = monthSalary;
	}
	
	public double yearlyIncomeTax() {
		return yearlyBonus + (monthSalary * 12);
	}
	public double yearlyIncomeWithoutTax() {
		double yearlyIncome = yearlyBonus + (monthSalary * 12);
		double yearlyIncomeTax = yearlyIncome * TAX_PERCENT /100;
		return yearlyIncome -yearlyIncomeTax;
	}
	public  int yearlySalary() {
		return  monthSalary * 12;
	}
	public  int yearlyIncome() {
		return yearlyBonus + (monthSalary * 12);
	}
	public String toString(){
		return "Faculty [ Name = "+getName() + "Id  = "+getId() + " Age = "+getAge() + " Initial = "+initial + " MSalary = "+monthSalary + " YearlyBonus = "+ yearlyBonus + "]";
	}
	
}
