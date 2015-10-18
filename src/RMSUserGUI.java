

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.GridLayout;
import java.awt.Image;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;

public class RMSUserGUI extends JFrame {
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

public RMSUserGUI() {
  initComponents();
  init(theUserLoggedIn);
}
public RMSUserGUI(String username){
  theUserLoggedIn = username;
  initComponents();
  init(theUserLoggedIn);
}
private void init(String theUserLoggedIn){
  this.setIconImage(new 
  ImageIcon(getClass().getResource("images\\5mbicon1.png")).getImage());
  UserLoggedInLabel.setText("You're logged in as : " + theUserLoggedIn);
  setTitle("User Console");
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  this.setSize(1380, 900);
  setLocationRelativeTo(null);
  setVisible(true);
  RMSToDoList td = new RMSToDoList();
  model=td.viewTodoList();
  if(!parse.isFileEmpty(RESTNAMEFILE)){
    restaurantName = parse.returnRestaurantName(RESTNAMEFILE);
    welcomeScreen.setText("Welcome to " +restaurantName);
  }
   try{
    information = database.getUsernameInformation(theUserLoggedIn);
    System.out.println(theUserLoggedIn);
    
    if(theUserLoggedIn != null && !theUserLoggedIn.isEmpty()){
     image = database.getImage(theUserLoggedIn);
     System.out.print(image);
     System.out.println("Entered if");
     ImageIcon picture = new ImageIcon(getClass().getResource(image));
     Image theimage = picture.getImage();
     theimage = theimage.getScaledInstance(312,312,Image.SCALE_SMOOTH);
     picture.setImage(theimage);
     imageOfYou.setIcon(picture);
     /*
     imageOfYou.setIcon(new ImageIcon(((new ImageIcon(image)).getImage())
               .getScaledInstance(312, 312, java.awt.Image.SCALE_SMOOTH))); */
    }else{
      imageOfYou.setIcon(new javax.swing.ImageIcon(getClass().getResource(image))); 
      System.out.println("Entered else");
    }
   }catch(Exception e){
     imageOfYou.setIcon(new ImageIcon(((new ImageIcon(image)).getImage())
               .getScaledInstance(312, 312, java.awt.Image.SCALE_SMOOTH)));
     System.out.print("caught");
     throw e;
   }
}
    
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    wholePanel = new javax.swing.JPanel();
    navPanel = new javax.swing.JPanel();
    navPanelHead = new javax.swing.JLabel();
    kronopesButton = new javax.swing.JButton();
    checkReservationButton = new javax.swing.JButton();
    restaurantViewButton = new javax.swing.JButton();
    scheduleLabel = new javax.swing.JLabel();
    viewLabel = new javax.swing.JLabel();
    settingsLabel = new javax.swing.JLabel();
    userPreferenceButton = new javax.swing.JButton();
    homeButton = new javax.swing.JButton();
    checkoutButton = new javax.swing.JButton();
    viewMenuButton = new javax.swing.JButton();
    UserMainPanel = new javax.swing.JPanel();
    homePanel = new javax.swing.JPanel();
    welomeUserLabel = new javax.swing.JLabel();
    checkReservationsPanel = new javax.swing.JPanel();
    restaurantViewPanel = new javax.swing.JPanel();
    tablePanel = new javax.swing.JPanel();
    checkOutPanel = new javax.swing.JPanel();
    viewMenuLog = new javax.swing.JPanel();
    userPreference = new javax.swing.JPanel();
    yourUsernamePreferenece = new javax.swing.JLabel();
    yourPasswordPreference = new javax.swing.JLabel();
    yourEmailPreference = new javax.swing.JLabel();
    passwordInfo = new javax.swing.JLabel();
    yourPayType = new javax.swing.JLabel();
    yourPayScale = new javax.swing.JLabel();
    payTypeInfo = new javax.swing.JLabel();
    payScaleInfo = new javax.swing.JLabel();
    yourPhoneNumberPreference = new javax.swing.JLabel();
    yourRolePreference = new javax.swing.JLabel();
    usernameInfo = new javax.swing.JLabel();
    emailInfo = new javax.swing.JLabel();
    phoneNumberInfo = new javax.swing.JLabel();
    roleInfo = new javax.swing.JLabel();
    youPanel = new javax.swing.JPanel();
    imageOfYou = new javax.swing.JLabel();
    editPreferenceButton = new javax.swing.JButton();
    applyPreferenceButton = new javax.swing.JButton();
    checkoutPanel = new javax.swing.JPanel();
    alertScrollPanel = new javax.swing.JScrollPane();
    alertTable = new javax.swing.JTable();
    summaryScrollPane = new javax.swing.JScrollPane();
    summaryTable = new javax.swing.JTable();
    TitlePanel = new javax.swing.JPanel();
    welcomeScreen = new javax.swing.JLabel();
    headerPanel = new javax.swing.JPanel();
    UserLoggedInLabel = new javax.swing.JLabel();
    LogoutButton = new javax.swing.JButton();

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
    navPanelHead.setText("  RMS User Console");
    navPanelHead.setOpaque(true);

    kronopesButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
    kronopesButton.setForeground(new java.awt.Color(102, 102, 102));
    kronopesButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/schedule-icon.png"))); // NOI18N
    kronopesButton.setText("Kronopes");
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
    restaurantViewButton.setText("Restaurant View");
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

    scheduleLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
    scheduleLabel.setForeground(new java.awt.Color(0, 102, 255));
    scheduleLabel.setText("Schedule");
    scheduleLabel.setMaximumSize(new java.awt.Dimension(175, 25));
    scheduleLabel.setMinimumSize(new java.awt.Dimension(175, 25));
    scheduleLabel.setPreferredSize(new java.awt.Dimension(175, 25));

    viewLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
    viewLabel.setForeground(new java.awt.Color(0, 102, 255));
    viewLabel.setText("View");

    settingsLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
    settingsLabel.setForeground(new java.awt.Color(0, 102, 255));
    settingsLabel.setText("Settings");

    userPreferenceButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
    userPreferenceButton.setForeground(new java.awt.Color(102, 102, 102));
    userPreferenceButton.setText("Profile");
    userPreferenceButton.setContentAreaFilled(false);
    userPreferenceButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    userPreferenceButton.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        userPreferenceButtonMouseEntered(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        userPreferenceButtonMouseExited(evt);
      }
    });
    userPreferenceButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        userPreferenceButtonActionPerformed(evt);
      }
    });

    homeButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
    homeButton.setForeground(new java.awt.Color(102, 102, 102));
    homeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home.png"))); // NOI18N
    homeButton.setText("Home");
    homeButton.setToolTipText("");
    homeButton.setContentAreaFilled(false);
    homeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    homeButton.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        homeButtonMouseEntered(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        homeButtonMouseExited(evt);
      }
    });
    homeButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        homeButtonActionPerformed(evt);
      }
    });

    checkoutButton.setBackground(new java.awt.Color(0, 0, 0));
    checkoutButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
    checkoutButton.setForeground(new java.awt.Color(102, 102, 102));
    checkoutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/checkout.png"))); // NOI18N
    checkoutButton.setText("Checkout");
    checkoutButton.setContentAreaFilled(false);
    checkoutButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    checkoutButton.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        checkoutButtonMouseEntered(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        checkoutButtonMouseExited(evt);
      }
    });
    checkoutButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        checkoutButtonActionPerformed(evt);
      }
    });

    viewMenuButton.setBackground(new java.awt.Color(0, 0, 0));
    viewMenuButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
    viewMenuButton.setForeground(new java.awt.Color(102, 102, 102));
    viewMenuButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/viewmenu.png"))); // NOI18N
    viewMenuButton.setText("View Menu");
    viewMenuButton.setContentAreaFilled(false);
    viewMenuButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    viewMenuButton.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseExited(java.awt.event.MouseEvent evt) {
        viewMenuButtonMouseExited(evt);
      }
    });
    viewMenuButton.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
      public void mouseMoved(java.awt.event.MouseEvent evt) {
        viewMenuButtonMouseMoved(evt);
      }
    });
    viewMenuButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        viewMenuButtonActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout navPanelLayout = new javax.swing.GroupLayout(navPanel);
    navPanel.setLayout(navPanelLayout);
    navPanelLayout.setHorizontalGroup(
      navPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(navPanelHead, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addGroup(navPanelLayout.createSequentialGroup()
        .addGap(25, 25, 25)
        .addGroup(navPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(viewMenuButton)
          .addComponent(checkoutButton)
          .addComponent(homeButton)
          .addComponent(userPreferenceButton)
          .addComponent(viewLabel)
          .addComponent(restaurantViewButton)
          .addComponent(checkReservationButton)
          .addComponent(settingsLabel)
          .addGroup(navPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
            .addComponent(scheduleLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(kronopesButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        .addContainerGap(20, Short.MAX_VALUE))
    );
    navPanelLayout.setVerticalGroup(
      navPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(navPanelLayout.createSequentialGroup()
        .addComponent(navPanelHead, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(33, 33, 33)
        .addComponent(scheduleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(kronopesButton)
        .addGap(18, 18, 18)
        .addComponent(viewLabel)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(homeButton)
        .addGap(11, 11, 11)
        .addComponent(checkReservationButton)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(restaurantViewButton)
        .addGap(11, 11, 11)
        .addComponent(checkoutButton)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(viewMenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addComponent(settingsLabel)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(userPreferenceButton)
        .addGap(0, 150, Short.MAX_VALUE))
    );

    UserMainPanel.setBackground(new java.awt.Color(242, 242, 250));
    UserMainPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
    UserMainPanel.setPreferredSize(new java.awt.Dimension(700, 400));
    UserMainPanel.setLayout(new java.awt.CardLayout());

    homePanel.setPreferredSize(new java.awt.Dimension(761, 500));

    welomeUserLabel.setText("Welcome "+theUserLoggedIn
      + " please make sure to check our menu specials to inform our customers."
      + " Enjoy your workday!");

    javax.swing.GroupLayout homePanelLayout = new javax.swing.GroupLayout(homePanel);
    homePanel.setLayout(homePanelLayout);
    homePanelLayout.setHorizontalGroup(
      homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(homePanelLayout.createSequentialGroup()
        .addGap(21, 21, 21)
        .addComponent(welomeUserLabel)
        .addContainerGap(674, Short.MAX_VALUE))
    );
    homePanelLayout.setVerticalGroup(
      homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(homePanelLayout.createSequentialGroup()
        .addGap(29, 29, 29)
        .addComponent(welomeUserLabel)
        .addContainerGap(554, Short.MAX_VALUE))
    );

    UserMainPanel.add(homePanel, "home");

    checkReservationsPanel.setBackground(new java.awt.Color(215, 230, 255));
    checkReservationsPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

    javax.swing.GroupLayout checkReservationsPanelLayout = new javax.swing.GroupLayout(checkReservationsPanel);
    checkReservationsPanel.setLayout(checkReservationsPanelLayout);
    checkReservationsPanelLayout.setHorizontalGroup(
      checkReservationsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 759, Short.MAX_VALUE)
    );
    checkReservationsPanelLayout.setVerticalGroup(
      checkReservationsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 595, Short.MAX_VALUE)
    );

    UserMainPanel.add(checkReservationsPanel, "checkReservations");

    restaurantViewPanel.setPreferredSize(new java.awt.Dimension(700, 300));

    javax.swing.GroupLayout restaurantViewPanelLayout = new javax.swing.GroupLayout(restaurantViewPanel);
    restaurantViewPanel.setLayout(restaurantViewPanelLayout);
    restaurantViewPanelLayout.setHorizontalGroup(
      restaurantViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 761, Short.MAX_VALUE)
    );
    restaurantViewPanelLayout.setVerticalGroup(
      restaurantViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 597, Short.MAX_VALUE)
    );

    UserMainPanel.add(restaurantViewPanel, "restaurantView");

    tablePanel.setBackground(new java.awt.Color(216, 216, 248));

    javax.swing.GroupLayout tablePanelLayout = new javax.swing.GroupLayout(tablePanel);
    tablePanel.setLayout(tablePanelLayout);
    tablePanelLayout.setHorizontalGroup(
      tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 761, Short.MAX_VALUE)
    );
    tablePanelLayout.setVerticalGroup(
      tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 597, Short.MAX_VALUE)
    );

    UserMainPanel.add(tablePanel, "tabel");

    javax.swing.GroupLayout checkOutPanelLayout = new javax.swing.GroupLayout(checkOutPanel);
    checkOutPanel.setLayout(checkOutPanelLayout);
    checkOutPanelLayout.setHorizontalGroup(
      checkOutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 761, Short.MAX_VALUE)
    );
    checkOutPanelLayout.setVerticalGroup(
      checkOutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 597, Short.MAX_VALUE)
    );

    UserMainPanel.add(checkOutPanel, "checkout");

    viewMenuLog.setBackground(new java.awt.Color(215, 230, 255));

    javax.swing.GroupLayout viewMenuLogLayout = new javax.swing.GroupLayout(viewMenuLog);
    viewMenuLog.setLayout(viewMenuLogLayout);
    viewMenuLogLayout.setHorizontalGroup(
      viewMenuLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 761, Short.MAX_VALUE)
    );
    viewMenuLogLayout.setVerticalGroup(
      viewMenuLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 597, Short.MAX_VALUE)
    );

    UserMainPanel.add(viewMenuLog, "viewMenu");

    userPreference.setBackground(new java.awt.Color(216, 216, 248));

    yourUsernamePreferenece.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
    yourUsernamePreferenece.setText("Username:");

    yourPasswordPreference.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
    yourPasswordPreference.setText("Password:");

    yourEmailPreference.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
    yourEmailPreference.setText("Email:");

    passwordInfo.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
    passwordInfo.setText("N/A");
    passwordInfo.setToolTipText("click to edit");

    yourPayType.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
    yourPayType.setText("Pay Type:");

    yourPayScale.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
    yourPayScale.setText("Pay Scale:");

    payTypeInfo.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
    payTypeInfo.setText("N/A");

    payScaleInfo.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
    payScaleInfo.setText("N/A");

    yourPhoneNumberPreference.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
    yourPhoneNumberPreference.setText("Phone Number:");

    yourRolePreference.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
    yourRolePreference.setText("Your Role:");

    usernameInfo.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
    usernameInfo.setText(theUserLoggedIn);

    emailInfo.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
    emailInfo.setText("N/A");

    phoneNumberInfo.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
    phoneNumberInfo.setText("N/A");

    roleInfo.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
    roleInfo.setText("N/A");

    imageOfYou.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/testIMAGE.jpg"))); // NOI18N
    imageOfYou.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        imageOfYouMouseClicked(evt);
      }
    });

    javax.swing.GroupLayout youPanelLayout = new javax.swing.GroupLayout(youPanel);
    youPanel.setLayout(youPanelLayout);
    youPanelLayout.setHorizontalGroup(
      youPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(youPanelLayout.createSequentialGroup()
        .addComponent(imageOfYou)
        .addGap(0, 0, Short.MAX_VALUE))
    );
    youPanelLayout.setVerticalGroup(
      youPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(imageOfYou, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    editPreferenceButton.setText("Edit");
    editPreferenceButton.setMaximumSize(new java.awt.Dimension(59, 23));
    editPreferenceButton.setMinimumSize(new java.awt.Dimension(59, 23));
    editPreferenceButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        editPreferenceButtonActionPerformed(evt);
      }
    });

    applyPreferenceButton.setText("Apply");

    javax.swing.GroupLayout userPreferenceLayout = new javax.swing.GroupLayout(userPreference);
    userPreference.setLayout(userPreferenceLayout);
    userPreferenceLayout.setHorizontalGroup(
      userPreferenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(userPreferenceLayout.createSequentialGroup()
        .addGap(21, 21, 21)
        .addGroup(userPreferenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(userPreferenceLayout.createSequentialGroup()
            .addGroup(userPreferenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(userPreferenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(yourPhoneNumberPreference, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                .addComponent(yourRolePreference)
                .addComponent(yourEmailPreference, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(yourUsernamePreferenece, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
              .addComponent(yourPasswordPreference)
              .addComponent(yourPayType)
              .addComponent(yourPayScale))
            .addGap(18, 18, 18)
            .addGroup(userPreferenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(payScaleInfo)
              .addComponent(payTypeInfo)
              .addComponent(passwordInfo)
              .addComponent(usernameInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(roleInfo)
              .addComponent(emailInfo)
              .addComponent(phoneNumberInfo)))
          .addGroup(userPreferenceLayout.createSequentialGroup()
            .addComponent(editPreferenceButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(applyPreferenceButton)))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 214, Short.MAX_VALUE)
        .addComponent(youPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(55, 55, 55))
    );
    userPreferenceLayout.setVerticalGroup(
      userPreferenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(userPreferenceLayout.createSequentialGroup()
        .addGroup(userPreferenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(userPreferenceLayout.createSequentialGroup()
            .addGap(28, 28, 28)
            .addGroup(userPreferenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(usernameInfo)
              .addComponent(yourUsernamePreferenece, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(userPreferenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(yourPasswordPreference)
              .addComponent(passwordInfo))
            .addGap(18, 18, 18)
            .addGroup(userPreferenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(yourEmailPreference)
              .addComponent(emailInfo))
            .addGap(18, 18, 18)
            .addGroup(userPreferenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(yourPhoneNumberPreference)
              .addComponent(phoneNumberInfo))
            .addGap(18, 18, 18)
            .addGroup(userPreferenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(yourRolePreference)
              .addComponent(roleInfo))
            .addGap(18, 18, 18)
            .addGroup(userPreferenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(yourPayType)
              .addComponent(payTypeInfo))
            .addGap(18, 18, 18)
            .addGroup(userPreferenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(yourPayScale)
              .addComponent(payScaleInfo))
            .addGap(33, 33, 33)
            .addGroup(userPreferenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(editPreferenceButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(applyPreferenceButton)))
          .addGroup(userPreferenceLayout.createSequentialGroup()
            .addGap(20, 20, 20)
            .addComponent(youPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addContainerGap(265, Short.MAX_VALUE))
    );

    UserMainPanel.add(userPreference, "userPreference");

    checkoutPanel.setBackground(new java.awt.Color(216, 216, 248));

    javax.swing.GroupLayout checkoutPanelLayout = new javax.swing.GroupLayout(checkoutPanel);
    checkoutPanel.setLayout(checkoutPanelLayout);
    checkoutPanelLayout.setHorizontalGroup(
      checkoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 761, Short.MAX_VALUE)
    );
    checkoutPanelLayout.setVerticalGroup(
      checkoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 597, Short.MAX_VALUE)
    );

    UserMainPanel.add(checkoutPanel, "checkout");

    alertTable.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
    alertTable.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {

      },
      new String [] {
        "Alerts"
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
    alertScrollPanel.setViewportView(alertTable);

    summaryTable.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
    summaryTable.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {

      },
      new String [] {
        "Summary"
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
    summaryScrollPane.setViewportView(summaryTable);

    TitlePanel.setBackground(new java.awt.Color(204, 204, 255));
    TitlePanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
    TitlePanel.setLayout(new java.awt.CardLayout());

    welcomeScreen.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
    welcomeScreen.setText("Welcome to " + restaurantName);
    welcomeScreen.setVisible(false);
    TitlePanel.add(welcomeScreen, "card2");

    headerPanel.setBackground(new java.awt.Color(0, 0, 51));
    headerPanel.setForeground(new java.awt.Color(204, 51, 0));

    UserLoggedInLabel.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
    UserLoggedInLabel.setText("You're logged in as : " + theUserLoggedIn);
    UserLoggedInLabel.setForeground(new java.awt.Color(255, 255, 255));
    UserLoggedInLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/userIconImage.png"))); // NOI18N

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

    javax.swing.GroupLayout wholePanelLayout = new javax.swing.GroupLayout(wholePanel);
    wholePanel.setLayout(wholePanelLayout);
    wholePanelLayout.setHorizontalGroup(
      wholePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(wholePanelLayout.createSequentialGroup()
        .addGap(30, 30, 30)
        .addComponent(navPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(27, 27, 27)
        .addGroup(wholePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(UserMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 763, Short.MAX_VALUE)
          .addComponent(TitlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addGap(25, 25, 25)
        .addGroup(wholePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(summaryScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(alertScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        .addGap(30, 30, 30))
      .addComponent(headerPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    wholePanelLayout.setVerticalGroup(
      wholePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(wholePanelLayout.createSequentialGroup()
        .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(10, 10, 10)
        .addGroup(wholePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addGroup(javax.swing.GroupLayout.Alignment.LEADING, wholePanelLayout.createSequentialGroup()
            .addComponent(TitlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(UserMainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(javax.swing.GroupLayout.Alignment.LEADING, wholePanelLayout.createSequentialGroup()
            .addComponent(alertScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(summaryScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addComponent(navPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(481, 481, 481))
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

  private void kronopesButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kronopesButtonMouseEntered
    Color customColor=  new Color(0,0,0);
    kronopesButton.setFont(new java.awt.Font("Arial", 1, 14));
    kronopesButton.setForeground(customColor);
  }//GEN-LAST:event_kronopesButtonMouseEntered

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

  private void kronopesButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kronopesButtonMouseExited
    Color customColor=  new Color(102,102,102);
    kronopesButton.setFont(new java.awt.Font("Arial", 1, 12));
    kronopesButton.setForeground(customColor);
  }//GEN-LAST:event_kronopesButtonMouseExited

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

  private void kronopesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kronopesButtonActionPerformed
  try {
    dispose();
    setVisible(false);
    Kronopes kronos = new Kronopes();
    kronos.setVisible(true);
    
  } catch (FileNotFoundException ex) {
    Logger.getLogger(RMSUserGUI.class.getName()).log(Level.SEVERE, null, ex);
  }
    
  }//GEN-LAST:event_kronopesButtonActionPerformed

  private void userPreferenceButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userPreferenceButtonMouseEntered
    Color customColor=  new Color(0,0,0);
    userPreferenceButton.setFont(new java.awt.Font("Arial", 1, 14));
    userPreferenceButton.setForeground(customColor);
  }//GEN-LAST:event_userPreferenceButtonMouseEntered

  private void userPreferenceButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userPreferenceButtonMouseExited
    Color customColor=  new Color(102,102,102);
    userPreferenceButton.setFont(new java.awt.Font("Arial", 1, 12));
    userPreferenceButton.setForeground(customColor);
  }//GEN-LAST:event_userPreferenceButtonMouseExited

  private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
    cl = (CardLayout)(UserMainPanel.getLayout());
    cl.show(UserMainPanel,"home");
    welcomeScreen.setText("Welcome to " + restaurantName);
  }//GEN-LAST:event_homeButtonActionPerformed

  private void homeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeButtonMouseEntered
    Color customColor=  new Color(0,0,0);
    homeButton.setFont(new java.awt.Font("Arial", 1, 14));
    homeButton.setForeground(customColor);
  }//GEN-LAST:event_homeButtonMouseEntered

  private void homeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeButtonMouseExited
    Color customColor=  new Color(102,102,102);
    homeButton.setFont(new java.awt.Font("Arial", 1, 12));
    homeButton.setForeground(customColor);
  }//GEN-LAST:event_homeButtonMouseExited

  private void checkReservationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkReservationButtonActionPerformed
    cl = (CardLayout)(UserMainPanel.getLayout());
    cl.show(UserMainPanel,"checkReservations");
    welcomeScreen.setText("Check Reservations");
  }//GEN-LAST:event_checkReservationButtonActionPerformed

  private void restaurantViewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restaurantViewButtonActionPerformed
    setVisible(false);
    dispose();
    RMSOrderGUI order =  new RMSOrderGUI();
    order.setVisible(true);
 
    //cl = (CardLayout)(UserMainPanel.getLayout());
    //cl.show(UserMainPanel,"restaurantView");
    //welcomeScreen.setText("Restaurant View");
  }//GEN-LAST:event_restaurantViewButtonActionPerformed

  private void userPreferenceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userPreferenceButtonActionPerformed
    cl = (CardLayout)(UserMainPanel.getLayout());
    cl.show(UserMainPanel,"userPreference");
    welcomeScreen.setText("Your Profile");
    String thePassword = information.get(1).toString();
    String theNumber = information.get(2).toString();
    String theEmail = information.get(3).toString();
    String theRole = information.get(4).toString();
    String thePay =  information.get(5).toString();
    String thePayScale = information.get(6).toString();
    
    roleInfo.setText(theRole);
    phoneNumberInfo.setText(theNumber);
    emailInfo.setText(theEmail);
    passwordInfo.setText(thePassword);
    payScaleInfo.setText("$"+thePayScale);
    payTypeInfo.setText(thePay);
  }//GEN-LAST:event_userPreferenceButtonActionPerformed

  private void viewMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewMenuButtonActionPerformed
    cl = (CardLayout)(UserMainPanel.getLayout());
    cl.show(UserMainPanel,"viewMenu");
    welcomeScreen.setText("View Menu");
  }//GEN-LAST:event_viewMenuButtonActionPerformed

  private void checkoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkoutButtonActionPerformed
    cl = (CardLayout)(UserMainPanel.getLayout());
    cl.show(UserMainPanel,"checkout");
    welcomeScreen.setText("Check Out");
  }//GEN-LAST:event_checkoutButtonActionPerformed

  private void checkoutButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkoutButtonMouseEntered
    Color customColor=  new Color(0,0,0);
    checkoutButton.setFont(new java.awt.Font("Arial", 1, 14));
    checkoutButton.setForeground(customColor);
  }//GEN-LAST:event_checkoutButtonMouseEntered

  private void checkoutButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkoutButtonMouseExited
    Color customColor=  new Color(102,102,102);
    checkoutButton.setFont(new java.awt.Font("Arial", 1, 12));
    checkoutButton.setForeground(customColor);
  }//GEN-LAST:event_checkoutButtonMouseExited

  private void viewMenuButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewMenuButtonMouseExited
    Color customColor=  new Color(102,102,102);
    viewMenuButton.setFont(new java.awt.Font("Arial", 1, 12));
    viewMenuButton.setForeground(customColor);
  }//GEN-LAST:event_viewMenuButtonMouseExited

  private void viewMenuButtonMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewMenuButtonMouseMoved
    Color customColor=  new Color(0,0,0);
    viewMenuButton.setFont(new java.awt.Font("Arial", 1, 14));
    viewMenuButton.setForeground(customColor);
  }//GEN-LAST:event_viewMenuButtonMouseMoved

  private void imageOfYouMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageOfYouMouseClicked
    final JFileChooser fc = new JFileChooser();
    //In response to a button click:
    int returnVal = fc.showOpenDialog(this);
    if(returnVal != JFileChooser.APPROVE_OPTION){
      File file = fc.getSelectedFile();
      imageOfYou.setIcon(new ImageIcon(((new ImageIcon(file.toString())).getImage())
              .getScaledInstance(312, 312, java.awt.Image.SCALE_SMOOTH)));
      String theFile = file.toString();
      int index =theFile.indexOf("image");
      int end = theFile.length();
      theFile.substring(index, end);
      database.modifyImage(theUserLoggedIn,theFile);
      //System.out.print(file.toString());
    }else {
      File file = fc.getSelectedFile();
      imageOfYou.setIcon(new ImageIcon(((new ImageIcon(file.toString())).getImage())
              .getScaledInstance(312, 312, java.awt.Image.SCALE_SMOOTH)));
      String theFile = file.toString();
      int index =theFile.indexOf("image");
      int end = theFile.length();
      theFile.substring(index, end);
      database.modifyImage(theUserLoggedIn,theFile);
      System.out.print(file.toString() +"else");
    }
  }//GEN-LAST:event_imageOfYouMouseClicked

  private void editPreferenceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editPreferenceButtonActionPerformed
    JPanel panel = new JPanel();
    JLabel password = new JLabel("Password: ");
    JLabel phoneNumber = new JLabel("Phone Number: ");
    JLabel email = new JLabel("Email: ");
    JPasswordField enterP = new JPasswordField("");
    JTextField enterN = new JTextField("");
    JTextField enterE = new JTextField("");
    
    panel.add(password);
    panel.add(enterP);
    panel.add(phoneNumber);
    panel.add(enterN);
    panel.add(email);
    panel.add(enterE);
    GridLayout layout = new GridLayout(3,1);
    panel.setLayout(layout);
    
    int result = JOptionPane.showConfirmDialog(null, panel, "Edit",
      JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
    
            
  }//GEN-LAST:event_editPreferenceButtonActionPerformed
  
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
                new RMSUserGUI().setVisible(true);
            }
        });
    }
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton LogoutButton;
  private javax.swing.JPanel TitlePanel;
  private javax.swing.JLabel UserLoggedInLabel;
  private javax.swing.JPanel UserMainPanel;
  private javax.swing.JScrollPane alertScrollPanel;
  private javax.swing.JTable alertTable;
  private javax.swing.JButton applyPreferenceButton;
  private javax.swing.JPanel checkOutPanel;
  private javax.swing.JButton checkReservationButton;
  private javax.swing.JPanel checkReservationsPanel;
  private javax.swing.JButton checkoutButton;
  private javax.swing.JPanel checkoutPanel;
  private javax.swing.JButton editPreferenceButton;
  private javax.swing.JLabel emailInfo;
  private javax.swing.JPanel headerPanel;
  private javax.swing.JButton homeButton;
  private javax.swing.JPanel homePanel;
  private javax.swing.JLabel imageOfYou;
  private javax.swing.JButton kronopesButton;
  private javax.swing.JPanel navPanel;
  private javax.swing.JLabel navPanelHead;
  private javax.swing.JLabel passwordInfo;
  private javax.swing.JLabel payScaleInfo;
  private javax.swing.JLabel payTypeInfo;
  private javax.swing.JLabel phoneNumberInfo;
  private javax.swing.JButton restaurantViewButton;
  private javax.swing.JPanel restaurantViewPanel;
  private javax.swing.JLabel roleInfo;
  private javax.swing.JLabel scheduleLabel;
  private javax.swing.JLabel settingsLabel;
  private javax.swing.JScrollPane summaryScrollPane;
  private javax.swing.JTable summaryTable;
  private javax.swing.JPanel tablePanel;
  private javax.swing.JPanel userPreference;
  private javax.swing.JButton userPreferenceButton;
  private javax.swing.JLabel usernameInfo;
  private javax.swing.JLabel viewLabel;
  private javax.swing.JButton viewMenuButton;
  private javax.swing.JPanel viewMenuLog;
  private javax.swing.JLabel welcomeScreen;
  private javax.swing.JLabel welomeUserLabel;
  private javax.swing.JPanel wholePanel;
  private javax.swing.JPanel youPanel;
  private javax.swing.JLabel yourEmailPreference;
  private javax.swing.JLabel yourPasswordPreference;
  private javax.swing.JLabel yourPayScale;
  private javax.swing.JLabel yourPayType;
  private javax.swing.JLabel yourPhoneNumberPreference;
  private javax.swing.JLabel yourRolePreference;
  private javax.swing.JLabel yourUsernamePreferenece;
  // End of variables declaration//GEN-END:variables

 
}
    


