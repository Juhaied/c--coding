package bmi;

public class TestBMI {

	public static void main(String[] args) {
	BMI n1 =new BMI("nabid",145.0,70);
	System.out.println(n1);
	System.out.println("BMI = "+n1.getBMI());
	System.out.println("Status of : "+n1 + "Bmi = "+n1.getBMI() + " condition = "+n1.getStatus());

	}

}
