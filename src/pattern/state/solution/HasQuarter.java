package pattern.state.solution;

public class HasQuarter implements State {
	
	private GumBallMachine gumBallMachine;
	
	public HasQuarter(GumBallMachine gumBallMachine) {
		this.gumBallMachine = gumBallMachine;
	}

	@Override
	public void insertQuarter() {
			System.out.println("You cannot insert another quarter");

	}

	@Override
	public void ejectQuarter() {
		// Here, a quarter exists, so return the quarter
		System.out.println("Quarter returned");
		gumBallMachine.setState(gumBallMachine.getNoQuarter());
	}

	@Override
	public void turnCrank() {
		System.out.println("You turned the crank");
		int winner = (int)(Math.random()*((10 - 0 )+1));
		System.out.println(winner);
		if ((winner == 10) && (gumBallMachine.getCount() > 1)) {
			gumBallMachine.setState(gumBallMachine.getWinner());
		}
		else {
			gumBallMachine.setState(gumBallMachine.getSold());
		}
		
	}

	@Override
	public void dispense() {
		System.out.println("No gum ball dispensed.  Turn the crank first.");
		gumBallMachine.setState(gumBallMachine.getSold());
	}
	
	

}
