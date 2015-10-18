import java.awt.BorderLayout;
import java.awt.Color;
import java.io.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;

class RMSSalesReport {
    DefaultTableModel model = new DefaultTableModel();
    DefaultTableModel modelA = new DefaultTableModel();
    DefaultTableModel modelD= new DefaultTableModel();
    String saleFile = "src\\data\\Sales.csv";
    boolean flag = false;
    ArrayList<String> al = new ArrayList<String>();
    Object[] salesData=new Object[8]; 
    NumberFormat formatter = new DecimalFormat("#,##0.00");
    String[]menuItem={"Ice Cream","Steak","Cola","Chicken Fingers"};
    ArrayList<String> totalQtySold;
    Object[] test = null ;
    String[] days=null;
    double appetizer = 10,entree = 10,drinks = 10,dessert = 10;
    ArrayList<String> daysList = new ArrayList();
    HashMap<String,Integer> map = new HashMap<>();
              // double total=getUnitSales(month);
            double totalGrossS=0;
            double totalGrossP=0;
            int entreeItemQty=0;
            double entreePrice=0;
            double entreeCost=0;
            int dessertItemQty=0;
            double dessertPrice=0;
            double dessertCost=0;
            int drinkItemQty=0;
            double drinkPrice=0;
            double drinkCost=0;
            int appetizerItemQty=0;
            double appetizerPrice=0;
            double appetizerCost=0;
                    int count=0;
    
    public RMSSalesReport() {
        this.totalQtySold = new ArrayList<>();

   
    }

    public DefaultTableModel viewDaily(String day){
       
       String[]COLUMNS={"Category","Qty Sold","Price($)","Cost($)","Margin($)","Gross Sales($)","Gross Profit($)","Unit Sales(%)"}; 
       Vector<String> colNames = new Vector<>(Arrays.asList(COLUMNS));
       Vector<Vector<Object>> dataVector = new Vector<Vector<Object>>();
       Vector<Object> rowVector = new Vector<Object>();
       
       
        try {
                     
            Scanner sc = new Scanner(new File(saleFile));
            double total=getUnitSales(day);
            double totalGrossS=0;
            double totalGrossP=0;
                    
            
            while(sc.hasNext()){
           
            String line =sc.nextLine();
            String[] split = line.split(",");
            if(line.contains(day)==true){
                    
                    rowVector.add((split[2]));
                    rowVector.add(split[3]);
                    totalGrossS +=((Double.parseDouble(split[3]))*(Double.parseDouble(split[4])));
                    totalGrossP += ((Double.parseDouble(split[3]))*(Double.parseDouble(split[5])));
                    
                    rowVector.add(formatter.format(Double.parseDouble(split[4])));
                    rowVector.add(formatter.format(Double.parseDouble(split[5])));
                    double margin = (Double.parseDouble(split[4])-Double.parseDouble(split[5]));
                    rowVector.add(formatter.format(margin));
                    double grossSales = ((Double.parseDouble(split[3]))*(Double.parseDouble(split[4])));
                    rowVector.add(formatter.format(grossSales));
                    double grossProfit = ((Double.parseDouble(split[3]))*(Double.parseDouble(split[5])));
                    rowVector.add(formatter.format(grossProfit));
                    double unitSales=((Double.parseDouble(split[3])/total)*100);
                    rowVector.add(formatter.format(unitSales));
                
                    
                    dataVector.add(rowVector);
                    rowVector = new Vector<Object>();
              
              
            }
           
            model = new DefaultTableModel(dataVector, colNames);}
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "ERROR: Sales.csv");
        }
        
