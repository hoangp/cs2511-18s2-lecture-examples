package pattern.state.solution;

public class Sold implements State {

	private GumBallMachine gumBallMachine;
	public Sold(GumBallMachine gumBallMachine) {
		this.gumBallMachine = gumBallMachine;
	}

	// insertQuarter(), ejectQuarter() and turnCrank() are all invalid actions for this state
	@Override
	public void insertQuarter() {
		System.out.println("Please wait, we are already going to give you a gumball");
	}

	@Override
	public void ejectQuarter() {
		// Here, a quarter exists, so return the quarter
		System.out.println("Sorry, but you already turned the crank");
	}

	@Override
	public void turnCrank() {
		System.out.println("Turning twice does not give you another gumball.  Nice try.");
	}

	@Override
	public void dispense() {
		//Here customer has paid the quarter. So we need to trigger the machine to release a gumball
		gumBallMachine.releaseBall();
		System.out.println("A gumball rolling out the slot...");
		// After this, depending on whether there are any gumballs left, we transition either to the NoQuarter state
		// or SoldOut state
		if (gumBallMachine.getCount() > 0){
			gumBallMachine.setState(gumBallMachine.getNoQuarter());
		}
		else {
			System.out.println("Oops out of gumballs...");
			gumBallMachine.setState(gumBallMachine.getSoldOut());
		}
	}

}
