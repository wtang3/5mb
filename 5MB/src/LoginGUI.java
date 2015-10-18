
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Toolkit;
import java.util.Timer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.TimerTask;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Random;

public class LoginGUI extends javax.swing.JFrame {
  private Parse parse =  new Parse();
  private Database database = new Database();
  private EncryptUserPassword encrypt = new EncryptUserPassword();
  Pattern pattern = Pattern.compile("\\d{3}-\\d{3}-\\d{4}|\\d{10}");
  Pattern passPattern = Pattern.compile("((?=.*[a-z])(?=.*[0-9])(?=.*[A-Z]){5,}+).+$");
  private sendConf send = null;
  private sendConf send2 = null;
  private sendConf send3 = null;
  Matcher matcher = null;
  Matcher passMatcher = null;
  private SecureRandom random =new SecureRandom();
  private int count = 0;

 
  public LoginGUI() {
    initComponents();
    myInitComponent();
  }
  
   private void myInitComponent(){
    setLocationRelativeTo(null);
    this.setIconImage(new 
    ImageIcon(getClass().getResource("images\\5mbicon1.png")).getImage()); 
  }


 
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    loginPanel = new javax.swing.JPanel();
    loginUsername = new javax.swing.JLabel();
    loginPassword = new javax.swing.JLabel();
    loginUsernameEntry = new javax.swing.JTextField();
    loginSubmitButton = new javax.swing.JButton();
    loginRegisterButton = new javax.swing.JButton();
    legitVersionLabel = new javax.swing.JLabel();
    loginPasswordEntry = new javax.swing.JPasswordField();
    emptyUsername = new javax.swing.JLabel();
    emptyPassword = new javax.swing.JLabel();
    theTitle = new javax.swing.JLabel();
    registerPanel = new javax.swing.JPanel();
    registerUsernameLabel = new javax.swing.JLabel();
    registerPassword = new javax.swing.JPasswordField();
    registerUsername = new javax.swing.JTextField();
    registerEmailLabel = new javax.swing.JLabel();
    registerEmail = new javax.swing.JTextField();
    registerPasswordLabel = new javax.swing.JLabel();
    registerSubmitButton = new javax.swing.JButton();
    registerBackButton = new javax.swing.JButton();
    registerEmptyUsername = new javax.swing.JLabel();
    registerEmptyPassword = new javax.swing.JLabel();
    registerEmptyEmail = new javax.swing.JLabel();
    registerPhoneNumberLabel = new javax.swing.JLabel();
    registerNumber = new javax.swing.JTextField();
    registerEmptyNumber = new javax.swing.JLabel();
    jLabel1 = new javax.swing.JLabel();
    carrierComboBox = new javax.swing.JComboBox();
    registerEmptyCarrier = new javax.swing.JLabel();
    processingLabel = new javax.swing.JLabel();
    loginLogo5MB = new javax.swing.JLabel();
    forgotUserButton = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("5MB RMS");
    setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    setResizable(false);

    loginPanel.setBackground(new java.awt.Color(0, 0, 51));
    loginPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
    loginPanel.setMaximumSize(new java.awt.Dimension(10, 10));

    loginUsername.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
    loginUsername.setForeground(new java.awt.Color(255, 255, 255));
    loginUsername.setText("Username :");
    loginUsername.setPreferredSize(new java.awt.Dimension(105, 22));

    loginPassword.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
    loginPassword.setForeground(new java.awt.Color(255, 255, 255));
    loginPassword.setText("Password  : ");

