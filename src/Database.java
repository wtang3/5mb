import java.io.File;
import java.io.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.OutputKeys;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.StringWriter;
import java.io.Writer;
import java.net.URL;
import java.util.List;
import java.util.Vector;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.NodeList;




 
public class Database{
  private final String FILEPATH ="src\\data\\e307db07b3975fef922a80d07455ee5e.xml";
  EncryptUserPassword encrypt = new EncryptUserPassword();
  DocumentBuilderFactory docFactory = null;
  DocumentBuilder docBuilder = null;
  Document doc = null;
 
  
  
  public boolean doesFileExist(String filename){
    return false;
  }
  
  public String whatEmailProvider(int index){
    String emailExtension = null;
    int selection = index;
    
    switch(selection){
      case 1:
        emailExtension ="@tmomail.net";
        break;
      case 2:
        emailExtension = "@messaging.sprintpcs.com";
        break;
      case 3:
        emailExtension = "@txt.att.net";
        break;
      case 4:
        emailExtension = "@vtext.com";
        break;
      case 5:
        emailExtension ="@mymetropcs.com";
        break;
      
    }
    return emailExtension; 
  }
  public boolean queryInformation(String content){
    
    String theContent = content;
    String xmlUsername = null;
    String xmlPassword = null;
    String xmlEmail = null;
    String xmlPhoneNumber = null;
    
    
    try{
      File xmlFile = new File(FILEPATH);
      docFactory = DocumentBuilderFactory.newInstance();
      docBuilder = docFactory.newDocumentBuilder();
      doc = docBuilder.parse(xmlFile);
      
      doc.getDocumentElement().normalize();
      
      NodeList node = doc.getElementsByTagName("employee");
      for(int temp = 0; temp < node.getLength(); temp++){
        Node nNode = node.item(temp);
        if(nNode.getNodeType() == Node.ELEMENT_NODE){
          Element theElement = (Element) nNode;
          xmlUsername = theElement.getAttribute("username");
          xmlEmail = theElement.getElementsByTagName("email").item(0).getTextContent();
          xmlPhoneNumber = theElement.getElementsByTagName("number").item(0).getTextContent();
          
          if(theContent.equals(xmlPhoneNumber)|| theContent.equals(xmlUsername)
             ||theContent.equals(xmlEmail)){
            return true;
          }
        }
      }
    }catch(Exception e){
      e.printStackTrace();
    }
  
    return false;
  }
  
  
   public int returnCounter(String username){
    
    String theUsername = username;
    String counter ="0";
    int count;
     try{
      File xmlFile = new File(FILEPATH);
      docFactory = DocumentBuilderFactory.newInstance();
      docBuilder = docFactory.newDocumentBuilder();
      doc = docBuilder.parse(xmlFile);
      
      doc.getDocumentElement().normalize();
      
      NodeList node = doc.getElementsByTagName("employee");
      for(int temp = 0; temp < node.getLength(); temp++){
        Node nNode = node.item(temp);
        if(nNode.getNodeType() == Node.ELEMENT_NODE){
          Element theElement = (Element) nNode;
          theUsername = theElement.getAttribute("username");
          if(username.equals(theUsername)){
          counter =theElement.getElementsByTagName("count").item(0).getTextContent();
          }
        }
      }
      }catch(Exception e){
      e.printStackTrace();
    }
     count = Integer.parseInt(counter);
   return count;
  }
    
  
  public Vector getAllUsers(){
    Vector usernameList = new Vector();
    String xmlUsername = null; 
    try{
      File xmlFile = new File(FILEPATH);
      docFactory = DocumentBuilderFactory.newInstance();
      docBuilder = docFactory.newDocumentBuilder();
      doc = docBuilder.parse(xmlFile);
      
      doc.getDocumentElement().normalize();
      
      NodeList node = doc.getElementsByTagName("employee");
      for(int temp = 0; temp < node.getLength(); temp++){
        Node nNode = node.item(temp);
        if(nNode.getNodeType() == Node.ELEMENT_NODE){
          Element theElement = (Element) nNode;
          xmlUsername = theElement.getAttribute("username");
          
          usernameList.add(xmlUsername);
          
        }
      }
    }catch(Exception e){
      e.printStackTrace();
    }
    return usernameList;
  }
  public List<String> getUsernameInformation(String username){
    Vector vec = new Vector();
    String theUsername = null;
    String thePassword = null;
    String theEmail = null;
    String thePhoneNumber = null;
    String theRole = null;
    String thePay = null;
    String thePayScale = null;
    String theSchedule = null;
    String theImage = null;
    
   try{
      File xmlFile = new File(FILEPATH);
      docFactory = DocumentBuilderFactory.newInstance();
      docBuilder = docFactory.newDocumentBuilder();
      doc = docBuilder.parse(xmlFile);
      
      doc.getDocumentElement().normalize();
      
      NodeList node = doc.getElementsByTagName("employee");
      for(int temp = 0; temp < node.getLength(); temp++){
        Node nNode = node.item(temp);
        if(nNode.getNodeType() == Node.ELEMENT_NODE){
          Element theElement = (Element) nNode;
          theUsername = theElement.getAttribute("username");
          if(username.equals(theUsername)){
          theEmail = theElement.getElementsByTagName("email").item(0).getTextContent();
          thePhoneNumber = theElement.getElementsByTagName("number").item(0).getTextContent();
          theRole = theElement.getElementsByTagName("role").item(0).getTextContent();
          thePay = theElement.getElementsByTagName("pay").item(0).getTextContent();
          thePassword =theElement.getElementsByTagName("password").item(0).getTextContent();
          thePayScale =theElement.getElementsByTagName("payscale").item(0).getTextContent();
          theSchedule =theElement.getElementsByTagName("schedule").item(0).getTextContent();
          theImage =theElement.getElementsByTagName("image").item(0).getTextContent();

          vec.add(username);
          vec.add(thePassword);
          vec.add(thePhoneNumber);
          vec.add(theEmail);
          vec.add(theRole);
          vec.add(thePay);
          vec.add(thePayScale);
          vec.add(theSchedule);
         }
        }
      }
      
    }catch(Exception e){
      e.printStackTrace();
    }
   return vec;
  }

