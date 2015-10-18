
import java.util.Properties; 
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
 
public class sendConf extends Thread {
  final String username = "team5mb2013@gmail.com";
	final String password = "********";
  String confUsername = null;
  String confPassword = null;
  String theEmail = null;
  String typeOfConfirmation = null;
    
  public sendConf(String email, String newUsername, String newPassword, String type){
    confUsername = newUsername;
    confPassword = newPassword;
    theEmail = email;
    typeOfConfirmation = type ;
  }
  
	public void run(){
   
		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
    ///////////// very important line//////////////////
    props.put("mail.smtp.ssl.trust", "smtp.gmail.com");
    ///////////////////////////////////////////////////
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");
 
		Session session = Session.getInstance(props,
		  new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		  });
    if(typeOfConfirmation.equals("regular")){
      try {

        Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress("team5mb2013@gmail.com"));
        message.setRecipients(Message.RecipientType.TO,
          InternetAddress.parse(theEmail));
        message.setSubject("5MB confirmation");
        message.setText("Dear " +confUsername + ","
          + "\n\n Your username is: " + confUsername +
                "\n Your password is: " + confPassword);

        Transport.send(message);
      }catch (MessagingException e) {
        throw new RuntimeException(e);
      }
    }
    else if(typeOfConfirmation.equals("forgot")){
      try {
        Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress("team5mb2013@gmail.com"));
        message.setRecipients(Message.RecipientType.TO,
          InternetAddress.parse(theEmail));
        message.setSubject("5MB password reset");
        message.setText("Dear " +confUsername + ","
                  +"\n\nYour password was reseted and is now"
                  + " changed to: " + confPassword
                  + "\n\nIf you did not initiate this please "
                  + "contact us and consider logging in and changing your password."
                  + "\n\nThank you,"
                  + "\nTeam 5MB");

        Transport.send(message);
      }catch (MessagingException e) {
        throw new RuntimeException(e);
      }
    }
	}
}