     return model;

    }
     public DefaultTableModel detailedMonth(String month){
       
       String[]COLUMNS={"Date","Item","Qty Sold","Price($)","Cost($)","Margin($)","Gross Sales($)","Gross Profit($)"}; 
       Vector<String> colNames = new Vector<>(Arrays.asList(COLUMNS));
       Vector<Vector<Object>> dataVector = new Vector<Vector<Object>>();
       Vector<Object> rowVector = new Vector<Object>();
       
       
        try {
                     
            Scanner sc = new Scanner(new File(saleFile));
            double total=getUnitSales(month);
            double totalGrossS=0;
            double totalGrossP=0;
                    
            
            while(sc.hasNext()){
           
            String line =sc.nextLine();
            String[] split = line.split(",");
            if(line.startsWith(month)==true){
                    rowVector.add(split[0]);
                    rowVector.add((split[2]));
                    rowVector.add(split[3]);
                    totalGrossS +=((Double.parseDouble(split[3]))*(Double.parseDouble(split[4])));
                    totalGrossP += ((Double.parseDouble(split[3]))*(Double.parseDouble(split[5])));
                    
                    rowVector.add(formatter.format(Double.parseDouble(split[4])));
                    rowVector.add(formatter.format(Double.parseDouble(split[5])));
                    double margin = (Double.parseDouble(split[4])-Double.parseDouble(split[5]));
                    rowVector.add(formatter.format(margin));
                    double grossSales = ((Double.parseDouble(split[3]))*(Double.parseDouble(split[4])));
                    rowVector.add(formatter.format(grossSales));
                    double grossProfit = ((Double.parseDouble(split[3]))*(Double.parseDouble(split[5])));
                    rowVector.add(formatter.format(grossProfit));
                    
                
                    
                    dataVector.add(rowVector);
                    rowVector = new Vector<Object>();
              
              
            }
           
            modelD = new DefaultTableModel(dataVector, colNames);}
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "ERROR: Sales.csv");
        }
        
     return modelD;

    }
    public DefaultTableModel viewMonth(String month){
          String[]COLUMNS={"Category","Qty Sold","Price","Cost","Margin","Gross Sales","Gross Profit","% Unit Sales"}; 
       Vector<String> colNames = new Vector<>(Arrays.asList(COLUMNS));
       Vector<Vector<Object>> dataVector = new Vector<Vector<Object>>();
       Vector<Object> dessertVector = new Vector<Object>();
       Vector<Object> entreeVector = new Vector<Object>();
       Vector<Object> drinkVector= new Vector<Object>();
       Vector<Object> appetizerVector = new Vector<Object>();
        dessertVector.add("Dessert");
        int qty=map.get("Dessert");
        dessertVector.add(qty);
        double price = 2.23;
        dessertVector.add(formatter.format(price));
        double cost=0.47;
        dessertVector.add(formatter.format(cost));
        double margin = price-cost;
        dessertVector.add(formatter.format(margin));
        double grossSales=price*qty;
        dessertVector.add(formatter.format(grossSales));
        double grossProfit = margin*qty;
        dessertVector.add(formatter.format(grossProfit));
        int totalItems=((map.get("Dessert"))+(map.get("Drinks"))+(map.get("Appetizer"))+(map.get("Entree")));
        double unitSales = ((double)qty/(double)totalItems);
        dessertVector.add(formatter.format(unitSales));
        
        drinkVector.add("Drinks");
        int qtyd=map.get("Drinks");
        drinkVector.add(qtyd);
        double priced = 3.10;
        drinkVector.add(formatter.format(priced));
        double costd=1.00;
        drinkVector.add(formatter.format(costd));
        double margind = priced-costd;
        drinkVector.add(formatter.format(margind));
        double grossSalesd=priced*qtyd;
        drinkVector.add(formatter.format(grossSalesd));
        double grossProfitd = margind*qtyd;
        drinkVector.add(formatter.format(grossProfitd));
        int totalItemsd=((map.get("Dessert"))+(map.get("Drinks"))+(map.get("Appetizer"))+(map.get("Entree")));
        double unitSalesd = ((double)qtyd/(double)totalItemsd);
        drinkVector.add(formatter.format(unitSalesd));
        
        entreeVector.add("Entree");
        int qtye=map.get("Entree");
        entreeVector.add(qtye);
        double pricee = 15.24;
        entreeVector.add(formatter.format(pricee));
        double coste=6.6;
        entreeVector.add(formatter.format(coste));
        double margine = pricee-coste;
        entreeVector.add(formatter.format(margine));
        double grossSalese=pricee*qtye;
        entreeVector.add(formatter.format(grossSalese));
        double grossProfite = margine*qtye;
        entreeVector.add(formatter.format(grossProfite));
        int totalItemse=((map.get("Dessert"))+(map.get("Drinks"))+(map.get("Appetizer"))+(map.get("Entree")));
        double unitSalese = ((double)qtye/(double)totalItemse);
        entreeVector.add(formatter.format(unitSalese));
       
        appetizerVector.add("Appetizer");
        int qtya=map.get("Appetizer");
        appetizerVector.add(qtya);
        double pricea = 5.12;
        appetizerVector.add(formatter.format(pricea));
        double costa=1.75;
        appetizerVector.add(formatter.format(costa));
        double margina = pricea-costa;
        appetizerVector.add(formatter.format(margine));
        double grossSalesa=pricea*qtya;
        appetizerVector.add(formatter.format(grossSalesa));
        double grossProfita = margina*qtya;
        appetizerVector.add(formatter.format(grossProfita));
        int totalItemsa=((map.get("Dessert"))+(map.get("Drinks"))+(map.get("Appetizer"))+(map.get("Entree")));
        double unitSalesa = ((double)qtya/(double)totalItemsa);
        appetizerVector.add(formatter.format(unitSalesa));
        dataVector.add(appetizerVector);
        dataVector.add(dessertVector);
        dataVector.add(drinkVector);
        dataVector.add(entreeVector);
        
            modelA = new DefaultTableModel(dataVector, colNames);
            
     
        
    
        return modelA;
    }

    protected double getUnitSales(String day) throws FileNotFoundException {
        double total=0;
        double gSales =0;
        Scanner sp = new Scanner(new File(saleFile));
        while(sp.hasNext()){
            String line =sp.nextLine();
            String[] split = line.split(",");
               if(line.contains(day)==true){
               int t=(Integer.parseInt(split[3]));
               total=total+t;  
        
    }
    
        }
        return total;
    }
       protected double getUnitSalesMonth(String month) throws FileNotFoundException {
        double total=0;
        double gSales =0;
        Scanner sp = new Scanner(new File(saleFile));
        while(sp.hasNext()){
            String line =sp.nextLine();
            String[] split = line.split(",");
               if(line.startsWith(month)==true){
               int t=(Integer.parseInt(split[3]));
               total=total+t;  
        
    }
    
        }
        return total;
    }

    protected HashMap<String, Integer> getTotalSold(String month) {
     
        try {
                     
            Scanner s = new Scanner(new File(saleFile));

            
            while(s.hasNext()){
            int i;
            String line =s.nextLine();
            String[] split = line.split(",");
            if(line.startsWith(month)==true){
                    if(split[1].matches("Entree")==true){  
                        
                          entreeItemQty+=(Integer.parseInt(split[3]));
                            
                       }
                   if(split[1].matches("Dessert")==true){
                       dessertItemQty+=(Integer.parseInt(split[3]));
          
                   }
                   if(split[1].matches("Drinks")==true){
                       drinkItemQty+=(Integer.parseInt(split[3]));
               
                   }
                   if(split[1].matches("Appetizer")){
                       appetizerItemQty+=(Integer.parseInt(split[3]));
                       
                   }

     
               
    }
                   map.put("Entree", entreeItemQty);
                   map.put("Drinks", drinkItemQty);
                   map.put("Dessert", dessertItemQty);
                   map.put("Appetizer", appetizerItemQty);

}
            
            //System.out.println(map);
                     } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "ERROR: Sales.csv");
        }
           //return entreeItemQty;
        return map;
    }
    protected void monthComboBox(){
        try {
            Scanner sc = new Scanner(new File(saleFile));
            //while(sc.hasNext){
                
            //}
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error Sales file not found");
        }
        
    }
        void valuesAtTable(JTable table){
        dessert = Double.parseDouble(table.getValueAt(0,5).toString());
        entree = Double.parseDouble(table.getValueAt(1,5).toString());
        drinks = Double.parseDouble(table.getValueAt(2,5).toString());
        appetizer = Double.parseDouble(table.getValueAt(3,5).toString());
        
        
    }
       JPanel viewCategoryChart(JPanel chartPanel,String day){
       //double dessert1 = (double) table.getValueAt(0,5);
        /*entree = (double) table.getValueAt(1, 5);
        drinks = (double) table.getValueAt(2, 5);
        appetizer = (double) table.getValueAt(3, 5);*/
        
           
         DefaultPieDataset pieDataset = new DefaultPieDataset();
         pieDataset.setValue("Entree", new Double(entree));
         pieDataset.setValue("Appetizer", new Double(appetizer));
         pieDataset.setValue("Drinks", new Double(drinks));
         pieDataset.setValue("Dessert", new Double(dessert));
         JFreeChart chart = ChartFactory.createPieChart3D("Sales By Category", pieDataset,true, true, true);
         chart.setBackgroundPaint(Color.white);
         
         PiePlot3D plot =(PiePlot3D) chart.getPlot();
         plot.setOutlineVisible(false);
         plot.setBackgroundPaint(Color.WHITE);
         plot.setSectionPaint("Appetizer", Color.GREEN.darker().darker());
         plot.setSectionPaint("Drinks",Color.CYAN.darker());
         plot.setSectionPaint("Entree",Color.ORANGE.darker());
         plot.setSectionPaint("Dessert",Color.blue.darker());
         ChartPanel cp = new ChartPanel(chart);
         //cp.setPreferredSize(new java.awt.Dimension(250, 200));
         cp.setBackground(Color.white);
         cp.setVisible(true);
         chartPanel.setLayout(new java.awt.BorderLayout());
         chartPanel.add(cp,BorderLayout.CENTER);
         chartPanel.validate();
         
     
        return chartPanel;
        
    }

    ArrayList getDay() {
        try {

            int i=0;
            
            Scanner sc = new Scanner(new File(saleFile));
            while(sc.hasNext()){
                String line= sc.nextLine();
                String[] split = line.split(",");
                if(!daysList.contains(split[0])){
                daysList.add(split[0]);
               
                }
            }
        } catch (FileNotFoundException ex) {
            System.err.println(saleFile + " not found");
        }
return daysList;
    }




}
        
