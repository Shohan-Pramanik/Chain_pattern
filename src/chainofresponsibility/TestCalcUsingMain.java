package chainofresponsibility;

public class TestCalcUsingMain {
	public static void main(String[] args) {
		Chain chainCalc1 = new AddNumber();
		Chain chainCalc2 = new SubNumber();
		Chain chainCalc3 = new DivideNumber();
		Chain chainCalc4 = new MultiplyNumber();
		
		chainCalc1.setNextChain(chainCalc2);
		chainCalc2.setNextChain(chainCalc3);
		chainCalc3.setNextChain(chainCalc4);
		
		
		Numbers requests = new Numbers (4,2,"pow");
		//Numbers requests = new Numbers (4,2,"sub");
		chainCalc1.calculate(requests);
	}
	

}
