package task7;

public class ProxyPattern {
	public static void main(String[] args) {
	      Image image = new ProxyImage("abc.png");

	   
	      image.display(); 
	      System.out.println("Successful :)");
	      
	      image.display(); 	
	   }
}
