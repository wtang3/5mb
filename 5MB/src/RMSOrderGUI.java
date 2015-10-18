
import java.awt.AlphaComposite;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

public class RMSOrderGUI extends JFrame {
        String username = "aburhan";
        private String theUserLoggedIn=null;
        public String restaurantName = "<Your Restaurant Name Here>";
private final String RESTNAMEFILE = "src/data/d75499b1dd87ae78efc7afec3fd7697b.txt";
Parse parse = new Parse(); 
Database database = new Database();
String image = "/images/testImage.jpg";
List<String> information = Collections.synchronizedList(new ArrayList<String>());
         double total=0;
        static final int IMG_WIDTH = 200;
	static final int IMG_HEIGHT = 200;
        BufferedImage resizeImagePng;
        String FilePath = "src\\images\\";
        String MENU_FILE="src\\data\\menu.csv";
        String logFile="src\\data\\log.txt";
        File MYTABLE_FILE=new File("src\\data\\"+username+"myTable.csv");
        File TABLE_STATE_FILE = new File("src\\data\\tableState.csv");
        Map<String,JButton> map = new HashMap();

    public RMSOrderGUI() {
        initComponents();
        init(theUserLoggedIn);
          CardLayout cl = (CardLayout)(cardPanel.getLayout());
    cl.show(cardPanel,"restaurantView");
    }
    public RMSOrderGUI(String username){
  theUserLoggedIn = username;
  initComponents();
  init(theUserLoggedIn);
            CardLayout cl = (CardLayout)(cardPanel.getLayout());
    cl.show(cardPanel,"restaurantView");
}
    void init(String theUserLoggedIn){
          this.setIconImage(new 
  ImageIcon(getClass().getResource("images\\5mbicon1.png")).getImage());
  UserLoggedInLabel.setText("Server "+theUserLoggedIn);
  setTitle("RMS Restaurant");
  setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
  this.setSize(1350, 689);
  setLocationRelativeTo(null);
  setVisible(true);
   if(!parse.isFileEmpty(RESTNAMEFILE)){
    restaurantName = parse.returnRestaurantName(RESTNAMEFILE);
    //welcomeScreen.setText("Welcome to " +restaurantName);
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
     //imageOfYou.setIcon(picture);
     /*
     imageOfYou.setIcon(new ImageIcon(((new ImageIcon(image)).getImage())
               .getScaledInstance(312, 312, java.awt.Image.SCALE_SMOOTH))); */
    }else{
      //imageOfYou.setIcon(new javax.swing.ImageIcon(getClass().getResource(image))); 
      System.out.println("Entered else");
    }
   }catch(Exception e){
     //imageOfYou.setIcon(new ImageIcon(((new ImageIcon(image)).getImage())
              // .getScaledInstance(312, 312, java.awt.Image.SCALE_SMOOTH)));
     System.out.print("caught");
     throw e;
   }
  restaurantButton.setBackground(Color.green);
  map.put("Table 1", table1);
  //map.put("Table 2", table2);
  