  public void modifyUsername(String username, String modifyString){
    String theUsername = null;
    String newUsername = modifyString;
    DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
    int count = 0;
    
    if(doesUserExist(username)){
    try{
      File xmlFile = new File(FILEPATH);
      docFactory = DocumentBuilderFactory.newInstance();
      docBuilder = docFactory.newDocumentBuilder();
      doc = docBuilder.parse(xmlFile);
      
      doc.getDocumentElement().normalize();
      
      NodeList node = doc.getElementsByTagName("employee");
      for(int temp = 0; temp < node.getLength(); temp++){
        Node nNode = node.item(temp);
        if(nNode.getNodeType() == Node.ELEMENT_NODE){
          Element theElement = (Element) nNode;
          theUsername = theElement.getAttribute("username");
          
          if(username.equals(theUsername)){
            count = temp;
            System.out.println(theUsername);
          }
        }
      }
      //SAX
      DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
      Document document = documentBuilder.parse(FILEPATH);
      
     
      System.out.print(count);
      Node employee = document.getElementsByTagName("employee").item(count);
      NamedNodeMap attribute = employee.getAttributes();
      Node nodeAttr = attribute.getNamedItem("username");
      nodeAttr.setTextContent(newUsername);
      
      TransformerFactory transformerFactory = TransformerFactory.newInstance();
      Transformer transformer = transformerFactory.newTransformer();
      DOMSource domSource = new DOMSource(document);
      StreamResult streamResult = new StreamResult(new File(FILEPATH));
      transformer.transform(domSource, streamResult);
    
    }catch (ParserConfigurationException pce){
      pce.printStackTrace();
    }catch (TransformerException tfe) {
      tfe.printStackTrace();
    }catch (IOException ioe) {
      ioe.printStackTrace();
    }catch (SAXException sae) {
      sae.printStackTrace();
    }
   }else{
      System.out.println("User does not exist!");
    }
  }
  
  public void modifyPassword(String username, String password){
    String theUsername = null;
    String newPassword = password;
    DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
    int count = 0;
    encrypt.encrypt(newPassword);
    newPassword = encrypt.getHashedPassword();
    if(doesUserExist(username)){
    try{
      File xmlFile = new File(FILEPATH);
      docFactory = DocumentBuilderFactory.newInstance();
      docBuilder = docFactory.newDocumentBuilder();
      doc = docBuilder.parse(xmlFile);
      
      doc.getDocumentElement().normalize();
      
      NodeList node = doc.getElementsByTagName("employee");
      for(int temp = 0; temp < node.getLength(); temp++){
        Node nNode = node.item(temp);
        if(nNode.getNodeType() == Node.ELEMENT_NODE){
          Element theElement = (Element) nNode;
          theUsername = theElement.getAttribute("username");
          
          if(username.equals(theUsername)){
            count = temp;
            System.out.println(theUsername);
          }
        }
      }
      //SAX
      DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
      Document document = documentBuilder.parse(FILEPATH);
      
     
      System.out.print(count);
      Node employee = document.getElementsByTagName("employee").item(count);
      NamedNodeMap attribute = employee.getAttributes();
      Node nodeAttr = attribute.getNamedItem("username");
      
       NodeList nodes = employee.getChildNodes();

       for (int i = 0; i < nodes.getLength(); i++) {
        Node element = nodes.item(i);
        if ("password".equals(element.getNodeName())){
          element.setTextContent(newPassword);
        }
       }

      
      TransformerFactory transformerFactory = TransformerFactory.newInstance();
      Transformer transformer = transformerFactory.newTransformer();
      DOMSource domSource = new DOMSource(document);
      StreamResult streamResult = new StreamResult(new File(FILEPATH));
      transformer.transform(domSource, streamResult);
    
    }catch (ParserConfigurationException pce){
      pce.printStackTrace();
    }catch (TransformerException tfe) {
      tfe.printStackTrace();
    }catch (IOException ioe) {
      ioe.printStackTrace();
    }catch (SAXException sae) {
      sae.printStackTrace();
    }
   }else{
      System.out.println("User does not exist!");
    }
  }
  
