
import java.util.Scanner;

public class BallotUI {
	 public Scanner keyboard;
	     public BallottingUnit ballot=	new BallottingUnit("ashley","seema","stanley","craig");
	     int voters;
	     public String votingMessage;
	
	     public BallotUI()
	     {      keyboard = new Scanner(System.in);
	     }

	     public void menu()  
	     {
	         int command = -1;
	         while(command != 0)       
	         {
	        	 displayMainMenu();
	             command = getCommand();
	             
	             execute(command);
	         }
	     }

	     private void displayMainMenu()

	     {
	
	         System.out.println("Options are");

	         System.out.println("To vote for ashley    Enter 1");

	         System.out.println("To vote for seema     Enter 2");

	         System.out.println("To vote for stanley      Enter 3");

	         System.out.println("To vote for craig     Enter 4");

	         System.out.println("To close   Enter 0");
	         
	         

	     }
	
	    private void execute(int command)
	    {

	         if(command == 1)
	         {
	        	 ballot.candidate1.incrementCount();

	         }

	         else if(command == 2)

	         {
	
	        	 ballot.candidate2.incrementCount();

	         }

	         else if(command == 3)

	         {
	
	        	 ballot.candidate3.incrementCount();

	         }
	
	         else if(command == 4)
	 
	         {

	        	 ballot.candidate4.incrementCount();

	         }           
	
	         else if(command == 0)
	         {
	             System.out.println(" Program closing down");
	             ballot.reportResults();
	
	         }
	
	         else
	
	         {
	
	             System.out.println("Unknown command");
	
	             //ballot.castVote();
	
	         }
	
	  
	
	     }
	
	 
	     private int getCommand()

	     {
	
	         System.out.print("Enter command: ");
	
	         return keyboard.nextInt();

	     }

	

	  
	
	   /*  private void setupVoteMessage(String vote)
	
	     {

	     }*/

}
