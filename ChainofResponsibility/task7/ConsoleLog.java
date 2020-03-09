package task7;

public class ConsoleLog extends AbstractLogger{
	public ConsoleLog(int level){
	      this.level = level;
	   }
	   protected void write(String message) {		
	      System.out.println("Standard Console::Logger: " + message);
	   }
}
