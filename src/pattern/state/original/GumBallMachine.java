package pattern.state.original;

public class GumBallMachine {
	
	// The four states corresponding to the state diagram
	private final static int NO_QUARTER = 0; // "No Quarter state"
	private final static int HAS_QUARTER = 1;// "Has Quarter state"
	private final static int SOLD = 2;       // "Sold state"
	private final static int SOLD_OUT = 3;   // "Out of Gumballs state"
	
	// The instance variable that will keep track of the current state
	// The state is initalised to SOLD_OUT to start with
	private int state = SOLD_OUT;
	// Instance variable to keep track of the number of gumballs
	private int count; 
	// The constructor takes an initial inventory of gumballs.  If the inventory isn't zero, the machine
	// can enter a state NO_QUARTER, else it remains in the SOLD_OUT state
	
	public GumBallMachine(int count) {
		this.count = count;
		if (count > 0) {
			state = NO_QUARTER;
		}
	}
	
	// Implement each state transition action as a method
	// Action: when a quarter is inserted
	public void insertQuarter() {
		if (state == HAS_QUARTER) {
			// Here, a quarter already exists
			System.out.println("You cannot insert another quarter");
		}
		else if (state == NO_QUARTER) {
			// This is a valid action. We can transition to the next state
			System.out.println("You inserted a quarter. Turn the crank to get a gumball");
			state = HAS_QUARTER;
		}
		else if (state == SOLD_OUT) {
			System.out.println("You cannot insert another quarter, machine is sold out");
		}
		else if (state == SOLD) {
			System.out.println("Please wait, we are already going to give you a gumball");
		}
	}

	// Action: Now, if the customer tries to eject a quarter
	public void ejectQuarter() {
		if (state == HAS_QUARTER) {
			// Here, a quarter exists, so return the quarter
			System.out.println("Quarter returned");
			state = NO_QUARTER;
		}
		else if (state == NO_QUARTER) {
			// There isn't a quarter, so we cannot return one. 
			System.out.println("You have not inserted a quarter.");
		}
		else if (state == SOLD_OUT) {
			System.out.println("You cannot eject, you haven't inserted a quarter yet");
		}
		else if (state == SOLD) {
			System.out.println("Sorry, we have already given you a gumball");
		}
	}
	
	public void turnCrank() {
		if (state == HAS_QUARTER) {
			System.out.println("You will receive a gumball shortly");
			state = SOLD;
			dispense();
		}
		else if (state == SOLD_OUT) {
			System.out.println("You cannot turn the crank, machine is sold out");
		}
		else if (state == SOLD) {
			System.out.println("Turning twice does not give you another gumball.  Nice try.");
		}
		else if (state == NO_QUARTER) {
			System.out.println("Please insert a quarter first.");
		}
	}
	
	    // Action: Now, if the customer tries to dispense a gumball
		public void dispense() {
			if (state == SOLD) {
				System.out.println("You should see a gumball rolling out soon...");
				count = count -1;
				if (count == 0) {
					System.out.println("Oops no more gumballs...");
					state = SOLD_OUT;
				}
				else {
					state = NO_QUARTER;
				}
			}
			else if (state == HAS_QUARTER) {
				System.out.println("No gumball dispensed. Turn the crank first.");
			}
			else if (state == NO_QUARTER) {
				System.out.println("You need to pay first");
			}
			else if (state == SOLD_OUT) {
				System.out.println("No gumball dispensed. Machine is sold out");
			} 
		}
		
		
		@Override
		public String toString() {
			String result="";
			switch (this.state) {
			  case 0: result =  "state: NO_QUARTER"; break;
			  case 1: result =   "state: HAS_QUARTER"; break;
			  case 2: result =  "state: SOLD"; break;
			  case 3: result =  "state: SOLD_OUT";break;
			}
			return result;
			
		}
		
		public static void main(String[] args) {
			GumBallMachine gumBall = new GumBallMachine(5);
			System.out.println(gumBall);
			gumBall.insertQuarter();
			System.out.println(gumBall);
			gumBall.turnCrank();
			System.out.println(gumBall);
			gumBall.insertQuarter();
			gumBall.ejectQuarter();
			gumBall.turnCrank();
			System.out.println(gumBall);
			gumBall.insertQuarter();
			gumBall.turnCrank();
			gumBall.insertQuarter();
			gumBall.ejectQuarter();
			gumBall.turnCrank();
			System.out.println(gumBall);
			
		}

}
