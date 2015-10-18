import java.awt.Color;
import java.io.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


class RMSToDoList {
    DefaultTableModel model= new DefaultTableModel();
    String LIST_FILE = "src\\data\\ToDoList.csv";
    
    public RMSToDoList() {
        
    }
    public DefaultTableModel viewTodoList(){
        String[]COLUMN={"To Do","Date","Urgency"}; 
       Vector<String> colNames = new Vector<>(Arrays.asList(COLUMN));
       Vector<Vector<Object>> dataVector = new Vector<Vector<Object>>();
       Vector<Object> rowVector = new Vector<Object>();
        try {
            Scanner sc = new Scanner(new File(LIST_FILE));
            while(sc.hasNext()){
                String line = sc.nextLine();
                String[] split = line.split(",");
                rowVector.add(split[0]);
                rowVector.add(split[1]);
                rowVector.add(split[2]);
            
            dataVector.add(rowVector);
                rowVector = new Vector<Object>();
        }  
              
            
           
            model = new DefaultTableModel(dataVector, colNames);
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Error To Do List "+LIST_FILE+" not found: line 24");
        }
     
        
        return model;   
    }
    protected void addToList(String title,String date, String urgent,JTable toDoTable){
        Object title1 = title;
        Object date1 = date;
        Object urgent1 = urgent;
        
        try { 
            FileWriter writer = new FileWriter(LIST_FILE,true);
            writer.append(title);
            writer.append(",");
            writer.append(date);
            writer.append(",");
            writer.append(urgent);
            writer.append("\n");
            writer.flush();
            writer.close();
            
            int i=0;
            DefaultTableModel model1 = new DefaultTableModel();
            model1=(DefaultTableModel) toDoTable.getModel();
            model.addRow(new Object[]{title1,date,urgent});
            
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,"Error cant open "+LIST_FILE+"To Do List Line 51");
        }
        
        
    }
    protected void deleteFromList(){
        
    }
    protected boolean toDoValidate(String title,JTextField titleToDoText,JLabel toDoLabel){
        boolean flag;
        
        if(title.isEmpty()==true){
           titleToDoText.setBorder(BorderFactory.createMatteBorder(2,2,2,2,Color.red));
           toDoLabel.setText("To Do - Field can not be blank");
           toDoLabel.setForeground(Color.red);  
           flag = false;
        }
        else{
           toDoLabel.setText("To Do");
           toDoLabel.setForeground(Color.green.darker());   
           titleToDoText.setBorder(BorderFactory.createMatteBorder(2,2,2,2,Color.green.darker())); 
           flag =true;
        }
        return flag;
    }
    protected boolean toDoDateValidate(String date, JTextField dateToDoText, JLabel dueDateLabel){
        String datePattern ="\\d{2}-\\d{2}-\\d{4}";
        boolean flag = false;
            if(date.isEmpty()==true){
           dateToDoText.setBorder(BorderFactory.createMatteBorder(2,2,2,2,Color.red));
           dueDateLabel.setText("Due Date - Field can not be blank");
           dueDateLabel.setForeground(Color.red);  
           flag = false;
            
        }
        if(date.isEmpty()!=true){
            if(date.matches(datePattern)){
                
                String[] split =date.split("-");
                int month=Integer.parseInt(split[0]);
                int day=Integer.parseInt(split[1]);
                int year=Integer.parseInt(split[2]);
                
                if((month>=0&&month<=12)&&(day>0&&day<32)&&(year>=2013)){
                      dateToDoText.setBorder(BorderFactory.createMatteBorder(2,2,2,2,Color.green.darker()));
                      dueDateLabel.setText("Due Date");
                      dueDateLabel.setForeground(Color.green.darker());
                      flag = true;
                    
                }
                else{
                   
                    dueDateLabel.setText("Date - Invalid Date");
                    dateToDoText.setBorder(BorderFactory.createMatteBorder(2,2,2,2,Color.red));
                    dateToDoText.setText("");
                    dueDateLabel.setForeground(Color.red);  
                    flag = false;
                }
              
}
            else{
                    
                    dueDateLabel.setText("Date - Invalid Date");
                    dateToDoText.setBorder(BorderFactory.createMatteBorder(2,2,2,2,Color.red));
                    dateToDoText.setText("");
                    dueDateLabel.setForeground(Color.red);  
                flag = false;
            }
        }
        return flag;
    }

 
}