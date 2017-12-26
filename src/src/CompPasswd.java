package src;

public class CompPasswd {

	public int flag;

	public CompPasswd(String passwd, String passwd2) {
		if (passwd.equals(passwd2)){
			flag = 1;
		}
		else {
			flag = 0;
			
		}
	}
	
}
