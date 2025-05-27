package Week3Day2;

public class Execution extends Connection {

	@Override
	public void status() {
		System.out.println("Return the status");
		
	}

	public static void main(String[] args) {
		Execution jc = new Execution();
		jc.connect();
		jc.disconnect();
		jc.executeUpdate();
		jc.status();
	}
}
