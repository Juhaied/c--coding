package task;

public class Test {

	public static void main(String[] args) {
		Person p1 = new Person("Juhaied","ctg",1840863884,"juhu@gmail");
		
		System.out.println("=======>>>>>>Person<<<<<==========");
System.out.println("Name = "+p1.getName() + " Address = "+p1.getAddress() + " Number = "+p1.getNum() + " email = "+p1.getEmail());
System.out.println();
Person p2 = new Student("Undergrade","juhu","dewanhut",2384,"hossa@");
System.out.println("Name = "+p2.getName() + " Address = "+p2.getAddress() + " Number = "+p2.getNum() + " email = "+p2.getEmail());

System.out.println();


 Employee e = new Employee("10A",20000,"Nabid","ctg",1845036,"Nabid@mail");
 System.out.println(e);

	}

}
