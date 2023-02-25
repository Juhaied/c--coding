package task;

public abstract class Employee {
	 private int SSN;
	    public int  PartTime=2;
	    public int  FillTime=1;
	    public int salary;

	    public int getSSN(){
	        return SSN;
	    }
	    public void setSSN(int SSN){
	        this.SSN=SSN;
	    }
	    private void printSSN(){
	        System.out.println(SSN);
	    }
	    int getNumberofEmployees(){
	        return 0;
	    }
	    abstract void setSalary(int jobtype);
}