    loginUsernameEntry.setBorder(javax.swing.BorderFactory.createEtchedBorder());
    loginUsernameEntry.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyPressed(java.awt.event.KeyEvent evt) {
        loginUsernameEntryKeyPressed(evt);
      }
    });

    loginSubmitButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
    loginSubmitButton.setText("Submit");
    loginSubmitButton.setMaximumSize(new java.awt.Dimension(111, 29));
    loginSubmitButton.setMinimumSize(new java.awt.Dimension(111, 29));
    loginSubmitButton.setPreferredSize(new java.awt.Dimension(71, 29));
    loginSubmitButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        loginSubmitButtonActionPerformed(evt);
      }
    });

    loginRegisterButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
    loginRegisterButton.setText("Register");
    loginRegisterButton.setMaximumSize(new java.awt.Dimension(111, 29));
    loginRegisterButton.setMinimumSize(new java.awt.Dimension(111, 29));
    loginRegisterButton.setPreferredSize(new java.awt.Dimension(81, 29));
    loginRegisterButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        loginRegisterButtonActionPerformed(evt);
      }
    });

    legitVersionLabel.setFont(new java.awt.Font("Courier New", 2, 11)); // NOI18N
    legitVersionLabel.setText("Version Alpha 1.0a");

    loginPasswordEntry.setBorder(javax.swing.BorderFactory.createEtchedBorder());
    loginPasswordEntry.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        loginPasswordEntryActionPerformed(evt);
      }
    });
    loginPasswordEntry.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyPressed(java.awt.event.KeyEvent evt) {
        loginPasswordEntryKeyPressed(evt);
      }
    });

    emptyUsername.setBackground(new java.awt.Color(255, 0, 51));
    emptyUsername.setForeground(new java.awt.Color(255, 0, 0));
    emptyUsername.setText("*");
    emptyUsername.setVisible(false);

    emptyPassword.setForeground(new java.awt.Color(255, 0, 0));
    emptyPassword.setText("*");
    emptyPassword.setVisible(false);

    theTitle.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
    theTitle.setForeground(new java.awt.Color(255, 255, 255));
    theTitle.setText("5MB Restaurant Management System");

    registerPanel.setBackground(new java.awt.Color(0, 0, 51));
    registerPanel.setPreferredSize(new java.awt.Dimension(320, 576));
    setRegisterPanelNotVisible();

    registerUsernameLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
    registerUsernameLabel.setForeground(new java.awt.Color(255, 255, 255));
    registerUsernameLabel.setText("Username:");

    registerPassword.setBorder(javax.swing.BorderFactory.createEtchedBorder());
    registerPassword.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyPressed(java.awt.event.KeyEvent evt) {
        registerPasswordKeyPressed(evt);
      }
    });

    registerUsername.setBorder(javax.swing.BorderFactory.createEtchedBorder());
    registerUsername.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyPressed(java.awt.event.KeyEvent evt) {
        registerUsernameKeyPressed(evt);
      }
    });

    registerEmailLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
    registerEmailLabel.setForeground(new java.awt.Color(255, 255, 255));
    registerEmailLabel.setText("Email:");

    registerEmail.setText("someone@email.com");
    registerEmail.setBorder(javax.swing.BorderFactory.createEtchedBorder());
    registerEmail.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyPressed(java.awt.event.KeyEvent evt) {
        registerEmailKeyPressed(evt);
      }
    });

    registerPasswordLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
    registerPasswordLabel.setForeground(new java.awt.Color(255, 255, 255));
    registerPasswordLabel.setText("Password:");

    registerSubmitButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
    registerSubmitButton.setText("Submit");
    registerSubmitButton.setMaximumSize(new java.awt.Dimension(111, 29));
    registerSubmitButton.setMinimumSize(new java.awt.Dimension(111, 29));
    registerSubmitButton.setPreferredSize(new java.awt.Dimension(71, 29));
    registerSubmitButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        registerSubmitButtonActionPerformed(evt);
      }
    });

    registerBackButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
    registerBackButton.setText("Back");
    registerBackButton.setMaximumSize(new java.awt.Dimension(111, 29));
    registerBackButton.setMinimumSize(new java.awt.Dimension(111, 29));
    registerBackButton.setPreferredSize(new java.awt.Dimension(71, 29));
    registerBackButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        registerBackButtonActionPerformed(evt);
      }
    });

    registerEmptyUsername.setForeground(new java.awt.Color(255, 0, 0));
    registerEmptyUsername.setText("*");
    registerEmptyUsername.setVisible(false);

    registerEmptyPassword.setForeground(new java.awt.Color(255, 0, 51));
    registerEmptyPassword.setText("*");
    registerEmptyPassword.setVisible(false);

    registerEmptyEmail.setForeground(new java.awt.Color(255, 0, 51));
    registerEmptyEmail.setText("*");
    registerEmptyEmail.setVisible(false);

    registerPhoneNumberLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
    registerPhoneNumberLabel.setForeground(new java.awt.Color(255, 255, 255));
    registerPhoneNumberLabel.setText("Phone (SMS):");

    registerNumber.setText("XXX-XXX-XXXX");
    registerNumber.setBorder(javax.swing.BorderFactory.createEtchedBorder());
    registerNumber.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyPressed(java.awt.event.KeyEvent evt) {
        registerNumberKeyPressed(evt);
      }
    });

    registerEmptyNumber.setForeground(new java.awt.Color(255, 0, 51));
    registerEmptyNumber.setText("*");
    registerEmptyNumber.setVisible(false);

    jLabel1.setText("OR");
    jLabel1.setVisible(false);

    carrierComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "select your carrier...", "T-Mobile", "Sprint", "AT&T", "Verizon", "MetroPCS" }));
    carrierComboBox.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyPressed(java.awt.event.KeyEvent evt) {
        carrierComboBoxKeyPressed(evt);
      }
    });

    registerEmptyCarrier.setForeground(new java.awt.Color(255, 0, 51));
    registerEmptyCarrier.setText("*");
    registerEmptyCarrier.setVisible(false);

    processingLabel.setForeground(new java.awt.Color(255, 255, 255));
    processingLabel.setVisible(false);

    javax.swing.GroupLayout registerPanelLayout = new javax.swing.GroupLayout(registerPanel);
    registerPanel.setLayout(registerPanelLayout);
    registerPanelLayout.setHorizontalGroup(
      registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registerPanelLayout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(registerSubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(registerBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(99, 99, 99))
      .addGroup(registerPanelLayout.createSequentialGroup()
        .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(registerPanelLayout.createSequentialGroup()
            .addContainerGap()
            .addComponent(processingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registerPanelLayout.createSequentialGroup()
              .addGap(182, 182, 182)
              .addComponent(jLabel1)
              .addGap(88, 88, 88))
            .addGroup(registerPanelLayout.createSequentialGroup()
              .addGap(24, 24, 24)
              .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(registerEmailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(registerPhoneNumberLabel)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                  .addComponent(registerPasswordLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addComponent(registerUsernameLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
              .addGap(10, 10, 10)
              .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(carrierComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(registerUsername)
                .addComponent(registerPassword)
                .addComponent(registerEmail)
                .addComponent(registerNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGap(18, 18, 18)
              .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(registerEmptyPassword)
                .addComponent(registerEmptyEmail)
                .addComponent(registerEmptyUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(registerEmptyNumber)
                .addComponent(registerEmptyCarrier)))))
        .addGap(26, 26, 26))
    );
    registerPanelLayout.setVerticalGroup(
      registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(registerPanelLayout.createSequentialGroup()
        .addGap(159, 159, 159)
        .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(registerPanelLayout.createSequentialGroup()
            .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(registerUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(registerUsernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(15, 15, 15)
            .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(registerPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(registerPasswordLabel)
              .addComponent(registerEmptyPassword))
            .addGap(15, 15, 15)
            .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(registerEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(registerEmailLabel)
              .addComponent(registerEmptyEmail))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jLabel1)
            .addGap(15, 15, 15)
            .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(registerPhoneNumberLabel)
              .addComponent(registerNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(registerEmptyNumber))
            .addGap(20, 20, 20)
            .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(carrierComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(registerEmptyCarrier)))
          .addComponent(registerEmptyUsername))
        .addGap(27, 27, 27)
        .addComponent(registerSubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(registerBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
        .addComponent(processingLabel)
        .addContainerGap())
    );

    loginLogo5MB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/5mb.png"))); // NOI18N

    forgotUserButton.setFont(new java.awt.Font("Arial", 2, 11)); // NOI18N
    forgotUserButton.setForeground(new java.awt.Color(255, 255, 255));
    forgotUserButton.setText("forgot username/password?");
    forgotUserButton.setToolTipText(null);
    forgotUserButton.setBorder(null);
    forgotUserButton.setBorderPainted(false);
    forgotUserButton.setContentAreaFilled(false);
    forgotUserButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    forgotUserButton.setSelected(true);
    forgotUserButton.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        forgotUserButtonMouseEntered(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        forgotUserButtonMouseExited(evt);
      }
    });
    forgotUserButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        forgotUserButtonActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
    loginPanel.setLayout(loginPanelLayout);
    loginPanelLayout.setHorizontalGroup(
      loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(theTitle)
        .addGap(46, 46, 46))
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(loginLogo5MB)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(legitVersionLabel)
        .addContainerGap())
      .addGroup(loginPanelLayout.createSequentialGroup()
        .addGap(30, 30, 30)
        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(loginUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(loginPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(loginPanelLayout.createSequentialGroup()
            .addGap(23, 23, 23)
            .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
              .addComponent(loginRegisterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(loginSubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
          .addGroup(loginPanelLayout.createSequentialGroup()
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(loginPasswordEntry, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(loginUsernameEntry, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(33, 33, 33)
            .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
              .addComponent(emptyUsername)
              .addComponent(emptyPassword))))
        .addContainerGap(49, Short.MAX_VALUE))
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(forgotUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(75, 75, 75))
      .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(loginPanelLayout.createSequentialGroup()
          .addGap(11, 11, 11)
          .addComponent(registerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addContainerGap(11, Short.MAX_VALUE)))
    );
    loginPanelLayout.setVerticalGroup(
      loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(loginPanelLayout.createSequentialGroup()
        .addContainerGap(143, Short.MAX_VALUE)
        .addComponent(loginLogo5MB, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(48, 48, 48)
        .addComponent(theTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(27, 27, 27)
        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(loginUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(loginUsernameEntry, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(emptyUsername))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(loginPassword)
          .addComponent(loginPasswordEntry, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(emptyPassword))
        .addGap(18, 18, 18)
        .addComponent(loginSubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(loginRegisterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(forgotUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addComponent(legitVersionLabel))
      .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(loginPanelLayout.createSequentialGroup()
          .addGap(4, 4, 4)
          .addComponent(registerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 366, Short.MAX_VALUE)
      .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
          .addGap(0, 10, Short.MAX_VALUE)
          .addComponent(loginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addGap(0, 10, Short.MAX_VALUE)))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 611, Short.MAX_VALUE)
      .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
          .addGap(0, 8, Short.MAX_VALUE)
          .addComponent(loginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addGap(0, 8, Short.MAX_VALUE)))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents
  
  
  
  private void processingBar(){
    processingLabel.setText("Processing");
    processingLabel.setVisible(true);
    processingLabel.setHorizontalTextPosition(JLabel.LEADING);
    AnimatedIcon icon = new AnimatedIcon(processingLabel);
    icon.setAlignmentX( AnimatedIcon.LEFT );
    icon.addIcon( new TextIcon(processingLabel, ".") );
    icon.addIcon( new TextIcon(processingLabel, "..") );
    icon.addIcon( new TextIcon(processingLabel, "...") );
    icon.addIcon( new TextIcon(processingLabel, "....") );
    icon.addIcon( new TextIcon(processingLabel, ".....") );
    processingLabel.setIcon(icon);
    icon.start();
  }
  private void stopProcessingBar(){
    long delay=4000;
    Timer time = new Timer();
    TimerTask task = new TimerTask(){
      @Override 
      public void run(){
        processingLabel.setVisible(false);
        JOptionPane.showMessageDialog(null,"You are now registered please"
            + "\n check your email/phone ");
      }
    };
    time.schedule(task,delay);
  }
  
  private void cancelProcessingBar(){
    long delay=4000;
    Timer time = new Timer();
    TimerTask task = new TimerTask(){
      @Override 
      public void run(){
        processingLabel.setVisible(false);
      }
    };
    time.schedule(task,delay);
  }
  

  private void loginPasswordEntryKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_loginPasswordEntryKeyPressed
    if(evt.getKeyCode() == KeyEvent.VK_ENTER){
      String username = loginUsernameEntry.getText();
      String password = loginPasswordEntry.getText();
      int previousCount = database.returnCounter(username);
      encrypt.encrypt(password);
      password = encrypt.getHashedPassword();
      if(username.equals("")){
        JOptionPane.showMessageDialog(null,"Username field is empty");
        loginUsernameEntry.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.red));
        emptyUsername.setVisible(true);
      }
      else if(!database.doesUserExist(username)){
        JOptionPane.showMessageDialog(null,"User does not exit!.");
        loginUsernameEntry.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.red));
        emptyUsername.setVisible(true);
      }
      else if(password.equals("") || password.equals("d41d8cd98f00b204e9800998ecf8427e")){
        JOptionPane.showMessageDialog(null,"Password field is empty.");
        loginPasswordEntry.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.red));
        emptyPassword.setVisible(true);
      }
      else if(database.loginSuccessful(username, password)){
         if(database.getRole(username).equals("Admin")){
          RMSAdminGUI admingui = new RMSAdminGUI(username);
          admingui.setVisible(true);
          setVisible(false);
          dispose();
        }
        else if(database.getRole(username).equals("User")){
          setVisible(false);
          dispose();
          RMSUserGUI usergui = new RMSUserGUI(username);
          usergui.setVisible(true);
          
        }
      }
      else{
        JOptionPane.showMessageDialog(null,"Wrong Username/Password");
        loginUsernameEntry.setText("");
        loginPasswordEntry.setText("");
        count ++;
        database.modifyCount(username, count+previousCount);
        count = 0;
         
        if(database.returnCounter(username)>=3){
         JOptionPane.showMessageDialog(null,"You have reached the maximum attempts!");
        } 
      }
    }
  }//GEN-LAST:event_loginPasswordEntryKeyPressed

  private void loginSubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginSubmitButtonActionPerformed
    String username = loginUsernameEntry.getText();
    String password = loginPasswordEntry.getText();
    int previousCount = database.returnCounter(username);
    
    encrypt.encrypt(password);
    password = encrypt.getHashedPassword();
    
    if(username.equals("")){
      JOptionPane.showMessageDialog(null,"Username field is empty.");
      loginUsernameEntry.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.red));
      emptyUsername.setVisible(true);
    }
    else if(password.equals("") || password.equals("d41d8cd98f00b204e9800998ecf8427e")){
      JOptionPane.showMessageDialog(null,"Password field is empty.");
      loginPasswordEntry.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.red));
      emptyPassword.setVisible(true);
    }
    else if(!database.doesUserExist(username)){
        JOptionPane.showMessageDialog(null,"User does not exit!.");
        loginUsernameEntry.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.red));
        emptyUsername.setVisible(true);
    }
     else if(database.loginSuccessful(username, password)){
        if(database.getRole(username).equals("Admin")){
          RMSAdminGUI admingui = new RMSAdminGUI(username);
          admingui.setVisible(true);
          setVisible(false);
          dispose();
        }
        else if(database.getRole(username).equals("User")){
          setVisible(false);
          dispose();
          RMSUserGUI usergui = new RMSUserGUI(username);
          usergui.setVisible(true);
          
        }
      }
    else{
      JOptionPane.showMessageDialog(null,"Wrong Username/Password");
      loginUsernameEntry.setText("");
      loginPasswordEntry.setText("");
      count++;
      database.modifyCount(username, count+previousCount);
      count = 0;
      
      if(database.returnCounter(username)>=3){
      JOptionPane.showMessageDialog(null,"You have reached the maximum attempts!");
      }
    }
  }//GEN-LAST:event_loginSubmitButtonActionPerformed

  private void loginUsernameEntryKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_loginUsernameEntryKeyPressed
    if(evt.getKeyCode() == KeyEvent.VK_ENTER){
      String username = loginUsernameEntry.getText();
      String password = loginPasswordEntry.getText();
      int previousCount = database.returnCounter(username);
      
      encrypt.encrypt(password);
      password = encrypt.getHashedPassword();
      if(username.equals("")){
        JOptionPane.showMessageDialog(null,"Username field is empty");
        loginUsernameEntry.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.red));
        emptyUsername.setVisible(true);
      }
      else if(!database.doesUserExist(username)){
        JOptionPane.showMessageDialog(null,"User does not exit!.");
        loginUsernameEntry.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.red));
        emptyUsername.setVisible(true);
      }
      else if(password.equals("") || password.equals("d41d8cd98f00b204e9800998ecf8427e")){
        JOptionPane.showMessageDialog(null,"Password field is empty.");
        loginPasswordEntry.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.red));
        emptyPassword.setVisible(true);
      }
      else if(database.loginSuccessful(username, password)){
         if(database.getRole(username).equals("User")){
          RMSAdminGUI admingui = new RMSAdminGUI(username);
          admingui.setVisible(true);
          setVisible(false);
          dispose();
        }
        else if(database.getRole(username).equals("Admin")){
          setVisible(false);
          dispose();
          RMSUserGUI admingui = new RMSUserGUI(username);
          admingui.setVisible(true);
          
        }
      }
      else{
        JOptionPane.showMessageDialog(null,"Wrong Username/Password");
        loginUsernameEntry.setText("");
        loginPasswordEntry.setText("");
        count++;
        database.modifyCount(username, count+previousCount);
        count = 0;
         
        if(database.returnCounter(username)>=3){
         JOptionPane.showMessageDialog(null,"You have reached the maximum attempts!");
        }  
      }
    }
  }//GEN-LAST:event_loginUsernameEntryKeyPressed

  private void loginRegisterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginRegisterButtonActionPerformed
     setLoginPageNotVisible();
     setRegisterPanelVisible();
     emptyUsername.setVisible(false);
     emptyPassword.setVisible(false);
     
  }//GEN-LAST:event_loginRegisterButtonActionPerformed

  private void registerBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBackButtonActionPerformed
    setRegisterPanelNotVisible();
    setLoginPageVisible();
  }//GEN-LAST:event_registerBackButtonActionPerformed

  private void registerSubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerSubmitButtonActionPerformed
     
    String username = registerUsername.getText();
    String password = registerPassword.getText();
    String email = registerEmail.getText();
    String number = registerNumber.getText();
    String extension = null;
    int index;
    matcher = pattern.matcher(number);
    passMatcher = passPattern.matcher(password);
    if(username.equals("")){
      JOptionPane.showMessageDialog(null,"Username field is empty");
      registerUsername.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.red));
      registerEmptyUsername.setVisible(true);
    }
    else if(password.equals("")){
      JOptionPane.showMessageDialog(null,"Password field is empty.");
      registerPassword.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.red));
      registerEmptyPassword.setVisible(true);
    }
    else if(database.doesUserExist(username)){
      JOptionPane.showMessageDialog(null,"Sorry username already exist.");
      registerUsername.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.red));
      registerEmptyUsername.setVisible(true);
    }
    else if(database.doesNumberExist(number)){
      JOptionPane.showMessageDialog(null,"Number already on file, consider retrieving username "
              + "\n and password on previous screen");
      registerNumber.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.red));
      registerEmptyNumber.setVisible(true);
    }
    else if(database.doesEmailExist(email)){
      JOptionPane.showMessageDialog(null,"Email already on file, consider retrieving username "
              + "\n and password on previous screen");
      registerEmail.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.red));
      registerEmptyEmail.setVisible(true);
    }
     else if(!passMatcher.matches()||(password.length()<5)){
      JOptionPane.showMessageDialog(null,"Password field must be atleast 5 in lenght, "
              +"1 lowercase,number,and uppercase");
      registerPassword.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.red));
      registerEmptyPassword.setVisible(true);
    }
    else if((email.equals("") || email.equals("someone@email.com")) 
            && (number.equals("") || number.equals("XXX-XXX-XXXX"))){
      JOptionPane.showMessageDialog(null,"You must enter an email or number.");
      registerEmail.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.red));
      registerNumber.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.red));
      registerEmptyEmail.setVisible(true);
      registerEmptyNumber.setVisible(true);
    }
    else if((!email.equals("") || !email.equals("someone@email.com")) && ((!email.contains("@") || !email.contains(".com")) 
            && (number.equals("") || number.equals("XXX-XXX-XXXX")))){
      JOptionPane.showMessageDialog(null,"Uh oh, not a correct email format"
              + "\nEmails must be in this format "
              + "\n\"YourEmail@EmalProvider.com\"");
      registerEmail.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.red));
      registerEmptyEmail.setVisible(true);
    }
    else if((!matcher.matches() && !number.equals("XXX-XXX-XXXX"))
            && (!matcher.matches() && !number.equals(""))){
      JOptionPane.showMessageDialog(null,"Uh oh, not a correct number format"
              + "\nNumbers must be in this format "
              + "\n\"XXX-XXX-XXXX or XXXXXXXXXX\"");
      registerNumber.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.red));
      registerEmptyNumber.setVisible(true);
    } 
    else if(((!database.doesUserExist(username) && !username.equals("")) && (!password.equals("")) && ((!email.equals("") 
            || !email.equals("someone@email.com"))&&!database.doesEmailExist(email))) || ((!database.doesUserExist(username) && !username.equals("")) && (!password.equals("") 
            && (((!number.equals("") || !number.equals("XXX-XXX-XXXX"))&&!database.doesNumberExist(number)) && matcher.matches())))){
      processingBar();
      if(email.equals("") || email.equals("someone@email.com")){
        //sending text message
         if((carrierComboBox.getSelectedIndex()) == 0){
            stopProcessingBar();
            JOptionPane.showMessageDialog(null,"Please select a carrier");
            carrierComboBox.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.red));
            registerEmptyCarrier.setVisible(true);
          }
        number = number.replaceAll("-", "");
        index = carrierComboBox.getSelectedIndex();
        extension = database.whatEmailProvider(index);
        number = number.concat(extension);
        send = new sendConf(number, username, password,"regular");
        send.start();
        encrypt.encrypt(password);
        password = encrypt.getHashedPassword();
        email =" ";
      database.newUser(username, password, number, email);
      }
      else if(number.equals("") ||number.equals("XXX-XXX-XXXX")){
        //Sending email only

        send = new sendConf(email, username, password,"regular");
        send.start();
        encrypt.encrypt(password);
        password = encrypt.getHashedPassword();
        number = " ";
        database.newUser(username, password, number, email);
      }
      else{
        //Will be sending email and text
         if((carrierComboBox.getSelectedIndex()) == 0){
            JOptionPane.showMessageDialog(null,"Please select a carrier");
            registerEmptyCarrier.setVisible(true);
            stopProcessingBar();
          }
        number = number.replaceAll("-", "");
        index = carrierComboBox.getSelectedIndex();
        extension = database.whatEmailProvider(index);
        number = number.concat(extension);
        send = new sendConf(email, username, password,"regular");
        send.start();
        send2 = new sendConf(number, username, password,"regular");
        send2.start();
        encrypt.encrypt(password);
        password = encrypt.getHashedPassword();
        database.newUser(username, password, number, email);
        
      }
      stopProcessingBar();
    }
  }//GEN-LAST:event_registerSubmitButtonActionPerformed
  
  private void registerPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_registerPasswordKeyPressed
    if(evt.getKeyCode() == KeyEvent.VK_ENTER){
      String username = registerUsername.getText();
      String password = registerPassword.getText();
      String email = registerEmail.getText();
      String number = registerNumber.getText();
      String extension = null;
      int index;
      matcher = pattern.matcher(number);
      passMatcher = passPattern.matcher(password);
      
      if(username.equals("")){
        JOptionPane.showMessageDialog(null,"Username field is empty");
        registerUsername.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.red));
        registerEmptyUsername.setVisible(true);
      }
      else if(database.doesUserExist(username)){
        JOptionPane.showMessageDialog(null,"Sorry username already exist.");
        registerUsername.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.red));
        registerEmptyUsername.setVisible(true);
      }
      else if(database.doesNumberExist(number)){
        JOptionPane.showMessageDialog(null,"Number already on file, consider retrieving username "
                + "\n and password on previous screen");
        registerNumber.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.red));
        registerEmptyNumber.setVisible(true);
      }
      else if(database.doesEmailExist(email)){
        JOptionPane.showMessageDialog(null,"Email already on file, consider retrieving username "
                + "\n and password on previous screen");
        registerEmail.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.red));
        registerEmptyEmail.setVisible(true);
      }
      
      else if(password.equals("")){
        JOptionPane.showMessageDialog(null,"Password field is empty.");
        registerPassword.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.red));
        registerEmptyPassword.setVisible(true);
      }
      else if(!passMatcher.matches()){
        JOptionPane.showMessageDialog(null,"Password field must be 5 in lenght, "
                +"1 lowercase,number,and uppercase");
        registerPassword.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.red));
        registerEmptyPassword.setVisible(true);
      }
      else if((email.equals("") || email.equals("someone@email.com")) 
              && (number.equals("") || number.equals("XXX-XXX-XXXX"))){
        JOptionPane.showMessageDialog(null,"You must enter an email or number.");
        registerEmail.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.red));
        registerNumber.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.red));
        registerEmptyEmail.setVisible(true);
        registerEmptyNumber.setVisible(true);
      }
      else if((!email.equals("") || !email.equals("someone@email.com")) && ((!email.contains("@") || !email.contains(".com")) 
              && (number.equals("") || number.equals("XXX-XXX-XXXX")))){
        JOptionPane.showMessageDialog(null,"Uh oh, not a correct email format"
                + "\nEmails must be in this format "
                + "\n\"YourEmail@EmalProvider.com\"");
        registerEmail.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.red));
        registerEmptyEmail.setVisible(true);
      }
      else if((!matcher.matches() && !number.equals("XXX-XXX-XXXX"))
            && (!matcher.matches() && !number.equals(""))){
      JOptionPane.showMessageDialog(null,"Uh oh, not a correct number format"
              + "\nNumbers must be in this format "
              + "\n\"XXX-XXX-XXXX or XXXXXXXXXX\"");
      registerNumber.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.red));
      registerEmptyNumber.setVisible(true);
     }

      else if(((!database.doesUserExist(username) && !username.equals("")) && (!password.equals("")) && ((!email.equals("") 
              || !email.equals("someone@email.com"))&&!database.doesEmailExist(email))) || ((!database.doesUserExist(username) && !username.equals("")) && (!password.equals("") 
              && (((!number.equals("") || !number.equals("XXX-XXX-XXXX"))&&!database.doesNumberExist(number)) && matcher.matches())))){
        processingBar();
        if(email.equals("") || email.equals("someone@email.com")){
          //sending text message
           if((carrierComboBox.getSelectedIndex()) == 0){
            JOptionPane.showMessageDialog(null,"Please select a carrier");
            carrierComboBox.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.red));
            registerEmptyCarrier.setVisible(true);
          }
          number = number.replaceAll("-", "");
          index = carrierComboBox.getSelectedIndex();
          extension = database.whatEmailProvider(index);
          number = number.concat(extension);
          send = new sendConf(number, username, password,"regular");
          send.start();
          encrypt.encrypt(password);
          password = encrypt.getHashedPassword();
          email =" ";
        database.newUser(username, password, number, email);
        }
        else if(number.equals("") ||number.equals("XXX-XXX-XXXX")){
          //Sending email only

          send = new sendConf(email, username, password,"regular");
          send.start();
          encrypt.encrypt(password);
          password = encrypt.getHashedPassword();
          number = " ";
          database.newUser(username, password, number, email);
        }
        else{
           if((carrierComboBox.getSelectedIndex()) == 0){
            JOptionPane.showMessageDialog(null,"Please select a carrier");
            carrierComboBox.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.red));
            stopProcessingBar();
            registerEmptyCarrier.setVisible(true);
          }
          //Will be sending email and text
          number = number.replaceAll("-", "");
          index = carrierComboBox.getSelectedIndex();
          extension = database.whatEmailProvider(index);
          number = number.concat(extension);
          send = new sendConf(email, username, password,"regular");
          send.start();
          send2 = new sendConf(number, username, password,"regular");
          send2.start();
          encrypt.encrypt(password);
          password = encrypt.getHashedPassword();
          database.newUser(username, password, number, email);

        }
        stopProcessingBar();
      }
    }
  }//GEN-LAST:event_registerPasswordKeyPressed

  private void registerEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_registerEmailKeyPressed
    if(evt.getKeyCode() == KeyEvent.VK_ENTER){
      String username = registerUsername.getText();
      String password = registerPassword.getText();
      String email = registerEmail.getText();
      String number = registerNumber.getText();
      String extension = null;
      int index;
      matcher = pattern.matcher(number);
      passMatcher = passPattern.matcher(password);
      
      if(username.equals("")){
        JOptionPane.showMessageDialog(null,"Username field is empty");
        registerUsername.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.red));
        registerEmptyUsername.setVisible(true);
      }
      else if(database.doesUserExist(username)){
        JOptionPane.showMessageDialog(null,"Sorry username already exist.");
        registerUsername.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.red));
        registerEmptyUsername.setVisible(true);
      }
      else if(database.doesNumberExist(number)){
        JOptionPane.showMessageDialog(null,"Number already on file, consider retrieving username "
                + "\n and password on previous screen");
        registerNumber.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.red));
        registerEmptyNumber.setVisible(true);
      }
      else if(database.doesEmailExist(email)){
          JOptionPane.showMessageDialog(null,"Email already on file, consider retrieving username "
                  + "\n and password on previous screen");
          registerEmail.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.red));
          registerEmptyEmail.setVisible(true);
        }
      else if(password.equals("")){
        JOptionPane.showMessageDialog(null,"Password field is empty.");
        registerPassword.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.red));
        registerEmptyPassword.setVisible(true);
      }
      else if(!passMatcher.matches()||(password.length()<5)){
      JOptionPane.showMessageDialog(null,"Password field must be 5 in lenght, "
              +"1 lowercase,number,and uppercase");
      registerPassword.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.red));
      registerEmptyPassword.setVisible(true);
      }
      else if((email.equals("") || email.equals("someone@email.com")) 
              && (number.equals("") || number.equals("XXX-XXX-XXXX"))){
        JOptionPane.showMessageDialog(null,"You must enter an email or number.");
        registerEmail.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.red));
        registerNumber.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.red));
        registerEmptyEmail.setVisible(true);
        registerEmptyNumber.setVisible(true);
      }
      else if((!email.equals("") || !email.equals("someone@email.com")) && ((!email.contains("@") || !email.contains(".com")) 
              && (number.equals("") || number.equals("XXX-XXX-XXXX")))){
        JOptionPane.showMessageDialog(null,"Uh oh, not a correct email format"
                + "\nEmails must be in this format "
                + "\n\"YourEmail@EmalProvider.com\"");
        registerEmail.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.red));
        registerEmptyEmail.setVisible(true);
      }
      else if((!matcher.matches() && !number.equals("XXX-XXX-XXXX"))
            && (!matcher.matches() && !number.equals(""))){
      JOptionPane.showMessageDialog(null,"Uh oh, not a correct number format"
              + "\nNumbers must be in this format "
              + "\n\"XXX-XXX-XXXX or XXXXXXXXXX\"");
      registerNumber.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.red));
      registerEmptyNumber.setVisible(true);
      }
       
      else if(((!database.doesUserExist(username) && !username.equals("")) && (!password.equals("")) && ((!email.equals("") 
              || !email.equals("someone@email.com"))&&!database.doesEmailExist(email))) || ((!database.doesUserExist(username) && !username.equals("")) && (!password.equals("") 
              && (((!number.equals("") || !number.equals("XXX-XXX-XXXX"))&&!database.doesNumberExist(number)) && matcher.matches())))){
        processingBar();
        if(email.equals("") || email.equals("someone@email.com")){
          //sending text message
           if((carrierComboBox.getSelectedIndex()) == 0){
            JOptionPane.showMessageDialog(null,"Please select a carrier");
            stopProcessingBar();
            carrierComboBox.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.red));
            registerEmptyCarrier.setVisible(true);
          }
          number = number.replaceAll("-", "");
          index = carrierComboBox.getSelectedIndex();
          extension = database.whatEmailProvider(index);
          number = number.concat(extension);
          send = new sendConf(number, username, password,"regular");
          send.start();
          encrypt.encrypt(password);
          password = encrypt.getHashedPassword();
          email =" ";
        database.newUser(username, password, number, email);
        }
        else if(number.equals("") ||number.equals("XXX-XXX-XXXX")){
          //Sending email only

          send = new sendConf(email, username, password,"regular");
          send.start();
          encrypt.encrypt(password);
          password = encrypt.getHashedPassword();
          number = " ";
          database.newUser(username, password, number, email);
        }
        else{
          //Will be sending email and text
          if((carrierComboBox.getSelectedIndex()) == 0){
            stopProcessingBar();
            JOptionPane.showMessageDialog(null,"Please select a carrier");
            carrierComboBox.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.red));
            registerEmptyCarrier.setVisible(true);
          }
          number = number.replaceAll("-", "");
          index = carrierComboBox.getSelectedIndex();
          extension = database.whatEmailProvider(index);
          number = number.concat(extension);
          send = new sendConf(email, username, password,"regular");
          send.start();
          send2 = new sendConf(number, username, password,"regular");
          send2.start();
          encrypt.encrypt(password);
          password = encrypt.getHashedPassword();
          database.newUser(username, password, number, email);

        }
        stopProcessingBar();
      }
    }
  }//GEN-LAST:event_registerEmailKeyPressed

  private void registerUsernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_registerUsernameKeyPressed
    if(evt.getKeyCode() == KeyEvent.VK_ENTER){
      String username = registerUsername.getText();
      String password = registerPassword.getText();
      String email = registerEmail.getText();
      String number = registerNumber.getText();
      String extension = null;
      int index;
      matcher = pattern.matcher(number);
      passMatcher = passPattern.matcher(password);
      if(username.equals("")){
        JOptionPane.showMessageDialog(null,"Username field is empty");
        registerUsername.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.red));
        registerEmptyUsername.setVisible(true);
      }
      else if(database.doesNumberExist(number)){
        JOptionPane.showMessageDialog(null,"Number already on file, consider retrieving username "
                + "\n and password on previous screen");
        registerNumber.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.red));
        registerEmptyNumber.setVisible(true);
      }
      else if(database.doesUserExist(username)){
        JOptionPane.showMessageDialog(null,"Sorry username already exist.");
        registerUsername.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.red));
        registerEmptyUsername.setVisible(true);
      }
      else if(database.doesEmailExist(email)){
          JOptionPane.showMessageDialog(null,"Email already on file, consider retrieving username "
                  + "\n and password on previous screen");
          registerEmail.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.red));
          registerEmptyEmail.setVisible(true);
        }
      else if(password.equals("")){
        JOptionPane.showMessageDialog(null,"Password field is empty.");
        registerPassword.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.red));
        registerEmptyPassword.setVisible(true);
      }
      else if(!passMatcher.matches()||(password.length()<5)){
        JOptionPane.showMessageDialog(null,"Password field must be 5 in lenght, "
              +"1 lowercase,number,and uppercase");
        registerPassword.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.red));
        registerEmptyPassword.setVisible(true);
      }
      else if((email.equals("") || email.equals("someone@email.com")) 
              && (number.equals("") || number.equals("XXX-XXX-XXXX"))){
        JOptionPane.showMessageDialog(null,"You must enter an email or number.");
        registerEmptyEmail.setVisible(true);
        registerEmail.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.red));
        registerNumber.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.red));
        registerEmptyNumber.setVisible(true);
      }
      else if((!email.equals("") || !email.equals("someone@email.com")) && ((!email.contains("@") || !email.contains(".com")) 
              && (number.equals("") || number.equals("XXX-XXX-XXXX")))){
        JOptionPane.showMessageDialog(null,"Uh oh, not a correct email format"
                + "\nEmails must be in this format "
                + "\n\"YourEmail@EmalProvider.com\"");
        registerEmail.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.red));
        registerEmptyEmail.setVisible(true);
      }
      else if((!matcher.matches() && !number.equals("XXX-XXX-XXXX"))
            && (!matcher.matches() && !number.equals(""))){
      JOptionPane.showMessageDialog(null,"Uh oh, not a correct number format"
              + "\nNumbers must be in this format "
              + "\n\"XXX-XXX-XXXX or XXXXXXXXXX\"");
      registerNumber.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.red));
      registerEmptyNumber.setVisible(true);
      }
      else if(((!database.doesUserExist(username) && !username.equals("")) && (!password.equals("")) && ((!email.equals("") 
              || !email.equals("someone@email.com"))&&!database.doesEmailExist(email))) || ((!database.doesUserExist(username) && !username.equals("")) && (!password.equals("") 
              && (((!number.equals("") || !number.equals("XXX-XXX-XXXX"))&&!database.doesNumberExist(number)) && matcher.matches())))){
        processingBar();
        if(email.equals("") || email.equals("someone@email.com")){
          //sending text message
          if((carrierComboBox.getSelectedIndex()) == 0){
            cancelProcessingBar();
            JOptionPane.showMessageDialog(null,"Please select a carrier");
            carrierComboBox.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.red));
            registerEmptyCarrier.setVisible(true);
          }
          number = number.replaceAll("-", "");
          index = carrierComboBox.getSelectedIndex();
          extension = database.whatEmailProvider(index);
          number = number.concat(extension);
          send = new sendConf(number, username, password,"regular");
          send.start();
          encrypt.encrypt(password);
          password = encrypt.getHashedPassword();
          email =" ";
        database.newUser(username, password, number, email);
        }
        else if(number.equals("") ||number.equals("XXX-XXX-XXXX")){
          //Sending email only

          send = new sendConf(email, username, password,"regular");
          send.start();
          encrypt.encrypt(password);
          password = encrypt.getHashedPassword();
          number = " ";
          database.newUser(username, password, number, email);
        }
        else{
          //Will be sending email and text
          if((carrierComboBox.getSelectedIndex()) == 0){
            cancelProcessingBar();
            JOptionPane.showMessageDialog(null,"Please select a carrier");
            carrierComboBox.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.red));
            registerEmptyCarrier.setVisible(true);
          }
          number = number.replaceAll("-", "");
          index = carrierComboBox.getSelectedIndex();
          extension = database.whatEmailProvider(index);
          number = number.concat(extension);
          send = new sendConf(email, username, password,"regular");
          send.start();
          send2 = new sendConf(number, username, password,"regular");
          send2.start();
          encrypt.encrypt(password);
          password = encrypt.getHashedPassword();
          database.newUser(username, password, number, email);

        }
        stopProcessingBar();
      }
    }
  }//GEN-LAST:event_registerUsernameKeyPressed
  private void createForgotUserDialog(){
    Random rand = new Random();
      String content= (String)JOptionPane.showInputDialog(null,"Enter Username, Phone, or Email"
              ,"Forgot Username/Password"
              ,JOptionPane.INFORMATION_MESSAGE);
      
      String temp = new BigInteger(130,random).toString(32);
      int endingNumber=0;
      int randomNumber = rand.nextInt(26);


      System.out.println("StartingNumber = "+randomNumber);
      System.out.println("Ending number = "+endingNumber);

      if(randomNumber >19){
        endingNumber = randomNumber;
        randomNumber = randomNumber - 6;
      }else{
        endingNumber = randomNumber + 6;
      }

      System.out.println("StartingNumber = "+randomNumber);
      System.out.println("Ending number = "+endingNumber);

      String password = temp.substring(randomNumber, endingNumber);

      System.out.println(content);
      System.out.println(password);

      if(database.doesUserExist(content)){
        String email;
        database.modifyPassword(content,password);
        email = database.getEmail(content);
        send3 = new sendConf(email,content,password,"forgot");
        send3.start();
        JOptionPane.showMessageDialog(null,"Your password has been reset "
                + "\n and sent to your email.");
      }

      else if(database.doesEmailExist(content)){

        String username = database.checkPasswordForEmail(content);
        database.modifyPassword(username,password);

        send3 = new sendConf(content,username,password,"forgot");
        send3.start();
        JOptionPane.showMessageDialog(null,"Your password has been reset "
                + "\n and sent to your email.");
      }
      else if(database.doesNumberExist(content)){
        String email = null;
        String username = database.checkPasswordForNumber(content);
        database.modifyPassword(username,password);
        email = database.getNumber(content);
        send3 = new sendConf(email,username,password,"forgot");
        send3.start();
        JOptionPane.showMessageDialog(null,"Your password has been reset "
                + "\n and sent to your email.");
      }
      else if(!database.doesEmailExist(content)&&!database.doesUserExist(content)
              &&!database.doesNumberExist(content)
              &&!content.equals("")){
        JOptionPane.showMessageDialog(null,"The data you presented "
                + "\n was not found in our database.");
        createForgotUserDialog();
      }
    }
  private void forgotUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forgotUserButtonActionPerformed
      createForgotUserDialog();
  }//GEN-LAST:event_forgotUserButtonActionPerformed

  private void registerNumberKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_registerNumberKeyPressed
   if(evt.getKeyCode() == KeyEvent.VK_ENTER){
      String username = registerUsername.getText();
      String password = registerPassword.getText();
      String email = registerEmail.getText();
      String number = registerNumber.getText();
      String extension = null;
      int index;
      matcher = pattern.matcher(number);
      passMatcher = passPattern.matcher(password);
      
      if(username.equals("")){
        JOptionPane.showMessageDialog(null,"Username field is empty");
        registerUsername.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.red));
        registerEmptyUsername.setVisible(true);
      }
      else if(database.doesUserExist(username)){
        JOptionPane.showMessageDialog(null,"Sorry username already exist.");
        registerUsername.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.red));
        registerEmptyUsername.setVisible(true);
      }
      else if(database.doesEmailExist(email)){
          JOptionPane.showMessageDialog(null,"Email already on file, consider retrieving username "
                  + "\n and password on previous screen");
          registerEmail.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.red));
          registerEmptyEmail.setVisible(true);
        }
      else if(database.doesNumberExist(number)){
        JOptionPane.showMessageDialog(null,"Number already on file, consider retrieving username "
                + "\n and password on previous screen");
        registerNumber.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.red));
        registerEmptyNumber.setVisible(true);
      }
      else if(password.equals("")){
        JOptionPane.showMessageDialog(null,"Password field is empty.");
        registerPassword.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.red));
        registerEmptyPassword.setVisible(true);
      }
      else if(!passMatcher.matches()||(password.length()<5)){
        JOptionPane.showMessageDialog(null,"Password field must be 5 in lenght, "
              +"1 lowercase,number,and uppercase");
        registerPassword.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.red));
        registerEmptyPassword.setVisible(true);
      }
      else if((email.equals("") || email.equals("someone@email.com")) 
              && (number.equals("") || number.equals("XXX-XXX-XXXX"))){
        JOptionPane.showMessageDialog(null,"You must enter an email or number.");
        registerEmptyEmail.setVisible(true);
        registerEmail.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.red));
        registerNumber.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.red));
        registerEmptyNumber.setVisible(true);
      }
      else if((!email.equals("") || !email.equals("someone@email.com")) && ((!email.contains("@") || !email.contains(".com")) 
              && (number.equals("") || number.equals("XXX-XXX-XXXX")))){
        JOptionPane.showMessageDialog(null,"Uh oh, not a correct email format"
                + "\nEmails must be in this format "
                + "\n\"YourEmail@EmalProvider.com\"");
        registerEmail.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.red));
        registerEmptyEmail.setVisible(true);
      }
       else if((!matcher.matches() && !number.equals("XXX-XXX-XXXX"))
            && (!matcher.matches() && !number.equals(""))){
        JOptionPane.showMessageDialog(null,"Uh oh, not a correct number format"
                + "\nNumbers must be in this format "
                + "\n\"XXX-XXX-XXXX or XXXXXXXXXX\"");
        registerNumber.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.red));
        registerEmptyNumber.setVisible(true);
      }
     
      else if(((!database.doesUserExist(username) && !username.equals("")) && (!password.equals("")) && ((!email.equals("") 
              || !email.equals("someone@email.com"))&&!database.doesEmailExist(email))) || ((!database.doesUserExist(username) && !username.equals("")) && (!password.equals("") 
              && (((!number.equals("") || !number.equals("XXX-XXX-XXXX"))&&!database.doesNumberExist(number)) && matcher.matches())))){
        processingBar();
        if(email.equals("") || email.equals("someone@email.com")){
          //sending text message
          if((carrierComboBox.getSelectedIndex()) == 0){
            cancelProcessingBar();
            JOptionPane.showMessageDialog(null,"Please select a carrier");
            carrierComboBox.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.red));
            registerEmptyCarrier.setVisible(true);
          }
          number = number.replaceAll("-", "");
          index = carrierComboBox.getSelectedIndex();
          extension = database.whatEmailProvider(index);
          number = number.concat(extension);
          send = new sendConf(number, username, password,"regular");
          send.start();
          encrypt.encrypt(password);
          password = encrypt.getHashedPassword();
          email =" ";
        database.newUser(username, password, number, email);
        }
        else if(number.equals("") ||number.equals("XXX-XXX-XXXX")){
          //Sending email only

          send = new sendConf(email, username, password,"regular");
          send.start();
          encrypt.encrypt(password);
          password = encrypt.getHashedPassword();
          number = " ";
          database.newUser(username, password, number, email);
        }
        else{
          //Will be sending email and text
          if((carrierComboBox.getSelectedIndex()) == 0){
            stopProcessingBar();
            JOptionPane.showMessageDialog(null,"Please select a carrier");
            carrierComboBox.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.red));
            registerEmptyCarrier.setVisible(true);
          }
          number = number.replaceAll("-", "");
          index = carrierComboBox.getSelectedIndex();
          extension = database.whatEmailProvider(index);
          number = number.concat(extension);
          send = new sendConf(email, username, password,"regular");
          send.start();
          send2 = new sendConf(number, username, password,"regular");
          send2.start();
          encrypt.encrypt(password);
          password = encrypt.getHashedPassword();
          database.newUser(username, password, number, email);

        }
        stopProcessingBar();
      }
    }
  }//GEN-LAST:event_registerNumberKeyPressed

  private void carrierComboBoxKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_carrierComboBoxKeyPressed
    if(evt.getKeyCode() == KeyEvent.VK_ENTER){
      String username = registerUsername.getText();
      String password = registerPassword.getText();
      String email = registerEmail.getText();
      String number = registerNumber.getText();
      String extension = null;
      int index;
      matcher = pattern.matcher(number);
      passMatcher = passPattern.matcher(password);
      
      if(username.equals("")){
        JOptionPane.showMessageDialog(null,"Username field is empty");
        registerUsername.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.red));
        registerEmptyUsername.setVisible(true);
      }
      else if(database.doesNumberExist(number)){
        JOptionPane.showMessageDialog(null,"Number already on file, consider retrieving username "
                + "\n and password on previous screen");
        registerNumber.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.red));
        registerEmptyNumber.setVisible(true);
      }
      else if(database.doesUserExist(username)){
        JOptionPane.showMessageDialog(null,"Sorry username already exist.");
        registerUsername.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.red));
        registerEmptyUsername.setVisible(true);
        
      }
      else if(password.equals("")){
        JOptionPane.showMessageDialog(null,"Password field is empty.");
        registerPassword.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.red));
        registerEmptyPassword.setVisible(true);
      }
      else if(database.doesEmailExist(email)){
          JOptionPane.showMessageDialog(null,"Email already on file, consider retrieving username "
                  + "\n and password on previous screen");
          registerEmail.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.red));
          registerEmptyEmail.setVisible(true);
        }
      else if(!passMatcher.matches()||(password.length()<5)){
        JOptionPane.showMessageDialog(null,"Password field must be 5 in lenght, "
              +"1 lowercase,number,and uppercase");
        registerPassword.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.red));
        registerEmptyPassword.setVisible(true);
      }
      else if((email.equals("") || email.equals("someone@email.com")) 
              && (number.equals("") || number.equals("XXX-XXX-XXXX"))){
        JOptionPane.showMessageDialog(null,"You must enter an email or number.");
        registerEmptyEmail.setVisible(true);
        registerEmail.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.red));
        registerNumber.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.red));
        registerEmptyNumber.setVisible(true);
      }
      else if((!email.equals("") || !email.equals("someone@email.com")) && ((!email.contains("@") || !email.contains(".com")) 
              && (number.equals("") || number.equals("XXX-XXX-XXXX")))){
        JOptionPane.showMessageDialog(null,"Uh oh, not a correct email format"
                + "\nEmails must be in this format "
                + "\n\"YourEmail@EmalProvider.com\"");
        registerEmail.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.red));
        registerEmptyEmail.setVisible(true);
      }
       else if((!matcher.matches() && !number.equals("XXX-XXX-XXXX"))
            && (!matcher.matches() && !number.equals(""))){
        JOptionPane.showMessageDialog(null,"Uh oh, not a correct number format"
                + "\nNumbers must be in this format "
                + "\n\"XXX-XXX-XXXX or XXXXXXXXXX\"");
        registerNumber.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.red));
        registerEmptyNumber.setVisible(true);
      }
     
      else if(((!database.doesUserExist(username) && !username.equals("")) && (!password.equals("")) && ((!email.equals("") 
              || !email.equals("someone@email.com"))&&!database.doesEmailExist(email))) || ((!database.doesUserExist(username) && !username.equals("")) && (!password.equals("") 
              && (((!number.equals("") || !number.equals("XXX-XXX-XXXX"))&&database.doesNumberExist(number)) && matcher.matches())))){
        processingBar();
        if(email.equals("") || email.equals("someone@email.com")){
          //sending text message
          if((carrierComboBox.getSelectedIndex()) == 0){
            cancelProcessingBar();
            JOptionPane.showMessageDialog(null,"Please select a carrier");
            carrierComboBox.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.red));
            registerEmptyCarrier.setVisible(true);
          }
          number = number.replaceAll("-", "");
          index = carrierComboBox.getSelectedIndex();
          extension = database.whatEmailProvider(index);
          number = number.concat(extension);
          send = new sendConf(number, username, password,"regular");
          send.start();
          encrypt.encrypt(password);
          password = encrypt.getHashedPassword();
          email =" ";
        database.newUser(username, password, number, email);
        }
        else if(number.equals("") ||number.equals("XXX-XXX-XXXX")){
          //Sending email only

          send = new sendConf(email, username, password,"regular");
          send.start();
          encrypt.encrypt(password);
          password = encrypt.getHashedPassword();
          number = " ";
          database.newUser(username, password, number, email);
        }
        else{
          //Will be sending email and text
          if((carrierComboBox.getSelectedIndex()) == 0){
            stopProcessingBar();
            JOptionPane.showMessageDialog(null,"Please select a carrier");
            carrierComboBox.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.red));
            registerEmptyCarrier.setVisible(true);
          }
          number = number.replaceAll("-", "");
          index = carrierComboBox.getSelectedIndex();
          extension = database.whatEmailProvider(index);
          number = number.concat(extension);
          send = new sendConf(email, username, password,"regular");
          send.start();
          send2 = new sendConf(number, username, password,"regular");
          send2.start();
          encrypt.encrypt(password);
          password = encrypt.getHashedPassword();
          database.newUser(username, password, number, email);

        }
        stopProcessingBar();
      }
    }
  }//GEN-LAST:event_carrierComboBoxKeyPressed

  private void forgotUserButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotUserButtonMouseEntered
    Color customColor=  new Color(0,102,255);
    forgotUserButton.setForeground(customColor); 
  }//GEN-LAST:event_forgotUserButtonMouseEntered

  private void forgotUserButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotUserButtonMouseExited
    forgotUserButton.setForeground(Color.WHITE);
  }//GEN-LAST:event_forgotUserButtonMouseExited

  private void loginPasswordEntryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginPasswordEntryActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_loginPasswordEntryActionPerformed
  
  public void setLoginPageVisible(){
    loginUsername.setVisible(true);
    loginPassword.setVisible(true);
    loginUsernameEntry.setVisible(true);
    loginSubmitButton.setVisible(true);
    loginRegisterButton.setVisible(true);
    loginPasswordEntry.setVisible(true);
    theTitle.setVisible(true);
    loginLogo5MB.setVisible(true);
    forgotUserButton.setVisible(true);
    loginUsernameEntry.setBorder(BorderFactory.createEtchedBorder());
    loginPasswordEntry.setBorder(BorderFactory.createEtchedBorder());

  }
  
  public void setLoginPageNotVisible(){
    loginUsername.setVisible(false);
    loginPassword.setVisible(false);
    loginUsernameEntry.setVisible(false);
    loginUsernameEntry.setText("");
    loginPasswordEntry.setVisible(false);
    loginPasswordEntry.setText("");
    loginSubmitButton.setVisible(false);
    loginRegisterButton.setVisible(false);
    theTitle.setVisible(false);
    loginLogo5MB.setVisible(false);
    forgotUserButton.setVisible(false);
    
  }
  
  public void setRegisterPanelNotVisible(){
    registerUsernameLabel.setVisible(false);
    registerPassword.setVisible(false);
    registerPassword.setText("");
    registerUsername.setText("");
    registerUsername.setVisible(false);
    registerEmailLabel.setVisible(false);
    registerEmail.setVisible(false);
    registerEmail.setText("someone@email.com");
    registerPasswordLabel.setVisible(false);
    registerSubmitButton.setVisible(false);
    registerBackButton.setVisible(false);
    registerEmptyPassword.setVisible(false);
    registerEmptyUsername.setVisible(false);
    registerEmptyCarrier.setVisible(false);
    registerEmptyEmail.setVisible(false);
    registerEmptyNumber.setVisible(false);
    registerPhoneNumberLabel.setVisible(false);
    registerNumber.setVisible(false);
    registerNumber.setText("XXX-XXX-XXXX");
    jLabel1.setVisible(false);
    carrierComboBox.setVisible(false);
    carrierComboBox.setSelectedItem("select your carrier...");   
  }
  public void setRegisterPanelVisible(){
    registerUsernameLabel.setVisible(true);
    registerPassword.setVisible(true);
    registerUsername.setVisible(true);
    registerEmailLabel.setVisible(true);
    registerEmail.setVisible(true);
    registerPasswordLabel.setVisible(true);
    registerSubmitButton.setVisible(true);
    registerBackButton.setVisible(true);
    registerNumber.setVisible(true);
    registerPhoneNumberLabel.setVisible(true);
    carrierComboBox.setVisible(true);
    jLabel1.setVisible(true);
    registerUsername.setBorder(BorderFactory.createEtchedBorder());
    registerPassword.setBorder(BorderFactory.createEtchedBorder());
    registerNumber.setBorder(BorderFactory.createEtchedBorder());
    registerEmail.setBorder(BorderFactory.createEtchedBorder());
    carrierComboBox.setBorder(BorderFactory.createEtchedBorder());
  }
  
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JComboBox carrierComboBox;
  private javax.swing.JLabel emptyPassword;
  private javax.swing.JLabel emptyUsername;
  private javax.swing.JButton forgotUserButton;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel legitVersionLabel;
  private javax.swing.JLabel loginLogo5MB;
  private javax.swing.JPanel loginPanel;
  private javax.swing.JLabel loginPassword;
  private javax.swing.JPasswordField loginPasswordEntry;
  private javax.swing.JButton loginRegisterButton;
  private javax.swing.JButton loginSubmitButton;
  private javax.swing.JLabel loginUsername;
  private javax.swing.JTextField loginUsernameEntry;
  private javax.swing.JLabel processingLabel;
  private javax.swing.JButton registerBackButton;
  private javax.swing.JTextField registerEmail;
  private javax.swing.JLabel registerEmailLabel;
  private javax.swing.JLabel registerEmptyCarrier;
  private javax.swing.JLabel registerEmptyEmail;
  private javax.swing.JLabel registerEmptyNumber;
  private javax.swing.JLabel registerEmptyPassword;
  private javax.swing.JLabel registerEmptyUsername;
  private javax.swing.JTextField registerNumber;
  private javax.swing.JPanel registerPanel;
  private javax.swing.JPasswordField registerPassword;
  private javax.swing.JLabel registerPasswordLabel;
  private javax.swing.JLabel registerPhoneNumberLabel;
  private javax.swing.JButton registerSubmitButton;
  private javax.swing.JTextField registerUsername;
  private javax.swing.JLabel registerUsernameLabel;
  private javax.swing.JLabel theTitle;
  // End of variables declaration//GEN-END:variables
public static void main(String args[]) {

   try {
      for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (ClassNotFoundException ex) {
      java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        Main splash = new Main();
        //splash.setVisible(true);
        splash.dispose();
        new LoginGUI().setVisible(true);
      }
    });
  }
}

