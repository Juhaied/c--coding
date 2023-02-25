package task;

public class PetTest {

	public static void main(String[] args) {
		Pet p1 = new Pet();
		p1.setName("Tuni");
		p1.setAnimal("Tiger");
		p1.setAge(8);
		
		System.out.println(p1);
		
	Pet p2 = new Pet("mini" ,"Cat",9);
		System.out.println(p2);

	}

}
