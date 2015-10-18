
import java.awt.Color;
import java.io.*;
import java.text.*;
import java.util.ArrayList;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;
import javax.swing.UIManager;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public class Kronopes extends JFrame {
  private String theUserLoggedIn=null;
  private String userLoggedin;
  private final String SAMPLEEMPLOYEE ="src\\data\\sampleEmployee.txt";
  private final String SAMPLESCHEDULE ="src\\data\\sampleSchedule.txt";
  private final String KRONOPESNEW ="src\\data\\kronopesTimesheet_new.csv";
  private final String TIME_FILE = "src\\data\\kronopesTimesheet.csv";
  private final String PREVIOUS ="src\\data\\kronopesTimesheet_previousPay.txt";
        private void dTable(){
        try{
        DefaultTableModel dt = (DefaultTableModel) dTable.getModel();
        String[] dColArray = {"Date","Start","End"};        
        Vector<String> dColNames = new Vector<>(Arrays.asList(dColArray));
        Vector<Vector<String>> dDataVector = new Vector<Vector<String>>();
        Vector<String> dRowVector = new Vector<String>();
        Scanner scannerd = new Scanner(new File(SAMPLESCHEDULE));
        int count = 0;
        
        
                 while (scannerd.hasNextLine()) {
                String line = scannerd.nextLine();

                String[] dsplit = line.split(",");
                dRowVector.add(dsplit[0]);
                dRowVector.add(dsplit[1]);
                dRowVector.add(dsplit[2]);
                
                count++;

                dDataVector.add(dRowVector);
                dRowVector = new Vector<String>();
            }
                 
                
            dt = new DefaultTableModel(dDataVector, dColNames);
            dTable.setModel(dt);
             } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "ERROR: File Not Found");
        } catch (Exception ex) {
            
        }
    }
        private void payTable() throws FileNotFoundException{
        int count = 0;
        totalHours=accumulate();
        String[] st = null;
        
        try{
        DefaultTableModel pt = (DefaultTableModel) pTable.getModel();
        Date checkDate = new Date();
        Scanner scannerd = new Scanner(new File(SAMPLEEMPLOYEE));
        
        //Object totHrs = totalHours;
                 while (scannerd.hasNextLine()) {
                String line = scannerd.nextLine();

                st = line.split(",");
                                  
                count++;

            }
              String payCode =st[3];
              String hourly =st[4];
              
              int hrs = Integer.parseInt(hourly);
              double wage = hrs*totalHours;
            pTable.setModel(pt);
            pt.addRow(new Object[]{checkDate.toString(),totalHours,wage});
             } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "ERROR: File Not Found");
        } catch (Exception ex) {
            
        }
            
        
    }
    protected void readTimesheet() throws FileNotFoundException {
           
         try {
            DefaultTableModel tm = (DefaultTableModel) timeTable.getModel();
          
            String[] colArray = {"Date","In","Out","In","Out","Shift"} ;
            

            Vector<String> colNames = new Vector<>(Arrays.asList(colArray));

            Scanner scanner1 = new Scanner(new File(TIME_FILE));
            int count = 0;
            Vector<Vector<String>> dataVector = new Vector<Vector<String>>();
            Vector<String> rowVector = new Vector<String>();
            while (scanner1.hasNextLine()) {
                String line = scanner1.nextLine();

                String[] split = line.split(",");
                rowVector.add(split[0]);
                rowVector.add(split[1]);
                rowVector.add(split[2]);
                rowVector.add(split[3]);
                rowVector.add(split[4]);
                rowVector.add(split[5]);
                

                count++;

                dataVector.add(rowVector);
                rowVector = new Vector<String>();
            }
            tm = new DefaultTableModel(dataVector, colNames);
            
            timeTable.setModel(tm);
            timeTable.setCellSelectionEnabled(true);
                ListSelectionModel cellSelectionModel = timeTable.getSelectionModel();
                    cellSelectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

                    cellSelectionModel.addListSelectionListener(new ListSelectionListener() {
                      public void valueChanged(ListSelectionEvent e) {
                        String selectedData = null;

                        int[] selectedRow = timeTable.getSelectedRows();
                        int[] selectedColumns = timeTable.getSelectedColumns();

                        for (int i = 0; i < selectedRow.length; i++) {
                          for (int j = 0; j < selectedColumns.length; j++) {
                            selectedData = (String) timeTable.getValueAt(selectedRow[i], selectedColumns[j]);
                            
                            
                          }
                        }
                        System.out.println("Selected: " + selectedData);
                      }

               private void validateTime(String selectedData) {
                   
               String[] punch = selectedData.split(":");
               if(selectedData.startsWith("1")){
                     System.out.println("Good time");
               }
               if(selectedData.startsWith("0")){
                   System.out.println("Good time");
               }
               else{
                   System.out.println("bad time");
               }
               }


                });

        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "ERROR: File Not Found");    
        }
           dTable();
           payTable();
   
    }

   
    public Kronopes() throws FileNotFoundException {
        initComponents();
        init(theUserLoggedIn);
         this.setIconImage(new 
        ImageIcon(getClass().getResource("images\\5mbicon1.png")).getImage());
        readTimesheet();

    }
    public Kronopes(String theUserLoggedIn) throws FileNotFoundException{
      userLoggedin = theUserLoggedIn;
       this.setIconImage(new 
    ImageIcon(getClass().getResource("images\\5mbicon1.png")).getImage());
      initComponents();
      init(theUserLoggedIn);
      readTimesheet();
      
    }
    private void init(String theUserLoggedIn){
        userLoggedin = theUserLoggedIn;
        userLoggedInLabel.setText("You're logged in as : " + theUserLoggedIn);
        setTitle("Kronopes TimeKeeper");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1280,700);
        setLocationRelativeTo(null);
        setVisible(true);
        
        
    }
 
    @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    timecardPanel = new javax.swing.JPanel();
    timecardScrollPane = new javax.swing.JScrollPane();
    timeTable = new javax.swing.JTable();
    logoPanel = new javax.swing.JPanel();
    logo = new javax.swing.JLabel();
    backButton = new javax.swing.JButton();
    saveButton = new javax.swing.JButton();
    timePeriodLabel = new javax.swing.JLabel();
    timePeriodCB = new javax.swing.JComboBox();
    timecardLabel = new javax.swing.JLabel();
    accuralApprovalTabbedPane = new javax.swing.JTabbedPane();
    accuralPanel = new javax.swing.JPanel();
    jScrollPane2 = new javax.swing.JScrollPane();
    pTable = new javax.swing.JTable();
    jScrollPane3 = new javax.swing.JScrollPane();
    dTable = new javax.swing.JTable();
    timeoffRequestPanel = new javax.swing.JPanel();
    approvalsPanel = new javax.swing.JPanel();
    approveButton = new javax.swing.JButton();
    addPunch = new javax.swing.JButton();
    filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(127, 0), new java.awt.Dimension(127, 0), new java.awt.Dimension(127, 32767));
    userLoggedInLabel = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setMinimumSize(new java.awt.Dimension(1327, 900));
    setResizable(false);

    timecardPanel.setBackground(new java.awt.Color(255, 255, 255));
    timecardPanel.setMinimumSize(new java.awt.Dimension(1327, 900));
    timecardPanel.setPreferredSize(new java.awt.Dimension(1327, 900));

    timeTable.setBorder(javax.swing.BorderFactory.createEtchedBorder());
    timeTable.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {null, null, null, null, null, null},
        {null, null, null, null, null, null},
        {null, null, null, null, null, null},
        {null, null, null, null, null, null},
        {null, null, null, null, null, null},
        {null, null, null, null, null, null},
        {null, null, null, null, null, null}
      },
      new String [] {
        "Date", "In", "Out", "In", "Out", "Shift"
      }
    ) {
      Class[] types = new Class [] {
        java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class
      };
      boolean[] canEdit = new boolean [] {
        false, false, false, false, false, false
      };

      public Class getColumnClass(int columnIndex) {
        return types [columnIndex];
      }

      public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit [columnIndex];
      }
    });
    timeTable.setColumnSelectionAllowed(true);
    timeTable.setGridColor(new java.awt.Color(0, 0, 102));
    timeTable.setSelectionForeground(new java.awt.Color(0, 0, 102));
    timeTable.getTableHeader().setReorderingAllowed(false);
    timecardScrollPane.setViewportView(timeTable);
    timeTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

    logoPanel.setBackground(new java.awt.Color(0, 0, 51));
    logoPanel.setPreferredSize(new java.awt.Dimension(1650, 98));
    logoPanel.setRequestFocusEnabled(false);

    logo.setFont(new java.awt.Font("Euphemia", 1, 36)); // NOI18N
    logo.setForeground(new java.awt.Color(255, 255, 255));
    logo.setText("KRONOPES");
    logo.setAlignmentY(0.0F);

    backButton.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
    backButton.setForeground(new java.awt.Color(0, 0, 102));
    backButton.setText("Back");
    backButton.setBorderPainted(false);
    backButton.setDoubleBuffered(true);
    backButton.setMaximumSize(new java.awt.Dimension(83, 23));
    backButton.setMinimumSize(new java.awt.Dimension(83, 23));
    backButton.setOpaque(false);
    backButton.setPreferredSize(new java.awt.Dimension(83, 23));
    backButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        backButtonActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout logoPanelLayout = new javax.swing.GroupLayout(logoPanel);
    logoPanel.setLayout(logoPanelLayout);
    logoPanelLayout.setHorizontalGroup(
      logoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(logoPanelLayout.createSequentialGroup()
        .addGap(38, 38, 38)
        .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(51, 51, 51))
    );
    logoPanelLayout.setVerticalGroup(
      logoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logoPanelLayout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(35, 35, 35))
      .addGroup(logoPanelLayout.createSequentialGroup()
        .addContainerGap()
        .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        .addContainerGap())
    );

    saveButton.setBackground(new java.awt.Color(255, 255, 255));
    saveButton.setForeground(new java.awt.Color(0, 0, 102));
    saveButton.setText("Save");
    saveButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        saveButtonActionPerformed(evt);
      }
    });

    timePeriodLabel.setText("Time Period");

    timePeriodCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Current Pay Period", "Previous Pay Period" }));
    timePeriodCB.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        timePeriodCBActionPerformed(evt);
      }
    });

    timecardLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
    timecardLabel.setForeground(new java.awt.Color(102, 102, 102));
    timecardLabel.setText("TIMECARD");

    pTable.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {

      },
      new String [] {
        "Date Checked", "Total Hours", "Wage"
      }
    ) {
      Class[] types = new Class [] {
        java.lang.Object.class, java.lang.Double.class, java.lang.Double.class
      };
      boolean[] canEdit = new boolean [] {
        false, false, false
      };

      public Class getColumnClass(int columnIndex) {
        return types [columnIndex];
      }

      public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit [columnIndex];
      }
    });
    jScrollPane2.setViewportView(pTable);
    pTable.getColumnModel().getColumn(1).setResizable(false);
    pTable.getColumnModel().getColumn(2).setResizable(false);

    dTable.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {

      },
      new String [] {
        "Day", "Start", "End"
      }
    ) {
      Class[] types = new Class [] {
        java.lang.String.class, java.lang.String.class, java.lang.String.class
      };
      boolean[] canEdit = new boolean [] {
        false, false, false
      };

      public Class getColumnClass(int columnIndex) {
        return types [columnIndex];
      }

      public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit [columnIndex];
      }
    });
    dTable.getTableHeader().setReorderingAllowed(false);
    jScrollPane3.setViewportView(dTable);

    javax.swing.GroupLayout accuralPanelLayout = new javax.swing.GroupLayout(accuralPanel);
    accuralPanel.setLayout(accuralPanelLayout);
    accuralPanelLayout.setHorizontalGroup(
      accuralPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(accuralPanelLayout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(139, 139, 139))
    );
    accuralPanelLayout.setVerticalGroup(
      accuralPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(accuralPanelLayout.createSequentialGroup()
        .addContainerGap()
        .addGroup(accuralPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
          .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    accuralApprovalTabbedPane.addTab("Accurals", accuralPanel);

    javax.swing.GroupLayout timeoffRequestPanelLayout = new javax.swing.GroupLayout(timeoffRequestPanel);
    timeoffRequestPanel.setLayout(timeoffRequestPanelLayout);
    timeoffRequestPanelLayout.setHorizontalGroup(
      timeoffRequestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 1079, Short.MAX_VALUE)
    );
    timeoffRequestPanelLayout.setVerticalGroup(
      timeoffRequestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 238, Short.MAX_VALUE)
    );

    accuralApprovalTabbedPane.addTab("Time-Off Request", timeoffRequestPanel);

    javax.swing.GroupLayout approvalsPanelLayout = new javax.swing.GroupLayout(approvalsPanel);
    approvalsPanel.setLayout(approvalsPanelLayout);
    approvalsPanelLayout.setHorizontalGroup(
      approvalsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 1079, Short.MAX_VALUE)
    );
    approvalsPanelLayout.setVerticalGroup(
      approvalsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 238, Short.MAX_VALUE)
    );

    accuralApprovalTabbedPane.addTab("Approvals", approvalsPanel);

    approveButton.setForeground(new java.awt.Color(0, 0, 102));
    approveButton.setText("Approve");
    approveButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        approveButtonActionPerformed(evt);
      }
    });

    addPunch.setForeground(new java.awt.Color(0, 0, 51));
    addPunch.setText("Add Punch");
    addPunch.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        addPunchActionPerformed(evt);
      }
    });

    userLoggedInLabel.setText("You're logged in as : " + theUserLoggedIn);
    userLoggedInLabel.setVisible(true);

    javax.swing.GroupLayout timecardPanelLayout = new javax.swing.GroupLayout(timecardPanel);
    timecardPanel.setLayout(timecardPanelLayout);
    timecardPanelLayout.setHorizontalGroup(
      timecardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(logoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1327, Short.MAX_VALUE)
      .addGroup(timecardPanelLayout.createSequentialGroup()
        .addGroup(timecardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(timecardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(accuralApprovalTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1084, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(timecardPanelLayout.createSequentialGroup()
              .addGroup(timecardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(timecardPanelLayout.createSequentialGroup()
                  .addGap(461, 461, 461)
                  .addComponent(timePeriodLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(timePeriodCB, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(timecardPanelLayout.createSequentialGroup()
                  .addGap(127, 127, 127)
                  .addGroup(timecardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userLoggedInLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(timecardPanelLayout.createSequentialGroup()
                      .addComponent(saveButton)
                      .addGap(18, 18, 18)
                      .addComponent(approveButton)
                      .addGap(18, 18, 18)
                      .addComponent(addPunch)))))
              .addGap(504, 504, 504))
            .addComponent(timecardScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1084, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(timecardPanelLayout.createSequentialGroup()
            .addGap(164, 164, 164)
            .addComponent(timecardLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      .addGroup(timecardPanelLayout.createSequentialGroup()
        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, Short.MAX_VALUE))
    );
    timecardPanelLayout.setVerticalGroup(
      timecardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(timecardPanelLayout.createSequentialGroup()
        .addContainerGap()
        .addComponent(logoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGroup(timecardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(timecardPanelLayout.createSequentialGroup()
            .addGap(65, 65, 65)
            .addGroup(timecardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(timePeriodLabel)
              .addComponent(timePeriodCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(2, 2, 2)
            .addGroup(timecardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(saveButton)
              .addComponent(approveButton)
              .addComponent(addPunch)))
          .addGroup(timecardPanelLayout.createSequentialGroup()
            .addGap(18, 18, 18)
            .addComponent(userLoggedInLabel)
            .addGap(10, 10, 10)
            .addComponent(timecardLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addGap(26, 26, 26)
        .addGroup(timecardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(timecardScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(accuralApprovalTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(227, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(timecardPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(timecardPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGap(72, 72, 72))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents
    
  private void addPunchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPunchActionPerformed
    int column = 0;
    String dayEntered = "Monday";

    //add to panel
    panel.add(dayLabel);
    panel.add(comboDay);
    panel.add(statusLabel);
    panel.add(comboStatus);
    panel.add(timeLabel);
    panel.add(comboTime);
    int result = JOptionPane.showConfirmDialog(null, panel, "Add to Menu",
      JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
    String selectedDay = comboDay.getSelectedItem().toString();
    String selectedTime = comboTime.getSelectedItem().toString();
    String selectedStatus = comboStatus.getSelectedItem().toString();

    switch(selectedDay){
      case "Monday":
      column = 0;
      break;
      case "Tuesday":
      column = 1;
      break;
      case "Wednesday":
      column = 2;
      break;
      case "Thursday":
      column = 3;
      break;
      case "Friday":
      column = 4;
      break;
      case "Saturday":
      column = 5;
      break;
      default:
      column = 6;
      break;

    }
    addStamps(column,result,selectedStatus,selectedTime,selectedDay);

  }//GEN-LAST:event_addPunchActionPerformed

  private void approveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approveButtonActionPerformed
    System.out.println(totalHours);

    InputStream inStream = null;
    OutputStream outStream = null;
    InputStream inStream1 = null;
    OutputStream outStream1 = null;
    if(totalHours>20){
      try{

        File afile =new File(TIME_FILE);
        File bfile =new File("kronopesTimesheet_previousPay.txt");
        File cfile = new File("kronopesTimesheet_new.csv");

        inStream = new FileInputStream(afile);
        outStream = new FileOutputStream(bfile);

        byte[] buffer = new byte[1024];

        int length;
        //copy the file content in bytes
        while ((length = inStream.read(buffer)) > 0){

          outStream.write(buffer, 0, length);

        }

        inStream.close();
        outStream.close();

        System.out.println("File is copied successful!");

        refresh();

      }catch(IOException e){
        e.printStackTrace();
      }
    }
    else{
      JOptionPane.showMessageDialog(null, "Error: Hours less than 20 are you sure you want to approve?");
    }

  }//GEN-LAST:event_approveButtonActionPerformed

  private void timePeriodCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timePeriodCBActionPerformed
    if(timePeriodCB.getSelectedItem()=="Previous Pay Period"){
      try {
        changeFile(PREVIOUS);
      } catch (FileNotFoundException ex) {
        Logger.getLogger(Kronopes.class.getName()).log(Level.SEVERE, null, ex);
      }

      System.out.println(PREVIOUS);
    }
    else{
      try {
        changeFile(TIME_FILE);
      } catch (FileNotFoundException ex) {
        Logger.getLogger(Kronopes.class.getName()).log(Level.SEVERE, null, ex);
      }
    }
  }//GEN-LAST:event_timePeriodCBActionPerformed

  private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
    PrintWriter os;
    try {
      os = new PrintWriter(TIME_FILE);

      for (int row = 0; row < timeTable.getRowCount(); row++) {
        for (int col = 0; col < timeTable.getColumnCount(); col++) {
          //os.print(timeTable.getColumnName(col));
          //os.print(",");
          os.print(timeTable.getValueAt(row, col));
          os.print(",");
        }
        os.print("\n");

      }
      os.close();

    } catch (FileNotFoundException ex) {
      JOptionPane.showMessageDialog(null, "Error Kronopes File Not Found: 663");
    }

  }//GEN-LAST:event_saveButtonActionPerformed

  private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
    timecardPanel.setVisible(false);
    dispose();
    RMSUserGUI gui = null;
    try {
      gui = new RMSUserGUI(userLoggedin);
    } catch (Exception ex) {
      Logger.getLogger(Kronopes.class.getName()).log(Level.SEVERE, null, ex);
    }
    gui.setVisible(true);
  }//GEN-LAST:event_backButtonActionPerformed

    public static void main(String args[]) throws FileNotFoundException {
        
        UIManager.put("Table.alternateRowColor", Color.LIGHT_GRAY);
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Kronopes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kronopes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kronopes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kronopes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       new Kronopes();
    }
    
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JTabbedPane accuralApprovalTabbedPane;
  private javax.swing.JPanel accuralPanel;
  private javax.swing.JButton addPunch;
  private javax.swing.JPanel approvalsPanel;
  private javax.swing.JButton approveButton;
  private javax.swing.JButton backButton;
  private javax.swing.JTable dTable;
  private javax.swing.Box.Filler filler1;
  private javax.swing.JScrollPane jScrollPane2;
  private javax.swing.JScrollPane jScrollPane3;
  private javax.swing.JLabel logo;
  private javax.swing.JPanel logoPanel;
  private javax.swing.JTable pTable;
  private javax.swing.JButton saveButton;
  private javax.swing.JComboBox timePeriodCB;
  private javax.swing.JLabel timePeriodLabel;
  private javax.swing.JTable timeTable;
  private javax.swing.JLabel timecardLabel;
  private javax.swing.JPanel timecardPanel;
  private javax.swing.JScrollPane timecardScrollPane;
  private javax.swing.JPanel timeoffRequestPanel;
  private javax.swing.JLabel userLoggedInLabel;
  // End of variables declaration//GEN-END:variables
    JPanel panel = new JPanel();//JOptionPane panel  
    
    DefaultTableModel tm;
    Scanner scanner; 
          String[] day = {"Monday","Tuesday","Wednesday","Thursday","Friday",
          "Saturday","Sunday"};
          String[] time ={"12:00 AM","1:00 AM","2:00 AM","3:00 AM","4:00 AM","5:00 AM"
          ,"6:00 AM","7:00 AM","8:00 AM","9:00 AM","10:00 AM","11:00 AM","12:00 PM",
          "1:00 PM","2:00 PM","3:00 PM","4:00 PM","5:00 PM"
          ,"6:00 PM","7:00 PM","8:00 PM","9:00 PM","10:00 PM","11:00 PM"};
          String[] inORout={"Clock In","Clock Out"};
          JComboBox comboDay = new JComboBox(day);
          JComboBox comboStatus = new JComboBox(inORout);
          JComboBox comboTime = new JComboBox(time);
          JLabel dayLabel = new JLabel("Select a Day");
          JLabel statusLabel = new JLabel("Punch Type");
          JLabel timeLabel = new JLabel("Select a Time");
          DateFormat sdf = new SimpleDateFormat("h:mm a");
          int totalHours;
    private void addStamps(int column, int result, String selectedStatus, String selectedTime, String selectedDay) {
        Boolean flag=false;
        Boolean flag2= false;
        String cmpTime1;
        String cmpTime2;
        
      
        try {
            scanner = new Scanner(new File(TIME_FILE));}
         catch (FileNotFoundException ex) {
            Logger.getLogger(Kronopes.class.getName()).log(Level.SEVERE, null, ex);
        }
                

                if (result == JOptionPane.OK_OPTION) {

                   //if(selectedDay.matches("Monday")){
                        if(selectedStatus.matches("Clock In")){
                            String t = (String) timeTable.getValueAt(column,1);
                            if(t.matches("_")){
                                   timeTable.setValueAt(selectedTime, column, 1);
                                   
                                   }
                               else{
                                   String test = (String) timeTable.getValueAt(column, 2);
                                                                    
                                   if(test.matches("_"))
                                   {
                                    JOptionPane.showMessageDialog(null, "Must clock out first");
                                   }
                                   else
                                   {
                                    //compare out time and in time to make sure in is greater than out
                                   
                                        try {
                                                                                    
                                        Date cmpTimeIn = sdf.parse(selectedTime);
                                        cmpTime1 = (String) (timeTable.getValueAt(column, 2));
                                        Date cmpTimeOut = sdf.parse(cmpTime1);
                                        
                                        if(cmpTimeOut.before(cmpTimeIn)){
                                       
                                        
                                        timeTable.setValueAt(selectedTime, column, 3);
                                        }
                                        else{
                                            JOptionPane.showMessageDialog(null, "Invalid time error: in");
                                        }
                                        } catch (ParseException ex) {
                                            JOptionPane.showMessageDialog(null,"Error");
                                        }
                                     }
                               }
                     
                        }
                        //handleClock Out
                        else{
                            //check to see if employee is clocked in
                            String check = (String) timeTable.getValueAt(column, 1);
                            if(check.matches("_")){
                                JOptionPane.showMessageDialog(null,"Must clock in");
                            }
                            else{
                                String check2 = (String) timeTable.getValueAt(column,2);
                                if(check2.matches("_")){
                                        Date cmpTimeOut;
                                    try {
                                        cmpTimeOut = sdf.parse(selectedTime);
                             
                                        cmpTime1 = (String) (timeTable.getValueAt(column, 1));
                                        Date cmpTimeIn;
                                   
                                        cmpTimeIn = sdf.parse(cmpTime1);
                                        
                                     if(cmpTimeOut.after(cmpTimeIn)){
                                    timeTable.setValueAt(selectedTime, column, 2);
                                    long shift1=cmpTimeOut.getTime();
                                    long shift2=cmpTimeIn.getTime();
                                    long shift=shift1-shift2;
                                    
                    //System.out.println(shift);
                    String hms = String.format("%d", TimeUnit.MILLISECONDS.toHours(shift),
            TimeUnit.MILLISECONDS.toMinutes(shift) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(shift)),
            TimeUnit.MILLISECONDS.toSeconds(shift) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(shift)));
                    
                    timeTable.setValueAt(hms, column, 5);
                  
                                     }
                                     else{
                                         JOptionPane.showMessageDialog(null, "Invalid Time");
                                     }
                                    } catch (ParseException ex) {
                                        Logger.getLogger(Kronopes.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                }   

                                else{
                                    String check3 = (String) timeTable.getValueAt(column,3);
                                    if(check3.matches("_")){
                                        JOptionPane.showMessageDialog(null,"Must Clock in");
                                    }
                                    else{
                                         Date cmpTimeOut;
                                    try {
                                        cmpTimeOut = sdf.parse(selectedTime);
                             
                                        cmpTime1 = (String) (timeTable.getValueAt(column, 3));
                                        Date cmpTimeIn;
                                   
                                        cmpTimeIn = sdf.parse(cmpTime1);
                                        
                                     if(cmpTimeOut.after(cmpTimeIn)){
                                     timeTable.setValueAt(selectedTime, column, 4);    
                                    String time2 = (String)timeTable.getValueAt(column, 5);
                                    int time3 = Integer.parseInt(time2);
                                     //Date time21 = sdf.parse(time2);
                                     //long readyWorked = time21.getTime();
                                     System.out.println("Time2 "+time2);
                                     long shift1=cmpTimeOut.getTime();
                                     long shift2=cmpTimeIn.getTime();
                                     long lshift=shift1-shift2;
                                     long shift = lshift;
                                     String hms = String.format("%d", TimeUnit.MILLISECONDS.toHours(shift),
            TimeUnit.MILLISECONDS.toMinutes(shift) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(shift)),
            TimeUnit.MILLISECONDS.toSeconds(shift) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(shift)));
                                     int time4 = Integer.parseInt(hms);
                                     int totalShift = time3+time4;
                    timeTable.setValueAt(totalShift, column, 5);
                              
                                     }
                                     else{
                                         JOptionPane.showMessageDialog(null, "Invalid Time");
                                     }
                                    } catch (ParseException ex) {
                                        Logger.getLogger(Kronopes.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                 
                                    }
                                }
                            }        
                        }
                                   
                }
    }

    private int accumulate() throws FileNotFoundException {
               Scanner acSc = new Scanner(new File(TIME_FILE));
               ArrayList accu = new ArrayList();
            int count = 0;
            int sum = 0;
           
            while (acSc.hasNextLine()) {
                String line = acSc.nextLine();

                String[] split = line.split(",");
                int temp = Integer.parseInt(split[5]);
                sum+=temp;
                accu.add(temp);               
               
                count++;
            }
            return sum;
            
    }

    private void refresh() throws IOException {
            try {
                InputStream inStream1 = null;
                OutputStream outStream1 = null;
                    
                    File afile =new File(TIME_FILE);
                       
                    File cfile = new File(KRONOPESNEW);
                   
                     inStream1 = new FileInputStream(cfile);
                       
                    outStream1 = new FileOutputStream(afile);
                         byte[] buffer1 = new byte[1024];
         
                        int length1;
                        //copy the file content in bytes 
                        while ((length1 = inStream1.read(buffer1)) > 0){
         
                                outStream1.write(buffer1, 0, length1);
         
                        }
         
                        inStream1.close();
                        outStream1.close();
                        System.out.println("File is copied successful!");
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Kronopes.class.getName()).log(Level.SEVERE, null, ex);
            }
    }

    public String changeFile(String TIME_FILE) throws FileNotFoundException {
        
        readTimesheet();
        return TIME_FILE;
        
    }
     
                
}