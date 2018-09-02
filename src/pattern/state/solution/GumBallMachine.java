package pattern.state.solution;

public class GumBallMachine {

	// The four states corresponding to the state diagram
	private State noQuarter;  // "No Quarter state"
	private State hasQuarter; // "Has Quarter state"
	private State soldOut;   // "Out of Gumballs state"
	private State sold;      // "Sold state"
	private State winner;    // "New State WINNER"
	
	// The instance variable that will keep track of the current state
	// The state is initalised to SOLD_OUT to start with
	private State state = soldOut;
	// Instance variable to keep track of the number of gumballs
	private int count; 
	// The constructor takes an initial inventory of gumballs.  If the inventory isn't zero, the machine
	// can enter a state NO_QUARTER, else it remains in the SOLD_OUT state
	
	public GumBallMachine(int numGumBalls) {
		this.count = numGumBalls;
		noQuarter = new NoQuarter(this);
		hasQuarter = new HasQuarter(this);
		soldOut = new SoldOut(this);
		sold = new Sold(this);	
		winner = new Winner(this);
		
		if (numGumBalls > 0) {
			state = noQuarter;
		}
	}
	public void insertQuarter() {
		state.insertQuarter();
	}

	// Action: Now, if the customer tries to eject a quarter
	public void ejectQuarter() {
		state.ejectQuarter();
	}

	// Action: turn the crank 
	// This also calls dispense(), as dispense() is an internal action, cannot ask the user to dispense gumballs
	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}
	
	// Action: Now, if the customer tries to dispense a gumball
	public void dispense() {
		state.dispense();
	}
		
	// A setter method to transition the machine to a different state
	public void setState(State state) {
		this.state = state;
	}
	
	public void releaseBall() {
		System.out.println("releasing the gum ball");
		if (count != 0) {
			count = count - 1;
		}
		
	}
	public State getHasQuarter() {
		return this.hasQuarter;
	}
	
	public State getNoQuarter() {
		return this.noQuarter;
	}
	
	public State getSold() {
		return this.sold;
	}
	
	public State getSoldOut() {
		return this.soldOut;
	}
	public int getCount() {
		return this.count;
	}
	public State getWinner() {
		return this.winner;
	}

	@Override
	public String toString() {
		return this.state.getClass().getSimpleName();
	}
	
	
	public static void main(String[] args) {
		GumBallMachine machine = new GumBallMachine(10);
		machine.insertQuarter();
		machine.turnCrank();
		System.out.println(machine);
		System.out.println();
		machine.insertQuarter();
		machine.turnCrank();
		machine.insertQuarter();
		machine.turnCrank();
		machine.insertQuarter();
		machine.turnCrank();
		
		System.out.println(machine);
		
	}
}
