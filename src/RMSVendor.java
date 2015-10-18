import java.awt.Color;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

class RMSVendor {
    protected boolean zipFlag=false;
    protected boolean phoneFlag=false;
    protected boolean emailFlag=false;
    protected boolean flag=false;
    
    String VENDOR_FILE= "src\\data\\vendor.csv";
    
    public RMSVendor() {
    }
    protected void addVendor(String vendorName, String contact, String streetAddress, String city, String zipCode, String state, String phone, String email){
       int zip = Integer.parseInt(zipCode);
       
       if(flag=true){
           try {
               try (FileWriter writer = new FileWriter(VENDOR_FILE,true)) {
                   writer.append(vendorName);
                   writer.append(",");
                   writer.append(contact);
                   writer.append(",");
                   writer.append(streetAddress);
                   writer.append(",");
                   writer.append(city);
                   writer.append(",");
                   writer.append(zipCode);
                   writer.append(",");
                   writer.append(state);
                   writer.append(",");
                   writer.append(email);
                   writer.append("\n");
                   writer.flush();
               }
               JOptionPane.showMessageDialog(null, "Vendor added");
           } catch (IOException ex) {
               JOptionPane.showMessageDialog(null, "Error VENDOR File not found");
           }
       }
       else{
           JOptionPane.showMessageDialog(null, "Please re-enter your info");
       }
       
        
    }
    protected void removeVendor(){
        
    }

    protected boolean validateZip(JTextField zipText, String zip) {
        int zipNum = Integer.parseInt(zip);
        if(zipNum<99999){
            zipFlag = true;
        }
        else{
           zipText.setBorder(BorderFactory.createMatteBorder(2,2,2,2,Color.red));
           zipText.setText("To Do - Field can not be blank");
           zipText.setForeground(Color.red);
        }
        return zipFlag;
    }
    protected boolean validatePhone(String phone){
        if(phone.matches("\\d{3}-\\d{3}-\\d{4}")){
            phoneFlag = true;
        }
        else{
            
        }
        return phoneFlag;
    }
    protected boolean validateEmail(String email){
        if(email.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
		+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")){
            emailFlag = true;
        }
        else{
            
        }
        return emailFlag;
    }



    
}