  public void modifyEmail(String username, String email){
    String theUsername = null;
    String newEmail = email;
    DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
    int count = 0;
    
    if(doesUserExist(username)){
    try{
      File xmlFile = new File(FILEPATH);
      docFactory = DocumentBuilderFactory.newInstance();
      docBuilder = docFactory.newDocumentBuilder();
      doc = docBuilder.parse(xmlFile);
      
      doc.getDocumentElement().normalize();
      
      NodeList node = doc.getElementsByTagName("employee");
      for(int temp = 0; temp < node.getLength(); temp++){
        Node nNode = node.item(temp);
        if(nNode.getNodeType() == Node.ELEMENT_NODE){
          Element theElement = (Element) nNode;
          theUsername = theElement.getAttribute("username");
          
          if(username.equals(theUsername)){
            count = temp;
            System.out.println(theUsername);
          }
        }
      }
      //SAX
      DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
      Document document = documentBuilder.parse(FILEPATH);
      
     
      System.out.print(count);
      Node employee = document.getElementsByTagName("employee").item(count);
      NamedNodeMap attribute = employee.getAttributes();
      Node nodeAttr = attribute.getNamedItem("username");
      
       NodeList nodes = employee.getChildNodes();

       for (int i = 0; i < nodes.getLength(); i++) {
        Node element = nodes.item(i);
        if ("email".equals(element.getNodeName())){
          element.setTextContent(newEmail);
        }
       }

      
      TransformerFactory transformerFactory = TransformerFactory.newInstance();
      Transformer transformer = transformerFactory.newTransformer();
      DOMSource domSource = new DOMSource(document);
      StreamResult streamResult = new StreamResult(new File(FILEPATH));
      transformer.transform(domSource, streamResult);
    
    }catch (ParserConfigurationException pce){
      pce.printStackTrace();
    }catch (TransformerException tfe) {
      tfe.printStackTrace();
    }catch (IOException ioe) {
      ioe.printStackTrace();
    }catch (SAXException sae) {
      sae.printStackTrace();
    }
   }else{
      System.out.println("User does not exist!");
    }
  }
  public void modifyNumber(String username, String number){
    String theUsername = null;
    String newNumber = number;
    DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
    int count = 0;
   
    if(doesUserExist(username)){
    try{
      File xmlFile = new File(FILEPATH);
      docFactory = DocumentBuilderFactory.newInstance();
      docBuilder = docFactory.newDocumentBuilder();
      doc = docBuilder.parse(xmlFile);
      
      doc.getDocumentElement().normalize();
      
      NodeList node = doc.getElementsByTagName("employee");
      for(int temp = 0; temp < node.getLength(); temp++){
        Node nNode = node.item(temp);
        if(nNode.getNodeType() == Node.ELEMENT_NODE){
          Element theElement = (Element) nNode;
          theUsername = theElement.getAttribute("username");
          
          if(username.equals(theUsername)){
            count = temp;
            System.out.println(theUsername);
          }
        }
      }
 
      DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
      Document document = documentBuilder.parse(FILEPATH);
      
     
      System.out.print(count);
      Node employee = document.getElementsByTagName("employee").item(count);
      NamedNodeMap attribute = employee.getAttributes();
      Node nodeAttr = attribute.getNamedItem("username");
      
       NodeList nodes = employee.getChildNodes();

       for (int i = 0; i < nodes.getLength(); i++) {
        Node element = nodes.item(i);
        if ("number".equals(element.getNodeName())){
          element.setTextContent(newNumber);
        }
       }

      
      TransformerFactory transformerFactory = TransformerFactory.newInstance();
      Transformer transformer = transformerFactory.newTransformer();
      DOMSource domSource = new DOMSource(document);
      StreamResult streamResult = new StreamResult(new File(FILEPATH));
      transformer.transform(domSource, streamResult);
    
    }catch (ParserConfigurationException pce){
      pce.printStackTrace();
    }catch (TransformerException tfe) {
      tfe.printStackTrace();
    }catch (IOException ioe) {
      ioe.printStackTrace();
    }catch (SAXException sae) {
      sae.printStackTrace();
    }
   }else{
      System.out.println("User does not exist!");
    }
  }
  public void modifyRole(String username, String role){
    String theUsername = null;
    String newRole = role;
    DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
    int count = 0;
    
    if(doesUserExist(username)){
    try{
      File xmlFile = new File(FILEPATH);
      docFactory = DocumentBuilderFactory.newInstance();
      docBuilder = docFactory.newDocumentBuilder();
      doc = docBuilder.parse(xmlFile);
      
      doc.getDocumentElement().normalize();
      
      NodeList node = doc.getElementsByTagName("employee");
      for(int temp = 0; temp < node.getLength(); temp++){
        Node nNode = node.item(temp);
        if(nNode.getNodeType() == Node.ELEMENT_NODE){
          Element theElement = (Element) nNode;
          theUsername = theElement.getAttribute("username");
          
          if(username.equals(theUsername)){
            count = temp;
            System.out.println(theUsername);
          }
        }
      }
      //SAX
      DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
      Document document = documentBuilder.parse(FILEPATH);
      
     
      System.out.print(count);
      Node employee = document.getElementsByTagName("employee").item(count);
      NamedNodeMap attribute = employee.getAttributes();
      Node nodeAttr = attribute.getNamedItem("username");
      
       NodeList nodes = employee.getChildNodes();

       for (int i = 0; i < nodes.getLength(); i++) {
        Node element = nodes.item(i);
        if ("role".equals(element.getNodeName())){
          element.setTextContent(newRole);
        }
       }

      
      TransformerFactory transformerFactory = TransformerFactory.newInstance();
      Transformer transformer = transformerFactory.newTransformer();
      DOMSource domSource = new DOMSource(document);
      StreamResult streamResult = new StreamResult(new File(FILEPATH));
      transformer.transform(domSource, streamResult);
    
    }catch (ParserConfigurationException pce){
      pce.printStackTrace();
    }catch (TransformerException tfe) {
      tfe.printStackTrace();
    }catch (IOException ioe) {
      ioe.printStackTrace();
    }catch (SAXException sae) {
      sae.printStackTrace();
    }
   }else{
      System.out.println("User does not exist!");
    }
  }
  public void modifyPay(String username, String payType){
    String theUsername = null;
    String newPay = payType;
    DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
    int count = 0;
 
    if(doesUserExist(username)){
    try{
      File xmlFile = new File(FILEPATH);
      docFactory = DocumentBuilderFactory.newInstance();
      docBuilder = docFactory.newDocumentBuilder();
      doc = docBuilder.parse(xmlFile);
      
      doc.getDocumentElement().normalize();
      
      NodeList node = doc.getElementsByTagName("employee");
      for(int temp = 0; temp < node.getLength(); temp++){
        Node nNode = node.item(temp);
        if(nNode.getNodeType() == Node.ELEMENT_NODE){
          Element theElement = (Element) nNode;
          theUsername = theElement.getAttribute("username");
          
          if(username.equals(theUsername)){
            count = temp;
            System.out.println(theUsername);
          }
        }
      }
      //SAX
      DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
      Document document = documentBuilder.parse(FILEPATH);
      
     
      System.out.print(count);
      Node employee = document.getElementsByTagName("employee").item(count);
      NamedNodeMap attribute = employee.getAttributes();
      Node nodeAttr = attribute.getNamedItem("username");
      
       NodeList nodes = employee.getChildNodes();

       for (int i = 0; i < nodes.getLength(); i++) {
        Node element = nodes.item(i);
        if ("pay".equals(element.getNodeName())){
          element.setTextContent(newPay);
        }
       }

      
      TransformerFactory transformerFactory = TransformerFactory.newInstance();
      Transformer transformer = transformerFactory.newTransformer();
      DOMSource domSource = new DOMSource(document);
      StreamResult streamResult = new StreamResult(new File(FILEPATH));
      transformer.transform(domSource, streamResult);
    
    }catch (ParserConfigurationException pce){
      pce.printStackTrace();
    }catch (TransformerException tfe) {
      tfe.printStackTrace();
    }catch (IOException ioe) {
      ioe.printStackTrace();
    }catch (SAXException sae) {
      sae.printStackTrace();
    }
   }else{
      System.out.println("User does not exist!");
    }
  }
  
  
  public void modifyImage(String username, String image){
    String theUsername = null;
    String newImage = image;
    DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
    int count = 0;
 
    if(doesUserExist(username)){
    try{
      File xmlFile = new File(FILEPATH);
      docFactory = DocumentBuilderFactory.newInstance();
      docBuilder = docFactory.newDocumentBuilder();
      doc = docBuilder.parse(xmlFile);
      
      doc.getDocumentElement().normalize();
      
      NodeList node = doc.getElementsByTagName("employee");
      for(int temp = 0; temp < node.getLength(); temp++){
        Node nNode = node.item(temp);
        if(nNode.getNodeType() == Node.ELEMENT_NODE){
          Element theElement = (Element) nNode;
          theUsername = theElement.getAttribute("username");
          
          if(username.equals(theUsername)){
            count = temp;
            System.out.println(theUsername);
          }
        }
      }
      //SAX
      DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
      Document document = documentBuilder.parse(FILEPATH);
      
     
      System.out.print(count);
      Node employee = document.getElementsByTagName("employee").item(count);
      NamedNodeMap attribute = employee.getAttributes();
      Node nodeAttr = attribute.getNamedItem("username");
      
       NodeList nodes = employee.getChildNodes();

       for (int i = 0; i < nodes.getLength(); i++) {
        Node element = nodes.item(i);
        if ("image".equals(element.getNodeName())){
          element.setTextContent(newImage);
        }
       }

      
      TransformerFactory transformerFactory = TransformerFactory.newInstance();
      Transformer transformer = transformerFactory.newTransformer();
      DOMSource domSource = new DOMSource(document);
      StreamResult streamResult = new StreamResult(new File(FILEPATH));
      transformer.transform(domSource, streamResult);
    
    }catch (ParserConfigurationException pce){
      pce.printStackTrace();
    }catch (TransformerException tfe) {
      tfe.printStackTrace();
    }catch (IOException ioe) {
      ioe.printStackTrace();
    }catch (SAXException sae) {
      sae.printStackTrace();
    }
   }else{
      System.out.println("User does not exist!");
    }
  }
  
  
  
