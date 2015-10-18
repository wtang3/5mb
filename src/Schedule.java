import java.io.File;
import java.io.FileNotFoundException;
import java.util.Calendar;
import java.util.Scanner;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

class Schedule {
    
    
    String day;
    String getDay() {
        Calendar calendar = Calendar.getInstance();
        int dayInt = calendar.get(Calendar.DAY_OF_WEEK); 
        
        
        
        switch(dayInt){
            case 1:
                day="Sunday";
                break;
            case 2:
                day="Monday";
                break;
            case 3:
                day="Tuesday";
                break;
            case 4:
                day="Wednesday";
                break;
            case 5:
                day="Thursday";
                break;
            case 6:
                day="Friday";
                break;
            default:
                day="Saturday";
                break;
          
        }
        return day; 
           }
//find the scheduled employees
    protected Vector<String> getScheduledList() {
        getDay();
        Vector<String> sRowVector = new Vector<String>();
        String[] todayScheduled=null;
        int count=0;
        try {
            Scanner sc = new Scanner(new File("availability.csv"));
            while(sc.hasNextLine()){
            String line = sc.nextLine();
             if(line.contains(day)==true){
                todayScheduled = line.split(",");
                sRowVector.add(todayScheduled[0]);
                sRowVector.add(todayScheduled[1]);
                sRowVector.add(todayScheduled[3]+"-"+todayScheduled[4]);
                count++;
            }
  
            }
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error Availability File Not Found");
        }
        
        return sRowVector;
    }
    
}
