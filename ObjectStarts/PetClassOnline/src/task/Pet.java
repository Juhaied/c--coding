package task;

public class Pet {

	private String name;
	private String animal;
	private int age;
	
	public Pet() {
		this.name = name;
		this.animal = animal;
		this.age = age;
	}
	public Pet(String name) {
		this.name = name;
	}
	public Pet(String animal,String name,int age) {
		this.animal = animal;
		this.name = name;
		
		this.age = age;
	}
	public Pet(int age) {
		this.age = age;
	}
	public  void setName(String name) {
		this.name = name;
	}
	public  void setAnimal(String animal) {
		this.animal =animal;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public String getAnimal() {
		return animal;
	}
	public int getAge() {
		return age;
	}
	public String toString() {
		return "Pet[Name = "+name +" Animal = "+animal + " Age = "+age +"]"; 
	}
	
}
