import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class ScheduleBuilder
{
  private Lecture[] classes;
  public ScheduleBuilder()
  {
    
  }
  public void generateSchedules()
  {
    
  }
  public void addLectures(File file)
  {
    Lecture temp = new Lecture(file);
    }
  }
  public static void main(String[] args)
  {
    ScheduleBuilder schedule = new ScheduleBuilder();
    
    try
    {
      File file = new File("times.txt");
    }
    catch (FileNotFoundException e)
    {
      System.out.println("An error occured.");
      e.printStackTrace();
    }
    schedule.addLectures(file)
    
  }
}
