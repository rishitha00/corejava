package oopsdemo;

public class BookTest {

	public static void main(String[] args) {
		Book b1 = new Book();
		b1.setBookId(101);
		b1.setBookName("Programming in Java");
		b1.setPrice(500);
		b1.setPublisher("Rishi Publisher");
		
		System.out.println("******** Book details ******");
		b1.display();
		System.out.println(b1.getBookId()+" "+b1.getBookName()+" "+b1.getPrice()+" "+b1.getPublisher());
		System.out.println("Discount Price :"+ b1.discountPrice());

	}

}
