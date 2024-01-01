import java.util.Scanner;
class Books{
	private String name;
	private String author;
	private int price;
	private int num_pages;
	
	public Books(String name,String author,int price,int num_pages){
		this.name=name;
		this.author=author;
		this.price=price;
		this.num_pages=num_pages;
	}
	public String toString(){
		String name,author,price,num_pages;
		name="Book name:"+this.name+"\n";
		author="Author name:"+this.author+"\n";
		price="Price:"+this.price+"\n";
		num_pages="Number of pages:"+this.num_pages+"\n";
		return name+author+price+num_pages;
	}
}
class BookMain{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int n;
		System.out.println("Enter the number of books: ");
		n=s.nextInt();
		Books b[]=new Books[n];
		for(int i=0;i<n;i++){
			System.out.println("Enter details for book "+(i+1)+":");
			System.out.print("Name: ");
			String name1=s.next();
			System.out.print("Author: ");
			String author=s.next();
			System.out.print("Price: ");
			int price=s.nextInt();
			System.out.print("Number of pages: ");
			int num_pages=s.nextInt();
			b[i]=new Books(name1,author,price,num_pages);
		}
		System.out.println("\nDetails of the Books:");
		for(int i=0;i<n;i++){
			System.out.println("\nBook "+(i+1)+":\n"+b[i]);
		}
		s.close();
	}
}