   public void modifyPayScale(String username, String payScale){
    String theUsername = null;
    String newPay = payScale;
    DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
    int count = 0;
 
    if(doesUserExist(username)){
    try{
      File xmlFile = new File(FILEPATH);
      docFactory = DocumentBuilderFactory.newInstance();
      docBuilder = docFactory.newDocumentBuilder();
      doc = docBuilder.parse(xmlFile);
      
      doc.getDocumentElement().normalize();
      
      NodeList node = doc.getElementsByTagName("employee");
      for(int temp = 0; temp < node.getLength(); temp++){
        Node nNode = node.item(temp);
        if(nNode.getNodeType() == Node.ELEMENT_NODE){
          Element theElement = (Element) nNode;
          theUsername = theElement.getAttribute("username");
          
          if(username.equals(theUsername)){
            count = temp;
            System.out.println(theUsername);
          }
        }
      }
      //SAX
      DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
      Document document = documentBuilder.parse(FILEPATH);
      
     
      System.out.print(count);
      Node employee = document.getElementsByTagName("employee").item(count);
      NamedNodeMap attribute = employee.getAttributes();
      Node nodeAttr = attribute.getNamedItem("username");
      
       NodeList nodes = employee.getChildNodes();

       for (int i = 0; i < nodes.getLength(); i++) {
        Node element = nodes.item(i);
        if ("payscale".equals(element.getNodeName())){
          element.setTextContent(newPay);
        }
       }

      
      TransformerFactory transformerFactory = TransformerFactory.newInstance();
      Transformer transformer = transformerFactory.newTransformer();
      DOMSource domSource = new DOMSource(document);
      StreamResult streamResult = new StreamResult(new File(FILEPATH));
      transformer.transform(domSource, streamResult);
    
    }catch (ParserConfigurationException pce){
      pce.printStackTrace();
    }catch (TransformerException tfe) {
      tfe.printStackTrace();
    }catch (IOException ioe) {
      ioe.printStackTrace();
    }catch (SAXException sae) {
      sae.printStackTrace();
    }
   }else{
      System.out.println("User does not exist!");
    }
  }
   
