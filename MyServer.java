import java.net.ServerSocket;
import java.net.Socket;

public class MyServer
{
	public static void main(String args[])
	{
		
	try
	{
	System.out.println("Waiting for Client request");
	ServerSocket ss=new ServerSocket(9800);
	Socket soc =ss.accept();
	System.out.println("Conenction Done");
	
}

catch(Exception e)

{
	e.printStackTrace();
	
	 
}
}
}


	
