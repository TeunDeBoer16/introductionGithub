import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.lang.Exception;

public class Test {

  public static void main(String[] args) {
	SimpleDateFormat parser = new SimpleDateFormat("yyyy-MM-d'T'HH:mm:ss");
	Date date = new Date();
    try
    {
      date = parser.parse("2025-07-28T13:21:49");
    }
    catch (Exception e)
    {
      e.printStackTrace();
	  System.out.println("err: "+ e.getMessage());
    } 
    System.out.println("Test 1 2 3 ..." + date.toString());
  }
}
