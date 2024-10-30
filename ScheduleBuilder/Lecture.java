import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
public class Lecture
{
  private ArrayList<ArrayList<Integer>> times;
  //private int length;
  private ArrayList<ArrayList<Integer>> times2;
  //private int length2;
  private boolean hasTwoTimes;
  private String name;
  //private int credits;
  private boolean isRequired;
  
  public Lecture()
  {
    times = [0];
    //length = 0;
    times2 = [0];
    //length2 = 0;
    hasTwoTimes = false;
    name = "";
    //credits = 0;
  }
  public Lecture(File file)
  {
    
    Scanner in = new Scanner(file);
    String data = in.nextLine();
    name = data;
    data = in.nextLine();
    ArrayList<String> temptime = data.split(", ");
    ArrayList<String> timess
    for(int i = 0; i < temptime.length; i++)
    {
      timess.add(temptime[i].split("-"));
      for(int j = 0; j < timess.length;j++) {
        times.add(Integer.parseInt(timess.get(i)));
      }
    }
    data = in.nextLine()
    if(data.substring(0,2).equals("-1"))
    {
      hasTwoTimes = false;
    }
    else
    {
      hasTwoTimes = true;
      ArrayList<String> temptime = in.split(", ");
      ArrayList<String> times2s;
      for(int i = 0; i < temptime.length; i++)
      {
        times2s.add(temptime[i].split("-"));
        for(int j = 0; j < times2s.length;j++) {
          times2.add(Integer.parseInt(times2.get(i)));
        }
      }
    }
    data = in.nextLine()
    if(data.equals("true")
    {
      isRequired = true;
    }
    else
    {
      isRequired = false;
    }
  }
  public ArrayList<ArrayList<ArrayList<Integer>>> getTimes()
  {
    ArrayList<ArrayList<ArrayList<Integer>>> temp;
    temp.add(times);
    if(hasTwoTimes)
    {
      temp.add(times2);
    }
    return temp
}
