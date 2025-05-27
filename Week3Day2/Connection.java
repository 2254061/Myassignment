package Week3Day2;

public abstract class Connection implements Dbconnection{

	@Override
	public void connect() {
		System.out.println("System is Connecting..");
		
		
	}

	@Override
	public void disconnect() {
		System.out.println(" System Disconnected..");
		
	}

	@Override
	public void executeUpdate() {
System.out.println("executeupdate");
		
	}
	public abstract void status();
	
}

	

