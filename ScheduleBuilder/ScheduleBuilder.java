import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
public class ScheduleBuilder
{
  private ArrayList<Lecture> classes;
  private ArrayList<ArrayList<int>> takenTimes;
  private Map<int, Lecture> dict;
  
  public ScheduleBuilder()
  {
    dict = new HashMap<int, Lecture>();
    takenTimes = new ArrayList<ArrayList<Integer>>();
    classes = new ArrayList<Lecture>();
  }
  public void generateSchedules()
  {
    for(int i = 0; i < classes.size();i++){
      ArrayList<ArrayList<
      
  }
  public void addLectures(File file)
  {
    Lecture temp = new Lecture(file);
    }
  }
  public printTimes
  public static void main(String[] args)
  {
    ScheduleBuilder schedule = new ScheduleBuilder();
    String[] fileNames = ["Phys.txt"];
    for(int = 0; i < fileNames.length; i++){
      
      try
      {
        File file = new File("times.txt");
      }
      catch (FileNotFoundException e)
      {
        System.out.println("An error occured.");
        e.printStackTrace();
      }
      schedule.addLectures(file);
    }
      
    
  }
}
