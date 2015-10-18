import java.awt.CardLayout;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;

public class RMSAdminGUI extends JFrame {
CardLayout cl = null;
DefaultTableModel model = new DefaultTableModel();
RMSVendor vendor = new RMSVendor();
private String theUserLoggedIn=null;
public String restaurantName = "<Your Restaurant Name Here>";
private final String RESTNAMEFILE = "src/data/d75499b1dd87ae78efc7afec3fd7697b.txt";
Parse parse = new Parse(); 
Database database = new Database();
String image = "/images/testImage.jpg";
List<String> information = Collections.synchronizedList(new ArrayList<String>());
RMSMenu menu = new RMSMenu();
RMSSalesReport sales = new RMSSalesReport();

public RMSAdminGUI() {
  initComponents();
  init(theUserLoggedIn);
   cl = (CardLayout)(adminMainPanel.getLayout());
    cl.show(adminMainPanel,"toDo");
}
public RMSAdminGUI(String username){
  theUserLoggedIn = username;
  initComponents();
  init(theUserLoggedIn);
   cl = (CardLayout)(adminMainPanel.getLayout());
    cl.show(adminMainPanel,"toDo");
}
private void init(String theUserLoggedIn){
//  this.setIconImage(new 
  //ImageIcon(getClass().getResource("images\\5mbicon1.png")).getImage());
  UserLoggedInLabel.setText("You're logged in as : " + theUserLoggedIn);
  setTitle("Administrator Console");
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  this.setSize(1380, 900);
  setLocationRelativeTo(null);
  setVisible(true);
  RMSToDoList td = new RMSToDoList();
  model=td.viewTodoList();
  toDoTable.setModel(model);
  if(!parse.isFileEmpty(RESTNAMEFILE)){
    restaurantName = parse.returnRestaurantName(RESTNAMEFILE);
   
  }
   try{
    information = database.getUsernameInformation(theUserLoggedIn);
    System.out.println(theUserLoggedIn);
    
    if(theUserLoggedIn != null && !theUserLoggedIn.isEmpty()){
     image = database.getImage(theUserLoggedIn);
     System.out.print(image);
     System.out.println("Entered if");
     //ImageIcon picture = new ImageIcon(getClass().getResource(image));
     //Image theimage = picture.getImage();
     //theimage = theimage.getScaledInstance(312,312,Image.SCALE_SMOOTH);
     //picture.setImage(theimage);
   //  imageOfYou.setIcon(picture);
     /*
     imageOfYou.setIcon(new ImageIcon(((new ImageIcon(image)).getImage())
               .getScaledInstance(312, 312, java.awt.Image.SCALE_SMOOTH))); */
    }else{
      //imageOfYou.setIcon(new javax.swing.ImageIcon(getClass().getResource(image))); 
      System.out.println("Entered else");
    }
   }catch(Exception e){
     //imageOfYou.setIcon(new ImageIcon(((new ImageIcon(image)).getImage())
       //        .getScaledInstance(312, 312, java.awt.Image.SCALE_SMOOTH)));
     System.out.print("caught");
     throw e;
   }
}
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        wholePanel = new javax.swing.JPanel();
        navPanel = new javax.swing.JPanel();
        navPanelHead = new javax.swing.JLabel();
        checkReservationButton = new javax.swing.JButton();
        restaurantViewButton = new javax.swing.JButton();
        viewLabel = new javax.swing.JLabel();
        salesLabel = new javax.swing.JLabel();
        inventoryLabel = new javax.swing.JLabel();
        settingsLabel = new javax.swing.JLabel();
        salesReportMonthButton = new javax.swing.JButton();
        modifyMenuButton = new javax.swing.JButton();
        viewMenuButton = new javax.swing.JButton();
        createNewPOButton = new javax.swing.JButton();
        salesReportDayButton = new javax.swing.JButton();
        addVendorButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        viewLabel1 = new javax.swing.JLabel();
        toDoListButton = new javax.swing.JButton();
        adminMainPanel = new javax.swing.JPanel();
        checkReservationsPanel = new javax.swing.JPanel();
        restaurantViewPanel = new javax.swing.JPanel();
        addToDoItemLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        table1 = new javax.swing.JButton();
        addToDoItemLabel2 = new javax.swing.JLabel();
        tabelPanel = new javax.swing.JPanel();
        viewMenuLog = new javax.swing.JPanel();
        checkoutPanel = new javax.swing.JPanel();
        toDoPanel = new javax.swing.JPanel();
        addToListPanel = new javax.swing.JPanel();
        titleToDoText = new javax.swing.JTextField();
        dateToDoText = new javax.swing.JTextField();
        urgentToDoCombo = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        addToListButton = new javax.swing.JButton();
        toDoLabel = new javax.swing.JLabel();
        dueDateLabel = new javax.swing.JLabel();
        cancelButton = new javax.swing.JButton();
        dueDateformateLabel = new javax.swing.JLabel();
        toDoScrollPane = new javax.swing.JScrollPane();
        toDoTable = new javax.swing.JTable();
        toDoListLabel = new javax.swing.JLabel();
        addToDoItemLabel = new javax.swing.JLabel();
        newVendor = new javax.swing.JPanel();
        addVendor = new javax.swing.JLabel();
        addVendorPanel = new javax.swing.JPanel();
        addVendorLabel = new javax.swing.JLabel();
        vendorNameText = new javax.swing.JTextField();
        vendorNameLabel = new javax.swing.JLabel();
        vendorStreetText = new javax.swing.JTextField();
        vendorStreetLabel = new javax.swing.JLabel();
        cityLabel = new javax.swing.JLabel();
        cityText = new javax.swing.JTextField();
        contactLabel = new javax.swing.JLabel();
        contactText = new javax.swing.JTextField();
        stateLabel = new javax.swing.JLabel();
        zipText = new javax.swing.JTextField();
        zipLabel = new javax.swing.JLabel();
        stateText = new javax.swing.JTextField();
        addProductScrollPane = new javax.swing.JScrollPane();
        vendorProductTable = new javax.swing.JTable();
        addProductLabel = new javax.swing.JLabel();
        addVendorButton2 = new javax.swing.JButton();
        cancelVendorButton = new javax.swing.JButton();
        phoneText = new javax.swing.JTextField();
        phoneLabel = new javax.swing.JLabel();
        emailText = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        viewMenuPanel = new javax.swing.JPanel();
        viewMenuPanel2 = new javax.swing.JPanel();
        modifyMenuPanel = new javax.swing.JPanel();
        modMenuScrollPane = new javax.swing.JScrollPane();
        modifyMenuTable = new javax.swing.JTable();
        modMenuButtonPanel = new javax.swing.JPanel();
        addItemButton = new javax.swing.JButton();
        deleteItemButton = new javax.swing.JButton();
        applyModifyButton = new javax.swing.JButton();
        modifyMenuLabel = new javax.swing.JLabel();
        viewMenuLog1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        viewLogTable = new javax.swing.JTable();
        salesReportPanel = new javax.swing.JPanel();
        generalSalesDataPanel = new javax.swing.JPanel();
        generalScrollPane = new javax.swing.JScrollPane();
        generalViewMonthTable = new javax.swing.JTable();
        generalViewLabel = new javax.swing.JLabel();
        detailSalesPanel = new javax.swing.JPanel();
        detailedScrollPane = new javax.swing.JScrollPane();
        detailedViewTable = new javax.swing.JTable();
        detailedViewLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        controlLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        monthCombo = new javax.swing.JComboBox();
        addVendor1 = new javax.swing.JLabel();
        createNewPO = new javax.swing.JPanel();
        createPoFormPanel = new javax.swing.JPanel();
        addVendorLabel1 = new javax.swing.JLabel();
        poNumLabel = new javax.swing.JLabel();
        poNumText = new javax.swing.JTextField();
        vNameLabel = new javax.swing.JLabel();
        findVendor = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        vendorStreetAddyText = new javax.swing.JTextField();
        vNameLabel1 = new javax.swing.JLabel();
        vendorCityText = new javax.swing.JTextField();
        vNameLabel2 = new javax.swing.JLabel();
        vendorStateText = new javax.swing.JTextField();
        vendorStateLabel = new javax.swing.JLabel();
        vendorStateLabel1 = new javax.swing.JLabel();
        vendorZipText = new javax.swing.JTextField();
        orderItemsPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        vendorCatalog = new javax.swing.JTable();
        skuLabel = new javax.swing.JLabel();
        skuText = new javax.swing.JTextField();
        qtyLabel = new javax.swing.JLabel();
        qtyText = new javax.swing.JTextField();
        qtyLabel1 = new javax.swing.JLabel();
        priceText = new javax.swing.JTextField();
        Add = new javax.swing.JButton();
        addVendor2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        addyLabel = new javax.swing.JLabel();
        phoneL = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        totalLabel = new javax.swing.JLabel();
        submitPOButton = new javax.swing.JButton();
        purchaseSummaryLabel = new javax.swing.JLabel();
        salesReportDayPanel = new javax.swing.JPanel();
        generalSalesDataPanel1 = new javax.swing.JPanel();
        generalScrollPane1 = new javax.swing.JScrollPane();
        generalViewTable1 = new javax.swing.JTable();
        generalViewLabel1 = new javax.swing.JLabel();
        chartPanel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        controlLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        dayComboBox = new javax.swing.JComboBox();
        addVendor3 = new javax.swing.JLabel();
        addUserPanel = new javax.swing.JPanel();
        addUserLabel = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        usernameText = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        phoneNumberText = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        passwordText = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        scheduleFilenameText = new javax.swing.JTextField();
        emailTexr = new javax.swing.JTextField();
        payScaleText = new javax.swing.JTextField();
        payCombo = new javax.swing.JComboBox();
        roleCombo = new javax.swing.JComboBox();
        addUserButton = new javax.swing.JButton();
        deleteUserPanel = new javax.swing.JPanel();
        deletePanel = new javax.swing.JPanel();
        userCombo = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel17 = new javax.swing.JLabel();
        removeUserButton = new javax.swing.JButton();
        deleteUserLabel = new javax.swing.JLabel();
        editUserPanel = new javax.swing.JPanel();
        editPanel = new javax.swing.JPanel();
        findUserCombo = new javax.swing.JComboBox();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        phoneModify = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        passwordModify = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        fileModify = new javax.swing.JTextField();
        emailModify = new javax.swing.JTextField();
        payScaleModify = new javax.swing.JTextField();
        payModify = new javax.swing.JComboBox();
        roleModify = new javax.swing.JComboBox();
        addUserButton1 = new javax.swing.JButton();
        editUserLabel = new javax.swing.JLabel();
        TitlePanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        headerPanel = new javax.swing.JPanel();
        UserLoggedInLabel = new javax.swing.JLabel();
        LogoutButton = new javax.swing.JButton();
        manageStaffPanel = new javax.swing.JPanel();
        settingsLabel1 = new javax.swing.JLabel();
        addUser = new javax.swing.JButton();
        deleteUser = new javax.swing.JButton();
        editUserButton = new javax.swing.JButton();
        kronopesButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1280, 768));
        setResizable(false);

        wholePanel.setBackground(new java.awt.Color(0, 0, 51));
        wholePanel.setForeground(new java.awt.Color(255, 255, 255));
        wholePanel.setMinimumSize(new java.awt.Dimension(1600, 1200));
        wholePanel.setPreferredSize(new java.awt.Dimension(1920, 1000));

        navPanel.setBackground(new java.awt.Color(236, 236, 254));
        navPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        navPanel.setPreferredSize(new java.awt.Dimension(222, 600));

        navPanelHead.setBackground(new java.awt.Color(204, 204, 255));
        navPanelHead.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        navPanelHead.setText("  RMS Admin Console");
        navPanelHead.setOpaque(true);

        checkReservationButton.setBackground(new java.awt.Color(102, 102, 102));
        checkReservationButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        checkReservationButton.setForeground(new java.awt.Color(102, 102, 102));
        checkReservationButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/checkreservation.png"))); // NOI18N
        checkReservationButton.setText("Check Reservations");
        checkReservationButton.setContentAreaFilled(false);
        checkReservationButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        checkReservationButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                checkReservationButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                checkReservationButtonMouseExited(evt);
            }
        });
        checkReservationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkReservationButtonActionPerformed(evt);
            }
        });

        restaurantViewButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        restaurantViewButton.setForeground(new java.awt.Color(102, 102, 102));
        restaurantViewButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/restview.png"))); // NOI18N
        restaurantViewButton.setText("Restaurant Table Status");
        restaurantViewButton.setContentAreaFilled(false);
        restaurantViewButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        restaurantViewButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                restaurantViewButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                restaurantViewButtonMouseExited(evt);
            }
        });
        restaurantViewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restaurantViewButtonActionPerformed(evt);
            }
        });

        viewLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        viewLabel.setForeground(new java.awt.Color(0, 102, 255));
        viewLabel.setText("View");

        salesLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        salesLabel.setForeground(new java.awt.Color(0, 102, 255));
        salesLabel.setText("Sales");
        salesLabel.setMaximumSize(new java.awt.Dimension(175, 25));
        salesLabel.setMinimumSize(new java.awt.Dimension(175, 25));
        salesLabel.setPreferredSize(new java.awt.Dimension(175, 25));

        inventoryLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        inventoryLabel.setForeground(new java.awt.Color(0, 102, 255));
        inventoryLabel.setText("Purchases");
        inventoryLabel.setMaximumSize(new java.awt.Dimension(175, 25));
        inventoryLabel.setMinimumSize(new java.awt.Dimension(175, 25));
        inventoryLabel.setPreferredSize(new java.awt.Dimension(175, 25));

        settingsLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        settingsLabel.setForeground(new java.awt.Color(0, 102, 255));
        settingsLabel.setText("Menu");
        settingsLabel.setMaximumSize(new java.awt.Dimension(175, 25));
        settingsLabel.setMinimumSize(new java.awt.Dimension(175, 25));
        settingsLabel.setPreferredSize(new java.awt.Dimension(175, 25));

        salesReportMonthButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        salesReportMonthButton.setForeground(new java.awt.Color(102, 102, 102));
        salesReportMonthButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/report.png"))); // NOI18N
        salesReportMonthButton.setText("Sales Report by Month");
        salesReportMonthButton.setContentAreaFilled(false);
        salesReportMonthButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salesReportMonthButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                salesReportMonthButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                salesReportMonthButtonMouseExited(evt);
            }
        });
        salesReportMonthButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salesReportMonthButtonActionPerformed(evt);
            }
        });

        modifyMenuButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        modifyMenuButton.setForeground(new java.awt.Color(102, 102, 102));
        modifyMenuButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/modifymenu.png"))); // NOI18N
        modifyMenuButton.setText("Modify Menu");
        modifyMenuButton.setContentAreaFilled(false);
        modifyMenuButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        modifyMenuButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                modifyMenuButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                modifyMenuButtonMouseExited(evt);
            }
        });
        modifyMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyMenuButtonActionPerformed(evt);
            }
        });

        viewMenuButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        viewMenuButton.setForeground(new java.awt.Color(102, 102, 102));
        viewMenuButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/viewmenu.png"))); // NOI18N
        viewMenuButton.setText("View Menu");
        viewMenuButton.setContentAreaFilled(false);
        viewMenuButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        viewMenuButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                viewMenuButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                viewMenuButtonMouseExited(evt);
            }
        });
        viewMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewMenuButtonActionPerformed(evt);
            }
        });

        createNewPOButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        createNewPOButton.setForeground(new java.awt.Color(102, 102, 102));
        createNewPOButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/purchaseorder.png"))); // NOI18N
        createNewPOButton.setText("Create New PO");
        createNewPOButton.setContentAreaFilled(false);
        createNewPOButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        createNewPOButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                createNewPOButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                createNewPOButtonMouseExited(evt);
            }
        });
        createNewPOButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createNewPOButtonActionPerformed(evt);
            }
        });

        salesReportDayButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        salesReportDayButton.setForeground(new java.awt.Color(102, 102, 102));
        salesReportDayButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/report.png"))); // NOI18N
        salesReportDayButton.setText("Sales Report by Day");
        salesReportDayButton.setContentAreaFilled(false);
        salesReportDayButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salesReportDayButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                salesReportDayButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                salesReportDayButtonMouseExited(evt);
            }
        });
        salesReportDayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salesReportDayButtonActionPerformed(evt);
            }
        });

        addVendorButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        addVendorButton.setForeground(new java.awt.Color(102, 102, 102));
        addVendorButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/vendor.png"))); // NOI18N
        addVendorButton.setText("Vendors");
        addVendorButton.setContentAreaFilled(false);
        addVendorButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addVendorButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addVendorButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addVendorButtonMouseExited(evt);
            }
        });
        addVendorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addVendorButtonActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(204, 204, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home.png"))); // NOI18N
        jLabel1.setOpaque(true);

        viewLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        viewLabel1.setForeground(new java.awt.Color(0, 102, 255));
        viewLabel1.setText("Assistant");

        toDoListButton.setBackground(new java.awt.Color(102, 102, 102));
        toDoListButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        toDoListButton.setForeground(new java.awt.Color(102, 102, 102));
        toDoListButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/toDoList.png"))); // NOI18N
        toDoListButton.setText("To Do List");
        toDoListButton.setContentAreaFilled(false);
        toDoListButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        toDoListButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                toDoListButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                toDoListButtonMouseExited(evt);
            }
        });
        toDoListButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toDoListButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout navPanelLayout = new javax.swing.GroupLayout(navPanel);
        navPanel.setLayout(navPanelLayout);
        navPanelLayout.setHorizontalGroup(
            navPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navPanelLayout.createSequentialGroup()
                .addComponent(navPanelHead, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(navPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(navPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(toDoListButton)
                    .addComponent(viewLabel1)
                    .addComponent(addVendorButton)
                    .addComponent(salesReportDayButton)
                    .addComponent(createNewPOButton)
                    .addComponent(viewMenuButton)
                    .addComponent(modifyMenuButton)
                    .addComponent(salesReportMonthButton)
                    .addComponent(settingsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inventoryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewLabel)
                    .addComponent(restaurantViewButton)
                    .addComponent(checkReservationButton))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        navPanelLayout.setVerticalGroup(
            navPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navPanelLayout.createSequentialGroup()
                .addGroup(navPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(navPanelHead, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(salesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(salesReportDayButton)
                .addGap(3, 3, 3)
                .addComponent(salesReportMonthButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inventoryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addVendorButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(createNewPOButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(settingsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(modifyMenuButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewMenuButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(viewLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(checkReservationButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(restaurantViewButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(viewLabel1)
                .addGap(18, 18, 18)
                .addComponent(toDoListButton)
                .addGap(97, 97, 97))
        );

        createNewPOButton.getAccessibleContext().setAccessibleName("createNewPO");
        addVendorButton.getAccessibleContext().setAccessibleName("vendors");

        adminMainPanel.setBackground(new java.awt.Color(242, 242, 250));
        adminMainPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        adminMainPanel.setPreferredSize(new java.awt.Dimension(700, 400));
        adminMainPanel.setLayout(new java.awt.CardLayout());

        checkReservationsPanel.setBackground(new java.awt.Color(215, 230, 255));
        checkReservationsPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        checkReservationsPanel.setPreferredSize(new java.awt.Dimension(700, 400));

        javax.swing.GroupLayout checkReservationsPanelLayout = new javax.swing.GroupLayout(checkReservationsPanel);
        checkReservationsPanel.setLayout(checkReservationsPanelLayout);
        checkReservationsPanelLayout.setHorizontalGroup(
            checkReservationsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 764, Short.MAX_VALUE)
        );
        checkReservationsPanelLayout.setVerticalGroup(
            checkReservationsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        adminMainPanel.add(checkReservationsPanel, "checkReservations");

        restaurantViewPanel.setPreferredSize(new java.awt.Dimension(700, 300));

        addToDoItemLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        addToDoItemLabel1.setText("Restaurant Table Status ");

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        table1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        table1.setForeground(new java.awt.Color(255, 255, 255));
        table1.setText("Table 1");

        addToDoItemLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        addToDoItemLabel2.setForeground(new java.awt.Color(0, 102, 0));
        addToDoItemLabel2.setText("View of Restaurant");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addToDoItemLabel2)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(table1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(491, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(addToDoItemLabel2)
                .addGap(74, 74, 74)
                .addComponent(table1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(286, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout restaurantViewPanelLayout = new javax.swing.GroupLayout(restaurantViewPanel);
        restaurantViewPanel.setLayout(restaurantViewPanelLayout);
        restaurantViewPanelLayout.setHorizontalGroup(
            restaurantViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(restaurantViewPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(restaurantViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(restaurantViewPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(addToDoItemLabel1))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        restaurantViewPanelLayout.setVerticalGroup(
            restaurantViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(restaurantViewPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(addToDoItemLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 67, Short.MAX_VALUE))
        );

        adminMainPanel.add(restaurantViewPanel, "restaurantView");

        tabelPanel.setBackground(new java.awt.Color(216, 216, 248));

        javax.swing.GroupLayout tabelPanelLayout = new javax.swing.GroupLayout(tabelPanel);
        tabelPanel.setLayout(tabelPanelLayout);
        tabelPanelLayout.setHorizontalGroup(
            tabelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 766, Short.MAX_VALUE)
        );
        tabelPanelLayout.setVerticalGroup(
            tabelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 602, Short.MAX_VALUE)
        );

        adminMainPanel.add(tabelPanel, "tabel");

        viewMenuLog.setBackground(new java.awt.Color(215, 230, 255));

        javax.swing.GroupLayout viewMenuLogLayout = new javax.swing.GroupLayout(viewMenuLog);
        viewMenuLog.setLayout(viewMenuLogLayout);
        viewMenuLogLayout.setHorizontalGroup(
            viewMenuLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 766, Short.MAX_VALUE)
        );
        viewMenuLogLayout.setVerticalGroup(
            viewMenuLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 602, Short.MAX_VALUE)
        );

        adminMainPanel.add(viewMenuLog, "viewMenu");

        checkoutPanel.setBackground(new java.awt.Color(216, 216, 248));

        javax.swing.GroupLayout checkoutPanelLayout = new javax.swing.GroupLayout(checkoutPanel);
        checkoutPanel.setLayout(checkoutPanelLayout);
        checkoutPanelLayout.setHorizontalGroup(
            checkoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 766, Short.MAX_VALUE)
        );
        checkoutPanelLayout.setVerticalGroup(
            checkoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 602, Short.MAX_VALUE)
        );

        adminMainPanel.add(checkoutPanel, "checkout");

        toDoPanel.setBackground(new java.awt.Color(236, 236, 254));
        toDoPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        addToListPanel.setBackground(new java.awt.Color(255, 255, 255));
        addToListPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        titleToDoText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 51)));

        dateToDoText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 51)));
        dateToDoText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateToDoTextActionPerformed(evt);
            }
        });

        urgentToDoCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Not Urgent", "Urgent", "Critically Urgent" }));
        urgentToDoCombo.setBorder(null);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Urgency");

        addToListButton.setText("Add to List");
        addToListButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToListButtonActionPerformed(evt);
            }
        });

        toDoLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        toDoLabel.setText("To Do");

        dueDateLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        dueDateLabel.setText("Due Date");

        cancelButton.setText("Cancel");

        dueDateformateLabel.setText("Due Date Formate: MM-DD-YYYY");

        javax.swing.GroupLayout addToListPanelLayout = new javax.swing.GroupLayout(addToListPanel);
        addToListPanel.setLayout(addToListPanelLayout);
        addToListPanelLayout.setHorizontalGroup(
            addToListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addToListPanelLayout.createSequentialGroup()
                .addGap(477, 477, 477)
                .addComponent(addToListButton)
                .addGap(18, 18, 18)
                .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 29, Short.MAX_VALUE))
            .addGroup(addToListPanelLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(addToListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleToDoText, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(toDoLabel))
                .addGap(57, 57, 57)
                .addGroup(addToListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dueDateformateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dueDateLabel)
                    .addComponent(dateToDoText, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(addToListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(urgentToDoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(57, 57, 57))
        );
        addToListPanelLayout.setVerticalGroup(
            addToListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addToListPanelLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(addToListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(toDoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(addToListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dueDateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addToListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titleToDoText, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateToDoText, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(urgentToDoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dueDateformateLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(addToListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addToListButton)
                    .addComponent(cancelButton))
                .addGap(23, 23, 23))
        );

        toDoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "To Do", "Title 2", "Title 3"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        toDoScrollPane.setViewportView(toDoTable);

        toDoListLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        toDoListLabel.setForeground(new java.awt.Color(51, 102, 0));
        toDoListLabel.setText("To Do List");

        addToDoItemLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        addToDoItemLabel.setForeground(new java.awt.Color(51, 102, 0));
        addToDoItemLabel.setText("Add To Do Item");

        javax.swing.GroupLayout toDoPanelLayout = new javax.swing.GroupLayout(toDoPanel);
        toDoPanel.setLayout(toDoPanelLayout);
        toDoPanelLayout.setHorizontalGroup(
            toDoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(toDoPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(toDoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(toDoListLabel)
                    .addComponent(addToDoItemLabel)
                    .addComponent(addToListPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(toDoScrollPane))
                .addGap(30, 30, 30))
        );
        toDoPanelLayout.setVerticalGroup(
            toDoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(toDoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addToDoItemLabel)
                .addGap(10, 10, 10)
                .addComponent(addToListPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(toDoListLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(toDoScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        adminMainPanel.add(toDoPanel, "toDo");

        newVendor.setPreferredSize(new java.awt.Dimension(700, 300));

        addVendor.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        addVendor.setText("Vendor Directory");

        addVendorPanel.setBackground(new java.awt.Color(255, 255, 255));
        addVendorPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        addVendorLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addVendorLabel.setForeground(new java.awt.Color(51, 102, 0));
        addVendorLabel.setText("Add Vendor ");

        vendorNameText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                vendorNameTextFocusLost(evt);
            }
        });

        vendorNameLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        vendorNameLabel.setForeground(new java.awt.Color(51, 51, 51));
        vendorNameLabel.setText("Vendor Name");

        vendorStreetLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        vendorStreetLabel.setForeground(new java.awt.Color(51, 51, 51));
        vendorStreetLabel.setText("Vendor Street ");

        cityLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cityLabel.setForeground(new java.awt.Color(51, 51, 51));
        cityLabel.setText("City");

        cityText.setToolTipText("");

        contactLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        contactLabel.setForeground(new java.awt.Color(51, 51, 51));
        contactLabel.setText("Contact Name");

        stateLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        stateLabel.setForeground(new java.awt.Color(51, 51, 51));
        stateLabel.setText("State");

        zipText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                zipTextFocusLost(evt);
            }
        });

        zipLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        zipLabel.setForeground(new java.awt.Color(51, 51, 51));
        zipLabel.setText("Zip");

        vendorProductTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "SKU", "Product", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        vendorProductTable.setFillsViewportHeight(true);
        addProductScrollPane.setViewportView(vendorProductTable);

        addProductLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addProductLabel.setForeground(new java.awt.Color(51, 102, 0));
        addProductLabel.setText("Add Products/Services");

        addVendorButton2.setText("Add Vendor");
        addVendorButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addVendorButton2ActionPerformed(evt);
            }
        });

        cancelVendorButton.setText("Cancel");

        phoneLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        phoneLabel.setForeground(new java.awt.Color(51, 51, 51));
        phoneLabel.setText("Phone Number");

        emailLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        emailLabel.setForeground(new java.awt.Color(51, 51, 51));
        emailLabel.setText("Email");

        javax.swing.GroupLayout addVendorPanelLayout = new javax.swing.GroupLayout(addVendorPanel);
        addVendorPanel.setLayout(addVendorPanelLayout);
        addVendorPanelLayout.setHorizontalGroup(
            addVendorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addVendorPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(addVendorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addVendorPanelLayout.createSequentialGroup()
                        .addComponent(addProductScrollPane)
                        .addGap(10, 10, 10))
                    .addGroup(addVendorPanelLayout.createSequentialGroup()
                        .addComponent(addProductLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(addVendorPanelLayout.createSequentialGroup()
                        .addGroup(addVendorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(addVendorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(vendorNameLabel)
                                .addComponent(addVendorLabel))
                            .addGroup(addVendorPanelLayout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(vendorStreetLabel))
                            .addGroup(addVendorPanelLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(addVendorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addVendorPanelLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(stateText, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(zipText, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(addVendorPanelLayout.createSequentialGroup()
                                        .addGroup(addVendorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cityLabel)
                                            .addGroup(addVendorPanelLayout.createSequentialGroup()
                                                .addComponent(stateLabel)
                                                .addGap(118, 118, 118)
                                                .addComponent(zipLabel)))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(addVendorPanelLayout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(vendorNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(vendorStreetText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cityText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(addVendorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(phoneLabel)
                            .addGroup(addVendorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addVendorPanelLayout.createSequentialGroup()
                                    .addGroup(addVendorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(phoneText, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(contactText, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(emailText, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(45, 45, 45))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addVendorPanelLayout.createSequentialGroup()
                                    .addComponent(contactLabel)
                                    .addGap(232, 232, 232)))
                            .addComponent(emailLabel)))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addVendorPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addVendorButton2)
                .addGap(36, 36, 36)
                .addComponent(cancelVendorButton)
                .addGap(54, 54, 54))
        );
        addVendorPanelLayout.setVerticalGroup(
            addVendorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addVendorPanelLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(addVendorLabel)
                .addGap(18, 18, 18)
                .addGroup(addVendorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vendorNameLabel)
                    .addComponent(contactLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(addVendorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(contactText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vendorNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(addVendorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vendorStreetLabel)
                    .addComponent(phoneLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addVendorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vendorStreetText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addVendorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cityLabel)
                    .addComponent(emailLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addVendorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cityText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addVendorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stateLabel)
                    .addComponent(zipLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(addVendorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stateText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zipText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(addProductLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addProductScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addVendorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addVendorButton2)
                    .addComponent(cancelVendorButton))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout newVendorLayout = new javax.swing.GroupLayout(newVendor);
        newVendor.setLayout(newVendorLayout);
        newVendorLayout.setHorizontalGroup(
            newVendorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, newVendorLayout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addComponent(addVendor)
                .addGap(552, 552, 552))
            .addGroup(newVendorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addVendorPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        newVendorLayout.setVerticalGroup(
            newVendorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newVendorLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(addVendor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addVendorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        adminMainPanel.add(newVendor, "newVendor");

        viewMenuPanel.setBackground(new java.awt.Color(236, 236, 254));

        viewMenuPanel2.setBackground(new java.awt.Color(255, 255, 255));
        viewMenuPanel2.setOpaque(false);

        javax.swing.GroupLayout viewMenuPanel2Layout = new javax.swing.GroupLayout(viewMenuPanel2);
        viewMenuPanel2.setLayout(viewMenuPanel2Layout);
        viewMenuPanel2Layout.setHorizontalGroup(
            viewMenuPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 708, Short.MAX_VALUE)
        );
        viewMenuPanel2Layout.setVerticalGroup(
            viewMenuPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 543, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout viewMenuPanelLayout = new javax.swing.GroupLayout(viewMenuPanel);
        viewMenuPanel.setLayout(viewMenuPanelLayout);
        viewMenuPanelLayout.setHorizontalGroup(
            viewMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewMenuPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(viewMenuPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        viewMenuPanelLayout.setVerticalGroup(
            viewMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewMenuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(viewMenuPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        adminMainPanel.add(viewMenuPanel, "viewMenu");

        modMenuScrollPane.setBackground(new java.awt.Color(255, 255, 255));
        modMenuScrollPane.setOpaque(false);
        modMenuScrollPane.setViewportView(modifyMenuTable);

        modMenuButtonPanel.setBackground(new java.awt.Color(255, 255, 255));
        modMenuButtonPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        addItemButton.setText("Add Item");
        addItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addItemButtonActionPerformed(evt);
            }
        });

        deleteItemButton.setText("Delete Item");
        deleteItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteItemButtonActionPerformed(evt);
            }
        });

        applyModifyButton.setText("Apply");
        applyModifyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applyModifyButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout modMenuButtonPanelLayout = new javax.swing.GroupLayout(modMenuButtonPanel);
        modMenuButtonPanel.setLayout(modMenuButtonPanelLayout);
        modMenuButtonPanelLayout.setHorizontalGroup(
            modMenuButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, modMenuButtonPanelLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(modMenuButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(applyModifyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteItemButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addItemButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        modMenuButtonPanelLayout.setVerticalGroup(
            modMenuButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modMenuButtonPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(addItemButton)
                .addGap(20, 20, 20)
                .addComponent(deleteItemButton)
                .addGap(18, 18, 18)
                .addComponent(applyModifyButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        modifyMenuLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        modifyMenuLabel.setText("Update Menu");

        javax.swing.GroupLayout modifyMenuPanelLayout = new javax.swing.GroupLayout(modifyMenuPanel);
        modifyMenuPanel.setLayout(modifyMenuPanelLayout);
        modifyMenuPanelLayout.setHorizontalGroup(
            modifyMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, modifyMenuPanelLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(modMenuScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(modMenuButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
            .addGroup(modifyMenuPanelLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(modifyMenuLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        modifyMenuPanelLayout.setVerticalGroup(
            modifyMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, modifyMenuPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(modifyMenuLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(modifyMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(modMenuButtonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(modMenuScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE))
                .addContainerGap(86, Short.MAX_VALUE))
        );

        adminMainPanel.add(modifyMenuPanel, "modifyMenu");

        viewMenuLog1.setBackground(new java.awt.Color(255, 255, 255));

        viewLogTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(viewLogTable);

        javax.swing.GroupLayout viewMenuLog1Layout = new javax.swing.GroupLayout(viewMenuLog1);
        viewMenuLog1.setLayout(viewMenuLog1Layout);
        viewMenuLog1Layout.setHorizontalGroup(
            viewMenuLog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewMenuLog1Layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(168, Short.MAX_VALUE))
        );
        viewMenuLog1Layout.setVerticalGroup(
            viewMenuLog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewMenuLog1Layout.createSequentialGroup()
                .addContainerGap(107, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(403, 403, 403))
        );

        adminMainPanel.add(viewMenuLog1, "viewMenuLog");

        salesReportPanel.setBackground(new java.awt.Color(216, 216, 248));

        generalSalesDataPanel.setBackground(new java.awt.Color(255, 255, 255));
        generalSalesDataPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 102)));

        generalViewMonthTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        generalScrollPane.setViewportView(generalViewMonthTable);

        generalViewLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        generalViewLabel.setText("GENERAL VIEW");

        javax.swing.GroupLayout generalSalesDataPanelLayout = new javax.swing.GroupLayout(generalSalesDataPanel);
        generalSalesDataPanel.setLayout(generalSalesDataPanelLayout);
        generalSalesDataPanelLayout.setHorizontalGroup(
            generalSalesDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(generalSalesDataPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(generalViewLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(generalSalesDataPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(generalScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
                .addContainerGap())
        );
        generalSalesDataPanelLayout.setVerticalGroup(
            generalSalesDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, generalSalesDataPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(generalViewLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(generalScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        detailSalesPanel.setBackground(new java.awt.Color(255, 255, 255));
        detailSalesPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 102)));
        detailSalesPanel.setForeground(new java.awt.Color(0, 51, 102));

        detailedViewTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        detailedScrollPane.setViewportView(detailedViewTable);

        detailedViewLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        detailedViewLabel.setText("DETAILED VIEW");

        javax.swing.GroupLayout detailSalesPanelLayout = new javax.swing.GroupLayout(detailSalesPanel);
        detailSalesPanel.setLayout(detailSalesPanelLayout);
        detailSalesPanelLayout.setHorizontalGroup(
            detailSalesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailSalesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(detailedScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(detailSalesPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(detailedViewLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        detailSalesPanelLayout.setVerticalGroup(
            detailSalesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailSalesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(detailedViewLabel)
                .addGap(18, 18, 18)
                .addComponent(detailedScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jPanel2.setForeground(new java.awt.Color(0, 0, 51));

        controlLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        controlLabel.setText("Control");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Select Month");

        monthCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "9", "10" }));
        monthCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthComboActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(controlLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(monthCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(controlLabel))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(monthCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        addVendor1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        addVendor1.setText("Sales Report");

        javax.swing.GroupLayout salesReportPanelLayout = new javax.swing.GroupLayout(salesReportPanel);
        salesReportPanel.setLayout(salesReportPanelLayout);
        salesReportPanelLayout.setHorizontalGroup(
            salesReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, salesReportPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122))
            .addGroup(salesReportPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(salesReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(generalSalesDataPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(detailSalesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addVendor1))
                .addGap(0, 22, Short.MAX_VALUE))
        );
        salesReportPanelLayout.setVerticalGroup(
            salesReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, salesReportPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(addVendor1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(detailSalesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(generalSalesDataPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        adminMainPanel.add(salesReportPanel, "salesReport");

        createPoFormPanel.setBackground(new java.awt.Color(255, 255, 255));
        createPoFormPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        addVendorLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addVendorLabel1.setForeground(new java.awt.Color(51, 102, 0));
        addVendorLabel1.setText("Create New Purchase Order");

        poNumLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        poNumLabel.setForeground(new java.awt.Color(51, 51, 51));
        poNumLabel.setText("PO #");

        vNameLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        vNameLabel.setForeground(new java.awt.Color(51, 51, 51));
        vNameLabel.setText("Vendor Name");

        searchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        searchButton.setText("Search");
        searchButton.setContentAreaFilled(false);
        searchButton.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        vNameLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        vNameLabel1.setForeground(new java.awt.Color(51, 51, 51));
        vNameLabel1.setText("Vendor Address");

        vNameLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        vNameLabel2.setForeground(new java.awt.Color(51, 51, 51));
        vNameLabel2.setText("City");

        vendorStateLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        vendorStateLabel.setForeground(new java.awt.Color(51, 51, 51));
        vendorStateLabel.setText("State");

        vendorStateLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        vendorStateLabel1.setForeground(new java.awt.Color(51, 51, 51));
        vendorStateLabel1.setText("Zip");

        orderItemsPanel.setBackground(new java.awt.Color(255, 255, 255));
        orderItemsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Product Catalog", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Arial", 1, 12), new java.awt.Color(0, 102, 0))); // NOI18N

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        vendorCatalog.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Catalog"
            }
        ));
        jScrollPane1.setViewportView(vendorCatalog);

        skuLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        skuLabel.setForeground(new java.awt.Color(51, 51, 51));
        skuLabel.setText("SKU/Product ID");

        qtyLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        qtyLabel.setForeground(new java.awt.Color(51, 51, 51));
        qtyLabel.setText("Quantity/Units");

        qtyLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        qtyLabel1.setForeground(new java.awt.Color(51, 51, 51));
        qtyLabel1.setText("Unit Price");

        Add.setText("Add");

        javax.swing.GroupLayout orderItemsPanelLayout = new javax.swing.GroupLayout(orderItemsPanel);
        orderItemsPanel.setLayout(orderItemsPanelLayout);
        orderItemsPanelLayout.setHorizontalGroup(
            orderItemsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orderItemsPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(orderItemsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(qtyLabel1)
                    .addComponent(qtyLabel)
                    .addComponent(skuLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(orderItemsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(qtyText, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                    .addComponent(priceText)
                    .addComponent(skuText))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Add)
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
        );
        orderItemsPanelLayout.setVerticalGroup(
            orderItemsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, orderItemsPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(orderItemsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(skuLabel)
                    .addComponent(skuText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(orderItemsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(qtyLabel)
                    .addComponent(qtyText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(orderItemsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(qtyLabel1)
                    .addComponent(priceText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Add))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout createPoFormPanelLayout = new javax.swing.GroupLayout(createPoFormPanel);
        createPoFormPanel.setLayout(createPoFormPanelLayout);
        createPoFormPanelLayout.setHorizontalGroup(
            createPoFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createPoFormPanelLayout.createSequentialGroup()
                .addGroup(createPoFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(createPoFormPanelLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(addVendorLabel1))
                    .addGroup(createPoFormPanelLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(createPoFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(vNameLabel)
                            .addComponent(poNumLabel)
                            .addComponent(vNameLabel1)
                            .addComponent(vNameLabel2)
                            .addComponent(vendorStateLabel))
                        .addGap(18, 18, 18)
                        .addGroup(createPoFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(vendorCityText)
                            .addComponent(vendorStreetAddyText)
                            .addComponent(poNumText)
                            .addComponent(findVendor)
                            .addGroup(createPoFormPanelLayout.createSequentialGroup()
                                .addComponent(vendorStateText, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)
                                .addComponent(vendorStateLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                                .addComponent(vendorZipText, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(orderItemsPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        createPoFormPanelLayout.setVerticalGroup(
            createPoFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createPoFormPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addVendorLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(createPoFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(poNumText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(poNumLabel))
                .addGroup(createPoFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(createPoFormPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(createPoFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(vNameLabel)
                            .addComponent(findVendor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(createPoFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(vNameLabel1)
                            .addComponent(vendorStreetAddyText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(createPoFormPanelLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(searchButton)))
                .addGap(12, 12, 12)
                .addGroup(createPoFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vNameLabel2)
                    .addComponent(vendorCityText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(createPoFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vendorStateLabel)
                    .addComponent(vendorStateText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vendorStateLabel1)
                    .addComponent(vendorZipText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(orderItemsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        addVendor2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        addVendor2.setText("Purchase");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        nameLabel.setText("Contact");

        addyLabel.setText("Street");

        phoneL.setText("phone");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SKU", "Qty", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable1);

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        totalLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        totalLabel.setText("TOTAL");

        submitPOButton.setText("Submit");

        purchaseSummaryLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        purchaseSummaryLabel.setForeground(new java.awt.Color(51, 102, 0));
        purchaseSummaryLabel.setText("Purchase Summary");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(totalLabel)
                .addGap(18, 18, 18)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(phoneL)
                    .addComponent(addyLabel)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(submitPOButton))
                    .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(purchaseSummaryLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(purchaseSummaryLabel)
                .addGap(28, 28, 28)
                .addComponent(nameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addyLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(phoneL)
                .addGap(43, 43, 43)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(totalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(submitPOButton)
                .addContainerGap())
        );

        javax.swing.GroupLayout createNewPOLayout = new javax.swing.GroupLayout(createNewPO);
        createNewPO.setLayout(createNewPOLayout);
        createNewPOLayout.setHorizontalGroup(
            createNewPOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createNewPOLayout.createSequentialGroup()
                .addGroup(createNewPOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(createNewPOLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(createPoFormPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(createNewPOLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(addVendor2)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        createNewPOLayout.setVerticalGroup(
            createNewPOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createNewPOLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addVendor2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(createNewPOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(createPoFormPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(83, Short.MAX_VALUE))
        );

        adminMainPanel.add(createNewPO, "createNewPO");

        salesReportDayPanel.setBackground(new java.awt.Color(239, 239, 255));
        salesReportDayPanel.setPreferredSize(new java.awt.Dimension(700, 400));

        generalSalesDataPanel1.setBackground(new java.awt.Color(255, 255, 255));
        generalSalesDataPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        generalViewTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        generalScrollPane1.setViewportView(generalViewTable1);

        generalViewLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        generalViewLabel1.setText("GENERAL VIEW");

        javax.swing.GroupLayout generalSalesDataPanel1Layout = new javax.swing.GroupLayout(generalSalesDataPanel1);
        generalSalesDataPanel1.setLayout(generalSalesDataPanel1Layout);
        generalSalesDataPanel1Layout.setHorizontalGroup(
            generalSalesDataPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(generalSalesDataPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(generalViewLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(generalSalesDataPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(generalScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 686, Short.MAX_VALUE)
                .addContainerGap())
        );
        generalSalesDataPanel1Layout.setVerticalGroup(
            generalSalesDataPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, generalSalesDataPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(generalViewLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(generalScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        chartPanel.setBackground(new java.awt.Color(255, 255, 255));
        chartPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        chartPanel.setForeground(new java.awt.Color(0, 51, 102));

        javax.swing.GroupLayout chartPanelLayout = new javax.swing.GroupLayout(chartPanel);
        chartPanel.setLayout(chartPanelLayout);
        chartPanelLayout.setHorizontalGroup(
            chartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 654, Short.MAX_VALUE)
        );
        chartPanelLayout.setVerticalGroup(
            chartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 261, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setForeground(new java.awt.Color(0, 0, 51));

        controlLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        controlLabel1.setText("Control");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Select a Day");

        dayComboBox.setModel(new DefaultComboBoxModel());
        RMSSalesReport rms = new RMSSalesReport();
        ArrayList<String> list = rms.getDay();
        for(Object item:list){
            dayComboBox.addItem(item);
        }
        dayComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dayComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(controlLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dayComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dayComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(26, 26, 26))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(controlLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        addVendor3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        addVendor3.setText("Daily Sales Report:");

        javax.swing.GroupLayout salesReportDayPanelLayout = new javax.swing.GroupLayout(salesReportDayPanel);
        salesReportDayPanel.setLayout(salesReportDayPanelLayout);
        salesReportDayPanelLayout.setHorizontalGroup(
            salesReportDayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, salesReportDayPanelLayout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addComponent(chartPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
            .addGroup(salesReportDayPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(salesReportDayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addVendor3)
                    .addGroup(salesReportDayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(generalSalesDataPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        salesReportDayPanelLayout.setVerticalGroup(
            salesReportDayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, salesReportDayPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(addVendor3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chartPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(generalSalesDataPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        adminMainPanel.add(salesReportDayPanel, "salesReportDay");

        addUserPanel.setPreferredSize(new java.awt.Dimension(700, 400));

        addUserLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        addUserLabel.setText("Add User");

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 0));
        jLabel6.setText("New Users Information");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Username / ID");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Password");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Phone Number");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Pay");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Role");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Email");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Pay Scale");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Schedule Filename");

        payCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Hourly", "Salary" }));

        roleCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "User", "Admin" }));

        addUserButton.setText("Add User");
        addUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel6))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(addUserButton)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14))
                                .addGap(85, 85, 85)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(phoneNumberText, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                                    .addComponent(passwordText)
                                    .addComponent(usernameText)
                                    .addComponent(scheduleFilenameText)
                                    .addComponent(emailTexr)
                                    .addComponent(payCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(roleCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(payScaleText))))))
                .addContainerGap(131, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(usernameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(passwordText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9))
                            .addComponent(phoneNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12))
                    .addComponent(emailTexr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(roleCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(payCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(payScaleText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(scheduleFilenameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(addUserButton)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout addUserPanelLayout = new javax.swing.GroupLayout(addUserPanel);
        addUserPanel.setLayout(addUserPanelLayout);
        addUserPanelLayout.setHorizontalGroup(
            addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addUserPanelLayout.createSequentialGroup()
                .addGroup(addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addUserPanelLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(addUserLabel))
                    .addGroup(addUserPanelLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        addUserPanelLayout.setVerticalGroup(
            addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addUserPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(addUserLabel)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );

        adminMainPanel.add(addUserPanel, "addUser");

        deleteUserPanel.setPreferredSize(new java.awt.Dimension(700, 400));

        deletePanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 102, 0));
        jLabel15.setText("Search For User");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Select User");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane4.setViewportView(jTextArea1);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("Reason (Optional)");

        removeUserButton.setText("Remove User");
        removeUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeUserButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout deletePanelLayout = new javax.swing.GroupLayout(deletePanel);
        deletePanel.setLayout(deletePanelLayout);
        deletePanelLayout.setHorizontalGroup(
            deletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deletePanelLayout.createSequentialGroup()
                .addGroup(deletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(deletePanelLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel15))
                    .addGroup(deletePanelLayout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(jLabel16)
                        .addGap(33, 33, 33)
                        .addComponent(userCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(deletePanelLayout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jLabel17)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, deletePanelLayout.createSequentialGroup()
                .addGap(0, 104, Short.MAX_VALUE)
                .addGroup(deletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(removeUserButton)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(98, 98, 98))
        );
        deletePanelLayout.setVerticalGroup(
            deletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deletePanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel15)
                .addGap(51, 51, 51)
                .addGroup(deletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(userCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addComponent(jLabel17)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(removeUserButton)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        deleteUserLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        deleteUserLabel.setText("Delete User");

        javax.swing.GroupLayout deleteUserPanelLayout = new javax.swing.GroupLayout(deleteUserPanel);
        deleteUserPanel.setLayout(deleteUserPanelLayout);
        deleteUserPanelLayout.setHorizontalGroup(
            deleteUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteUserPanelLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(deleteUserLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, deleteUserPanelLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(deletePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        deleteUserPanelLayout.setVerticalGroup(
            deleteUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteUserPanelLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(deleteUserLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deletePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        adminMainPanel.add(deleteUserPanel, "deleteUser");

        editUserPanel.setPreferredSize(new java.awt.Dimension(700, 400));

        editPanel.setBackground(new java.awt.Color(255, 255, 255));
        editPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        findUserCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findUserComboActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 102, 0));
        jLabel18.setText("Modify User");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setText("Username / ID");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setText("Password");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setText("Phone Number");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setText("Pay");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setText("Role");

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setText("Email");

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel25.setText("Pay Scale");

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel26.setText("Schedule Filename");

        payModify.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Hourly", "Salary" }));

        roleModify.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "User", "Admin" }));

        addUserButton1.setText("Add User");
        addUserButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout editPanelLayout = new javax.swing.GroupLayout(editPanel);
        editPanel.setLayout(editPanelLayout);
        editPanelLayout.setHorizontalGroup(
            editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editPanelLayout.createSequentialGroup()
                .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editPanelLayout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(addUserButton1)
                            .addGroup(editPanelLayout.createSequentialGroup()
                                .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(editPanelLayout.createSequentialGroup()
                                        .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel20)
                                            .addComponent(jLabel21)
                                            .addComponent(jLabel24)
                                            .addComponent(jLabel23)
                                            .addComponent(jLabel22)
                                            .addComponent(jLabel25)
                                            .addComponent(jLabel26))
                                        .addGap(85, 85, 85))
                                    .addGroup(editPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel19)
                                        .addGap(37, 37, 37)))
                                .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(findUserCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(phoneModify, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                                        .addComponent(passwordModify)
                                        .addComponent(fileModify)
                                        .addComponent(emailModify)
                                        .addComponent(payModify, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(roleModify, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(payScaleModify))))))
                    .addGroup(editPanelLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel18)))
                .addContainerGap(123, Short.MAX_VALUE))
        );
        editPanelLayout.setVerticalGroup(
            editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19)
                    .addComponent(findUserCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(editPanelLayout.createSequentialGroup()
                        .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(editPanelLayout.createSequentialGroup()
                                .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel20)
                                    .addComponent(passwordModify, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel21))
                            .addComponent(phoneModify, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel24))
                    .addComponent(emailModify, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(roleModify, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(payModify, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(payScaleModify, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(fileModify, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addComponent(addUserButton1)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        editUserLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        editUserLabel.setText("Modify User");

        javax.swing.GroupLayout editUserPanelLayout = new javax.swing.GroupLayout(editUserPanel);
        editUserPanel.setLayout(editUserPanelLayout);
        editUserPanelLayout.setHorizontalGroup(
            editUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editUserPanelLayout.createSequentialGroup()
                .addGroup(editUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editUserPanelLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(editUserLabel))
                    .addGroup(editUserPanelLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(editPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        editUserPanelLayout.setVerticalGroup(
            editUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editUserPanelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(editUserLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(editPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        adminMainPanel.add(editUserPanel, "EU");

        TitlePanel.setBackground(new java.awt.Color(204, 204, 255));
        TitlePanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        TitlePanel.setLayout(new java.awt.CardLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("    DASHBOARDS");
        TitlePanel.add(jLabel2, "card2");

        headerPanel.setBackground(new java.awt.Color(0, 0, 51));
        headerPanel.setForeground(new java.awt.Color(204, 51, 0));

        UserLoggedInLabel.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        UserLoggedInLabel.setText("You're logged in as : " + theUserLoggedIn);
        UserLoggedInLabel.setForeground(new java.awt.Color(255, 255, 255));
        UserLoggedInLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/test.png"))); // NOI18N

        LogoutButton.setBackground(new java.awt.Color(255, 255, 255));
        LogoutButton.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        LogoutButton.setForeground(new java.awt.Color(255, 255, 255));
        LogoutButton.setText("Logout");
        LogoutButton.setContentAreaFilled(false);
        LogoutButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LogoutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LogoutButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LogoutButtonMouseExited(evt);
            }
        });
        LogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(UserLoggedInLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 871, Short.MAX_VALUE)
                .addComponent(LogoutButton)
                .addGap(300, 300, 300))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                        .addComponent(LogoutButton)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(UserLoggedInLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        manageStaffPanel.setBackground(new java.awt.Color(236, 236, 254));
        manageStaffPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        settingsLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        settingsLabel1.setForeground(new java.awt.Color(0, 102, 255));
        settingsLabel1.setText("Manage Staff");
        settingsLabel1.setMaximumSize(new java.awt.Dimension(175, 25));
        settingsLabel1.setMinimumSize(new java.awt.Dimension(175, 25));
        settingsLabel1.setPreferredSize(new java.awt.Dimension(175, 25));

        addUser.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        addUser.setForeground(new java.awt.Color(102, 102, 102));
        addUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/addUser.png"))); // NOI18N
        addUser.setText("Add User");
        addUser.setContentAreaFilled(false);
        addUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addUserMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addUserMouseExited(evt);
            }
        });
        addUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserActionPerformed(evt);
            }
        });

        deleteUser.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        deleteUser.setForeground(new java.awt.Color(102, 102, 102));
        deleteUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/removeUser.png"))); // NOI18N
        deleteUser.setText("Delete User");
        deleteUser.setContentAreaFilled(false);
        deleteUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteUserMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteUserMouseExited(evt);
            }
        });
        deleteUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteUserActionPerformed(evt);
            }
        });

        editUserButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        editUserButton.setForeground(new java.awt.Color(102, 102, 102));
        editUserButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/editUser.png"))); // NOI18N
        editUserButton.setText("Modify User");
        editUserButton.setContentAreaFilled(false);
        editUserButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editUserButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editUserButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editUserButtonMouseExited(evt);
            }
        });
        editUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editUserButtonActionPerformed(evt);
            }
        });

        kronopesButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        kronopesButton.setForeground(new java.awt.Color(102, 102, 102));
        kronopesButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/kronopes.png"))); // NOI18N
        kronopesButton.setText("Kronopes Admin");
        kronopesButton.setContentAreaFilled(false);
        kronopesButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kronopesButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                kronopesButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                kronopesButtonMouseExited(evt);
            }
        });
        kronopesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kronopesButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout manageStaffPanelLayout = new javax.swing.GroupLayout(manageStaffPanel);
        manageStaffPanel.setLayout(manageStaffPanelLayout);
        manageStaffPanelLayout.setHorizontalGroup(
            manageStaffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageStaffPanelLayout.createSequentialGroup()
                .addGroup(manageStaffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(manageStaffPanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(settingsLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 15, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, manageStaffPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(manageStaffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kronopesButton)
                            .addComponent(editUserButton)
                            .addComponent(deleteUser)
                            .addComponent(addUser))))
                .addContainerGap())
        );
        manageStaffPanelLayout.setVerticalGroup(
            manageStaffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageStaffPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(settingsLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(addUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editUserButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kronopesButton)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout wholePanelLayout = new javax.swing.GroupLayout(wholePanel);
        wholePanel.setLayout(wholePanelLayout);
        wholePanelLayout.setHorizontalGroup(
            wholePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(wholePanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(navPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(wholePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(adminMainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 768, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TitlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(11, 11, 11)
                .addComponent(manageStaffPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(headerPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        wholePanelLayout.setVerticalGroup(
            wholePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(wholePanelLayout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(wholePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(wholePanelLayout.createSequentialGroup()
                        .addComponent(TitlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(wholePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(adminMainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(manageStaffPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(navPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(503, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(wholePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(wholePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

  private void LogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutButtonActionPerformed
    setVisible(false);
    dispose();
    LoginGUI login = new LoginGUI();
    login.setVisible(true);
  }//GEN-LAST:event_LogoutButtonActionPerformed

  private void checkReservationButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkReservationButtonMouseEntered
    Color customColor=  new Color(0,0,0);
    checkReservationButton.setFont(new java.awt.Font("Arial", 1, 14));
    checkReservationButton.setForeground(customColor);
  }//GEN-LAST:event_checkReservationButtonMouseEntered

  private void restaurantViewButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_restaurantViewButtonMouseEntered
    Color customColor=  new Color(0,0,0);
    restaurantViewButton.setFont(new java.awt.Font("Arial", 1, 14));
    restaurantViewButton.setForeground(customColor);
  }//GEN-LAST:event_restaurantViewButtonMouseEntered

  private void checkReservationButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkReservationButtonMouseExited
    Color customColor=  new Color(102,102,102);
    checkReservationButton.setFont(new java.awt.Font("Arial", 1, 12));
    checkReservationButton.setForeground(customColor);
  }//GEN-LAST:event_checkReservationButtonMouseExited

  private void restaurantViewButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_restaurantViewButtonMouseExited
    Color customColor=  new Color(102,102,102);
    restaurantViewButton.setFont(new java.awt.Font("Arial", 1, 12));
    restaurantViewButton.setForeground(customColor);
  }//GEN-LAST:event_restaurantViewButtonMouseExited

  private void LogoutButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutButtonMouseEntered
    LogoutButton.setForeground(Color.RED);
  }//GEN-LAST:event_LogoutButtonMouseEntered

  private void LogoutButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutButtonMouseExited
     LogoutButton.setForeground(Color.WHITE);
  }//GEN-LAST:event_LogoutButtonMouseExited

  private void checkReservationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkReservationButtonActionPerformed
    cl = (CardLayout)(adminMainPanel.getLayout());
    cl.show(adminMainPanel,"checkReservations");
    
  }//GEN-LAST:event_checkReservationButtonActionPerformed

  private void restaurantViewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restaurantViewButtonActionPerformed
    cl = (CardLayout)(adminMainPanel.getLayout());
    cl.show(adminMainPanel,"restaurantView");
    RMSTable table = new RMSTable();
    table.getTableState(table1);
    
  }//GEN-LAST:event_restaurantViewButtonActionPerformed

    private void dateToDoTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateToDoTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateToDoTextActionPerformed

    private void addToListButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToListButtonActionPerformed
        RMSToDoList tdl = new RMSToDoList();
        String  title = titleToDoText.getText();
        String  date = dateToDoText.getText();
        Boolean dateFlag, toDoFlag=false;

        String urgent = (String) urgentToDoCombo.getSelectedItem();

        toDoFlag=tdl.toDoValidate(title,titleToDoText,toDoLabel);
        dateFlag=tdl.toDoDateValidate(date, dateToDoText, dueDateLabel);

        if((toDoFlag=true)&&(dateFlag=true)){
            tdl.addToList(title,date,urgent,toDoTable);

        }

    }//GEN-LAST:event_addToListButtonActionPerformed

    private void vendorNameTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_vendorNameTextFocusLost

        RMSVendor vendor = new RMSVendor();

        if(vendorNameText.getText().isEmpty()){
            vendorNameText.setBorder(BorderFactory.createMatteBorder(2,2,2,2,Color.red));
            vendorNameLabel.setText("Vendor Name - Field cannot be blank");
            vendorNameLabel.setForeground(Color.red);
        }
    }//GEN-LAST:event_vendorNameTextFocusLost

    private void zipTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_zipTextFocusLost
        String zip = zipText.getText();
        //  vendor.validateZip(zipText,zip);
    }//GEN-LAST:event_zipTextFocusLost

    private void addVendorButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addVendorButton2ActionPerformed

        String vendorName = vendorNameText.getText();
        String contact = contactText.getText();
        String street = vendorStreetText.getText();
        String state = stateText.getText();
        String zip = zipText.getText();
        String email = emailText.getText();
        String phone = phoneText.getText();
        String city = cityText.getText();
        vendor.addVendor(vendorName, contact, street, city, zip, state, phone, email);
    }//GEN-LAST:event_addVendorButton2ActionPerformed

    private void salesReportDayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salesReportDayButtonActionPerformed
    cl = (CardLayout)(adminMainPanel.getLayout());
    cl.show(adminMainPanel,"salesReportDay");
    
    sales.getDay();
    String day = dayComboBox.getSelectedItem().toString();
       
    
     RMSSalesReport sr = new RMSSalesReport();
        //HashMap<String, Integer> test=sr.getTotalSold("9");
         
        DefaultTableModel model1=
       sr.viewDaily(day);
        
        generalViewTable1.setModel(model1);
       sales.valuesAtTable(generalViewTable1);
       sales.viewCategoryChart(chartPanel,day);
     TableColumn col = null;
        col = generalViewTable1.getColumnModel().getColumn(0);
       col.setPreferredWidth(200);
       generalScrollPane1.getViewport().setBackground(Color.WHITE);
       generalScrollPane1.getViewport().setBorder(null);
      JTableHeader header = generalViewTable1.getTableHeader();
      header.setOpaque(false);

  
    }//GEN-LAST:event_salesReportDayButtonActionPerformed

    private void salesReportDayButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salesReportDayButtonMouseEntered
    Color customColor=  new Color(0,0,0);
    salesReportDayButton.setFont(new java.awt.Font("Arial", 1, 14));
    salesReportDayButton.setForeground(customColor);
    }//GEN-LAST:event_salesReportDayButtonMouseEntered

    private void salesReportDayButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salesReportDayButtonMouseExited
    Color customColor=  new Color(102,102,102);
    salesReportDayButton.setFont(new java.awt.Font("Arial", 1, 12));
    salesReportDayButton.setForeground(customColor);
    }//GEN-LAST:event_salesReportDayButtonMouseExited

    private void salesReportMonthButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salesReportMonthButtonActionPerformed
    String month = monthCombo.getSelectedItem().toString();
    cl = (CardLayout)(adminMainPanel.getLayout());
    cl.show(adminMainPanel,"salesReport");
    RMSSalesReport sr = new RMSSalesReport();
    HashMap<String, Integer> test=sr.getTotalSold(month);
    //DefaultTableModel model1 = sr.viewMonth("9");
     //DefaultTableModel model = sr.detailedMonth("9");
    
     generalViewMonthTable.setModel(sr.viewMonth(month));
     detailedViewTable.setModel(sr.detailedMonth(month));
     TableColumn col = null;
        col = detailedViewTable.getColumnModel().getColumn(0);
       col.setPreferredWidth(100);
       //detailedViewTable.getViewport().setBackground(Color.WHITE);
       //detailedViewTable.getViewport().setBorder(null);
      JTableHeader header = detailedViewTable.getTableHeader();
      header.setOpaque(false);
    
    }//GEN-LAST:event_salesReportMonthButtonActionPerformed

    private void salesReportMonthButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salesReportMonthButtonMouseEntered
    Color customColor=  new Color(0,0,0);
    salesReportMonthButton.setFont(new java.awt.Font("Arial", 1, 14));
    salesReportMonthButton.setForeground(customColor);
    }//GEN-LAST:event_salesReportMonthButtonMouseEntered

    private void salesReportMonthButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salesReportMonthButtonMouseExited
    Color customColor=  new Color(102,102,102);
    salesReportMonthButton.setFont(new java.awt.Font("Arial", 1, 12));
    salesReportMonthButton.setForeground(customColor);
    }//GEN-LAST:event_salesReportMonthButtonMouseExited

    private void addVendorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addVendorButtonActionPerformed
    cl = (CardLayout)(adminMainPanel.getLayout());
    cl.show(adminMainPanel,"newVendor");
    }//GEN-LAST:event_addVendorButtonActionPerformed

    private void addVendorButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addVendorButtonMouseEntered
    Color customColor=  new Color(0,0,0);
    addVendorButton.setFont(new java.awt.Font("Arial", 1, 14));
    addVendorButton.setForeground(customColor);
    }//GEN-LAST:event_addVendorButtonMouseEntered

    private void addVendorButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addVendorButtonMouseExited
    Color customColor=  new Color(102,102,102);
    addVendorButton.setFont(new java.awt.Font("Arial", 1, 12));
    addVendorButton.setForeground(customColor);
    }//GEN-LAST:event_addVendorButtonMouseExited

    private void createNewPOButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createNewPOButtonActionPerformed
    cl = (CardLayout)(adminMainPanel.getLayout());
    cl.show(adminMainPanel,"createNewPO");
    }//GEN-LAST:event_createNewPOButtonActionPerformed

    private void createNewPOButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createNewPOButtonMouseEntered
    Color customColor=  new Color(0,0,0);
    createNewPOButton.setFont(new java.awt.Font("Arial", 1, 14));
    createNewPOButton.setForeground(customColor);
    }//GEN-LAST:event_createNewPOButtonMouseEntered

    private void createNewPOButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createNewPOButtonMouseExited
    Color customColor=  new Color(102,102,102);
    createNewPOButton.setFont(new java.awt.Font("Arial", 1, 12));
    createNewPOButton.setForeground(customColor);
    }//GEN-LAST:event_createNewPOButtonMouseExited

    private void modifyMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyMenuButtonActionPerformed
        
    cl = (CardLayout)(adminMainPanel.getLayout());
    cl.show(adminMainPanel,"modifyMenu");
    
        DefaultTableModel model = new DefaultTableModel();
        model = menu.viewMenu(modifyMenuTable);
    }//GEN-LAST:event_modifyMenuButtonActionPerformed

    private void modifyMenuButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modifyMenuButtonMouseEntered
    Color customColor=  new Color(0,0,0);
    modifyMenuButton.setFont(new java.awt.Font("Arial", 1, 14));
    modifyMenuButton.setForeground(customColor);
    }//GEN-LAST:event_modifyMenuButtonMouseEntered

    private void modifyMenuButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modifyMenuButtonMouseExited
    Color customColor=  new Color(102,102,102);
    modifyMenuButton.setFont(new java.awt.Font("Arial", 1, 12));
    modifyMenuButton.setForeground(customColor);
    }//GEN-LAST:event_modifyMenuButtonMouseExited

    private void viewMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewMenuButtonActionPerformed
 
    RMSMenu menu = new RMSMenu();
    menu.viewMenu(viewMenuPanel2);
    cl = (CardLayout)(adminMainPanel.getLayout());
    cl.show(adminMainPanel,"viewMenu");
    }//GEN-LAST:event_viewMenuButtonActionPerformed

    private void viewMenuButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewMenuButtonMouseEntered
    Color customColor=  new Color(0,0,0);
    viewMenuButton.setFont(new java.awt.Font("Arial", 1, 14));
    viewMenuButton.setForeground(customColor);
    }//GEN-LAST:event_viewMenuButtonMouseEntered

    private void viewMenuButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewMenuButtonMouseExited
    Color customColor=  new Color(102,102,102);
    viewMenuButton.setFont(new java.awt.Font("Arial", 1, 12));
    viewMenuButton.setForeground(customColor);
    }//GEN-LAST:event_viewMenuButtonMouseExited

    private void addItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addItemButtonActionPerformed
        menu.addItem();
    }//GEN-LAST:event_addItemButtonActionPerformed

    private void deleteItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteItemButtonActionPerformed
        menu.deleteItem(modifyMenuTable);
    }//GEN-LAST:event_deleteItemButtonActionPerformed

    private void applyModifyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applyModifyButtonActionPerformed
        menu.saveMenuChange(modifyMenuTable);
    }//GEN-LAST:event_applyModifyButtonActionPerformed

    private void dayComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dayComboBoxActionPerformed
       String day = dayComboBox.getSelectedItem().toString();

    
     RMSSalesReport sr = new RMSSalesReport();
        //HashMap<String, Integer> test=sr.getTotalSold("9");
         
        DefaultTableModel model1=
       sr.viewDaily(day);
        
        generalViewTable1.setModel(model1);
     TableColumn col = null;
        col = generalViewTable1.getColumnModel().getColumn(0);
       col.setPreferredWidth(100);
       generalScrollPane1.getViewport().setBackground(Color.WHITE);
       generalScrollPane1.getViewport().setBorder(null);
      JTableHeader header = generalViewTable1.getTableHeader();
      header.setOpaque(false);
      sales.valuesAtTable(generalViewTable1);

       sales.viewCategoryChart(chartPanel,day);
    }//GEN-LAST:event_dayComboBoxActionPerformed

    private void addUserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addUserMouseEntered
    Color customColor=  new Color(0,0,0);
    viewMenuButton.setFont(new java.awt.Font("Arial", 1, 14));
    viewMenuButton.setForeground(customColor);
    }//GEN-LAST:event_addUserMouseEntered

    private void addUserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addUserMouseExited
    Color customColor=  new Color(102,102,102);
    addUser.setFont(new java.awt.Font("Arial", 1, 12));
    addUser.setForeground(customColor);
    }//GEN-LAST:event_addUserMouseExited

    private void addUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUserActionPerformed
     cl = (CardLayout)(adminMainPanel.getLayout());
    cl.show(adminMainPanel,"addUser");
    }//GEN-LAST:event_addUserActionPerformed

    private void addUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUserButtonActionPerformed
        Database db = new Database();
        if(db.doesUserExist(usernameText.getText())==false){
            
        db.newUser(usernameText.getText(), passwordText.getText(),
    phoneNumberText.getText(), emailTexr.getText());
        db.modifyRole(usernameText.getText(), roleCombo.getSelectedItem().toString());
        db.modifyPay(usernameText.getText(), payCombo.getSelectedItem().toString());
        db.modifyPayScale(usernameText.getText(), payScaleText.getText());
        db.modifySchedule(usernameText.getText(), "src\\data\\"+scheduleFilenameText.getText());
        
    }
        else{
            JOptionPane.showMessageDialog(null, "Employee Already Exist");
        }
        
    }//GEN-LAST:event_addUserButtonActionPerformed

    private void deleteUserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteUserMouseEntered
    Color customColor=  new Color(0,0,0);
    deleteUser.setFont(new java.awt.Font("Arial", 1, 14));
    deleteUser.setForeground(customColor);
    }//GEN-LAST:event_deleteUserMouseEntered

    private void deleteUserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteUserMouseExited
    Color customColor=  new Color(102,102,102);
    deleteUser.setFont(new java.awt.Font("Arial", 1, 12));
    deleteUser.setForeground(customColor);
    }//GEN-LAST:event_deleteUserMouseExited

    private void deleteUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteUserActionPerformed
    cl = (CardLayout)(adminMainPanel.getLayout());
    cl.show(adminMainPanel,"deleteUser");
    Database db = new Database();
    List<String> firstList = Collections.synchronizedList(new ArrayList<String>());
    List<String> List = Collections.synchronizedList(new ArrayList<String>());
    firstList = db.getAllUsers();
    
    for(int i = 0; i <firstList.size(); i++){
        if((!firstList.get(i).equals(""))){
            List.add(firstList.get(i));
        }
      cl.show(adminMainPanel,"deleteUser");
    }
    
    //DefaultComboBoxModel model = new DefaultComboBoxModel(firstList.toArray());
    //userCombo = new JComboBox(model);
    userCombo.setModel(new javax.swing.DefaultComboBoxModel(List.toArray()));
    }//GEN-LAST:event_deleteUserActionPerformed

    private void removeUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeUserButtonActionPerformed
        Database db = new Database();
        db.modifyUsername(userCombo.getSelectedItem().toString(), "");
        JOptionPane.showMessageDialog(null, "User "+userCombo.getSelectedItem().toString()+" was Removed");
    }//GEN-LAST:event_removeUserButtonActionPerformed

    private void monthComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthComboActionPerformed
        String month = monthCombo.getSelectedItem().toString();
        viewMonth(month);
    }//GEN-LAST:event_monthComboActionPerformed

    private void toDoListButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toDoListButtonMouseEntered
           Color customColor=  new Color(0,0,0);
    toDoListButton.setFont(new java.awt.Font("Arial", 1, 14));
    toDoListButton.setForeground(customColor);
    }//GEN-LAST:event_toDoListButtonMouseEntered

    private void toDoListButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toDoListButtonMouseExited
           Color customColor=  new Color(102,102,102);
    toDoListButton.setFont(new java.awt.Font("Arial", 1, 12));
    toDoListButton.setForeground(customColor);
    }//GEN-LAST:event_toDoListButtonMouseExited

    private void toDoListButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toDoListButtonActionPerformed
      cl = (CardLayout)(adminMainPanel.getLayout());
    cl.show(adminMainPanel,"toDo");
    }//GEN-LAST:event_toDoListButtonActionPerformed

    private void editUserButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editUserButtonMouseEntered
           Color customColor=  new Color(0,0,0);
    checkReservationButton.setFont(new java.awt.Font("Arial", 1, 14));
    checkReservationButton.setForeground(customColor);
    }//GEN-LAST:event_editUserButtonMouseEntered

    private void editUserButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editUserButtonMouseExited
     Color customColor=  new Color(102,102,102);
    checkReservationButton.setFont(new java.awt.Font("Arial", 1, 12));
    checkReservationButton.setForeground(customColor);
    }//GEN-LAST:event_editUserButtonMouseExited

    private void editUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editUserButtonActionPerformed
    cl = (CardLayout)(adminMainPanel.getLayout());
    cl.show(adminMainPanel,"EU");
     Database db = new Database();
    List<String> firstList = Collections.synchronizedList(new ArrayList<String>());
    List<String> List = Collections.synchronizedList(new ArrayList<String>());
    firstList = db.getAllUsers();
    
    for(int i = 0; i <firstList.size(); i++){
        if((!firstList.get(i).equals(""))){
            List.add(firstList.get(i));
        }
      //cl.show(adminMainPanel,"deleteUser");
    }
    
    //DefaultComboBoxModel model = new DefaultComboBoxModel(firstList.toArray());
    //userCombo = new JComboBox(model);
    userCombo.setModel(new javax.swing.DefaultComboBoxModel(List.toArray()));
    }//GEN-LAST:event_editUserButtonActionPerformed

    private void addUserButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUserButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addUserButton1ActionPerformed

    private void findUserComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findUserComboActionPerformed
Database db = new Database();
String user = findUserCombo.getSelectedItem().toString();
passwordModify.setText(db.getUsernameInformation(user).get(1).toString());
phoneModify.setText(db.getUsernameInformation(user).get(2).toString());
emailModify.setText(db.getUsernameInformation(user).get(3).toString());
payScaleModify.setText(db.getUsernameInformation(user).get(6).toString());
fileModify.setText(db.getUsernameInformation(user).get(7).toString());

    }//GEN-LAST:event_findUserComboActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
         RMSVendor vendor = new RMSVendor();
        
        String[] fv;
        fv = vendor.findVendor(vendorNameText.getText().toLowerCase());
        int result =JOptionPane.showConfirmDialog(null, "Are you looking for "+fv[0]+ " at "+fv[1]);
        if(result == JOptionPane.OK_OPTION){
        
        nameLabel.setText(fv[2]);
        addyLabel.setText(fv[3]);
        phoneL.setText(fv[4]);
        
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void kronopesButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kronopesButtonMouseEntered
         Color customColor=  new Color(0,0,0);
    toDoListButton.setFont(new java.awt.Font("Arial", 1, 14));
    toDoListButton.setForeground(customColor);
    }//GEN-LAST:event_kronopesButtonMouseEntered

    private void kronopesButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kronopesButtonMouseExited
         Color customColor=  new Color(102,102,102);
    toDoListButton.setFont(new java.awt.Font("Arial", 1, 12));
    toDoListButton.setForeground(customColor);
    }//GEN-LAST:event_kronopesButtonMouseExited

    private void kronopesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kronopesButtonActionPerformed
       KronopesAdmin ka = new KronopesAdmin();
    }//GEN-LAST:event_kronopesButtonActionPerformed
  
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
           JOptionPane.showMessageDialog(null, "Error in validation");
        }

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new RMSAdminGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JButton LogoutButton;
    private javax.swing.JPanel TitlePanel;
    private javax.swing.JLabel UserLoggedInLabel;
    private javax.swing.JButton addItemButton;
    private javax.swing.JLabel addProductLabel;
    private javax.swing.JScrollPane addProductScrollPane;
    private javax.swing.JLabel addToDoItemLabel;
    private javax.swing.JLabel addToDoItemLabel1;
    private javax.swing.JLabel addToDoItemLabel2;
    private javax.swing.JButton addToListButton;
    private javax.swing.JPanel addToListPanel;
    private javax.swing.JButton addUser;
    private javax.swing.JButton addUserButton;
    private javax.swing.JButton addUserButton1;
    private javax.swing.JLabel addUserLabel;
    private javax.swing.JPanel addUserPanel;
    private javax.swing.JLabel addVendor;
    private javax.swing.JLabel addVendor1;
    private javax.swing.JLabel addVendor2;
    private javax.swing.JLabel addVendor3;
    private javax.swing.JButton addVendorButton;
    private javax.swing.JButton addVendorButton2;
    private javax.swing.JLabel addVendorLabel;
    private javax.swing.JLabel addVendorLabel1;
    private javax.swing.JPanel addVendorPanel;
    private javax.swing.JLabel addyLabel;
    private javax.swing.JPanel adminMainPanel;
    private javax.swing.JButton applyModifyButton;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton cancelVendorButton;
    private javax.swing.JPanel chartPanel;
    private javax.swing.JButton checkReservationButton;
    private javax.swing.JPanel checkReservationsPanel;
    private javax.swing.JPanel checkoutPanel;
    private javax.swing.JLabel cityLabel;
    private javax.swing.JTextField cityText;
    private javax.swing.JLabel contactLabel;
    private javax.swing.JTextField contactText;
    private javax.swing.JLabel controlLabel;
    private javax.swing.JLabel controlLabel1;
    private javax.swing.JPanel createNewPO;
    private javax.swing.JButton createNewPOButton;
    private javax.swing.JPanel createPoFormPanel;
    private javax.swing.JTextField dateToDoText;
    private javax.swing.JComboBox dayComboBox;
    private javax.swing.JButton deleteItemButton;
    private javax.swing.JPanel deletePanel;
    private javax.swing.JButton deleteUser;
    private javax.swing.JLabel deleteUserLabel;
    private javax.swing.JPanel deleteUserPanel;
    private javax.swing.JPanel detailSalesPanel;
    private javax.swing.JScrollPane detailedScrollPane;
    private javax.swing.JLabel detailedViewLabel;
    private javax.swing.JTable detailedViewTable;
    private javax.swing.JLabel dueDateLabel;
    private javax.swing.JLabel dueDateformateLabel;
    private javax.swing.JPanel editPanel;
    private javax.swing.JButton editUserButton;
    private javax.swing.JLabel editUserLabel;
    private javax.swing.JPanel editUserPanel;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailModify;
    private javax.swing.JTextField emailTexr;
    private javax.swing.JTextField emailText;
    private javax.swing.JTextField fileModify;
    private javax.swing.JComboBox findUserCombo;
    private javax.swing.JTextField findVendor;
    private javax.swing.JPanel generalSalesDataPanel;
    private javax.swing.JPanel generalSalesDataPanel1;
    private javax.swing.JScrollPane generalScrollPane;
    private javax.swing.JScrollPane generalScrollPane1;
    private javax.swing.JLabel generalViewLabel;
    private javax.swing.JLabel generalViewLabel1;
    private javax.swing.JTable generalViewMonthTable;
    private javax.swing.JTable generalViewTable1;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel inventoryLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton kronopesButton;
    private javax.swing.JPanel manageStaffPanel;
    private javax.swing.JPanel modMenuButtonPanel;
    private javax.swing.JScrollPane modMenuScrollPane;
    private javax.swing.JButton modifyMenuButton;
    private javax.swing.JLabel modifyMenuLabel;
    private javax.swing.JPanel modifyMenuPanel;
    private javax.swing.JTable modifyMenuTable;
    private javax.swing.JComboBox monthCombo;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JPanel navPanel;
    private javax.swing.JLabel navPanelHead;
    private javax.swing.JPanel newVendor;
    private javax.swing.JPanel orderItemsPanel;
    private javax.swing.JTextField passwordModify;
    private javax.swing.JTextField passwordText;
    private javax.swing.JComboBox payCombo;
    private javax.swing.JComboBox payModify;
    private javax.swing.JTextField payScaleModify;
    private javax.swing.JTextField payScaleText;
    private javax.swing.JLabel phoneL;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JTextField phoneModify;
    private javax.swing.JTextField phoneNumberText;
    private javax.swing.JTextField phoneText;
    private javax.swing.JLabel poNumLabel;
    private javax.swing.JTextField poNumText;
    private javax.swing.JTextField priceText;
    private javax.swing.JLabel purchaseSummaryLabel;
    private javax.swing.JLabel qtyLabel;
    private javax.swing.JLabel qtyLabel1;
    private javax.swing.JTextField qtyText;
    private javax.swing.JButton removeUserButton;
    private javax.swing.JButton restaurantViewButton;
    private javax.swing.JPanel restaurantViewPanel;
    private javax.swing.JComboBox roleCombo;
    private javax.swing.JComboBox roleModify;
    private javax.swing.JLabel salesLabel;
    private javax.swing.JButton salesReportDayButton;
    private javax.swing.JPanel salesReportDayPanel;
    private javax.swing.JButton salesReportMonthButton;
    private javax.swing.JPanel salesReportPanel;
    private javax.swing.JTextField scheduleFilenameText;
    private javax.swing.JButton searchButton;
    private javax.swing.JLabel settingsLabel;
    private javax.swing.JLabel settingsLabel1;
    private javax.swing.JLabel skuLabel;
    private javax.swing.JTextField skuText;
    private javax.swing.JLabel stateLabel;
    private javax.swing.JTextField stateText;
    private javax.swing.JButton submitPOButton;
    private javax.swing.JPanel tabelPanel;
    private javax.swing.JButton table1;
    private javax.swing.JTextField titleToDoText;
    private javax.swing.JLabel toDoLabel;
    private javax.swing.JButton toDoListButton;
    private javax.swing.JLabel toDoListLabel;
    private javax.swing.JPanel toDoPanel;
    private javax.swing.JScrollPane toDoScrollPane;
    private javax.swing.JTable toDoTable;
    private javax.swing.JLabel totalLabel;
    private javax.swing.JComboBox urgentToDoCombo;
    private javax.swing.JComboBox userCombo;
    private javax.swing.JTextField usernameText;
    private javax.swing.JLabel vNameLabel;
    private javax.swing.JLabel vNameLabel1;
    private javax.swing.JLabel vNameLabel2;
    private javax.swing.JTable vendorCatalog;
    private javax.swing.JTextField vendorCityText;
    private javax.swing.JLabel vendorNameLabel;
    private javax.swing.JTextField vendorNameText;
    private javax.swing.JTable vendorProductTable;
    private javax.swing.JLabel vendorStateLabel;
    private javax.swing.JLabel vendorStateLabel1;
    private javax.swing.JTextField vendorStateText;
    private javax.swing.JTextField vendorStreetAddyText;
    private javax.swing.JLabel vendorStreetLabel;
    private javax.swing.JTextField vendorStreetText;
    private javax.swing.JTextField vendorZipText;
    private javax.swing.JLabel viewLabel;
    private javax.swing.JLabel viewLabel1;
    private javax.swing.JTable viewLogTable;
    private javax.swing.JButton viewMenuButton;
    private javax.swing.JPanel viewMenuLog;
    private javax.swing.JPanel viewMenuLog1;
    private javax.swing.JPanel viewMenuPanel;
    private javax.swing.JPanel viewMenuPanel2;
    private javax.swing.JPanel wholePanel;
    private javax.swing.JLabel zipLabel;
    private javax.swing.JTextField zipText;
    // End of variables declaration//GEN-END:variables

    private void viewMonth(String month) {
            RMSSalesReport sr = new RMSSalesReport();
    HashMap<String, Integer> test=sr.getTotalSold(month);
    //DefaultTableModel model1 = sr.viewMonth("9");
     //DefaultTableModel model = sr.detailedMonth("9");
    
     generalViewMonthTable.setModel(sr.viewMonth(month));
     detailedViewTable.setModel(sr.detailedMonth(month));
     TableColumn col = null;
        col = detailedViewTable.getColumnModel().getColumn(0);
       col.setPreferredWidth(100);
       //detailedViewTable.getViewport().setBackground(Color.WHITE);
       //detailedViewTable.getViewport().setBorder(null);
      JTableHeader header = detailedViewTable.getTableHeader();
      header.setOpaque(false);
    }

 
}
    


