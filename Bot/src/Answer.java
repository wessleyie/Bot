import java.util.Scanner;

public class Answer {
	
	@SuppressWarnings("resource")
	public static void Choice() throws InterruptedException{
		Scanner key = new Scanner(System.in);
		
		System.out.println("Please enter a command: " 
				+ "\n"
				+ "1 - Like"
				+ "\n"
				+ "2 - Follow"
				+ "\n"
				+ "3 - Download"
				+ "\n"
				+ "4 - Logout"
				+ "\n"
				+ "5 - Exit");
		
		String ans = key.next();
		
		if (ans.equals ("Like") || ans.equals("1")){
			Liking.Like();
		}
		
		if (ans.equals ("Follow") || ans.equals("2")){
			Follow.Amount();
		}
			
		if (ans.equals("Download") || ans.equals("3")) {
			System.out.println("This feature has not been implemented yet.");
		}
		
		if (ans.equals("Logout") || ans.equals("4")) {
			Log.Logout();
		}

		if (ans.equals("Exit") || ans.equals("5")){
			Close.Exit();
		}
		else {
			System.out.println("Invalid command.");
		}
		Choice();
	}
}
