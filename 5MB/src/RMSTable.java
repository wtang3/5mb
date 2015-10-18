
import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;


class RMSTable {
            File TABLE_STATE_FILE = new File("src\\data\\tableState.csv");
      void getTableState(JButton table) {
            try {
                Scanner sc = new Scanner(TABLE_STATE_FILE);
                    while(sc.hasNext()){
                        String line = sc.nextLine();
                        String split[] = line.split(",");
                        int tableState = Integer.parseInt(split[1].toString());
                        if(line.contains("Table 1")){
                        switch(tableState){
                            case 1:
                                table.setBackground(Color.green.darker());
                                break;
                            case 2:
                                table.setBackground(Color.yellow.darker());
                                break;
                            default:
                                table.setBackground(Color.red.darker());
                                break;
                        }
                        }
                    }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(RMSOrderGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }  
}
