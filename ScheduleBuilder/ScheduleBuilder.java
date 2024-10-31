import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Collections;
import java.util.Comparator;
public class ScheduleBuilder
{
  private ArrayList<Lecture> classes;
  private ArrayList<ArrayList<Integer>> takenTimes;
  private Map<int, Lecture> dict;
  
  public ScheduleBuilder()
  {
    dict = new HashMap<int, Lecture>();
    takenTimes = new ArrayList<ArrayList<Integer>>();
    classes = new ArrayList<Lecture>();
  }
  public void generateSchedules()
  {
    boolean addedClass = false;
    int t = 0;
    ArrayList<ArrayList<ArrayList<Integer>>> itimes = new ArrayList<ArrayList<ArrayList<Integer>>>(classes.get(0).getTimes());
    takenTimes.add(itimes.get(0).get(t));
    if(ctimes.size()==2){
      takenTimes.add(itimes.get(1).get(t));
    }
    for(int i = 1; i < classes.size();i++){
      ArrayList<ArrayList<ArrayList<Integer>>> ctimes = new ArrayList<ArrayList<ArrayList<Integer>>>(classes.get(i).getTimes());
      for(int k = 0; k < ctimes.get(0).size(); k++){
        for(int l = 0; l < takenTimes.size(); l++){
          if(ctimes.size() == 2){
            if((ctimes.get(0).get(k).get(0)<takenTimes.get(i).get(0) || ctimes.get(0).get(k).get(0)>takenTimes.get(i).get(1)) && (ctimes.get(0).get(k).get(1)<takenTimes.get(i).get(0) || ctimes.get(0).get(k).get(1)>takenTimes.get(i).get(1))){
              if((ctimes.get(1).get(k).get(0)<takenTimes.get(i).get(0) || ctimes.get(1).get(k).get(0)>takenTimes.get(i).get(1)) && (ctimes.get(1).get(k).get(1)<takenTimes.get(i).get(0) || ctimes.get(1).get(k).get(1)>takenTimes.get(i).get(1))){
                takenTimes.add(ctimes.get(0));
                takenTimes.add(ctimes.get(1));
                addedClass = true;
                break;
              }
            }
          }
          else{
            if((ctimes.get(0).get(k).get(0)<takenTimes.get(i).get(0) || ctimes.get(0).get(k).get(0)>takenTimes.get(i).get(1)) && (ctimes.get(0).get(k).get(1)<takenTimes.get(i).get(0) || ctimes.get(0).get(k).get(1)>takenTimes.get(i).get(1))){
              takenTimes.add(ctimes.get(0));
              addedClass = true;
              break;
            }
          }
        }
        if(addedClass){
          addedClass = false;
          break;
        }
        else{
          takenTimes = new ArrayList<ArrayList<Integer>>();
          if(t == classes.size()-1){
            return;
          }
          t++;
        }
      }
    }
  }
  public void addLectures(File file)
  {
    Lecture temp = new Lecture(file);
    }
  }
  public void printTimes() {
    Collections.sort(list, new Comparator<ArrayList<Integer>>(){
      @Override
      public int compare(ArrayList<Integer> o1, ArrayList<Integer> o21){
        return o1.get(0).compareTo(o2.get(0));
      } });
    for(int i = 0; i < takenTimes.size(); i++){
      System.out.println(takenTimes.get(i).get(0)+" - "+takenTimes.get(i).get(1));
    }
  }
    
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
    schedule.generateSchedule();
    schedule.printTimes();
    
  }
}
