
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class KronopesAdmin extends JFrame {


    public KronopesAdmin() {
        initComponents();
        init();
        test.setVisible(true);
        modifyAvailPanel.setVisible(false);
    }
        private void init(){
        setTitle("Kronopes Admin Console");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
        setVisible(true);
        displayScheduled(); 
        displayAvailStaffTable();
        displayPossibleOTTable();
        displayShiftManager();
        displayPendingRequest();

       }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        KronopesPanel = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        defaultPanel = new javax.swing.JPanel();
        test = new javax.swing.JPanel();
        OTScrollPane = new javax.swing.JScrollPane();
        possibleOTTable = new javax.swing.JTable();
        workforceLabel = new javax.swing.JLabel();
        OTReachLabel = new javax.swing.JLabel();
        callInShiftDay = new javax.swing.JComboBox();
        availDayLabel = new javax.swing.JLabel();
        shiftFromLabel = new javax.swing.JLabel();
        callInShiftFrom = new javax.swing.JComboBox();
        callInShiftTo = new javax.swing.JComboBox();
        workforceScrollPane = new javax.swing.JScrollPane();
        availStaffTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        modifyAvailPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        employeeAvailabilityTable = new javax.swing.JTable();
        selectEmpCB = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        empFoundText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        findEmpButton = new javax.swing.JButton();
        saveChangesButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        schedulePanel = new javax.swing.JPanel();
        scheduleHeader = new javax.swing.JPanel();
        scheduleLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        currentScheduledTable = new javax.swing.JTable();
        quickLinksPanel = new javax.swing.JPanel();
        quickLinksHeader = new javax.swing.JPanel();
        quickLinksLabel = new javax.swing.JLabel();
        modifyAvailButton = new javax.swing.JButton();
        shiftManagerPanel = new javax.swing.JPanel();
        shiftManagerHeader = new javax.swing.JPanel();
        shiftManagerLabel = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        shiftManager = new javax.swing.JTable();
        timeOffRequest = new javax.swing.JPanel();
        timeOffRequestHeader = new javax.swing.JPanel();
        timeOffRequestLabel = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        torTable = new javax.swing.JTable();
        callInShiftHeader = new javax.swing.JLabel();
        modTimecardsButton = new javax.swing.JButton();
        timeoffRequestButton = new javax.swing.JButton();
        callInShiftLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1327, 900));

        KronopesPanel.setBackground(new java.awt.Color(0, 0, 51));
        KronopesPanel.setForeground(new java.awt.Color(0, 0, 51));
        KronopesPanel.setMinimumSize(new java.awt.Dimension(1327, 900));

        logo.setFont(new java.awt.Font("Euphemia", 1, 24)); // NOI18N
        logo.setForeground(new java.awt.Color(255, 255, 255));
        logo.setText("KRONOPES");
        logo.setAlignmentY(0.0F);

        defaultPanel.setBackground(new java.awt.Color(255, 255, 255));
        defaultPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        defaultPanel.setPreferredSize(new java.awt.Dimension(548, 548));

        test.setBackground(new java.awt.Color(255, 255, 255));
        test.setPreferredSize(new java.awt.Dimension(548, 548));

        possibleOTTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Hours", "Payrate"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        OTScrollPane.setViewportView(possibleOTTable);

        workforceLabel.setBackground(new java.awt.Color(51, 153, 255));
        workforceLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        workforceLabel.setText("   Workforce");
        workforceLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        workforceLabel.setOpaque(true);

        OTReachLabel.setBackground(new java.awt.Color(0, 153, 255));
        OTReachLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        OTReachLabel.setText("  Could Reach OT");
        OTReachLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        OTReachLabel.setOpaque(true);

        callInShiftDay.setBackground(new java.awt.Color(153, 204, 255));
        callInShiftDay.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" }));

        availDayLabel.setText("Availability Day");

        shiftFromLabel.setText("Shift from");

        callInShiftFrom.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "12:00 AM", "1:00 AM", "2:00 AM", "3:00 AM", "4:00 AM", "5:00 AM", "6:00 AM", "7:00 AM", "8:00 AM", "9:00 AM", "10:00 AM", "11:00 AM", "12:00 PM", "1:00 PM", "2:00 PM", "3:00 PM", "4:00 PM", "5:00 PM", "6:00 PM", "7:00 PM", "8:00 PM", "9:00 PM", "10:00 PM", "11:00 PM" }));

        callInShiftTo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "12:00 AM", "1:00 AM", "2:00 AM", "3:00 AM", "4:00 AM", "5:00 AM", "6:00 AM", "7:00 AM", "8:00 AM", "9:00 AM", "10:00 AM", "11:00 AM", "12:00 PM", "1:00 PM", "2:00 PM", "3:00 PM", "4:00 PM", "5:00 PM", "6:00 PM", "7:00 PM", "8:00 PM", "9:00 PM", "10:00 PM", "11:00 PM" }));

        availStaffTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Phone Number", "Scheduled Hours"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        availStaffTable.setGridColor(new java.awt.Color(153, 204, 255));
        workforceScrollPane.setViewportView(availStaffTable);

        jLabel1.setText("Shift to");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Filter call-in");

        javax.swing.GroupLayout testLayout = new javax.swing.GroupLayout(test);
        test.setLayout(testLayout);
        testLayout.setHorizontalGroup(
            testLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(testLayout.createSequentialGroup()
                .addGroup(testLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(testLayout.createSequentialGroup()
                        .addGroup(testLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(testLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel1))
                            .addGroup(testLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(shiftFromLabel)))
                        .addGap(18, 18, 18))
                    .addGroup(testLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(availDayLabel)
                        .addGap(18, 18, 18)
                        .addComponent(callInShiftDay, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(testLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(callInShiftFrom, 0, 99, Short.MAX_VALUE)
                    .addComponent(callInShiftTo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(82, 82, 82))
            .addGroup(testLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(testLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(OTScrollPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
                    .addComponent(workforceScrollPane)
                    .addComponent(workforceLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(OTReachLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        testLayout.setVerticalGroup(
            testLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(testLayout.createSequentialGroup()
                .addGroup(testLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(testLayout.createSequentialGroup()
                        .addGroup(testLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(testLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel2))
                            .addGroup(testLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(testLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(callInShiftFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(shiftFromLabel))))
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, testLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(testLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(callInShiftDay, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(availDayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)))
                .addGroup(testLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(callInShiftTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(48, 48, 48)
                .addComponent(workforceLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(workforceScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(OTReachLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(OTScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                .addGap(41, 41, 41))
        );

        modifyAvailPanel.setBackground(new java.awt.Color(255, 255, 255));
        modifyAvailPanel.setPreferredSize(new java.awt.Dimension(548, 548));

        employeeAvailabilityTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Day", "From", "To"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        employeeAvailabilityTable.setColumnSelectionAllowed(true);
        employeeAvailabilityTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(employeeAvailabilityTable);
        employeeAvailabilityTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        selectEmpCB.setModel(selectEmpCB.getModel());

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel3.setText("Select Employee");

        empFoundText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empFoundTextActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel4.setText("Employee Name");

        findEmpButton.setText("Find");
        findEmpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findEmpButtonActionPerformed(evt);
            }
        });

        saveChangesButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Save.png"))); // NOI18N
        saveChangesButton.setText("Save Changes");
        saveChangesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveChangesButtonActionPerformed(evt);
            }
        });

        cancelButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancel.png"))); // NOI18N
        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout modifyAvailPanelLayout = new javax.swing.GroupLayout(modifyAvailPanel);
        modifyAvailPanel.setLayout(modifyAvailPanelLayout);
        modifyAvailPanelLayout.setHorizontalGroup(
            modifyAvailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modifyAvailPanelLayout.createSequentialGroup()
                .addGroup(modifyAvailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(modifyAvailPanelLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(modifyAvailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(modifyAvailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(empFoundText)
                            .addComponent(selectEmpCB, 0, 171, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(findEmpButton))
                    .addGroup(modifyAvailPanelLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, modifyAvailPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cancelButton)
                .addGap(40, 40, 40)
                .addComponent(saveChangesButton)
                .addGap(47, 47, 47))
        );
        modifyAvailPanelLayout.setVerticalGroup(
            modifyAvailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modifyAvailPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(modifyAvailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(selectEmpCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(findEmpButton))
                .addGap(24, 24, 24)
                .addGroup(modifyAvailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(empFoundText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(modifyAvailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveChangesButton)
                    .addComponent(cancelButton))
                .addGap(67, 67, 67))
        );

        javax.swing.GroupLayout defaultPanelLayout = new javax.swing.GroupLayout(defaultPanel);
        defaultPanel.setLayout(defaultPanelLayout);
        defaultPanelLayout.setHorizontalGroup(
            defaultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(defaultPanelLayout.createSequentialGroup()
                .addComponent(test, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(defaultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(modifyAvailPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 558, Short.MAX_VALUE))
        );
        defaultPanelLayout.setVerticalGroup(
            defaultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(defaultPanelLayout.createSequentialGroup()
                .addComponent(test, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(defaultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(modifyAvailPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        scheduleHeader.setBackground(new java.awt.Color(0, 141, 215));
        scheduleHeader.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        scheduleLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        scheduleLabel.setText("Scheduled");

        javax.swing.GroupLayout scheduleHeaderLayout = new javax.swing.GroupLayout(scheduleHeader);
        scheduleHeader.setLayout(scheduleHeaderLayout);
        scheduleHeaderLayout.setHorizontalGroup(
            scheduleHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(scheduleHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scheduleLabel)
                .addContainerGap(246, Short.MAX_VALUE))
        );
        scheduleHeaderLayout.setVerticalGroup(
            scheduleHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scheduleLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        currentScheduledTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Shift"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(currentScheduledTable);
        if (currentScheduledTable.getColumnModel().getColumnCount() > 0) {
            currentScheduledTable.getColumnModel().getColumn(0).setMinWidth(80);
            currentScheduledTable.getColumnModel().getColumn(0).setPreferredWidth(80);
            currentScheduledTable.getColumnModel().getColumn(0).setMaxWidth(80);
            currentScheduledTable.getColumnModel().getColumn(2).setMinWidth(200);
            currentScheduledTable.getColumnModel().getColumn(2).setPreferredWidth(200);
            currentScheduledTable.getColumnModel().getColumn(2).setMaxWidth(200);
        }

        javax.swing.GroupLayout schedulePanelLayout = new javax.swing.GroupLayout(schedulePanel);
        schedulePanel.setLayout(schedulePanelLayout);
        schedulePanelLayout.setHorizontalGroup(
            schedulePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scheduleHeader, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(schedulePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        schedulePanelLayout.setVerticalGroup(
            schedulePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(schedulePanelLayout.createSequentialGroup()
                .addComponent(scheduleHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );

        quickLinksHeader.setBackground(new java.awt.Color(0, 141, 215));
        quickLinksHeader.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        quickLinksLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        quickLinksLabel.setText("Quick Links");

        javax.swing.GroupLayout quickLinksHeaderLayout = new javax.swing.GroupLayout(quickLinksHeader);
        quickLinksHeader.setLayout(quickLinksHeaderLayout);
        quickLinksHeaderLayout.setHorizontalGroup(
            quickLinksHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(quickLinksHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(quickLinksLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        quickLinksHeaderLayout.setVerticalGroup(
            quickLinksHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(quickLinksLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        modifyAvailButton.setText("Modify Availability");
        modifyAvailButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyAvailButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout quickLinksPanelLayout = new javax.swing.GroupLayout(quickLinksPanel);
        quickLinksPanel.setLayout(quickLinksPanelLayout);
        quickLinksPanelLayout.setHorizontalGroup(
            quickLinksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(quickLinksHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(quickLinksPanelLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(modifyAvailButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        quickLinksPanelLayout.setVerticalGroup(
            quickLinksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(quickLinksPanelLayout.createSequentialGroup()
                .addComponent(quickLinksHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(modifyAvailButton)
                .addGap(0, 24, Short.MAX_VALUE))
        );

        shiftManagerHeader.setBackground(new java.awt.Color(0, 141, 215));
        shiftManagerHeader.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        shiftManagerLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        shiftManagerLabel.setText("Shift Manager");

        javax.swing.GroupLayout shiftManagerHeaderLayout = new javax.swing.GroupLayout(shiftManagerHeader);
        shiftManagerHeader.setLayout(shiftManagerHeaderLayout);
        shiftManagerHeaderLayout.setHorizontalGroup(
            shiftManagerHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(shiftManagerHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(shiftManagerLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        shiftManagerHeaderLayout.setVerticalGroup(
            shiftManagerHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(shiftManagerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        shiftManager.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee ID", "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(shiftManager);

        javax.swing.GroupLayout shiftManagerPanelLayout = new javax.swing.GroupLayout(shiftManagerPanel);
        shiftManagerPanel.setLayout(shiftManagerPanelLayout);
        shiftManagerPanelLayout.setHorizontalGroup(
            shiftManagerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(shiftManagerHeader, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, shiftManagerPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        shiftManagerPanelLayout.setVerticalGroup(
            shiftManagerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(shiftManagerPanelLayout.createSequentialGroup()
                .addComponent(shiftManagerHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        timeOffRequestHeader.setBackground(new java.awt.Color(0, 141, 215));
        timeOffRequestHeader.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        timeOffRequestLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        timeOffRequestLabel.setText("Timeoff Request");

        javax.swing.GroupLayout timeOffRequestHeaderLayout = new javax.swing.GroupLayout(timeOffRequestHeader);
        timeOffRequestHeader.setLayout(timeOffRequestHeaderLayout);
        timeOffRequestHeaderLayout.setHorizontalGroup(
            timeOffRequestHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(timeOffRequestHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(timeOffRequestLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        timeOffRequestHeaderLayout.setVerticalGroup(
            timeOffRequestHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(timeOffRequestLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        torTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Pending Request"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(torTable);

        javax.swing.GroupLayout timeOffRequestLayout = new javax.swing.GroupLayout(timeOffRequest);
        timeOffRequest.setLayout(timeOffRequestLayout);
        timeOffRequestLayout.setHorizontalGroup(
            timeOffRequestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(timeOffRequestHeader, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, timeOffRequestLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        timeOffRequestLayout.setVerticalGroup(
            timeOffRequestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(timeOffRequestLayout.createSequentialGroup()
                .addComponent(timeOffRequestHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                .addContainerGap())
        );

        callInShiftHeader.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        callInShiftHeader.setForeground(new java.awt.Color(255, 255, 255));
        callInShiftHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        callInShiftHeader.setText("Call-in Shifts");
        callInShiftHeader.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        modTimecardsButton.setForeground(new java.awt.Color(255, 255, 255));
        modTimecardsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/editTable.png"))); // NOI18N
        modTimecardsButton.setText("Modify Timecards");
        modTimecardsButton.setContentAreaFilled(false);
        modTimecardsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modTimecardsButtonActionPerformed(evt);
            }
        });

        timeoffRequestButton.setForeground(new java.awt.Color(255, 255, 255));
        timeoffRequestButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/off.png"))); // NOI18N
        timeoffRequestButton.setText("Timeoff Request");
        timeoffRequestButton.setBorderPainted(false);
        timeoffRequestButton.setContentAreaFilled(false);
        timeoffRequestButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeoffRequestButtonActionPerformed(evt);
            }
        });

        callInShiftLabel.setBackground(new java.awt.Color(102, 204, 255));
        callInShiftLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        callInShiftLabel.setText("   Call-in Shifts");
        callInShiftLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        callInShiftLabel.setOpaque(true);

        javax.swing.GroupLayout KronopesPanelLayout = new javax.swing.GroupLayout(KronopesPanel);
        KronopesPanel.setLayout(KronopesPanelLayout);
        KronopesPanelLayout.setHorizontalGroup(
            KronopesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(KronopesPanelLayout.createSequentialGroup()
                .addGroup(KronopesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(KronopesPanelLayout.createSequentialGroup()
                        .addGroup(KronopesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(KronopesPanelLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(logo))
                            .addGroup(KronopesPanelLayout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addGroup(KronopesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(modTimecardsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(timeoffRequestButton, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(162, 162, 162))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, KronopesPanelLayout.createSequentialGroup()
                        .addComponent(schedulePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)))
                .addGroup(KronopesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(defaultPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
                    .addComponent(callInShiftLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40)
                .addGroup(KronopesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(quickLinksPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(callInShiftHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(timeOffRequest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(shiftManagerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        KronopesPanelLayout.setVerticalGroup(
            KronopesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(KronopesPanelLayout.createSequentialGroup()
                .addGroup(KronopesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(KronopesPanelLayout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(callInShiftHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(shiftManagerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(timeOffRequest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(quickLinksPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, KronopesPanelLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(KronopesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(KronopesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(KronopesPanelLayout.createSequentialGroup()
                                    .addComponent(logo)
                                    .addGap(44, 44, 44)
                                    .addComponent(modTimecardsButton)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(timeoffRequestButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(26, 26, 26)
                                    .addComponent(schedulePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(KronopesPanelLayout.createSequentialGroup()
                                    .addComponent(callInShiftLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(551, 551, 551)))
                            .addComponent(defaultPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(249, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(KronopesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(KronopesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void modTimecardsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modTimecardsButtonActionPerformed
        
            
       
    }//GEN-LAST:event_modTimecardsButtonActionPerformed

    private void modifyAvailButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyAvailButtonActionPerformed
        String[]cbValue=null;
        try {
            test.setVisible(false);
            callInShiftLabel.setText("Modify Availability");
            modifyAvailPanel.setVisible(true);
            Schedule sch = new Schedule();
            String day = sch.getDay();
            ArrayList<String> cb = new ArrayList<>();
            Scanner sc = new Scanner(new File("src\\data\\employee.txt"));
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                String[] split= line.split(",");
                cb.add(split[0]);
                
                
            }
            sc.close();
            selectEmpCB.setModel(new DefaultComboBoxModel(cb.toArray()));

            getAvail();
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error: KronopesAdmin Line 676\nFile Not Found");
        }
    }//GEN-LAST:event_modifyAvailButtonActionPerformed

    private void empFoundTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empFoundTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empFoundTextActionPerformed

    private void findEmpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findEmpButtonActionPerformed
     try{
        DefaultTableModel tm = (DefaultTableModel) employeeAvailabilityTable.getModel();
          
            String[] colArray = {"Day","In","Out"} ;
            

            Vector<String> colNames = new Vector<>(Arrays.asList(colArray));

            Scanner scanner1 = new Scanner(new File("src\\data\\1001Availability.txt"));
            int count = 0;
            Vector<Vector<String>> dataVector = new Vector<Vector<String>>();
            Vector<String> rowVector = new Vector<String>();
            while (scanner1.hasNextLine()) {
                String line = scanner1.nextLine();

                String[] split = line.split(",");
                
                 rowVector.add(split[0]);
                 rowVector.add(split[1]);
                 rowVector.add(split[2]);
                

                dataVector.add(rowVector);
                rowVector = new Vector<String>();
            }
            System.out.println(dataVector);
            tm = new DefaultTableModel(dataVector, colNames);
            
            employeeAvailabilityTable.setModel(tm);
            employeeAvailabilityTable.setCellSelectionEnabled(true);
            scanner1.close();
   
        
    }    
                
         catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "test");
        }
      
    }//GEN-LAST:event_findEmpButtonActionPerformed

    private void saveChangesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveChangesButtonActionPerformed
        
        selected = (String) selectEmpCB.getSelectedItem();
 
                           /*    PrintWriter os;
        try {
            os = new PrintWriter("1002Availability.txt");

    for (int row = 0; row < employeeAvailabilityTable.getRowCount(); row++) {
    for (int col = 0; col < employeeAvailabilityTable.getColumnCount(); col++) {
        //os.print(timeTable.getColumnName(col));
        //os.print(",");
        System.out.print(employeeAvailabilityTable.getValueAt(row, col));
     System.out.print(",");
    }
    System.out.print("\n");
    
}
              os.close();*/ ArrayList temp = new ArrayList();
    for (int row = 0; row < employeeAvailabilityTable.getRowCount(); row++) {
    for (int col = 0; col < employeeAvailabilityTable.getColumnCount(); col++) {
        temp.add(employeeAvailabilityTable.getValueAt(row, col));
        
            }
    }
    System.out.println(temp);
              JOptionPane.showConfirmDialog(null, "Availability is updated");
                      modifyAvailPanel.setVisible(false);
                        callInShiftLabel.setText("Call-in Shifts");
                        test.setVisible(true);
              
                      
        //employeeAvailabilityTable.
    }//GEN-LAST:event_saveChangesButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        modifyAvailPanel.setVisible(false);
        callInShiftLabel.setText("Call-in Shifts");
        test.setVisible(true);
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void timeoffRequestButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeoffRequestButtonActionPerformed
        //TimeoffRequest tor = new TimeoffRequest();
    }//GEN-LAST:event_timeoffRequestButtonActionPerformed

    public static void main(String args[]) {

        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(KronopesAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KronopesAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KronopesAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KronopesAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KronopesAdmin().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel KronopesPanel;
    private javax.swing.JLabel OTReachLabel;
    private javax.swing.JScrollPane OTScrollPane;
    private javax.swing.JLabel availDayLabel;
    private javax.swing.JTable availStaffTable;
    private javax.swing.JComboBox callInShiftDay;
    private javax.swing.JComboBox callInShiftFrom;
    private javax.swing.JLabel callInShiftHeader;
    private javax.swing.JLabel callInShiftLabel;
    private javax.swing.JComboBox callInShiftTo;
    private javax.swing.JButton cancelButton;
    private javax.swing.JTable currentScheduledTable;
    private javax.swing.JPanel defaultPanel;
    private javax.swing.JTextField empFoundText;
    private javax.swing.JTable employeeAvailabilityTable;
    private javax.swing.JButton findEmpButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel logo;
    private javax.swing.JButton modTimecardsButton;
    private javax.swing.JButton modifyAvailButton;
    private javax.swing.JPanel modifyAvailPanel;
    private javax.swing.JTable possibleOTTable;
    private javax.swing.JPanel quickLinksHeader;
    private javax.swing.JLabel quickLinksLabel;
    private javax.swing.JPanel quickLinksPanel;
    private javax.swing.JButton saveChangesButton;
    private javax.swing.JPanel scheduleHeader;
    private javax.swing.JLabel scheduleLabel;
    private javax.swing.JPanel schedulePanel;
    private javax.swing.JComboBox selectEmpCB;
    private javax.swing.JLabel shiftFromLabel;
    private javax.swing.JTable shiftManager;
    private javax.swing.JPanel shiftManagerHeader;
    private javax.swing.JLabel shiftManagerLabel;
    private javax.swing.JPanel shiftManagerPanel;
    private javax.swing.JPanel test;
    private javax.swing.JPanel timeOffRequest;
    private javax.swing.JPanel timeOffRequestHeader;
    private javax.swing.JLabel timeOffRequestLabel;
    private javax.swing.JButton timeoffRequestButton;
    private javax.swing.JTable torTable;
    private javax.swing.JLabel workforceLabel;
    private javax.swing.JScrollPane workforceScrollPane;
    // End of variables declaration//GEN-END:variables
    String selected;
     
    private void displayScheduled() {
      Schedule sch = new Schedule();
      Vector<String> ma = sch.getScheduledList();
      DefaultTableModel dt = (DefaultTableModel) currentScheduledTable.getModel();
      String[] schColArray = {"ID","Name","Shift"}; 
      Vector<String> schColNames = new Vector<>(Arrays.asList(schColArray));
      Vector<Vector<String>> schDataVector = new Vector<Vector<String>>();
      schDataVector.add(ma);
      dt = new DefaultTableModel(schDataVector, schColNames);
      currentScheduledTable.setModel(dt);
             
    }

    private void getAvail() {
        
    }

    private void displayAvailStaffTable() {
      
       try{
        DefaultTableModel dt = (DefaultTableModel) availStaffTable.getModel();
        String[] dColArray = {"ID","Name","Phone","scheduled"};        
        Vector<String> dColNames = new Vector<>(Arrays.asList(dColArray));
        Vector<Vector<String>> dDataVector = new Vector<Vector<String>>();
        Vector<String> dRowVector = new Vector<String>();
        Scanner scannerd = new Scanner(new File("src\\data\\employee.txt"));
        int count = 0;
        
                 while (scannerd.hasNextLine()) {
                String line = scannerd.nextLine();

                String[] dsplit = line.split(",");
                dRowVector.add(dsplit[0]);
                dRowVector.add(dsplit[2]);
                dRowVector.add(dsplit[3]);
                dRowVector.add(dsplit[4]);
                
                count++;

                dDataVector.add(dRowVector);
                dRowVector = new Vector<String>();
            }
                 
                
            dt = new DefaultTableModel(dDataVector, dColNames);
            availStaffTable.setModel(dt);
             } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "ERROR: File Not Found  1004");
        } 
    }

    private void displayPossibleOTTable() {
          try{
        DefaultTableModel ot = (DefaultTableModel) possibleOTTable.getModel();
        String[] dColArray = {"ID","Name","Phone","scheduled"};        
        Vector<String> dColNames = new Vector<>(Arrays.asList(dColArray));
        Vector<Vector<String>> dDataVector = new Vector<Vector<String>>();
        Vector<String> dRowVector = new Vector<String>();
        Vector<String> eRowVector = new Vector<String>();
        Scanner emp = new Scanner(new File("src\\data\\employee.txt"));
        Scanner pay = new Scanner(new File("src\\data\\pay.txt"));
        int count = 0;
        
                 while (pay.hasNextLine()) {
                String line = pay.nextLine();

                String[] dsplit = line.split(",");
                String id = dsplit[0];
                for(int i =0;i<3;i++){           
                int hours = Integer.parseInt(dsplit[2]);
                
               
                    
                    dRowVector.add(dsplit[i]);
                    dRowVector.add(dsplit[i++]);
                    i++;
                    dRowVector.add(dsplit[i]);
                    dRowVector.add("8:00-5:00");
     
                i++;

            }
                 }  
                dDataVector.add(dRowVector);
                dRowVector = new Vector<String>();  
                
            ot = new DefaultTableModel(dDataVector, dColNames);
            possibleOTTable.setModel(ot);
             } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "ERROR: File Not Found 1045");
        } 
    
        
    }

    private void displayShiftManager() {
         try{
        DefaultTableModel sm = (DefaultTableModel) shiftManager.getModel();
        String[] sColArray = {"ID","Name","Phone","scheduled"};        
        Vector<String> sColNames = new Vector<>(Arrays.asList(sColArray));
        Vector<Vector<String>> sDataVector = new Vector<Vector<String>>();
        Vector<String> sRowVector = new Vector<String>();
        Scanner scsm = new Scanner(new File("src\\data\\clockedInAdminSample.txt"));
        int count = 0;
        
                 while (scsm.hasNextLine()) {
                String line = scsm.nextLine();

                String[] ssplit = line.split(",");
                sRowVector.add(ssplit[0]);
                sRowVector.add(ssplit[1]);
                
                count++;

                sDataVector.add(sRowVector);
                sRowVector = new Vector<String>();
            }
                 
                
            sm = new DefaultTableModel(sDataVector, sColNames);
            shiftManager.setModel(sm);
             } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "ERROR: File Not Found 1078");
        } 
    }
    private void displayPendingRequest() { 
        DefaultTableModel pt = (DefaultTableModel) torTable.getModel();
        torTable.setModel(pt);
            pt.addRow(new Object[]{"No Pending Requests"});
    }
          
}