   public void modifySchedule(String username, String scheduleFile){
    String theUsername = null;
    String newPay = scheduleFile;
    DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
    int count = 0;
 
    if(doesUserExist(username)){
    try{
      File xmlFile = new File(FILEPATH);
      docFactory = DocumentBuilderFactory.newInstance();
      docBuilder = docFactory.newDocumentBuilder();
      doc = docBuilder.parse(xmlFile);
      
      doc.getDocumentElement().normalize();
      
      NodeList node = doc.getElementsByTagName("employee");
      for(int temp = 0; temp < node.getLength(); temp++){
        Node nNode = node.item(temp);
        if(nNode.getNodeType() == Node.ELEMENT_NODE){
          Element theElement = (Element) nNode;
          theUsername = theElement.getAttribute("username");
          
          if(username.equals(theUsername)){
            count = temp;
            System.out.println(theUsername);
          }
        }
      }
      //SAX
      DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
      Document document = documentBuilder.parse(FILEPATH);
      
      //testing purposes.
      System.out.print(count);
      Node employee = document.getElementsByTagName("employee").item(count);
      NamedNodeMap attribute = employee.getAttributes();
      Node nodeAttr = attribute.getNamedItem("username");
      
       NodeList nodes = employee.getChildNodes();

       for (int i = 0; i < nodes.getLength(); i++) {
        Node element = nodes.item(i);
        if ("schedule".equals(element.getNodeName())){
          element.setTextContent(newPay);
        }
       }

      
      TransformerFactory transformerFactory = TransformerFactory.newInstance();
      Transformer transformer = transformerFactory.newTransformer();
      DOMSource domSource = new DOMSource(document);
      StreamResult streamResult = new StreamResult(new File(FILEPATH));
      transformer.transform(domSource, streamResult);
    
    }catch (ParserConfigurationException pce){
      pce.printStackTrace();
    }catch (TransformerException tfe) {
      tfe.printStackTrace();
    }catch (IOException ioe) {
      ioe.printStackTrace();
    }catch (SAXException sae) {
      sae.printStackTrace();
    }
   }else{
      System.out.println("User does not exist!");
    }
  }
  
   
  public void modifyCount(String username, int theCount){
    String theUsername = null;
    int counter = theCount;
    DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
    int count = 0;
 
    if(doesUserExist(username)){
    try{
      File xmlFile = new File(FILEPATH);
      docFactory = DocumentBuilderFactory.newInstance();
      docBuilder = docFactory.newDocumentBuilder();
      doc = docBuilder.parse(xmlFile);
      
      doc.getDocumentElement().normalize();
      
      NodeList node = doc.getElementsByTagName("employee");
      for(int temp = 0; temp < node.getLength(); temp++){
        Node nNode = node.item(temp);
        if(nNode.getNodeType() == Node.ELEMENT_NODE){
          Element theElement = (Element) nNode;
          theUsername = theElement.getAttribute("username");
          
          if(username.equals(theUsername)){
            count = temp;
            System.out.println(theUsername);
          }
        }
      }
      //SAX
      DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
      Document document = documentBuilder.parse(FILEPATH);
      
     
      System.out.print(count);
      Node employee = document.getElementsByTagName("employee").item(count);
      NamedNodeMap attribute = employee.getAttributes();
      Node nodeAttr = attribute.getNamedItem("username");
      
       NodeList nodes = employee.getChildNodes();

       for (int i = 0; i < nodes.getLength(); i++) {
        Node element = nodes.item(i);
        if ("count".equals(element.getNodeName())){
          element.setTextContent(Integer.toString(counter));
        }
       }

      
      TransformerFactory transformerFactory = TransformerFactory.newInstance();
      Transformer transformer = transformerFactory.newTransformer();
      DOMSource domSource = new DOMSource(document);
      StreamResult streamResult = new StreamResult(new File(FILEPATH));
      transformer.transform(domSource, streamResult);
    
    }catch (ParserConfigurationException pce){
      pce.printStackTrace();
    }catch (TransformerException tfe) {
      tfe.printStackTrace();
    }catch (IOException ioe) {
      ioe.printStackTrace();
    }catch (SAXException sae) {
      sae.printStackTrace();
    }
   }else{
      System.out.println("User does not exist!");
    }
  }
  
