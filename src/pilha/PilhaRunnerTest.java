package pilha;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class PilhaRunnerTest {

	public static void main(String[] args) {
		
		Result result = JUnitCore.runClasses(PilhaMain.class);

		List<Failure> falha = result.getFailures();
		
		for(Failure failure: falha) {
			System.out.println(failure.getMessage());
		}
		
		System.out.println(result.wasSuccessful());
		
	}

}