  RMSTable table = new RMSTable();
  table.getTableState(table1);
  
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fullPanel = new javax.swing.JPanel();
        totalOrderPanel = new javax.swing.JPanel();
        totalLabel = new javax.swing.JLabel();
        orderPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        orderTable = new javax.swing.JTable();
        saveSendButton = new javax.swing.JButton();
        UserLoggedInLabel = new javax.swing.JLabel();
        LogoutButton = new javax.swing.JButton();
        cardPanel = new javax.swing.JPanel();
        tableViewPanel = new javax.swing.JPanel();
        seatPanel = new javax.swing.JPanel();
        tableNumberLabel = new javax.swing.JLabel();
        seatNumberLabel = new javax.swing.JLabel();
        noOfSeatsCombo = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        selectMenuItemLabel = new javax.swing.JLabel();
        addToOrderButton = new javax.swing.JButton();
        quantityLabel = new javax.swing.JLabel();
        unitPriceLabel = new javax.swing.JLabel();
        itemQtyCombo = new javax.swing.JComboBox();
        voidItemButton = new javax.swing.JButton();
        dineInTakeOutLabel = new javax.swing.JLabel();
        dineCarryCombo = new javax.swing.JComboBox();
        selectedItemText = new javax.swing.JLabel();
        selectedPriceText = new javax.swing.JLabel();
        forSeatCombo = new javax.swing.JComboBox();
        dineInTakeOutLabel1 = new javax.swing.JLabel();
        discountCombo = new javax.swing.JComboBox();
        editSeats = new javax.swing.JButton();
        tLabel = new javax.swing.JLabel();
        menuOrderPanel1 = new javax.swing.JPanel();
        menuViewPanel = new javax.swing.JPanel();
        menuOrderPanel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        myTablesViewPanel = new javax.swing.JPanel();
        myTablesScrollPane = new javax.swing.JScrollPane();
        myTablesTable = new javax.swing.JTable();
        cashLabel = new javax.swing.JLabel();
        discoverLabel = new javax.swing.JLabel();
        amexLabel = new javax.swing.JLabel();
        visaLabel = new javax.swing.JLabel();
        mcLabel = new javax.swing.JLabel();
        weAcceptLabel = new javax.swing.JLabel();
        demoSwipe = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        totalDue = new javax.swing.JLabel();
        tender = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cleanedTable = new javax.swing.JButton();
        restaurantViewPanel = new javax.swing.JPanel();
        table1 = new javax.swing.JButton();
        buttonPanel = new javax.swing.JPanel();
        restaurantButton = new javax.swing.JButton();
        tableTabButton = new javax.swing.JButton();
        menuButton = new javax.swing.JButton();
        myTables = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1280, 778));
        setResizable(false);

        fullPanel.setBackground(new java.awt.Color(255, 255, 255));

        totalOrderPanel.setBackground(new java.awt.Color(204, 204, 255));

        totalLabel.setBackground(new java.awt.Color(255, 255, 255));
        totalLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        totalLabel.setText(" Total");
        totalLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        totalLabel.setOpaque(true);

        orderPanel.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPane1.setViewportBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPane1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        orderTable.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        orderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Table", "Seat", "Item", "Qty", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        orderTable.setFillsViewportHeight(true);
        orderTable.setGridColor(new java.awt.Color(153, 204, 255));
        jScrollPane1.setViewportView(orderTable);

        saveSendButton.setBackground(new java.awt.Color(0, 153, 255));
        saveSendButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        saveSendButton.setForeground(new java.awt.Color(255, 255, 255));
        saveSendButton.setText("Save and Send");
        saveSendButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveSendButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout orderPanelLayout = new javax.swing.GroupLayout(orderPanel);
        orderPanel.setLayout(orderPanelLayout);
        orderPanelLayout.setHorizontalGroup(
            orderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(saveSendButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(orderPanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(UserLoggedInLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        orderPanelLayout.setVerticalGroup(
            orderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, orderPanelLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE)
                .addGap(9, 9, 9)
                .addComponent(UserLoggedInLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saveSendButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        LogoutButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        LogoutButton.setText("Log Out");
        LogoutButton.setContentAreaFilled(false);
        LogoutButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout totalOrderPanelLayout = new javax.swing.GroupLayout(totalOrderPanel);
        totalOrderPanel.setLayout(totalOrderPanelLayout);
        totalOrderPanelLayout.setHorizontalGroup(
            totalOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(totalOrderPanelLayout.createSequentialGroup()
                .addGroup(totalOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(totalOrderPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(LogoutButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(totalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(orderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        totalOrderPanelLayout.setVerticalGroup(
            totalOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(totalOrderPanelLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(totalOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LogoutButton))
                .addGap(1, 1, 1)
                .addComponent(orderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        cardPanel.setLayout(new java.awt.CardLayout());

        tableViewPanel.setBackground(new java.awt.Color(0, 0, 51));

        seatPanel.setOpaque(false);
        seatPanel.setPreferredSize(new java.awt.Dimension(896, 314));

        tableNumberLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tableNumberLabel.setForeground(new java.awt.Color(255, 255, 255));

        seatNumberLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        seatNumberLabel.setForeground(new java.awt.Color(255, 255, 255));
        seatNumberLabel.setText("# of Seats");

        noOfSeatsCombo.setVisible(false);
        noOfSeatsCombo.setBackground(new java.awt.Color(204, 204, 255));
        noOfSeatsCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        noOfSeatsCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noOfSeatsComboActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Item for seat #");

        selectMenuItemLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        selectMenuItemLabel.setForeground(new java.awt.Color(255, 255, 255));
        selectMenuItemLabel.setText("Select Menu Item");

        addToOrderButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        addToOrderButton.setForeground(new java.awt.Color(0, 153, 0));
        addToOrderButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/addToOrder.png"))); // NOI18N
        addToOrderButton.setText("Add To Order");
        addToOrderButton.setContentAreaFilled(false);
        addToOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToOrderButtonActionPerformed(evt);
            }
        });

        quantityLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        quantityLabel.setForeground(new java.awt.Color(255, 255, 255));
        quantityLabel.setText("Quantity:");

        unitPriceLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        unitPriceLabel.setForeground(new java.awt.Color(255, 255, 255));
        unitPriceLabel.setText("Unit Price:");

        itemQtyCombo.setBackground(new java.awt.Color(204, 204, 255));
        itemQtyCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        itemQtyCombo.setName(""); // NOI18N

        voidItemButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        voidItemButton.setForeground(new java.awt.Color(204, 0, 0));
        voidItemButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/voidItem.png"))); // NOI18N
        voidItemButton.setText("Void Item");
        voidItemButton.setContentAreaFilled(false);
        voidItemButton.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        dineInTakeOutLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        dineInTakeOutLabel.setForeground(new java.awt.Color(255, 255, 255));
        dineInTakeOutLabel.setText("Dine in / Take Out");

        dineCarryCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Dine in", "Carry Out" }));

        selectedItemText.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        selectedItemText.setForeground(new java.awt.Color(255, 255, 255));
        selectedItemText.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        selectedPriceText.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        selectedPriceText.setForeground(new java.awt.Color(255, 255, 255));
        selectedPriceText.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        forSeatCombo.setMinimumSize(new java.awt.Dimension(37, 20));
        forSeatCombo.setPreferredSize(new java.awt.Dimension(37, 20));

        dineInTakeOutLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        dineInTakeOutLabel1.setForeground(new java.awt.Color(255, 255, 255));
        dineInTakeOutLabel1.setText("Add Discount");

        editSeats.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        editSeats.setForeground(new java.awt.Color(255, 255, 255));
        editSeats.setText("Edit # of Seats");
        editSeats.setContentAreaFilled(false);
        editSeats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editSeatsActionPerformed(evt);
            }
        });

        tLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tLabel.setForeground(new java.awt.Color(255, 255, 255));
        tLabel.setText("Table");

        javax.swing.GroupLayout seatPanelLayout = new javax.swing.GroupLayout(seatPanel);
        seatPanel.setLayout(seatPanelLayout);
        seatPanelLayout.setHorizontalGroup(
            seatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, seatPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(seatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectMenuItemLabel))
                .addGap(17, 17, 17)
                .addGroup(seatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(selectedPriceText, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectedItemText, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(seatPanelLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(seatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(seatPanelLayout.createSequentialGroup()
                        .addComponent(quantityLabel)
                        .addGap(203, 203, 203))
                    .addGroup(seatPanelLayout.createSequentialGroup()
                        .addGroup(seatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(unitPriceLabel)
                            .addComponent(voidItemButton))
                        .addGap(139, 139, 139))))
            .addGroup(seatPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(seatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(seatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(addToOrderButton)
                        .addGroup(seatPanelLayout.createSequentialGroup()
                            .addGroup(seatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(dineInTakeOutLabel)
                                .addGroup(seatPanelLayout.createSequentialGroup()
                                    .addGap(9, 9, 9)
                                    .addComponent(dineInTakeOutLabel1)))
                            .addGap(25, 25, 25)
                            .addGroup(seatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(discountCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(dineCarryCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(seatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(forSeatCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(seatPanelLayout.createSequentialGroup()
                            .addComponent(editSeats)
                            .addGap(44, 44, 44)
                            .addGroup(seatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(itemQtyCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(noOfSeatsCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(seatPanelLayout.createSequentialGroup()
                        .addComponent(tLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tableNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(seatNumberLabel)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        seatPanelLayout.setVerticalGroup(
            seatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(seatPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(seatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(seatNumberLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tableNumberLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(seatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(noOfSeatsCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editSeats))
                .addGap(22, 22, 22)
                .addGroup(seatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(seatPanelLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(24, 24, 24))
                    .addGroup(seatPanelLayout.createSequentialGroup()
                        .addComponent(forSeatCombo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)))
                .addGroup(seatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(selectedItemText, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectMenuItemLabel))
                .addGap(27, 27, 27)
                .addGroup(seatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quantityLabel)
                    .addComponent(itemQtyCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(seatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(unitPriceLabel)
                    .addComponent(selectedPriceText, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(voidItemButton)
                .addGap(31, 31, 31)
                .addGroup(seatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dineInTakeOutLabel)
                    .addComponent(dineCarryCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(seatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dineInTakeOutLabel1)
                    .addComponent(discountCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addComponent(addToOrderButton)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        menuOrderPanel1.setBackground(new java.awt.Color(255, 255, 255));
        menuOrderPanel1.setOpaque(false);

        javax.swing.GroupLayout menuOrderPanel1Layout = new javax.swing.GroupLayout(menuOrderPanel1);
        menuOrderPanel1.setLayout(menuOrderPanel1Layout);
        menuOrderPanel1Layout.setHorizontalGroup(
            menuOrderPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 716, Short.MAX_VALUE)
        );
        menuOrderPanel1Layout.setVerticalGroup(
            menuOrderPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout tableViewPanelLayout = new javax.swing.GroupLayout(tableViewPanel);
        tableViewPanel.setLayout(tableViewPanelLayout);
        tableViewPanelLayout.setHorizontalGroup(
            tableViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tableViewPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(seatPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(menuOrderPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        tableViewPanelLayout.setVerticalGroup(
            tableViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tableViewPanelLayout.createSequentialGroup()
                .addGroup(tableViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(seatPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 577, Short.MAX_VALUE)
                    .addComponent(menuOrderPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        cardPanel.add(tableViewPanel, "tableView");

        menuViewPanel.setBackground(new java.awt.Color(0, 0, 51));

        menuOrderPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout menuOrderPanelLayout = new javax.swing.GroupLayout(menuOrderPanel);
        menuOrderPanel.setLayout(menuOrderPanelLayout);
        menuOrderPanelLayout.setHorizontalGroup(
            menuOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 744, Short.MAX_VALUE)
        );
        menuOrderPanelLayout.setVerticalGroup(
            menuOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel7.setFont(new java.awt.Font("Brush Script MT", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Today's Specials");

        javax.swing.GroupLayout menuViewPanelLayout = new javax.swing.GroupLayout(menuViewPanel);
        menuViewPanel.setLayout(menuViewPanelLayout);
        menuViewPanelLayout.setHorizontalGroup(
            menuViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuViewPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel7)
                .addGap(36, 36, 36)
                .addComponent(menuOrderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        menuViewPanelLayout.setVerticalGroup(
            menuViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuViewPanelLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel7)
                .addContainerGap(502, Short.MAX_VALUE))
            .addGroup(menuViewPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menuOrderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        cardPanel.add(menuViewPanel, "menuView");

        myTablesScrollPane.setBackground(new java.awt.Color(255, 255, 255));

        myTablesTable.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        myTablesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "My Unpaid Orders", "Total"
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
        myTablesTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                myTablesTableMouseClicked(evt);
            }
        });
        myTablesScrollPane.setViewportView(myTablesTable);

        cashLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cash.png"))); // NOI18N

        discoverLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/discover.png"))); // NOI18N

        amexLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/amex.png"))); // NOI18N

        visaLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/visa.png"))); // NOI18N

        mcLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mastercard.png"))); // NOI18N

        weAcceptLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        weAcceptLabel.setText("We accept ");

        demoSwipe.setText("DEMO SWIPE");
        demoSwipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                demoSwipeActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("CASH");

        totalDue.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        tender.setEditable(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("TOTAL DUE");

        cleanedTable.setText("CLEANED TABLE");
        cleanedTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cleanedTableActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout myTablesViewPanelLayout = new javax.swing.GroupLayout(myTablesViewPanel);
        myTablesViewPanel.setLayout(myTablesViewPanelLayout);
        myTablesViewPanelLayout.setHorizontalGroup(
            myTablesViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myTablesViewPanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(myTablesScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(myTablesViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(myTablesViewPanelLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(weAcceptLabel)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, myTablesViewPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                        .addGroup(myTablesViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(demoSwipe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(myTablesViewPanelLayout.createSequentialGroup()
                                .addGroup(myTablesViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, myTablesViewPanelLayout.createSequentialGroup()
                                        .addComponent(cashLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(discoverLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(amexLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(visaLabel))
                                    .addGroup(myTablesViewPanelLayout.createSequentialGroup()
                                        .addGap(49, 49, 49)
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tender, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(totalDue, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mcLabel))
                            .addComponent(cleanedTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(70, 70, 70))))
            .addGroup(myTablesViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, myTablesViewPanelLayout.createSequentialGroup()
                    .addContainerGap(658, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addGap(324, 324, 324)))
        );
        myTablesViewPanelLayout.setVerticalGroup(
            myTablesViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myTablesViewPanelLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(myTablesViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(myTablesScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(myTablesViewPanelLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(weAcceptLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(myTablesViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cashLabel)
                            .addComponent(discoverLabel)
                            .addComponent(amexLabel)
                            .addComponent(visaLabel)
                            .addComponent(mcLabel))
                        .addGap(54, 54, 54)
                        .addComponent(totalDue, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(myTablesViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tender, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(69, 69, 69)
                        .addComponent(demoSwipe, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cleanedTable, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(112, Short.MAX_VALUE))
            .addGroup(myTablesViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(myTablesViewPanelLayout.createSequentialGroup()
                    .addGap(239, 239, 239)
                    .addComponent(jLabel2)
                    .addContainerGap(332, Short.MAX_VALUE)))
        );

        cardPanel.add(myTablesViewPanel, "myTables");

        restaurantViewPanel.setBackground(new java.awt.Color(0, 0, 51));

        table1.setBackground(new java.awt.Color(0, 102, 0));
        table1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        table1.setForeground(new java.awt.Color(255, 255, 255));
        table1.setText("Table 1");
        table1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                table1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout restaurantViewPanelLayout = new javax.swing.GroupLayout(restaurantViewPanel);
        restaurantViewPanel.setLayout(restaurantViewPanelLayout);
        restaurantViewPanelLayout.setHorizontalGroup(
            restaurantViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(restaurantViewPanelLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(table1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(791, Short.MAX_VALUE))
        );
        restaurantViewPanelLayout.setVerticalGroup(
            restaurantViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(restaurantViewPanelLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(table1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(371, Short.MAX_VALUE))
        );

        cardPanel.add(restaurantViewPanel, "restaurantView");

        buttonPanel.setBackground(new java.awt.Color(204, 204, 255));
        buttonPanel.setMaximumSize(new java.awt.Dimension(261, 30));
        buttonPanel.setLayout(new java.awt.GridLayout(1, 0));

        restaurantButton.setBackground(new java.awt.Color(255, 255, 255));
        restaurantButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        restaurantButton.setText("Restuarant");
        restaurantButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restaurantButtonActionPerformed(evt);
            }
        });
        buttonPanel.add(restaurantButton);

        tableTabButton.setBackground(new java.awt.Color(255, 255, 255));
        tableTabButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tableTabButton.setText("Table");
        tableTabButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tableTabButtonActionPerformed(evt);
            }
        });
        buttonPanel.add(tableTabButton);

        menuButton.setBackground(new java.awt.Color(255, 255, 255));
        menuButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        menuButton.setText("Menu");
        menuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuButtonActionPerformed(evt);
            }
        });
        buttonPanel.add(menuButton);

        myTables.setBackground(new java.awt.Color(255, 255, 255));
        myTables.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        myTables.setText("My Tables/Check Out");
        myTables.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myTablesActionPerformed(evt);
            }
        });
        buttonPanel.add(myTables);

        javax.swing.GroupLayout fullPanelLayout = new javax.swing.GroupLayout(fullPanel);
        fullPanel.setLayout(fullPanelLayout);
        fullPanelLayout.setHorizontalGroup(
            fullPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fullPanelLayout.createSequentialGroup()
                .addComponent(totalOrderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(fullPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cardPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        fullPanelLayout.setVerticalGroup(
            fullPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fullPanelLayout.createSequentialGroup()
                .addComponent(buttonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(cardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
            .addGroup(fullPanelLayout.createSequentialGroup()
                .addComponent(totalOrderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fullPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fullPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void table1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_table1ActionPerformed
        int result = JOptionPane.showConfirmDialog(null, "Would you like to pick up this table?");
        if(result == JOptionPane.YES_OPTION||result == JOptionPane.OK_OPTION){
            changeTableStateYellow(table1);
       
        CardLayout cl = (CardLayout)(cardPanel.getLayout());
        
        tableNumberLabel.setText("1");
        String input = JOptionPane.showInputDialog(null,"How Many Guest?");
        try{
        int guest = Integer.parseInt(input);
        String[] seatsCB = new String[guest];
        
        for(int i=0; i<guest;i++){
            seatsCB[i]=Integer.toString(i+1);
        }
        forSeatCombo.setModel(new javax.swing.DefaultComboBoxModel(seatsCB));
        seatNumberLabel.setText("Number of Guests "+input);
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Error invalid number");
        }
        restaurantButton.setBackground(Color.white);
        tableTabButton.setBackground(Color.green);
       cl.show(cardPanel,"tableView");
       viewMenu(menuOrderPanel1);
        }
        
    }//GEN-LAST:event_table1ActionPerformed

    private void editSeatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editSeatsActionPerformed
        noOfSeatsCombo.setVisible(true);
       
    }//GEN-LAST:event_editSeatsActionPerformed

    private void noOfSeatsComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noOfSeatsComboActionPerformed
        String input = (String) noOfSeatsCombo.getSelectedItem();
        int guest = Integer.parseInt(input);
        String[] seatsCB = new String[guest];
        seatNumberLabel.setText("Number of Guests "+input);
        for(int i=0; i<guest;i++){
            seatsCB[i]=Integer.toString(i+1);
        }
        forSeatCombo.setModel(new javax.swing.DefaultComboBoxModel(seatsCB));
    }//GEN-LAST:event_noOfSeatsComboActionPerformed

    private void addToOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToOrderButtonActionPerformed
         
        
         DefaultTableModel model = (DefaultTableModel) orderTable.getModel();
        String tableNumber = tableNumberLabel.getText();
        String seatNumber = forSeatCombo.getSelectedItem().toString();
        
        String item = selectedItemText.getText();
        String qtyString = itemQtyCombo.getSelectedItem().toString();
        String priceString = selectedPriceText.getText().toString();
        String dine = dineCarryCombo.getSelectedItem().toString();
        int qty=Integer.parseInt(qtyString);
        double price = Double.parseDouble(priceString);
        
//        String discount = discountCombo.getSelectedItem().toString();
       
        total+=(price*qty);
        Object totalPrint=total;
        totalLabel.setText("Total "+totalPrint);
        
     
       orderTable.setModel(model);
            model.addRow(new Object[]{tableNumber,seatNumber,item,qty,price});
       
    
    }//GEN-LAST:event_addToOrderButtonActionPerformed

    private void saveSendButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveSendButtonActionPerformed
     
                
            PrintWriter os;
    try {
      os = new PrintWriter(MYTABLE_FILE);
      for (int row = 0; row < orderTable.getRowCount(); row++) {
        for (int col = 0; col < orderTable.getColumnCount(); col++) {
          os.print(orderTable.getValueAt(row, col));
          os.print(",");
        }
        os.print("\n");

      }
     
 os.close();
    } catch (FileNotFoundException ex) {
  
                    try {
                        MYTABLE_FILE.createNewFile();
                    } catch (IOException ex1) {
                        Logger.getLogger(RMSOrderGUI.class.getName()).log(Level.SEVERE, null, ex1);
                    }
                } 
     toCheckout();
    }//GEN-LAST:event_saveSendButtonActionPerformed

    private void myTablesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myTablesActionPerformed
        toCheckout();

       
    }//GEN-LAST:event_myTablesActionPerformed

    private void menuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuButtonActionPerformed
        CardLayout cl = (CardLayout)(cardPanel.getLayout());
        cl.show(cardPanel,"menuView");
        menuButton.setBackground(Color.green);
        restaurantButton.setBackground(Color.white);
        tableTabButton.setBackground(Color.white);
        myTables.setBackground(Color.white);
       
        viewMenu(menuOrderPanel);
    }//GEN-LAST:event_menuButtonActionPerformed

    private void tableTabButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tableTabButtonActionPerformed
        CardLayout cl = (CardLayout)(cardPanel.getLayout());
        cl.show(cardPanel,"tableView");
        tableTabButton.setBackground(Color.green);
        restaurantButton.setBackground(Color.white);
        menuButton.setBackground(Color.white);

        myTables.setBackground(Color.white);
       

        viewMenu(menuOrderPanel1);
    }//GEN-LAST:event_tableTabButtonActionPerformed

    private void restaurantButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restaurantButtonActionPerformed
        CardLayout cl = (CardLayout)(cardPanel.getLayout());
        cl.show(cardPanel,"restaurantView");
        restaurantButton.setBackground(Color.green);
        menuButton.setBackground(Color.white);
        tableTabButton.setBackground(Color.white);
        myTables.setBackground(Color.white);
       
    }//GEN-LAST:event_restaurantButtonActionPerformed

    private void myTablesTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myTablesTableMouseClicked
            Object total = myTablesTable.getValueAt(myTablesTable.getSelectedRow(), 1);
            totalDue.setText(total.toString());
    }//GEN-LAST:event_myTablesTableMouseClicked

    private void demoSwipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_demoSwipeActionPerformed
     JOptionPane.showMessageDialog(null, "Payment Successful");
     changeTableStateRed(table1);
     
    }//GEN-LAST:event_demoSwipeActionPerformed

    private void cleanedTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleanedTableActionPerformed
        changeTableStateGreen(table1);
    }//GEN-LAST:event_cleanedTableActionPerformed

    private void LogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutButtonActionPerformed
    setVisible(false);
    dispose();
    LoginGUI login = new LoginGUI();
    login.setVisible(true);
    }//GEN-LAST:event_LogoutButtonActionPerformed

    public static void main(String args[]) {
    
        try {
            UIManager.put("Table.alternateRowColor", Color.LIGHT_GRAY);
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RMSOrderGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new RMSOrderGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LogoutButton;
    private javax.swing.JLabel UserLoggedInLabel;
    private javax.swing.JButton addToOrderButton;
    private javax.swing.JLabel amexLabel;
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JPanel cardPanel;
    private javax.swing.JLabel cashLabel;
    private javax.swing.JButton cleanedTable;
    private javax.swing.JButton demoSwipe;
    private javax.swing.JComboBox dineCarryCombo;
    private javax.swing.JLabel dineInTakeOutLabel;
    private javax.swing.JLabel dineInTakeOutLabel1;
    private javax.swing.JComboBox discountCombo;
    private javax.swing.JLabel discoverLabel;
    private javax.swing.JButton editSeats;
    private javax.swing.JComboBox forSeatCombo;
    private javax.swing.JPanel fullPanel;
    private javax.swing.JComboBox itemQtyCombo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel mcLabel;
    private javax.swing.JButton menuButton;
    private javax.swing.JPanel menuOrderPanel;
    private javax.swing.JPanel menuOrderPanel1;
    private javax.swing.JPanel menuViewPanel;
    private javax.swing.JButton myTables;
    private javax.swing.JScrollPane myTablesScrollPane;
    private javax.swing.JTable myTablesTable;
    private javax.swing.JPanel myTablesViewPanel;
    private javax.swing.JComboBox noOfSeatsCombo;
    private javax.swing.JPanel orderPanel;
    private javax.swing.JTable orderTable;
    private javax.swing.JLabel quantityLabel;
    private javax.swing.JButton restaurantButton;
    private javax.swing.JPanel restaurantViewPanel;
    private javax.swing.JButton saveSendButton;
    private javax.swing.JLabel seatNumberLabel;
    private javax.swing.JPanel seatPanel;
    private javax.swing.JLabel selectMenuItemLabel;
    private javax.swing.JLabel selectedItemText;
    private javax.swing.JLabel selectedPriceText;
    private javax.swing.JLabel tLabel;
    private javax.swing.JButton table1;
    private javax.swing.JLabel tableNumberLabel;
    private javax.swing.JButton tableTabButton;
    private javax.swing.JPanel tableViewPanel;
    private javax.swing.JTextField tender;
    private javax.swing.JLabel totalDue;
    private javax.swing.JLabel totalLabel;
    private javax.swing.JPanel totalOrderPanel;
    private javax.swing.JLabel unitPriceLabel;
    private javax.swing.JLabel visaLabel;
    private javax.swing.JButton voidItemButton;
    private javax.swing.JLabel weAcceptLabel;
    // End of variables declaration//GEN-END:variables

       void viewMenu(JPanel viewMenuPanel){
       
        final int IMG_WIDTH = 100;
	final int IMG_HEIGHT = 100;
       
        try {

        
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(10, 10, 650, 600);
        viewMenuPanel.add(scrollPane);

        JPanel borderlayoutpanel = new JPanel();
        scrollPane.setViewportView(borderlayoutpanel);
        borderlayoutpanel.setLayout(new BorderLayout(0, 0));

        JPanel columnpanel = new JPanel();
        borderlayoutpanel.add(columnpanel, BorderLayout.NORTH);
        columnpanel.setLayout(new GridLayout(0, 1, 0, 1));
        columnpanel.setBackground(Color.gray);
         
        Scanner sc = new Scanner(new File(MENU_FILE));
int i = 0;
       while(sc.hasNext()){
           String line = sc.nextLine();
           String[] split=line.split(",");
           String category=split[0];
           String description =split[1];
           String price = split[2];
           String pic = split[3];
 
           BufferedImage originalImage = ImageIO.read(new File(FilePath+pic));
           int type = originalImage.getType() == 0? BufferedImage.TYPE_INT_ARGB : originalImage.getType();
           
           resizeImagePng = resizeImage(originalImage, type);
           ImageIO.write(resizeImagePng, "png", new File(FilePath+pic+"_resized")); 

           JLabel picLabel = new JLabel(new ImageIcon(FilePath+pic+"_resized"));
           
            JPanel rowPanel = new JPanel();
            rowPanel.setPreferredSize(new Dimension(400,200));
            columnpanel.add(rowPanel);
            rowPanel.setLayout(null);

            
            JButton addButton = new JButton("Add");
            final JLabel catLabel = new JLabel(split[0]);
            
            final JLabel descLabel = new JLabel(split[1]);
            
            final JLabel priceLabel = new JLabel ((split[2]));
            priceLabel.setToolTipText(price);
            catLabel.setFont(new Font("Serif", Font.BOLD, 18));
            priceLabel.setFont(new Font("Serif",Font.BOLD, 24));
            descLabel.setFont(new Font("Serif",Font.PLAIN, 20));
             addButton.addActionListener(new ActionListener() {
 
            public void actionPerformed(ActionEvent e)
            {
                String desc = descLabel.getText();
                String cat = catLabel.getText();
                String price = priceLabel.getText();
                
                selectedItemText.setText(desc);
                selectedPriceText.setText(price);
            }
        });    
            
            catLabel.setBounds(180,20,150,50);
            addButton.setBounds(350,60,150,50);
            descLabel.setBounds(200,3,300,200);
            priceLabel.setBounds(400,10,150,50);
            picLabel.setBounds(10,25,150,150);
            
            rowPanel.add(picLabel);
            rowPanel.add(catLabel);
            rowPanel.add(addButton);
            rowPanel.add(descLabel);
            rowPanel.add(priceLabel);

            if(i%2==0)
            rowPanel.setBackground(SystemColor.inactiveCaptionBorder);
            i++;
       }
    } catch (FileNotFoundException ex) {
        System.err.println("menu file not found");
    } catch (IOException ex) {
        System.err.println("IO error");
    }
          
    }
           private static BufferedImage resizeImage(BufferedImage originalImage, int type){
	BufferedImage resizedImage = new BufferedImage(IMG_WIDTH, IMG_HEIGHT, type);
	Graphics2D g = resizedImage.createGraphics();
	g.drawImage(originalImage, 0, 0, IMG_WIDTH, IMG_HEIGHT, null);
	g.dispose();
 
	return resizedImage;
    }
 
    private static BufferedImage resizeImageWithHint(BufferedImage originalImage, int type){
 
	BufferedImage resizedImage = new BufferedImage(IMG_WIDTH, IMG_HEIGHT, type);
	Graphics2D g = resizedImage.createGraphics();
	g.drawImage(originalImage, 0, 0, IMG_WIDTH, IMG_HEIGHT, null);
	g.dispose();	
	g.setComposite(AlphaComposite.Src);
 
	g.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
	RenderingHints.VALUE_INTERPOLATION_BILINEAR);
	g.setRenderingHint(RenderingHints.KEY_RENDERING,
	RenderingHints.VALUE_RENDER_QUALITY);
	g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
	RenderingHints.VALUE_ANTIALIAS_ON);
 
	return resizedImage;
    }	 
    private void changeTableStateGreen(JButton table) {
        ArrayList<String> update = new ArrayList();
             try {
                Scanner sc = new Scanner(TABLE_STATE_FILE);
                while(sc.hasNext()){
                    
                    String line = sc.nextLine();
                    String[] split = line.split(",");
                    
                    if((split[0]).toString().equals(table.getText())==true){
                        table.setBackground(Color.yellow.darker());
                        update.add(split[0]);
                        update.add(",");
                        update.add("1");
                        update.add("\n");
                    }
                    else{
                    update.add(split[0]);
                    update.add(",");
                    update.add(split[1]);
                    update.add("\n");
                    }
                    
                }
                sc.close();
                   
            } catch (FileNotFoundException ex) {
                Logger.getLogger(RMSOrderGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                PrintWriter pw = new PrintWriter(TABLE_STATE_FILE);
                for(int i=0;i<update.size();i++){
                    pw.write(update.get(i));
                }
                pw.flush();
                pw.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(RMSOrderGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
             
    }
    private void changeTableStateYellow(JButton table) {
        ArrayList<String> update = new ArrayList();
             try {
                Scanner sc = new Scanner(TABLE_STATE_FILE);
                while(sc.hasNext()){
                    
                    String line = sc.nextLine();
                    String[] split = line.split(",");
                    
                    if((split[0]).toString().equals(table.getText())==true){
                        table.setBackground(Color.yellow.darker());
                        update.add(split[0]);
                        update.add(",");
                        update.add("2");
                        update.add("\n");
                    }
                    else{
                    update.add(split[0]);
                    update.add(",");
                    update.add(split[1]);
                    update.add("\n");
                    }
                    
                }
                sc.close();
                   
            } catch (FileNotFoundException ex) {
                Logger.getLogger(RMSOrderGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                PrintWriter pw = new PrintWriter(TABLE_STATE_FILE);
                for(int i=0;i<update.size();i++){
                    pw.write(update.get(i));
                }
                pw.flush();
                pw.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(RMSOrderGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
             
    }
 private void changeTableStateRed(JButton table) {
        ArrayList<String> update = new ArrayList();
             try {
                Scanner sc = new Scanner(TABLE_STATE_FILE);
                while(sc.hasNext()){
                    
                    String line = sc.nextLine();
                    String[] split = line.split(",");
                    
                    if((split[0]).toString().equals(table.getText())==true){
                        table.setBackground(Color.yellow.darker());
                        update.add(split[0]);
                        update.add(",");
                        update.add("3");
                        update.add("\n");
                    }
                    else{
                    update.add(split[0]);
                    update.add(",");
                    update.add(split[1]);
                    update.add("\n");
                    }
                    
                }
                sc.close();
                   
            } catch (FileNotFoundException ex) {
                Logger.getLogger(RMSOrderGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                PrintWriter pw = new PrintWriter(TABLE_STATE_FILE);
                for(int i=0;i<update.size();i++){
                    pw.write(update.get(i));
                }
                pw.flush();
                pw.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(RMSOrderGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
             
    }


    private void toCheckout() {
                DefaultTableModel model = (DefaultTableModel) myTablesTable.getModel(); 
        myTablesTable.setModel(model);
        int table = 0;
        try {
                CardLayout cl = (CardLayout)(cardPanel.getLayout());
               cl.show(cardPanel,"myTables");
               restaurantButton.setBackground(Color.white);
               menuButton.setBackground(Color.white);
               tableTabButton.setBackground(Color.white);
               myTables.setBackground(Color.green);
               Scanner sc = new Scanner(MYTABLE_FILE);
               double totalTable1=0;
               double totalTable2=0;
               double totalTable3=0;
               double totalTable4=0;
               double totalTable5=0;
               double totalTable6=0;
                while(sc.hasNext()){
                    String line = sc.nextLine();
                    String[] split = line.split(",");
                    table = Integer.parseInt(split[0]);
                    switch(table){
                        case 1:
                            totalTable1+=Double.parseDouble(split[4]);
                            break;
                        case 2:
                            totalTable2+=Double.parseDouble(split[4]);
                            break;
                        case 3:
                            totalTable3+=Double.parseDouble(split[4]);
                            break;
                        case 4:
                            totalTable4+=Double.parseDouble(split[4]);
                            break;
                        case 5:
                            totalTable5+=Double.parseDouble(split[4]);
                            break;
                        default:
                            totalTable1+=Double.parseDouble(split[4]);
                            break;
                    }
                     
            
                }
                model.addRow(new Object[]{table,totalTable1});
                
            } catch (FileNotFoundException ex) {
              System.err.append("myTablesActionPerformed has thrown a file not found on  "+MYTABLE_FILE);
            }
    }
}
