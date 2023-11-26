import java.net.ServerSocket;
import java.net.Socket;
public class MyClient
{
	public static void main(String args[])
	{
		try
		{
			System.out.println("Client Running");
			Socket soc =new Socket("localhost",9800);
		}
		catch(Exception e )
		{
			e.printStackTrace();
		}
	}
}




