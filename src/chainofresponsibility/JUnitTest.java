package chainofresponsibility;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JUnitTest {

	@Test
	void test() {
		Chain chainCalc1 = new AddNumber();
		Chain chainCalc2 = new SubNumber();
		Chain chainCalc3 = new DivideNumber();
		Chain chainCalc4 = new MultiplyNumber();
		
		chainCalc1.setNextChain(chainCalc2);
		chainCalc2.setNextChain(chainCalc3);
		chainCalc3.setNextChain(chainCalc4);
		
		assertEquals(5.0,chainCalc1.calculate(new Numbers(3.0, 2.0,"add"))," ");
		assertEquals(5.0,chainCalc1.calculate(new Numbers(7.0, 2.0,"sub"))," ");
		assertEquals(5.0,chainCalc1.calculate(new Numbers(25.0, 5.0,"divide"))," ");
		assertEquals(6.0,chainCalc1.calculate(new Numbers(3.0, 2.0,"multiply"))," ");
	}

}
