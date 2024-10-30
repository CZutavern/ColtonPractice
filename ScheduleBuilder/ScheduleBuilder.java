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
    Scanner in = new Scanner(file);
    while (in.hasNextLine())
    {
      String data = in.nextLine();
      
      Lecture temp = new Lecture(in);
      classes.append(temp);
    }
  }
  public static void main(String[] args)
  {
    ScheduleBuilder schedule = new ScheduleBuilder();
    try
    {
      File file = new File("times.txt");
    }
    schedule.addLectures(file)
    
  }
}