  ///////////////////////////////////////////////////////////////////////
  
  // queries the file to see if user exist.
  public boolean doesUserExist(String username){
    String theUsername = username;
    String xmlUsername = null;
    try{
      File xmlFile = new File(FILEPATH);
      docFactory = DocumentBuilderFactory.newInstance();
      docBuilder = docFactory.newDocumentBuilder();
      doc = docBuilder.parse(xmlFile);
      
      doc.getDocumentElement().normalize();
      
      NodeList node = doc.getElementsByTagName("employee");
      for(int temp = 0; temp < node.getLength(); temp++){
        Node nNode = node.item(temp);
        if(nNode.getNodeType() == Node.ELEMENT_NODE){
          Element theElement = (Element) nNode;
          xmlUsername = theElement.getAttribute("username");
          if(theUsername.equals(xmlUsername)){
            return true;
          }
        }
      }
    }catch(Exception e){
      e.printStackTrace();
    }
  
   return false;
  }
 
  public boolean doesEmailExist(String email){
    String theEmail = email;
    String xmlEmail = null;
    String username = null;
    
    try{
      File xmlFile = new File(FILEPATH);
      docFactory = DocumentBuilderFactory.newInstance();
      docBuilder = docFactory.newDocumentBuilder();
      doc = docBuilder.parse(xmlFile);
      
      doc.getDocumentElement().normalize();
      
      NodeList node = doc.getElementsByTagName("employee");
      for(int temp = 0; temp < node.getLength(); temp++){
        Node nNode = node.item(temp);
        if(nNode.getNodeType() == Node.ELEMENT_NODE){
          Element theElement = (Element) nNode;
          username = theElement.getAttribute("username");
          xmlEmail = theElement.getElementsByTagName("email").item(0).getTextContent();

          if(theEmail.equals(xmlEmail)){
            return true;
          }
        }
      }
    }catch(Exception e){
      e.printStackTrace();
    }
    return false;
  }
  
  public String getEmail(String theusername){
    String xmlEmail = null;
    String username = theusername;
    String xmlUsername = null;
    
    try{
      File xmlFile = new File(FILEPATH);
      docFactory = DocumentBuilderFactory.newInstance();
      docBuilder = docFactory.newDocumentBuilder();
      doc = docBuilder.parse(xmlFile);
      
      doc.getDocumentElement().normalize();
      
      NodeList node = doc.getElementsByTagName("employee");
      for(int temp = 0; temp < node.getLength(); temp++){
        Node nNode = node.item(temp);
        if(nNode.getNodeType() == Node.ELEMENT_NODE){
          Element theElement = (Element) nNode;
          xmlUsername = theElement.getAttribute("username");
          xmlEmail = theElement.getElementsByTagName("email").item(0).getTextContent();

          if(username.equals(xmlUsername)){
            return xmlEmail;
          }
        }
      }
    }catch(Exception e){
      e.printStackTrace();
    }
    return null;
  }
  
