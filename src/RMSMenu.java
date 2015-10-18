import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

class RMSMenu {
       	static final int IMG_WIDTH = 200;
	static final int IMG_HEIGHT = 200;
        BufferedImage resizeImagePng;
        String FilePath = "src\\data\\";
        String MENU_FILE="src\\data\\menu.csv";
        String logFile="src\\data\\log.txt";
    public RMSMenu() {
    }
    protected void logMenu(JPanel viewMenuPanel, JTable viewLogTable){
             DefaultTableModel tm2 = (DefaultTableModel) viewLogTable.getModel();
        
        String[] colArray = {"Log"} ;

            Vector<String> colNames = new Vector<>(Arrays.asList(colArray));
            
            
            Scanner scanner;
        try {
            scanner = new Scanner(new File(logFile));
        
            int count = 0;
            Vector<Vector<String>> dataVector = new Vector<Vector<String>>();
            Vector<String> rowVector = new Vector<String>();
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                
                rowVector.add(line);
                

                count++;

                dataVector.add(rowVector);
                rowVector = new Vector<String>();
            }
            tm2 = new DefaultTableModel(dataVector, colNames);

            viewLogTable.setModel(tm2);

        } catch (FileNotFoundException ex) {
     
        }
          
        
    }
    protected void viewMenu(JPanel viewMenuPanel){
        final int IMG_WIDTH = 150;
	final int IMG_HEIGHT = 150;
       
        try {

        
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(10, 10, 730, 550);
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
            rowPanel.setPreferredSize(new Dimension(500,200));
            columnpanel.add(rowPanel);
            rowPanel.setLayout(null);

          
            JLabel catLabel = new JLabel(split[0]);
            JLabel descLabel = new JLabel(split[1]);
            JLabel priceLabel = new JLabel ("$"+(split[2]));
            catLabel.setFont(new Font("Serif", Font.BOLD, 18));
            priceLabel.setFont(new Font("Serif",Font.BOLD, 24));
            descLabel.setFont(new Font("Serif",Font.PLAIN, 20));
            
            catLabel.setBounds(180,20,150,50);
            descLabel.setBounds(300,3,300,200);
            priceLabel.setBounds(600,10,150,50);
            picLabel.setBounds(10,25,150,150);
            rowPanel.add(picLabel);
            rowPanel.add(catLabel);
            rowPanel.add(descLabel);
            rowPanel.add(priceLabel);

            if(i%2==0)
            rowPanel.setBackground(SystemColor.inactiveCaptionBorder);
            i++;
       }
    } catch (FileNotFoundException ex) {
        Logger.getLogger(RMSAdminGUI.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IOException ex) {
        Logger.getLogger(RMSAdminGUI.class.getName()).log(Level.SEVERE, null, ex);
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
   



 public static final String FILE_NAME = "C:\\Users\\Ameenah\\Documents\\NetBeansProjects\\RMS_SE_Fall\\DATA\\menu.csv";
 public static final String[] COLUMNS = {"Category", "Description", "Price","Image File"};
 DefaultTableModel model = new DefaultTableModel();
 final JFileChooser fc = new JFileChooser();
 String[] items = {"Appetizer", "Dessert", "Drinks", "Entree"};
 String photoName;
  
    DefaultTableModel viewMenu(JTable table) {
        
    
    Vector<String> colNames = new Vector<String>(Arrays.asList(COLUMNS));
        try {
            Scanner scanner = new Scanner(new File(FILE_NAME));
            int count = 0;
                Vector<Vector<String>> dataVector = new Vector<Vector<String>>();
                Vector<String> rowVector = new Vector<String>();
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();

                    String[] split = line.split(",");
                    rowVector.add(split[0]);
                    rowVector.add(split[1]);
                    rowVector.add(split[2]);
                    rowVector.add(split[3]);

                    count++;

                    dataVector.add(rowVector);
                    rowVector = new Vector<String>();

        }
        model = new DefaultTableModel(dataVector, colNames);
        
        
        table.setModel(model);
       
        table.setAutoCreateRowSorter(true);
       }
    catch (FileNotFoundException e) {
        }    
     return model;
    }

    void addItem() {
          //add to panel
                panel.add(combo);
                panel.add(new JLabel("Item Description"));
                panel.add(description);
                panel.add(new JLabel("Item Price"));
                panel.add(price);
                panel.add(costLabel);
                panel.add(cost);
                photoNameField.setVisible(false);
                panel.add(photoNameField);
                panel.add(addPic);
           
        addPic.addActionListener(new java.awt.event.ActionListener() {
            
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPicActionPerformed(evt);
                }
                  
             private String addPicActionPerformed(ActionEvent evt)  {
               FileNameExtensionFilter filter = new FileNameExtensionFilter(
            "JPG & GIF Images", "jpg", "gif");
            fc.setFileFilter(filter);
            int returnVal = fc.showOpenDialog(null);
            if(returnVal == fc.APPROVE_OPTION) {
              
                  photoName= fc.getSelectedFile().getName();
                  photoNameField.setVisible(true);
                  photoNameField.setText(photoName);
    }
                return photoName;
             }
            });
        addItem.addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
                try { 
                    addItemActionPerformed(evt);
                } catch (FileNotFoundException ex) {
                    JOptionPane.showMessageDialog(null, "RMSMenu file not found: menu.csv");
                }
            }

            private void addItemActionPerformed(ActionEvent evt) throws FileNotFoundException {

                //add to panel
                panel.add(combo);
                panel.add(new JLabel("Item Description"));
                panel.add(description);
                panel.add(new JLabel("Item Price"));
                panel.add(price);
                photoNameField.setVisible(false);
                panel.add(photoNameField);
                panel.add(addPic);
                
               
                
                int result = JOptionPane.showConfirmDialog(null, panel, "Add to Menu",
                    JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
                if (result == JOptionPane.OK_OPTION) {
                    String selectedCB = combo.getSelectedItem().toString();
                    String priceTF = price.getText();
                    String descTF = description.getText();
                    
                         
                     
                    Boolean valid=AddValidation(selectedCB, priceTF,descTF);
                    
                    if(valid == true){
                        log = new PrintWriter("log.txt");
                        
                        log.println(logDate+ " added "+ selectedCB+","+priceTF+","+descTF);
                        model.addRow(new Object[]{selectedCB,descTF,priceTF,photoName});
                        log.close();
                    }
                    
                } else {
                    JOptionPane.showMessageDialog(null, "Item was not added");
                }
            }
/*
 * Add Validation
 * Takes in the information recieved from 
 * AddToMenuPopUp and makes sure that the numbers entered are valid
 * non negative numbers. 
 * Provides a catch if price is over $100 dollar
 */
            private Boolean AddValidation(String selectedItem, String price, String desc) {
                double priceVal;
                
                Boolean valid=false;
                if(!desc.matches("")){
                try  
                {  
                   Double.parseDouble( price );  
                    
                        //if its a number we can parse it
                        priceVal = Double.parseDouble(price);
                        if(0<priceVal && priceVal<=100){
                        
                            int priceConf=JOptionPane.showConfirmDialog(apply, "Are you sure $"
                                    +(new DecimalFormat(".00").format(priceVal))+" is the correct price for "
                                + selectedItem+": "+desc);
                            
                            if(priceConf==JOptionPane.YES_OPTION){
                             valid = true;
                             //check to see if descript text is empty
                                    
                                  
                            }
                            else
                            {
                                System.exit(0);
                            }
                        }
                        
                        else
                        {
                            JOptionPane.showMessageDialog(null,"The price "
                                    + "entered is not valid");
                            valid = false;
                        }
                
                }
         
                      
                catch(NumberFormatException | HeadlessException e )  
                {  
                    JOptionPane.showMessageDialog(null,"The price "
                                    + "entered is not valid");
                   return false;  
                }
                }
                else{
                      //Display error
             JOptionPane.showMessageDialog(apply, "Description field must not be empty");
                }
            
                return valid;
            }  
        });
           
                int result = JOptionPane.showConfirmDialog(null, panel, "Add to Menu",
                    JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
                if (result == JOptionPane.OK_OPTION) {
                    String selectedCB = combo.getSelectedItem().toString();
                    String priceTF = price.getText();
                    String descTF = description.getText();
                    String costTF = cost.getText();
                         
                     
                    Boolean valid=AddValidation(selectedCB, priceTF,descTF,costTF);
                    
                    if(valid == true){
                        try {
                            log = new PrintWriter("log.txt");
                        } catch (FileNotFoundException ex) {
                            JOptionPane.showMessageDialog(null, "log.txt file not found RMSMenu");
                        }
                        
                        log.println(logDate+ " added "+ selectedCB+","+priceTF+","+descTF);
                        model.addRow(new Object[]{selectedCB,descTF,priceTF,photoName});
                        log.close();
                    }
                    
                } else {
                    JOptionPane.showMessageDialog(null, "Item was not added");
                }
            }
   
        private JTable table = new JTable();
        private JButton deleteItem = new JButton("Delete");
        private JButton addItem = new JButton("Add");
        private JButton modifyItem = new JButton("Modify");
        private JButton apply = new JButton("Apply");
        private JPanel modifyPanel = new JPanel();
        private JButton addPic = new JButton("Add Picture");
        private JFrame frame2 = new JFrame("Menu Modification");
        private JComboBox combo = new JComboBox(items);
        private JTextField description = new JTextField();
        private JTextField price = new JTextField();
        private JPanel panel = new JPanel(new GridLayout(0, 1));
        private JTextField photoNameField = new JTextField();
        private JButton doneMod = new JButton("Done");
        private JLabel costLabel= new JLabel("Unit Cost");
        private JTextField cost = new JTextField();
        private PrintWriter log;
        private Date logDate = new Date();
        

               private Boolean AddValidation(String selectedItem, String price, String desc,String cost) {
                double priceVal;
                double costVal;
                
                Boolean valid=false;
                if(!desc.matches("")){
                try  
                {  
                   Double.parseDouble( price );  
                    
                        //if its a number we can parse it
                        priceVal = Double.parseDouble(price);
                        if(0<priceVal && priceVal<=100){
                        
                            int priceConf=JOptionPane.showConfirmDialog(apply, "Are you sure $"
                                    +(new DecimalFormat(".00").format(priceVal))+" is the correct price for "
                                + selectedItem+": "+desc);
                            
                            if(priceConf==JOptionPane.YES_OPTION){
                             valid = true;
                             //check to see if descript text is empty
                                    
                                  
                            }
                            if(!cost.isEmpty()){
                                costVal = Double.parseDouble(cost);
                                if(priceVal-costVal<0){
                                    JOptionPane.showMessageDialog(null,"Error: Your 'Unit Cost' is greater than your 'Price'");
                                        valid = false;
                                }
                            }
                            else{
                                JOptionPane.showMessageDialog(null, "Unit Cost field is empty");
                                            valid = false;
                            }
                        }
                        
                        else
                        {
                            JOptionPane.showMessageDialog(null,"The price "
                                    + "entered is not valid");
                            valid = false;
                        }
                
                }
         
                      
                catch(NumberFormatException | HeadlessException e )  
                {  
                    JOptionPane.showMessageDialog(null,"The price "
                                    + "entered is not valid");
                   return false;  
                }
                }
                else{
                      //Display error
             JOptionPane.showMessageDialog(apply, "Description field must not be empty");
             valid = false;
                }
            
                return valid;
            }

    void saveMenuChange(JTable table) {
                      PrintWriter writer = null;
                try {
                    int colCount = table.getModel().getColumnCount();
                    int rowCount = table.getModel().getRowCount();
                    int i=0;
                    writer = new PrintWriter( FILE_NAME);
                    while(i<rowCount){
                         int j=0;
                       while(j<colCount){
                           
                    
                  writer.println((String) table.getModel().getValueAt(i, j++)+","+
                            (String) table.getModel().getValueAt(i, j++)+","+
                            (String) table.getModel().getValueAt(i, j++)+","+
                            (String) table.getModel().getValueAt(i, j++));
                     
                    
                        }
                      
                    i++;
                    }
                    writer.close();
                } catch (FileNotFoundException ex) {
                    JOptionPane.showMessageDialog(null, "Error RMSMenu file not found "+FILE_NAME);
                } finally {
                    writer.close();
                }
                }  
    void deleteItem(JTable table){
            if(table.getSelectedRow()>=0){
                int reply = JOptionPane.showConfirmDialog(null, "Are you"
                                   + "sure you want to "
                                   + "delete this item?", "Menu Deletion", JOptionPane.YES_NO_OPTION);

                    if (reply == JOptionPane.YES_OPTION) {
                               model.removeRow(table.getSelectedRow());
                               
                              // log.println(logDate +"Deletion" );
                   }
                    else {

                      System.exit(0);
                   }
            }
                else{
                    JOptionPane.showMessageDialog(null,"Please select an item");
                }
            }
 
        
    }
   
                     
 

 


