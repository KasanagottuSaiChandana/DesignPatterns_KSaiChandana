package task7;

public class ErrorLog extends AbstractLogger{
	public ErrorLog(int level){
	      this.level = level;
	   }
	   protected void write(String message) {		
	      System.out.println("Error Console::Logger: " + message);
	   }
}
