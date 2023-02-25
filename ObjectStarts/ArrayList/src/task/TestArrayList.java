package task;

import java.util.ArrayList;

public class TestArrayList {

	public static void main(String[] args) {
		ArrayList<String> cityList = new ArrayList<>();
		
		cityList.add("London");
		
		cityList.add("Denver");
		
		cityList.add("Paris");
		cityList.add("Miami");
		cityList.add("Seoul");
		
		cityList.add("Tokyo");
		System.out.println(cityList);

		System.out.println("List size = "+cityList.size());
		System.out.println();
		System.out.println("is dhaka found is the list ? "+cityList.contains("dhaka"));

		System.out.println("is london found in the list? "+cityList.contains("London"));
		
		System.out.println();
		System.out.println("the location of Tokyo in the list "+cityList.indexOf("Tokyo"));
		System.out.println("is the list is empty "+cityList.isEmpty());
		
		cityList.add(2, "Xian");
		System.out.println(cityList);
		
		cityList.remove("Paris");
		System.out.println(cityList);
		cityList.remove(1);
		System.out.println(cityList);
		
		///displaying the list in reverse order
		System.out.println("------Reverse Order---------");
		for(int i = cityList.size()-1;i>=0;i--) {
			System.out.println(cityList.get(i)+" ");
			
		}
		///displaying the elements in the normal order
		System.out.println("------Normal order---------");
		for(int i = 0;i<cityList.size();i++) {
			System.out.println(cityList.get(i));
		}
		


			}

}
