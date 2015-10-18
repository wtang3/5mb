////////////////////////////
// TODO:: NOT FINISHED YET 
// Needs a REMOVE METHOD
// 
//
//
///////////////////////////

import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;

public class Parse{
	String fileName = null;
	String content  = null;
	String compare  = null;

	public Parse(){
	}

	public Parse(String filename, String contents){
		fileName = filename;
		content  = contents;
	}	

	public void writeToFileWithoutOverwrite(String filename, String content){
		String fileName = filename;
		String contents = content;
		try{
      // true meaning to append to file
			BufferedWriter out = new BufferedWriter(new FileWriter(fileName,true));
			out.write(content);
			out.newLine();
			out.close();
		}catch(IOException ioe){
			ioe.printStackTrace();
		}	
	}
  
  
  public void writeToFileOverwrite(String filename, String content){
		String fileName = filename;
		String contents = content;
		try{
			BufferedWriter out = new BufferedWriter(new FileWriter(fileName,false));
			out.write(content);
			out.newLine();
			out.close();
		}catch(IOException ioe){
			ioe.printStackTrace();
		}	
	}
  
  public String returnRestaurantName(String filename){
    try{
		BufferedReader br =  new BufferedReader(new FileReader(filename));
			while((compare = br.readLine()) != null){
				 if(!compare.equals("")){
           return compare;
         }
			}
		
	}catch(IOException ioe){
		ioe.printStackTrace();
	}
		return compare;
	}
  
	public boolean doesItemExist(String filename,String item){
	try{
		BufferedReader br =  new BufferedReader(new FileReader(filename));
			while((compare = br.readLine()) != null){
				if(compare.equals(item)){
					return true;
				}
				else{ 
					return false;
				}
			}
		
	}catch(IOException ioe){
		ioe.printStackTrace();
	}
		return false;
	}
  
  public boolean isFileEmpty(String filename){
    
    try{
			BufferedReader br =  new BufferedReader(new FileReader(filename));
      while((compare = br.readLine()) != null){
          return false;
      }
		}catch(IOException ioe){
			ioe.printStackTrace();
		}
    return true;
  }
  

	public boolean doesUsernameExist(String filename, String username){
		EncryptUserPassword encrypt = new EncryptUserPassword();
		String encrypted = "";
		encrypt.encrypt(username);
		encrypted = encrypt.getHashedPassword();

		try{
			BufferedReader br =  new BufferedReader(new FileReader(filename));
				while((compare = br.readLine()) != null){
					if(compare.equals(encrypted)){
						return true;
					}
				}
			
		}catch(IOException ioe){
			ioe.printStackTrace();
		}
		return false;
	}

	public boolean doesPasswordExist(String filename, String password){
		EncryptUserPassword encrypt = new EncryptUserPassword();
		String encrypted = "";
		encrypt.encrypt(password);
		encrypted = encrypt.getHashedPassword();

		try{
			BufferedReader br =  new BufferedReader(new FileReader(filename));
				while((compare = br.readLine()) != null){
					if(compare.equals(encrypted)){
						return true;
					}
				}
			
		}catch(IOException ioe){
			ioe.printStackTrace();
		}
		return false;
	}
}
