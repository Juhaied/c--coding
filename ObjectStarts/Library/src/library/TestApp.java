package library;

public class TestApp {

	public static void main(String[] args) {
		Author a1 = new Author("Juhaied hossen","hossainjuh@gmai.com","Male");
		System.out.println("Author name : "+a1.getName());
		System.out.println("Author email : "+a1.getEmail());
		System.out.println("Author gender : "+a1.getGender());

		System.out.println();
		
		Book b1 = new Book("Programing language","Tamim shahriar",700,125);
		System.out.println(b1.getName());
	System.out.println(b1.getAuthor());
	System.out.println(b1.getBooks());
	System.out.println(b1.getPrice());
	}

}
