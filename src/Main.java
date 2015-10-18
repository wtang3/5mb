
import java.awt.AWTEvent;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.SplashScreen;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Rectangle2D.Double;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JWindow;


public class Main extends JWindow{
  public static SplashScreen loadingScreen;
  public static Double loadingTextArea;
  public static Double loadingProgressArea;
  public static Graphics2D loadingGraphics;
  
    JLabel splashImgHolder;
    Image image;
    ImageIcon splashIcon;
    JPanel contentPane;
    
    public Main(){
        // Choose logo as splash screen TODO::
        //image = new ImageIcon((getClass().getResource("images\\5mb.png")))
        //.getImage();
        //splashIcon = new ImageIcon(image);
        
       /**
        * Enables the events defined by the specified event mask parameter to 
        * be delivered to this component. Event types are automatically enabled
        * when a listener for that event type is added to the component.
        */       
        enableEvents(AWTEvent.WINDOW_EVENT_MASK);
        
        try{
            showSplash();
        }catch(Exception ex){
            System.out.println("Error! " + ex.getMessage());
            System.exit(1);
        }
        
        this.setVisible(true);
        
        try{
          // how long to display the splash
            Thread.sleep(2000);
        }catch(InterruptedException e){
            //do nothing here!
        }
    }


        public void setVisible(boolean b) {
        super.setVisible(b);
    }
    private void showSplash() throws Exception{
        splashImgHolder = new JLabel();
        splashImgHolder.setIcon(splashIcon);
        
        contentPane = ((JPanel)this.getContentPane());
        contentPane.setLayout(new BorderLayout());
        contentPane.add(splashImgHolder, BorderLayout.NORTH);
        
        setSplashLocation();
        
        pack();
        
    }

    private void setSplashLocation() {
        this.setLocationRelativeTo(null);
    }
 
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
