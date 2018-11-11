package chainofresponsibility;

public class DivideNumber implements Chain {
	private Chain nextInChain;
	@Override
	public void setNextChain(Chain nextChain) {
		this.nextInChain = nextChain;

	}

	@Override
	public double calculate(Numbers requests) {
		if(requests.getCalculationWanted() == "divide") {
			return requests.getNumber1() / requests.getNumber2();
		}
		else {
			return nextInChain.calculate(requests);
			//System.out.println("ok");
		}

		

	}

}
