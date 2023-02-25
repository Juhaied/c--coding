package task;

public class Minizoo {
	private Animal[] animals;

	public Minizoo(Animal[] animals) {
		this.animals = animals;
	}
	public void putThemonSleep() {
		for(Animal animal : animals) {
			animal.sleep();
		}
	}
}
