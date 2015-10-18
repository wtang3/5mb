import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class KronopesTimeOff {
    String employeeID;
    File EMP_TIMEOFF_REQUEST=new File("DATA\\"+employeeID+"timeOff.csv");
    File ALLREQUEST_FILE = new File("DATA\\allRequest.csv");
 
    Date today = new Date();
    void newTimeOffRequest(String employeeID, Date startDate, Date endDate, String payType,String reason) throws FileNotFoundException, IOException{
       if(!ALLREQUEST_FILE.exists()){
           ALLREQUEST_FILE.createNewFile();
       }
        if(EMP_TIMEOFF_REQUEST.exists()){
                FileWriter fw = new FileWriter(EMP_TIMEOFF_REQUEST,true);
                fw.append(employeeID);
                fw.append(",");
                fw.append(startDate.toString());
                fw.append(",");
                fw.append(endDate.toString());
                fw.append(",");
                fw.append(payType);
                fw.append(",");
                fw.append(reason);
                fw.append(",");
                fw.append("Pending");
                fw.append("\n");
                fw.flush();
                fw.close();
                FileWriter mfw = new FileWriter(ALLREQUEST_FILE,true);
                mfw.append(employeeID);
                mfw.append(",");
                mfw.append(startDate.toString());
                mfw.append(",");
                mfw.append(endDate.toString());
                mfw.append(",");
                mfw.append(payType);
                mfw.append(",");
                mfw.append(reason);
                mfw.append(",");
                mfw.append("Pending");
                mfw.append("\n");
                mfw.flush();
                mfw.close();
                
        }
        else{
            EMP_TIMEOFF_REQUEST.createNewFile();
               FileWriter fw = new FileWriter(EMP_TIMEOFF_REQUEST,true);
                fw.append(employeeID);
                fw.append(",");
                fw.append(startDate.toString());
                fw.append(",");
                fw.append(endDate.toString());
                fw.append(",");
                fw.append(payType);
                fw.append(",");
                fw.append(reason);
                fw.append(",");
                fw.append("Pending");
                fw.append("\n");
                fw.flush();
                fw.close();
                FileWriter mfw = new FileWriter(ALLREQUEST_FILE,true);
                mfw.append(employeeID);
                mfw.append(",");
                mfw.append(startDate.toString());
                mfw.append(",");
                mfw.append(endDate.toString());
                mfw.append(",");
                mfw.append(payType);
                mfw.append(",");
                mfw.append(reason);
                mfw.append(",");
                mfw.append("Pending");
                mfw.append("\n");
                mfw.flush();
                mfw.close();
        }
        JOptionPane.showMessageDialog(null,"Your request has been submitted");
    }
    DefaultTableModel pendingTimeOffRequest(String employeeID,JTable pendingTable) throws IOException{
        DefaultTableModel model = (DefaultTableModel) pendingTable.getModel();
        try{
  
        String[] dColArray = {"Start Date","End Date","Type","Status"};        
        Vector<String> dColNames = new Vector<>(Arrays.asList(dColArray));
        Vector<Vector<String>> dDataVector = new Vector<Vector<String>>();
        Vector<String> dRowVector = new Vector<String>();
        Scanner scannerd = new Scanner(EMP_TIMEOFF_REQUEST);
        int count = 0;
        
                 while (scannerd.hasNextLine()) {
                String line = scannerd.nextLine();

                String[] dsplit = line.split(",");
                dRowVector.add(dsplit[1]);
                dRowVector.add(dsplit[2]);
                dRowVector.add(dsplit[3]);
                dRowVector.add(dsplit[4]);
                
                count++;

                dDataVector.add(dRowVector);
                dRowVector = new Vector<String>();
            }
                 
                
            model = new DefaultTableModel(dDataVector, dColNames);
            pendingTable.setModel(model);
             } catch (FileNotFoundException ex) {
                 
             EMP_TIMEOFF_REQUEST.createNewFile();
        }
             return model;
        
    }
    void validateStartDate(Date startDate){
        if(startDate.before(today)){
            JOptionPane.showMessageDialog(null, "Invalid Start Date: Start Date can't happen in the past");
        }
    }
    void validateEndDate(Date startDate, Date endDate){
        if(endDate.before(startDate)){
            JOptionPane.showMessageDialog(null, "Invalid End Date: End Date can't happen before Start Date");
        }
    }
}
