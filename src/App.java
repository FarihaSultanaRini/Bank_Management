import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
public class App {
	ArrayList<BankAccountAbstraceClass> users=new ArrayList<>();
	public void NewAccount(BankAccountAbstraceClass member)
	{

		users.add(member);
	}
	BankAccountAbstraceClass getObject(String uId){
		for(BankAccountAbstraceClass temp:users)
		{
			if(uId.equals(temp.id))
			{
				System.out.println("Found");
				return temp;
			}
			
		}
		System.out.println("Not Found");
		return null;
	}
	void printAllAtFile() {
		FileOutputStream fout=null;
		ObjectOutputStream out=null;
		try {
			fout=new FileOutputStream("DATA.txt");
			out=new ObjectOutputStream(fout);
			out.writeObject(users);
			out.flush();
			out.close();
			System.out.println("writing done");
		}
		catch(Exception e) {
		}
	}
	void getObjectBack(){
		try {
			FileInputStream in1=new FileInputStream("DATA.txt");
			ObjectInputStream in=new ObjectInputStream(in1);
			users=(ArrayList<BankAccountAbstraceClass>)in.readObject();
			in.close();
			in1.close();
			System.out.println("read done");  
		} catch (Exception e) {
		}
	}
}
