package Week3;

public class APIclient1 {
	public void sendRequest(int numb, String Text) {
	System.out.println(numb +" "+ Text  );	
	}

	public void sendRequest(String endpoint) {
		System.out.println("String" + endpoint);
	}
	
	public void sendRequest(String endpoint2, String requestBody, boolean reqstatus) {
		System.out.println(endpoint2 +requestBody+reqstatus);
	}
	
	public static void main(String[] args) {
		APIclient1 ap = new APIclient1();
		ap.sendRequest(24, "Api");
		ap.sendRequest("String endpoint");
		ap.sendRequest("Endpoint", "rqbody", false);
		
	}
}


/*

 * - Create a main method to demonstrate the usage of the overloaded sendRequest
 * method. - Inside the main method, create an object of the APIClient class. -
 * Call both versions of the sendRequest method on the APIClient object with
 * different sets of input arguments to showcase method overloading.
 */