  public String getNumber(String username){
    String xmlNumber = null;
    String theUsername = username;
    String xmlUsername = null;
    
    try{
      File xmlFile = new File(FILEPATH);
      docFactory = DocumentBuilderFactory.newInstance();
      docBuilder = docFactory.newDocumentBuilder();
      doc = docBuilder.parse(xmlFile);
      
      doc.getDocumentElement().normalize();
      
      NodeList node = doc.getElementsByTagName("employee");
      for(int temp = 0; temp < node.getLength(); temp++){
        Node nNode = node.item(temp);
        if(nNode.getNodeType() == Node.ELEMENT_NODE){
          Element theElement = (Element) nNode;
          xmlUsername = theElement.getAttribute("username");
          xmlNumber = theElement.getElementsByTagName("number").item(0).getTextContent();

          if(xmlUsername.equals(theUsername)){
            return xmlNumber;
          }
        }
      }
    }catch(Exception e){
      e.printStackTrace();
    }
    return null;
  }
  
   public boolean doesNumberExist(String theNumber){
    String xmlNumber = null;
    String username = null;
    String xmlUsername = null;
    
    try{
      File xmlFile = new File(FILEPATH);
      docFactory = DocumentBuilderFactory.newInstance();
      docBuilder = docFactory.newDocumentBuilder();
      doc = docBuilder.parse(xmlFile);
      
      doc.getDocumentElement().normalize();
      
      NodeList node = doc.getElementsByTagName("employee");
      for(int temp = 0; temp < node.getLength(); temp++){
        Node nNode = node.item(temp);
        if(nNode.getNodeType() == Node.ELEMENT_NODE){
          Element theElement = (Element) nNode;
          xmlUsername = theElement.getAttribute("username");
          xmlNumber = theElement.getElementsByTagName("number").item(0).getTextContent();

          if(xmlNumber.contains(theNumber)){
            return true;
          }
        }
      }
    }catch(Exception e){
      e.printStackTrace();
    }
    return false;
  }
  
  public String checkPasswordForEmail(String email){
    String theEmail = email;
    String xmlEmail = null;
    String username = null;
    
    try{
      File xmlFile = new File(FILEPATH);
      docFactory = DocumentBuilderFactory.newInstance();
      docBuilder = docFactory.newDocumentBuilder();
      doc = docBuilder.parse(xmlFile);
      
      doc.getDocumentElement().normalize();
      
      NodeList node = doc.getElementsByTagName("employee");
      for(int temp = 0; temp < node.getLength(); temp++){
        Node nNode = node.item(temp);
        if(nNode.getNodeType() == Node.ELEMENT_NODE){
          Element theElement = (Element) nNode;
          username = theElement.getAttribute("username");
          xmlEmail = theElement.getElementsByTagName("email").item(0).getTextContent();

          if(theEmail.equals(xmlEmail)){
            return username;
          }
        }
      }
    }catch(Exception e){
      e.printStackTrace();
    }
    return null;
  }
  
  public String checkPasswordForNumber(String email){
    String theEmail = email;
    String xmlEmail = null;
    String username = null;
    
    try{
      File xmlFile = new File(FILEPATH);
      docFactory = DocumentBuilderFactory.newInstance();
      docBuilder = docFactory.newDocumentBuilder();
      doc = docBuilder.parse(xmlFile);
      
      doc.getDocumentElement().normalize();
      
      NodeList node = doc.getElementsByTagName("employee");
      for(int temp = 0; temp < node.getLength(); temp++){
        Node nNode = node.item(temp);
        if(nNode.getNodeType() == Node.ELEMENT_NODE){
          Element theElement = (Element) nNode;
          username = theElement.getAttribute("username");
          xmlEmail = theElement.getElementsByTagName("number").item(0).getTextContent();

          if(xmlEmail.contains(theEmail)){
            return username;
          }
        }
      }
    }catch(Exception e){
      e.printStackTrace();
    }
    return null;
  }
  
  public String getRole(String username){
    String theUsername = username;
    String theRole = null;
    
    try{
      File xmlFile = new File(FILEPATH);
      docFactory = DocumentBuilderFactory.newInstance();
      docBuilder = docFactory.newDocumentBuilder();
      doc = docBuilder.parse(xmlFile);
      
      doc.getDocumentElement().normalize();
      
      NodeList node = doc.getElementsByTagName("employee");
      for(int temp = 0; temp < node.getLength(); temp++){
        Node nNode = node.item(temp);
        if(nNode.getNodeType() == Node.ELEMENT_NODE){
          Element theElement = (Element) nNode;
          username = theElement.getAttribute("username");
          theRole = theElement.getElementsByTagName("role").item(0).getTextContent();

          if(username.equals(theUsername)){
            return theRole;
          }
        }
      }
    }catch(Exception e){
      e.printStackTrace();
    }
    return null;
    
  }
  
