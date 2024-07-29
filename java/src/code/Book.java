package code;
import java.util.Scanner;

class Book
{
String title ;
String author;
double price;

public Book(String title, String author , double price)
{
	this.title=title;
	this.author = author;
	this.price= price;
}
  public void displayDetails()
  {
  System.out.println("Name of the book is : " + title);
  System.out.println("Author of the book is : " +  author);
  System.out.println("Price of the book is : " +  price);
}
public static void main(String[]args)
{
	Scanner s = new Scanner(System.in);
	System.out.print("enter the name of the book");
	String title = s.nextLine();
	
	System.out.print("enter the name of the author");
	String author = s.nextLine();
	
	System.out.print("enter the price of the book");
	double price = s.nextDouble();
	
	System.out.println("*****************************");
	
	Book b= new Book(title,author, price);
			b.displayDetails();
	 
			s.close();
}
}
