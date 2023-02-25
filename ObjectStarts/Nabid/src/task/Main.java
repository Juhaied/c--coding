package task;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	        Employee f1 = new Employee() {
	            @Override
	            void setSalary(int jobtype) {
	                if (jobtype==FillTime){
	                    salary=40000;
	                }
	            }
	        };
	        Employee p1 = new Employee() {
	            @Override
	            void setSalary(int jobtype) {
	                if (jobtype==PartTime){
	                    salary=20000;
	                }
	            }
	        };

	        Employee p2 = new Employee() {
	            @Override
	            void setSalary(int jobtype) {
	                if (jobtype==PartTime){
	                    salary=20000;
	                }
	            }
	        };
	        p1.setSSN(123);
	        p2.setSSN(124);
	        f1.setSSN(125);

	}
	}