  public String getImage(String username){
    String theUsername = username;
    String theImage = null;
    
    try{
      File xmlFile = new File(FILEPATH);
      docFactory = DocumentBuilderFactory.newInstance();
      docBuilder = docFactory.newDocumentBuilder();
      doc = docBuilder.parse(xmlFile);
      
      doc.getDocumentElement().normalize();
      
      NodeList node = doc.getElementsByTagName("employee");
      for(int temp = 0; temp < node.getLength(); temp++){
        Node nNode = node.item(temp);
        if(nNode.getNodeType() == Node.ELEMENT_NODE){
          Element theElement = (Element) nNode;
          username = theElement.getAttribute("username");
          theImage = theElement.getElementsByTagName("image").item(0).getTextContent();

          if(username.equals(theUsername)){
            return theImage;
          }
        }
      }
    }catch(Exception e){
      e.printStackTrace();
    }
    return null;  
  }
  
  
  public boolean loginSuccessful(String username, String password){
    String theUsername = username;
    String thePassword = password;
    String xmlUsername = null;
    String xmlPassword = null;
    
    try{
      File xmlFile = new File(FILEPATH);
      docFactory = DocumentBuilderFactory.newInstance();
      docBuilder = docFactory.newDocumentBuilder();
      doc = docBuilder.parse(xmlFile);
      
      doc.getDocumentElement().normalize();
      
      NodeList node = doc.getElementsByTagName("employee");
      for(int temp = 0; temp < node.getLength(); temp++){
        Node nNode = node.item(temp);
        if(nNode.getNodeType() == Node.ELEMENT_NODE){
          Element theElement = (Element) nNode;
          xmlUsername = theElement.getAttribute("username");
          xmlPassword = theElement.getElementsByTagName("password").item(0).getTextContent();
          if(theUsername.equals(xmlUsername) && thePassword.equals(xmlPassword)){
            return true;
          }
        }
      }
    }catch(Exception e){
      e.printStackTrace();
    }
   
   return false;
    
  }
  
  
  public void newUser(String username, String password,
    String phoneNumber, String email){

    try {
    docFactory = DocumentBuilderFactory.newInstance();
    docBuilder = docFactory.newDocumentBuilder();
    doc = docBuilder.parse(FILEPATH);
 
    // Get the root element
    Node server = doc.getFirstChild();
 
    // Get the appendToRoot element by tag name directly
    Node appendToRoot = doc.getElementsByTagName("Root").item(0);
 
 
    // append a new node to appendToRoot
    Element staff = doc.createElement("employee");
    appendToRoot.appendChild(staff);
    Attr attr = doc.createAttribute("username");
    attr.setValue(username);
    staff.setAttributeNode(attr);
 
    Element thePassword = doc.createElement("password");
    thePassword.appendChild(doc.createTextNode(password));
    staff.appendChild(thePassword);
 
    // phonenumber elements
    Element phonenumber = doc.createElement("number");
    phonenumber.appendChild(doc.createTextNode(phoneNumber));
    staff.appendChild(phonenumber);
    // email elements
    Element theEmail = doc.createElement("email");
    theEmail.appendChild(doc.createTextNode(email));
    staff.appendChild(theEmail);
 
    // role elements
    Element theRole = doc.createElement("role");
    theRole.appendChild(doc.createTextNode("User"));
    staff.appendChild(theRole);
    
    Element thePay = doc.createElement("pay");
    //defaults at hourly
    thePay.appendChild(doc.createTextNode("Hourly"));
    staff.appendChild(thePay);
    
    
    Element thePayScale = doc.createElement("payscale");
    thePayScale.appendChild(doc.createTextNode("0.00"));
    staff.appendChild(thePayScale);
    
    Element schedule = doc.createElement("schedule");
    schedule.appendChild(doc.createTextNode("N/A"));
    staff.appendChild(schedule);
    
    
    Element count = doc.createElement("count");
    count.appendChild(doc.createTextNode("0"));
    staff.appendChild(count);
    
    Element image = doc.createElement("image");
    image.appendChild(doc.createTextNode("/images/testIMAGE.jpg"));
    staff.appendChild(image);

    // write the content into xml file
    TransformerFactory transformerFactory = TransformerFactory.newInstance();
    Transformer transformer = transformerFactory.newTransformer();
    transformer.setOutputProperty(OutputKeys.INDENT, "yes");
    transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount","2");
    DOMSource source = new DOMSource(doc);
    StreamResult result = new StreamResult(new File(FILEPATH));
    transformer.transform(source, result);
 
   } catch (ParserConfigurationException pce) {
    pce.printStackTrace();
   } catch (TransformerException tfe) {
    tfe.printStackTrace();
   } catch (IOException ioe) {
    ioe.printStackTrace();
   } catch (SAXException sae) {
    sae.printStackTrace();
   }
  }
}