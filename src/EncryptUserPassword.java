import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.math.BigInteger;

public class EncryptUserPassword{
	
	private String hashedPass = null;

	public void encrypt(String password){
		try{
			MessageDigest md5 = MessageDigest.getInstance("MD5");
			md5.update(password.getBytes());
			BigInteger hashIt = new BigInteger(1,md5.digest());
			hashedPass = hashIt.toString(16);
			if(hashedPass.length()==31){
				hashedPass= "o"+ hashedPass;
			}
			setHashedPassword(hashedPass);	
		}catch(NoSuchAlgorithmException nae){
		//NoSuchAlgorithm
		}
	}

	private void setHashedPassword(String hPassword){
		hashedPass = hPassword;
	}

	public String getHashedPassword(){
		return hashedPass;
	}
}